package com.hand;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App3 {
    public static void main(String[] args) {
        System.out.println("Factory test");
        Intercla handlelist =  Factory.getClass("Handlelist");
        handlelist.getnum();
        Intercla randomnum =  Factory.getClass("Randomnum");
        randomnum.getnum();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        int[] ints = random.ints(50, 1, 100).toArray();
        for (int a : ints) {
            integers.add(a);
            int c = a / 10;
            if (map.keySet().contains(c)) {
                map.get(c).add(a);

            } else {
                ArrayList<Integer> integers1 = new ArrayList<>();
                integers1.add(a);
                map.put(c, integers1);
            }
        }

        Iterator<Map.Entry<Integer, ArrayList<Integer>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, ArrayList<Integer>> next = iterator.next();
            Integer key = next.getKey();
            ArrayList<Integer> value = next.getValue();
            List<Integer> collect = value.stream().sorted().collect(Collectors.toList());
            value.clear();
            value.addAll(collect);
            System.out.print(key+"=");
            for (int a:value
                 ) {
                System.out.print(a+",");

            }

        }


    }

    public static ArrayList<Integer> mysort(List<Integer> args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        int min=0;
        for (int i = 0; i < args.size(); i++) {
            for (int j = i+1; j < args.size(); j++) {
                if(i>j){
                    min=j;
                }else{
                    min=i;
                }
            }
            integers.add(min);
        }
        return integers;
    }

}