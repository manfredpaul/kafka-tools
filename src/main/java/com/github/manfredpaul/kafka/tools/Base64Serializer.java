package com.github.manfredpaul.kafka.tools;

import java.util.Base64;
import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;

public class Base64Serializer implements Serializer<String> {

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    @Override
    public byte[] serialize(String topic, String data) {
        return Base64.getDecoder().decode(data);
    }

    @Override
    public void close() {

    }
}
