package se.iths;

import se.iths.spi.Service;

import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<Service> loader = ServiceLoader.load(Service.class);

        System.out.println("Available services:");
        int index = 1;
        Service[] services = new Service[10];

        for (Service service : loader) {
            System.out.println(index + ". " + service.getName());
            services[index - 1] = service;
            index++;
        }

        if (index == 1) {
            System.out.println("Inga tjänster hittades!");
            return;
        }

        System.out.print("Choose service (number): ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice > 0 && choice < index) {
            services[choice - 1].execute();
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
