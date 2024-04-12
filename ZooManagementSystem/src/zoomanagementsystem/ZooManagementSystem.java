/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoomanagementsystem;
/**
 *
 * @author AMD
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooManagementSystem {
    private List<Animal> animals;
    private List<Bird> aviary;
    private List<Fish> aquarium;
    private List<Mammal> savannah;
    private List<Reptile> jungle;

    public ZooManagementSystem() {
        animals = new ArrayList<>();
        aviary = new ArrayList<>();
        aquarium = new ArrayList<>();
        savannah = new ArrayList<>();
        jungle = new ArrayList<>();
    }

    public static void main(String[] args) {
      ZooManagementSystem zooManager = new ZooManagementSystem();
        zooManager.runZoo();
    }

    public void runZoo() {
        Scanner scanner = new Scanner(System.in);
        boolean continueAdding = true;

        System.out.println("----------------------------------------------------");
        System.out.println("                WELCOME TO THE ZOO!                 ");
        System.out.println("----------------------------------------------------");

        while (continueAdding) {
            System.out.println("Enter Animal Type |1.MAMMAL 2.BIRD 3.FISH 4.REPTILE |: ");
            int choice = scanner.nextInt();
            System.out.println("----- Enter details for animal -----");
            System.out.print("Animal Name       : ");
            String name = scanner.next();
            System.out.print("Animal Age        : ");
            int age = scanner.nextInt();
            System.out.print("Animal Weight(kg) : ");
            double weight = scanner.nextDouble();
            scanner.nextLine();

            Animal animal = null;
            switch (choice) {
                case 1:
                    animal = new Mammal(name, age, weight);
                    savannah.add((Mammal) animal);
                    break;
                case 2:
                    animal = new Bird(name, age, weight);
                    aviary.add((Bird) animal);
                    break;
                case 3:
                    animal = new Fish(name, age, weight);
                    aquarium.add((Fish) animal);
                    break;
                case 4:
                    animal = new Reptile(name, age, weight);
                    jungle.add((Reptile) animal);
                    break;
                default:
                    System.out.println("Invalid animal type. Please try again.");
            }

            animals.add(animal);
            System.out.println();
            System.out.println("Do you want to add another animal? (Y/N)");
            String input = scanner.nextLine();
            continueAdding = input.equalsIgnoreCase("Y");
        }

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("              ANIMALS IN THE ZOO                    ");
        System.out.println("----------------------------------------------------");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " | " + animal.getClass().getSimpleName() + " | " + "Age:" + animal.getAge() + " | " + "Weight:" + animal.getWeight());
        }

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("             HABITAT DETAILS                        ");
        System.out.println("----------------------------------------------------");
        System.out.println("Aviary  : " + aviary.size() + " birds");
        System.out.println("Aquarium: " + aquarium.size() + " fish");
        System.out.println("Savannah: " + savannah.size() + " mammals");
        System.out.println("Jungle  : " + jungle.size() + " reptiles");
        
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("             INTERACTIONS IN THE ZOO                ");
        System.out.println("----------------------------------------------------");

        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
            animal.sleep();

            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
            if (animal instanceof Climber) {
                ((Climber) animal).climb();
            }
        }
        System.out.println("----------------------------------------------------");
        scanner.close();
    }
}
