package com.github.manfredpaul.kafka.tools;

import java.util.Base64;
import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

public class Base64Deserializer implements Deserializer<String> {

    @Override
    public void configure(Map configs, boolean isKey) {

    }

    @Override
    public String deserialize(String topic, byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }

    @Override
    public void close() {

    }
}
