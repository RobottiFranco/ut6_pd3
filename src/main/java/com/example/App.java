package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public final class App {

    public static void main(String[] args) throws Exception {

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Galton", "notlag");
        hashMap.put("Juan", "nuaj");
        hashMap.put(null, null);
        hashMap.put("Julio", "oiluj");
        hashMap.put("Maria", "airam");
        hashMap.put("null", null);

        System.out.println("Antes: " + hashMap);

        eiminarNulos(hashMap);

        System.out.println("Después: " + hashMap);

        Map<String, String> invertido = invertirMapa(hashMap);

        System.out.println("invertido:" + invertido);
    }


    public static Map<String, String> invertirMapa(Map<String, String> hashMap) throws Exception {
        Map<String, String> invertedMap = new HashMap<>();

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String originalKey = entry.getKey();
            String originalValue = entry.getValue();

            if (invertedMap.containsKey(originalValue)) {
                throw new Exception("Valor duplicado encontrado: " + originalValue);
            }

            invertedMap.put(originalValue, originalKey);
        }

        return invertedMap;
    }

    public static void eiminarNulos(HashMap hashMap) {

        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getKey() == null || entry.getValue() == null) {
                iterator.remove();
            }
        }
    }
}
