package com.pcschool.ocp.d08.case1;

import java.util.Arrays;

public class PetStore {
    public static void main(String[] args) {
        Pet[] pets = {new Chihuahua(), new Yorkshire(), new Yorkshire()};
        Arrays.stream(pets)
                .forEach(p -> p.skill());
        
    }
}
