package com.company;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @org.junit.jupiter.api.Test
    void testGetName() {
        Dog dog = new Dog("Albert", 2);
        assertEquals("Albert", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}