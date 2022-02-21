package com.qkrfowns45.firstproject.ioc;

public abstract class IngreDient {
    private String name;

    public IngreDient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
