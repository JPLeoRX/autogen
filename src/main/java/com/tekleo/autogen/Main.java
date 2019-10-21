package com.tekleo.autogen;

import com.tekleo.autogen.pom.objects.PomProperties;
import com.tekleo.autogen.pom.objects.PomProperty;

public class Main {
    public static void main(String[] args) {
        PomProperty p1 = new PomProperty("java.version", "1.8");
        PomProperty p2 = new PomProperty("spring-cloud.version", "Greenwich.SR2");

        PomProperties all = new PomProperties(p1, p2);
        System.out.println(all.getFilled());
    }
}
