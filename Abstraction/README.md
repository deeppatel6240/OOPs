# Abstraction

Abstraction is one of the piller of Object-Oriented Programming concept.

### Definitions of Abstraction

1. Hiding internal details and showing functionality is known as abstraction. Applying abstraction means that each
   object should only expose a high-level mechanism for using it.
2. Process of selecting the key aspects (Attributes, Behaviors) of an object and Ignoring the rest as per the domain
   requirements.

### Real World Examples

* ATM where a person is withdrawing cash. He inserts his card to withdraw cash or to check the amount in his account. In
  this scenario, implementation details are hidden from the user. He receives the cash through the machine ( which is
  only visible to the user).
* giving the user the ability to drive the car without the need to understand tiny details of ‘how does the engine
  work’.
* We all know how to turn the Vehicle on, but we don’t need to know how it works in order to drive it. This is an
  example of Abstraction.

### When to use Abstract Methods & Abstract Class?

Abstract methods are mostly declared where two or more subclasses are also doing the same thing in different ways
through different implementations. It also extends the same Abstract class and offers different implementations of the
abstract methods.

Abstract classes help to describe generic types of behaviors and object-oriented programming class hierarchy. It also
describes subclasses to offer implementation details of the abstract class.

### What are the different types of abstraction?

1. There are two types of abstraction.
    * Data Abstraction
    * Process Abstraction

* Data Abstraction

      When the object data is not visible to the outer world, it creates data abstraction. If needed, access to the Objects’ data is provided through some methods.
      Data Abstraction is hiding instance class variables from the worlds.

* Process Abstraction

      We don’t need to provide details about all the functions of an object. 
      When we hide the internal implementation of the different functions involved in a user operation, it creates process abstraction.

### How do we achieve Abstraction in Java?

1. There are 2 ways by which we can achieve abstraction in Java.
    * By Abstract class
    * By using Interfaces

#### Abstract class

* An abstract class is a special class in Java that can have abstract methods.
* We cannot initialize abstract classes directly.
* The abstract class can have regular methods and properties as well.
* If an abstract class extends another abstract class but the implementation of abstract methods is not required.
* The first non-abstract class that extends the abstract class must implement all its abstract methods.
* The class can extend only one abstract class by the rules of inheritance to avoid the diamond problem.
* An abstract class can extend another Java class and implement multiple Java interfaces.

#### Abstract Methods

* The method name should be same.
* The number, order, and data type of argument should be same. Data type can be covariant as well.
* Access modifier should be same or more accessible.
* If overriding method throws exception in the method declaration. Exception should be same or smaller(child exceptions)
  than parent’s class method or no exception at all.

```java
// abstract class and parent class used to achieve abstraction in our project.
public abstract class Shape {

    //final data member
    public static final double MATH_PI = 3.14;

    //declaration of method
    public abstract double calculateArea();

    //declaration of method
    public abstract double calculatePerimeter();

}
```

#### Shape is abstract class, and it's extended by Circle, Rectangle and Square child class and they all are implementing abstract methods like calculateArea, calculatePerimeter which you can observe in my project.

### How does abstraction help in hiding the implementation details in Java?

1. Only passing reference of abstract class in main method, we can access subclasses and it's method results also we
   doesn't need to understand about its implementations. you can see in this below code.

```java
public class Main {
    public static void main(String[] args) {

        // Using Abstract class achieving abstraction
        Shape shape;

        // Creating Object of Circle
        shape = new Circle(1.0f);

        shape.calculateArea();
        shape.calculatePerimeter();

        // Creating Object of Rectangle
        shape = new Rectangle(2.0f, 4.0f);

        shape.calculateArea();
        shape.calculatePerimeter();

        // Creating Object of Square
        shape = new Square(5.0f);

        shape.calculateArea();
        shape.calculatePerimeter();
    }
}
```

2. I have another utility class which can compare two area and perimeter of 2 shapes,  It will just take a Shape (abstract class) as an argument, then get its area and perimeter and save it to its internal database, like so:

