package com.cg.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindKeysForValueInMap {
	
	public static <K, V> List<K> getKeysForValue(Map<K, V> map, V value) {
        List<K> keys = new ArrayList<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                keys.add(entry.getKey());
            }
        }

        return keys;
    }

    public static void main(String[] args) {
    	
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 5);
        map.put(2, 7);
        map.put(3, 5);

        int valueToFind = 5;
        List<Integer> keys = getKeysForValue(map, valueToFind);

        System.out.println("Keys for value " + valueToFind + ": " + keys);
    }

}
