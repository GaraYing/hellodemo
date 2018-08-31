package com.gara.hellodemo.java8.lambda;

/**
 * @description: 函数相关
 * @author: GaraYing
 * @create: 2018-08-31 17:44
 **/

//FunctionalInterface可不填
@FunctionalInterface
public interface Function_Interface<F, T> {
    T convert(F from);
}

/**
 * 函数式接口
 */
class Test {
    public static void main(String[] args) {
        Function_Interface<Integer, Integer> convert = (from -> Integer.valueOf(from));

        Integer converted = convert.convert(2323);
        System.out.println(converted);

    }
}

/**
 * 方法和构造函数引用
 */
class Something {

    String startsWith(String s) {
        return String.valueOf(s.length() > 0 ? s.charAt(0) : null);
    }

    public static void main(String[] args) {
        Something something = new Something();
        Function_Interface<String, String> converter = something::startsWith;
        String converted = converter.convert("JavaYouCan");
        System.out.println(converted);    // "J"
    }
}