```java
public class ShapeAreaPerimeterComparisonEngine {

    public static void compareAreaOfShape(Shape shape1, Shape shape2) {

        double areaOfShape1 = shape1.calculateArea();
        double areaOfShape2 = shape2.calculateArea();

        System.out.println("Area of shape1 is: " + areaOfShape1 + " and Area of shape2 is: " + areaOfShape2);

    }

    public static void comparePerimeterOfShape(Shape shape1, Shape shape2) {

        double perimeterOfShape1 = shape1.calculatePerimeter();
        double perimeterOfShape2 = shape2.calculatePerimeter();

        System.out.println("Perimeter of shape1 is: " + perimeterOfShape1 + " and Perimeter of shape2 is: " + perimeterOfShape2);

    }
}
```

#### How are the implementation details hidden exactly? 

Well, ShapeAreaPerimeterComparisonEngine does not know how calculateArea(), calculatePerimeter() methods of a concrete implementation of Shape works (that is: For example, Circle.calculateArea() or Circle.calculatePerimeter() is implemented). It only knows they are a methods that returns an double (and that it should return area and perimeter). The implementation details are hidden inside the concrete classes that extend abstract class Shape.

#### Interface

* The interface can have only abstract methods except for static and default methods. Also, If we declare static and default method in interface then we must have to write method body and if you declare abstract methods then we must not have to write body part.
* we can not write private and protected method in interfaces. An interface can only have public abstract methods except static and default. (Since Java 9, we can have private methods in an interface.)
* Variables of interfaces are final by default. Abstract classes may or may not have a final variable.
* It supports multiple inheritances. Also It can not provide the implementation of the abstract class.
* We cannot initialize the interface directly.
* public abstract is optional to type for methods in the interface. It will be injected by default.
* public static final is optional to type for properties(variables). It will be injected by default.
* We need to use implements keyword to implement our interface. One class can implement multiple interfaces.

1. Here Shape is my interface and Circle, Rectangle and Square is my normal classes that implements all interface methods.

```java
// interface to achieve abstraction
public interface Shape {

    double MATH_PI = 3.14;

    // public abstract will be injected by default
    double calculateArea();

    // public abstract will be injected by default
    double calculatePerimeter();
}
```

2. ShapeFactoryDesign is a factory class that returns the Shape interface implementation based on the input parameter.

```java
public class ShapeFactoryDesign {

    public static Shape getShape(String shape) {
        if (shape == null) {
            return null;
        } else if ("Circle".equals(shape)) {
            return new Circle(3.0f);
        } else if ("Rectangle".equals(shape)) {
            return new Rectangle(10f, 10f);
        } else if ("Square".equals(shape)) {
            return new Square(5f);
        } else {
            return null;
        }
    }
}
```
3. This is the main method based on the ShapeFactoryDesign.getShape parameter it returns the corresponding Shape implementation. So here in the Main class perspective, the Shape interface implementation is completely hidden. It just calls the calculateArea function of whatever the shape implementation which returned by ShapeFactoryDesign.getShape method. In short, we can say like the implementation logic is completely hidden from the Main class.

```java
public class Main {
    public static void main(String[] args) {
        // Using Interface for achieving abstraction
        com.deep.usingInterface.Shape shape1;

        // Creating Object of Circle
        shape1 = ShapeFactoryDesign.getShape("Circle");

        shape1.calculateArea();
        shape1.calculatePerimeter();

        // Creating Object of Rectangle
        shape1 = ShapeFactoryDesign.getShape("Rectangle");

        shape1.calculateArea();
        shape1.calculatePerimeter();

        // Creating Object of Square
        shape1 = ShapeFactoryDesign.getShape("Square");
        shape1.calculateArea();
        shape1.calculatePerimeter();

        System.out.println("Comparing two shapes using another utility");
        shapeComparisonByPassingInterfaceMethod();
    }
}
```

