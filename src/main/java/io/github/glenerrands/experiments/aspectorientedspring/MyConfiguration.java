package io.github.glenerrands.experiments.aspectorientedspring;

public class MyConfiguration {

    private boolean executionTrigger = false;

    public boolean shouldExecuteFor(Object anObject) {
        executionTrigger = !executionTrigger;
        System.out.println("should execute " + anObject + "? " + executionTrigger);
        return executionTrigger;
    }

}