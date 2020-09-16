package com.taotie.stream;

import org.junit.Test;

import javax.sound.midi.SoundbankResource;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author: taotie
 * @Date: 2020/9/16 23:06
 * @email:
 * @Description: stream流的是使用
 */
public class Demo {
    // map 的使用
    // map 可以对数据进行函数处理
    @Test
    public void mapTest() {
        List<String> list = getList();
        List<String> collect = list.stream().map(s -> s.concat("test")).filter(s -> s.contains("a")).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void filterTest() {
        List<String> list = getList();
        List<String> w = list.stream().filter(s -> s.startsWith("w")).map(s -> s.concat("123")).collect(Collectors.toList());
        System.out.println(w);
    }

    @Test
    public void distinctTest() {
        List list = null;
        List list1 = Optional.ofNullable(list).orElse(new ArrayList());
        System.out.println(list1);
    }

    private List<String> getList() {
        List<String> list = new ArrayList();

        list.add("abc");
        list.add("abcq");
        list.add("bed1");
        list.add("bed1");
        list.add("rgse");
        list.add("rgs");
        list.add("wde");
        list.add("wtf");
        list.add("wtf");
        list.add("wtf");
        return list;
    }
    @Test
    public void test1(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("学习无止境");
            }
        };
        runnable.run();
        Runnable runnable1 = () -> System.out.println("学习痛并快乐着");

        runnable1.run();
    }

}