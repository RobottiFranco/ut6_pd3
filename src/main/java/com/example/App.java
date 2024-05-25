package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public final class App {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Galton", "Galton");
        hashMap.put("Juan", "Juan");
        hashMap.put(null, null);
        hashMap.put("Julio", "Julio");
        hashMap.put("Maria", "Maria");
        hashMap.put("null", null);

        System.out.println("Antes: " + hashMap);

        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getKey() == null || entry.getValue() == null) {
                iterator.remove();
            }
        }

        System.out.println("Después: " + hashMap);
    }
}
