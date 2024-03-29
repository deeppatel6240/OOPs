package com.deep.creational;

// Prototype interface
interface Prototype1 {
    Prototype1 clone();
}

// Concrete prototype
class ConcretePrototype implements Prototype1 {
    private String property;

    public ConcretePrototype(String property) {
        this.property = property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

    public Prototype1 clone() {
        return new ConcretePrototype(this.property);
    }
}

// Client
public class Prototype {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Initial property value");

        // Cloning the prototype
        ConcretePrototype clonedPrototype = (ConcretePrototype) prototype.clone();

        // Modifying the cloned object
        clonedPrototype.setProperty("Modified property value");

        // Printing properties of original and cloned objects
        System.out.println("Original Prototype Property: " + prototype.getProperty());
        System.out.println("Cloned Prototype Property: " + clonedPrototype.getProperty());
    }
}