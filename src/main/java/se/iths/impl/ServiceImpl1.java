package se.iths.impl;

import se.iths.spi.Service;

public class ServiceImpl1 implements Service {
    public String getName() {
        return "Valutaomvandlare";
    }

    public void execute() {
        System.out.println("100 USD = 950");
    }
}
