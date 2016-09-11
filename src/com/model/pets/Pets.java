package com.model.pets;

/**
 * Created by kgdwhsk on 2016/9/11.
 */
import java.util.*;

public class Pets {
    public static final PetCreator creator =
            new LiteralPetCreator();
    public static Pet randomPet() {
        return creator.randomPet();
    }
    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
} ///:~
