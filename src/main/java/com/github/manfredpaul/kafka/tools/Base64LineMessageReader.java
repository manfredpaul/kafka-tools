package com.github.manfredpaul.kafka.tools;

import java.io.InputStream;
import java.util.Properties;

import org.apache.kafka.clients.producer.ProducerRecord;

import kafka.common.MessageReader;

public class Base64LineMessageReader implements MessageReader {

    @Override
    public void init(InputStream inputStream, Properties props) {

    }

    @Override
    public ProducerRecord<byte[], byte[]> readMessage() {
        return null;
    }

    @Override
    public void close() {

    }
}
