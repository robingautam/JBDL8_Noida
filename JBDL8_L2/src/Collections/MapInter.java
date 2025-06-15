package Collections;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInter {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Robin",46464);
        map.put("Aakash", 75656);

        //System.out.println(map.get("Robin1"));

        for (Map.Entry<String,Integer> hm: map.entrySet()){
            System.out.println(hm.getKey()+" "+hm.getValue());
        }

        map.remove("Aakash");
        for (String key: map.keySet()){
            System.out.println(key+" "+map.get(key));
        }

        System.out.println(map.containsKey("Robin"));
        System.out.println(map.getOrDefault("Robin",1));

        System.out.println("=============TreeMap==========");

        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Robin",1);
        treeMap.put("Aakash",2);

        for (String key: treeMap.keySet()){
            System.out.println(key+" "+treeMap.get(key));
        }

    }
}
