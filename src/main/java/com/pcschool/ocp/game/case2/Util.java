package com.pcschool.ocp.game.case2;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Util {
    public static int[] getRandomIntArray(int n) {
        Set<Integer> set = new LinkedHashSet<>();
        while (set.size() < n) {            
            set.add(new Random().nextInt(9) + 1);
        }
        return set.stream().mapToInt(e->e).toArray();
    }
}
