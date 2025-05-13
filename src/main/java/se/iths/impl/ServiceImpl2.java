package se.iths.impl;

import se.iths.spi.Service;

public class ServiceImpl2 implements Service {
    public String getName() {
        return "Enkel räknare";
    }

    public void execute() {
        System.out.println("2 + 2 = 4");
    }
}
