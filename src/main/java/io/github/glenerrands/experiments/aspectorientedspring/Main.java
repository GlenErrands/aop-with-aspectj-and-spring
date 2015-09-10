package io.github.glenerrands.experiments.aspectorientedspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("/io/github/glenerrands/experiments/aspectorientedspring/applicationContext.xml");
        context.getBean(App.class).run();
    }

}