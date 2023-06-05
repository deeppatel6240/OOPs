# Encapsulation

Encapsulation is one of the piller of Object-Oriented Programming concept.

### Definitions of Encapsulation

1. Encapsulation is a mechanism of wrapping the data (instance variables) and code acting on the data (instance methods)
   together as a single unit(i.e. class).
2. For reference Encapsulation can be defined as “Binding of data and functions together into a single unit such that
   they are kept both safe from outside interference and misuse.”

### Real World Examples

* An organization is consists of several departments like the production department, purchase department, sales
  department, and Accounts department. It combines all these departments together and had formed the organization. if
  you want to access or need anything from any departments you can not directly access it. you need to contact
  administration (methods in java) in order to access something from any departments.
* Talking about Bluetooth which we usually have in our mobile. When we switch on a Bluetooth, I am able to connect to
  another mobile or Bluetooth enabled devices but I’m not able to access the other mobile features like dialling a
  number, accessing inbox etc. This is because the Bluetooth feature is given some level of restriction.

### Why do we need to encapsulate?

1. If the property has public access, the client code can have direct access and can assign any value. By encapsulating
   we have one layer where we can control what comes to our property in our setter method.
2. You can think of it as a protective shield that prevents the data from being accessed by the code outside this
   shield. So that instance variable (data) of a class is hidden from any other class and can be accessed only through
   any member function of its own class in which it is declared.

### How to Achieve Encapsulation?

1. Declaring the instance variables of a class as private.
2. Providing public setter and getter methods to modify and view the values of the variables.
   Private member variables are only accessible with in the class . Only by using the getter methods the private members
   can be accessed outside the class.

### Data Hiding vs Encapsulation

* The process of hiding the data of an entity from other entities is called Data Hiding . It is made possible because of
  Encapsulation. The purpose of Data Hiding is to prevent corruption of data by other entities.

Exa. In real life context, All the things that we have in our houses can be thought of as our data. Different type of
people such as unknown visitors, friends and relatives come to our house. We don’t want to show each and every item of
our house to each person hence we apply different access rules to them.

Encapsulation isn’t Data Hiding.

Encapsulation is the means (saadhan) and Data Hiding is the end (lakshaya) . Because of the one the other is possible.
When we create a group we encapsulate, and when we apply different access rule on its members we do data hiding. We
can’t hide data without groups, but we can create groups without data hiding. These groups will act like public places
such as roads, parks etc. where all the persons have same access.

<p align="center">
<img src="https://drive.google.com/uc?export=view&id=10zGBW2XsUwxo0MKMe0v2zNG2qxpE5nx0" height="400px" width="500px">
</p>   

### What is the use of encapsulation when I'm able to change the property values with setter methods?

Assume you have an age property.

The user can enter a value of -10, which although is a valid number, is an invalid age. A setter method could have logic
which would allow you to catch such things.

Another scenario, would be to have the age field, but hide it. You could also have a Date of Birth field, and in it's
setter you would have something like so:

```java
public class Person {
    private int age;
    private Date dob;

    public void setDateOfBirth(Date dob) {
        this.dob = dob;
        age = 12; //some logic to calculate the age from the Date of Birth.
    }
}
```

### Advantage of Encapsulation in Java

1. The encapsulated code is more flexible and easy to change with new requirements.
2. It prevents the other classes to access the private fields.
3. Encapsulation allows modifying implemented code without breaking other code that has implemented the code.
4. It keeps the data and codes safe from external inheritance. Thus, Encapsulation helps to achieve security.
5. It improves the maintainability of the application.
6. If you don’t define the setter method in the class then the fields can be made read-only.
7. If you don’t define the getter method in the class then the fields can be made write-only.

### Implementation of Encapsulation

1. I have one class Shape which has class variables and getter/setter methods, and it will bind of data and functions
   together into a single unit. it has a private class variables.

```java
public class Shape {

    private String name;
    private double height;
    private double width;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}
```

2. you can see that I have make class variables private, so it can be not accessible by another class or outside the
   worlds. In order to access it we need to call getter and setter methods.

```java
public class Main {
    public static void main(String[] args) {

        // Shape Encapsulated class's object
        Shape shape = new Shape();

        /*
         *  shape.color="yellow";
         *  'color' has private access in 'Shape', this can not be done.
         */

        shape.setColor("blue");
        shape.setName("rectangle");
        shape.setHeight(5.5);
        shape.setWidth(3.5);

        System.out.println(shape);

    }
}
```

3. I have one class Shape1 which has class variables and getter/setter methods, and it will bind of data and functions
   together into a single unit, but it has a class variable, but it's not private.

```java
public class Shape1 {
    String name;
    double height;
    double width;
    String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}
```

4. you can see that I have make class variables not private, so it can be accessible by another class or outside the
   worlds. In order to access it we need don't need to use class methods so in order to achieve data hiding by encapsulation. so you must keep class variables private to protect data from outside the class.

```java
public class Main {
    public static void main(String[] args) {

        // Shape1 class's object
        Shape1 shape1 = new Shape1();

        shape1.name = "121";
        shape1.height = 2.5;
        shape1.width = 7.5;
        shape1.color = "red";

        System.out.println(shape1);
    }
}
```

5. In above steps you can see that I can access those class variables without calling getter/setter methods of the class (Single unit).
