package com.example.crudapplication;

import java.util.HashMap;
import java.util.Map;

public class CustomerDatabase {

    private Map<Integer, Map<String, String>> data = new HashMap<>();
    private Integer nextKey = 0;

    public int saveCustomer(Map<String, String> customerRecord) {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        customerRecord.put("_id", (++nextKey).toString());
        data.put(nextKey, customerRecord);
        return nextKey;
    }

    public Map<Integer, Map<String,String>> getData() {
        return data;
    }
}
