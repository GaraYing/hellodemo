package com.gara.hellodemo.java8.libs;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description: 函数式编程
 * @author: GaraYing
 * @create: 2018-09-03 16:24
 **/

public class MyStream {
    private enum Status{
        OPEN,CLOSED
    }

    private static final class Task{
        private final Status status;
        private final Integer points;

        public Task(Status status, Integer points) {
            this.status = status;
            this.points = points;
        }

        public Status getStatus() {
            return status;
        }

        public Integer getPoints() {
            return points;
        }

        @Override
        public String toString() {
            return String.format( "[%s, %d]", status, points );
        }
    }

    public static void main(String[] args) {
        final Collection< Task > tasks = Arrays.asList(
                new Task( Status.OPEN, 5 ),
                new Task( Status.OPEN, 13 ),
                new Task( Status.OPEN, 12 ),
                new Task( Status.CLOSED, 8 )
        );
        /*
            第一，task集合被转换化为其相应的stream表示。然后，filter操作过滤掉状态为CLOSED的task。
            下一步，mapToInt操作通过Task::getPoints这种方式调用每个task实例的getPoints方法把Task的stream转化为Integer的stream。
            最后，用sum函数把所有的分数加起来，得到最终的结果。
         */

        final long totalPointsOfOpenTasks = tasks
                .stream()
                .filter(task -> task.getStatus()==Status.OPEN)
                .mapToInt(Task::getPoints)
                .sum();

        System.out.println("Total points: " +totalPointsOfOpenTasks );

        /**
         *  需要按照某种准则来对集合中的元素进行分组
         */
        // Group tasks by their status
        final Map< Status, List< Task >> map = tasks
                .stream()
                .collect( Collectors.groupingBy( Task::getStatus ) );
        System.out.println( map );


        /**
         * 原生支持并行处理
         */
        // Calculate total points of all tasks
        final double totalPoints = tasks
                .stream()
                .parallel()
                .map( task -> task.getPoints() ) // or map( Task::getPoints )
                .reduce( 0, Integer::sum );

        System.out.println( "Total points (all tasks): " + totalPoints );

        // Calculate the weight of each tasks (as percent of total points)
        final Collection< String > result = tasks
                .stream()                                        // Stream< String >
                .mapToInt( Task::getPoints )                     // IntStream
                .asLongStream()                                  // LongStream
                .mapToDouble( points -> points / totalPoints )   // DoubleStream
                .boxed()                                         // Stream< Double >
                .mapToLong( weigth -> ( long )( weigth * 100 ) ) // LongStream
                .mapToObj( percentage -> percentage + "%" )      // Stream< String>
                .collect( Collectors.toList() );                 // List< String >

        System.out.println( result );

        /**
         * 逐行读取数据这样典型的I/O操作
         */
        final Path path = new File( "F://js-accessToken.png" ).toPath();
        try( Stream< String > lines = Files.lines( path, StandardCharsets.UTF_8 ) ) {
            lines.onClose( () -> System.out.println("Done!") ).forEach( System.out::println );
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
