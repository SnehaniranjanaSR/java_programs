package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TraverseThruMap {
    public void traverseThruMapMethod(){
        Map<Integer,Integer> sampleMap = new HashMap<>();

        sampleMap.put(1,1);
        sampleMap.put(2,2);
        sampleMap.put(3,3);

        //using foreach
        for (Map.Entry e:sampleMap.entrySet()) {
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        System.out.println("Keys:");
        for(Integer keyK: sampleMap.keySet()){
            System.out.println(keyK);
        }
        System.out.println("Values:");
        for(Integer valueV: sampleMap.values()){
            System.out.println(valueV);
        }

        //using iterators
        Iterator<Map.Entry<Integer,Integer>> i = sampleMap.entrySet().iterator();

        System.out.println("using iterators:");
        while(i.hasNext()){
            Map.Entry<Integer,Integer> e = i.next();
            System.out.println(e.getKey()+" : "+e.getValue());
        }

        //foreach action method
        System.out.println("foreach action method:");
        sampleMap.forEach((k,v) -> System.out.println(k+" : "+ v));

        //searching value by key

        for(Integer k: sampleMap.keySet()){
            System.out.println("Value for Key : "+ k+" is Value : "+sampleMap.get(k));
        }
    }
}
