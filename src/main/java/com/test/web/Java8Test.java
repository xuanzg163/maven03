package com.test.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Test {
    public static void main(String[] args){

        //测试Java8新特性
        List<String> nameListA = new ArrayList<String>();

        nameListA.add("g");
        nameListA.add("d");
        nameListA.add("c");
        nameListA.add("b");
        nameListA.add("s");
        nameListA.add("r");
        List<String> nameListB = nameListA;


        Java8Test test = new Java8Test();

        System.out.println("Java7 语法");
        test.sortUsingJava7(nameListA);
        System.out.println(nameListA);

        System.out.println("Java8 语法");
        test.sortUsingJava8(nameListB);
        System.out.println(nameListB);

    }

    /**
     * Using Java7
     * @param nameList
     */
    private void sortUsingJava7(List<String> nameList){

        Collections.sort(nameList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    /**
     *  Using Java8
     * @param nameList
     */
    private  void sortUsingJava8(List<String> nameList){
       Collections.sort(nameList,((o1, o2) -> o1.compareTo(o2)));
    }
}
