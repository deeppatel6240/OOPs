package com.deep.creational;

interface Window {

    void setTitle(String title);

    void render();

}

class WindowsWindow implements Window {

    private String title;

    @Override
    public void setTitle(String title) {
        this.title = title;
        System.out.println("Windows title is: " + title);
    }

    @Override
    public void render() {
        System.out.println("Windows window is rendering");
    }
}

class MACOSsWindow implements Window {

    private String title;

    @Override
    public void setTitle(String title) {
        this.title = title;
        System.out.println("MACOS title is: " + title);
    }

    @Override
    public void render() {
        System.out.println("MACOSs window is rendering");
    }
}


interface Button {

    void click();

}

class WindowsButton implements Button {

    @Override
    public void click() {
        System.out.println("Windows button is clicking");
    }
}

class MACOSsButton implements Button {

    @Override
    public void click() {
        System.out.println("MACOSs button is clicking");
    }
}


interface GUIFactory {

    Window createWindow();

    Button clickButton();

}

class WindowFactory implements GUIFactory {

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }

    @Override
    public Button clickButton() {
        return new WindowsButton();
    }

}

class MACOSFactory implements GUIFactory {

    @Override
    public Window createWindow() {
        return new MACOSsWindow();
    }

    @Override
    public Button clickButton() {
        return new MACOSsButton();
    }
}

public class AbstractFactory {

    public static void main(String[] args) {

        GUIFactory factory = guiFactory("Windows");

        Window window = factory.createWindow();
        Button button = factory.clickButton();

        window.setTitle("Deep");
        window.render();

        button.click();
    }

    public static GUIFactory guiFactory(String osType) {

        if (osType.equals("Windows")) {
            return new WindowFactory();
        } else if (osType.equals("Mac")) {
            return new MACOSFactory();
        } else {
            System.out.println("invalid input");
            return null;
        }
    }
}