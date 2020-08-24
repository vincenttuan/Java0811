package com.pcschool.ocp.d11.case2;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

public class ItemGroupDemo {

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("蘋果", 10, new BigDecimal("9.99")), // 一箱
                new Item("香蕉", 20, new BigDecimal("19.99")),
                new Item("柳丁", 10, new BigDecimal("29.99")),
                new Item("西瓜", 10, new BigDecimal("29.99")),
                new Item("木瓜", 20, new BigDecimal("9.99")),
                new Item("蘋果", 10, new BigDecimal("9.99")),
                new Item("香蕉", 10, new BigDecimal("19.99")),
                new Item("蘋果", 20, new BigDecimal("9.99"))
        );
        // 每一種水果各有幾箱 ?
        Map<String, Long> group1 = items.stream()
                .collect(groupingBy(Item::getName, counting()));
        System.out.println(group1);
    }
}
