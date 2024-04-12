/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoomanagementsystem;

/**
 *
 * @author AMD
 */
public class Fish extends Animal implements Swimmable {
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }
    
    @Override
    public void makeSound() {
    System.out.println(getName() + " Blub blub!!");
    }
    
    @Override
    public void eat() {
    System.out.println(getName() + " is eating");
    }
    
    @Override
    public void sleep() {
    System.out.println(getName() + " is resting in the seabed");
    }
    
    @Override
    public void swim() {
     System.out.println(getName() + " swims");
    }
}