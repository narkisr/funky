package com.narkisr.funky;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Core {

    public static <T, U, R> Function<U, R> partial(BiFunction<T, U, R> f, T x) {
        return (y) -> f.apply(x, y);
    }
  

    public static void times(final int i, final IntConsumer action) {
      IntStream.range(0, i).forEach(action);
   }
}
