package day07.theory;

public class Dog {
    
    public String breed;
    public int age;
    public String color;
    public String name;
    
    public void bark() {
        System.out.println(" is barking");
    }
    
    public void eat() {
        System.out.println(" is eating");
    }
    
    public void sleep() {
        System.out.println(" is sleeping");
    }
    
    public void info() {
        System.out.println("Age\t\t: " + age);
        System.out.println("Breed\t: " + breed);
        System.out.println("Name\t: " + name);
        System.out.println("Color\t: " + color);
        System.out.println(name + " is barking, eating, sleeping\n");
    }
}
