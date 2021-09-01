package com.kafka.producer.dto.request;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserRequest implements Serializable {
  private String id;
  private String fName;
  private String lName;
  private List<Book> books;
}
