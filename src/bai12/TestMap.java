package bai12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer>hashMap=new HashMap<>();
        hashMap.put("tom",22);
        hashMap.put("Quyen",19);
        hashMap.put("ha",20);
        hashMap.put("ta",21);
        hashMap.put("hanh",18);
        System.out.println(hashMap);
        Map<String,Integer>treeMap=new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending");
        System.out.println(treeMap);
        Map<String,Integer>linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("tom",22);
        linkedHashMap.put("quyen",19);
        linkedHashMap.put("ha",20);
        linkedHashMap.put("ta",21);
        linkedHashMap.put("hanh",18);
        System.out.println(linkedHashMap);
    }
}
