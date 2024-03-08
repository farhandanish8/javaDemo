package com.util.maps;

import java.util.*;

public class MapStateDemo {
    public static void main(String[] args) {
        Map<String, List<String>> stateMap= new HashMap<>();
        stateMap.put("Karnataka", Arrays.asList("Bangalare","Tumkur","Davanagere"));
        stateMap.put("Kerala", Arrays.asList("Munnar","Kozhikode","Kochi"));
        stateMap.put("TamilNadu", Arrays.asList("Vellore","Coimbatore","Madurai"));

        Set<Map.Entry<String,List<String>>>enteries = stateMap.entrySet();



    }
}
