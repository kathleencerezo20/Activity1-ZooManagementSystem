/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoomanagementsystem;

/**
 *
 * @author AMD
 */
public class Monkey extends Primate implements Climber {
    public Monkey(String name, int age, double weight) {
        super(name, age, weight);
    }
    
    @Override
    public void climb() {
        System.out.println("Monkey climbs");
    }
}