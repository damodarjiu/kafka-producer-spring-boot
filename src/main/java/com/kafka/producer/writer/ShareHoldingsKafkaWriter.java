package com.kafka.producer.writer;

import java.awt.*;
import java.util.List;

import com.kafka.producer.dto.request.ShareHoldingsInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShareHoldingsKafkaWriter implements IWriter<ShareHoldingsInformation> {

  @Autowired private Sender sender;

  @Override
  public void write(List<? extends ShareHoldingsInformation> items) {
    items.forEach(
        item -> {
          sender.send("damodarjava", item);
        });
  }
}
