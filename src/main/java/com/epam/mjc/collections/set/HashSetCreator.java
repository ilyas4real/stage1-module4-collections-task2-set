package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : sourceList) {
            if (i%2==0) {
                hashSet.add(i);
                while (i%2==0) {
                    hashSet.add(i/2);
                    i /= 2;
                }
            } else {
                hashSet.add(i);
                hashSet.add(i*2);
            }
        }
        return hashSet;
    }
}
