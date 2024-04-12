/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoomanagementsystem;

/**
 *
 * @author AMD
 */
public class Reptile extends Animal {

    public Reptile(String name, int age, double weight) {
        super(name, age, weight);
    }
    
    @Override
    public void makeSound() {
     System.out.println(getName() +" Swish swish!!");
    }
    
    @Override
    public void eat() {
    System.out.println(getName() + " is eating");
    }
    
    @Override
    public void sleep() {
     System.out.println(getName() + " is sleeping");
    }
}