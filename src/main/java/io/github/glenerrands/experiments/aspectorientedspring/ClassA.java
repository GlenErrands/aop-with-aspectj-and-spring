package io.github.glenerrands.experiments.aspectorientedspring;

public class ClassA {

    private String name;

    public ClassA(String name) {
        this.name = name;
    }

    public void someMethod() {
        System.out.println("someMethod(\"" + name + "\") called on " + this);
    }

}