package com.deep.creational;

// Product
class Computer {
    private String cpu;
    private String gpu;
    private int ram;
    private int storage;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void showSpecs() {
        System.out.println("CPU: " + cpu);
        System.out.println("GPU: " + gpu);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
    }
}

// Builder
interface ComputerBuilder {
    void setCpu(String cpu);
    void setGpu(String gpu);
    void setRam(int ram);
    void setStorage(int storage);
    Computer build();
}

// Concrete Builder
class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    public void setCpu(String cpu) {
        computer.setCpu(cpu);
    }

    public void setGpu(String gpu) {
        computer.setGpu(gpu);
    }

    public void setRam(int ram) {
        computer.setRam(ram);
    }

    public void setStorage(int storage) {
        computer.setStorage(storage);
    }

    public Computer build() {
        return computer;
    }
}

// Director
class ComputerEngineer {
    private ComputerBuilder computerBuilder;

    public ComputerEngineer(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void constructComputer() {
        computerBuilder.setCpu("Intel Core i9");
        computerBuilder.setGpu("Nvidia RTX 3080");
        computerBuilder.setRam(32);
        computerBuilder.setStorage(1000);
    }

    public Computer getComputer() {
        return computerBuilder.build();
    }
}

// Client
public class Builder {
    public static void main(String[] args) {
        ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerEngineer computerEngineer = new ComputerEngineer(gamingComputerBuilder);

        computerEngineer.constructComputer();
        Computer gamingComputer = computerEngineer.getComputer();
        System.out.println("Gaming Computer Specs:");
        gamingComputer.showSpecs();
    }
}