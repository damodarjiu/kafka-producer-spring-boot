package com.kafka.producer.writer;

import java.util.List;

/**
 * IWriter interface will used for write data objects into kafka producer.
 *
 * @param <T> Item list.
 */
public interface IWriter<T> {
  void write(List<? extends T> items);
}
