package com.gara.hellodemo.design_pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: GaraYing
 * @create: 2018-08-24 18:03
 **/

public class ProtoType implements Cloneable {
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
    public ArrayList<String > list = new ArrayList<String>();

    // 深拷贝
    protected Object clone() throws CloneNotSupportedException {

        ProtoType protoType = null;
        try {
            protoType =  (ProtoType) super.clone();

            protoType.list = (ArrayList) list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return protoType;
    }

}
