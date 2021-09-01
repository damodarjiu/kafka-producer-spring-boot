package com.kafka.producer.dto.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class Book implements Serializable {
  private String bookId;
  private String bookName;
}
