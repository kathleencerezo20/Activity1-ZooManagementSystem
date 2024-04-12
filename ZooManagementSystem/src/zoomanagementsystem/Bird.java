/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoomanagementsystem;

/**
 *
 * @author AMD
 */
public class Bird extends Animal implements Flyable {
    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + " Chirp chirp!!");
    }
    
    @Override
    public void eat() {
     System.out.println(getName() + " is eating");
    }
    
    @Override
    public void sleep() {
       System.out.println(getName() + " is sleeping");
    }
    
    @Override
    public void fly() {
         System.out.println(getName() + " flies");
        
    }
}