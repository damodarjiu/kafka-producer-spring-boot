package com.kafka.producer.writer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/** This sender class is used for send messages to kafka producer. */
@Service
public class Sender {

  @Autowired private KafkaTemplate<String, Object> kafkaTemplate;

  public <T> void send(String topic, T data) {
    kafkaTemplate.send(topic, data);
  }
}
