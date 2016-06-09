package com.narkisr.funky;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Into {

  public static <T> List<T> into(Stream<T> input) {
     return input.collect(Collectors.toList());
  }
}
