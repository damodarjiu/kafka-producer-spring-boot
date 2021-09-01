package com.kafka.producer.writer;

import com.kafka.producer.dto.request.UserRequest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserKafkaWriter implements IWriter<UserRequest> {

  @Autowired private Sender sender;

  @Override
  public void write(List<? extends UserRequest> items) {
    items.forEach(
        item -> {
          sender.send("damodarjava", item);
        });
  }
}
