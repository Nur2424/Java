/* 
In Java, constructors play an important role in object creation. A constructor is a special block of code that
  is called when an object is created. Its main job is to initialize the object, to set up its internal state, 
  or to assign default values to its attributes. This process happens automatically when we use the "new" keyword 
  to create an object.
  
Characteristics of Constructors:

Same Name as the Class: A constructor has the same name as the class in which it is defined.
No Return Type: Constructors do not have any return type, not even void. The main purpose of a constructor is to initialize the object, not to return a value.
Automatically Called on Object Creation: When an object of a class is created, the constructor is called automatically to initialize the object’s attributes.
Used to Set Initial Values for Object Attributes: Constructors are primarily used to set the initial state or values of an object’s attributes when it is created.
Now, let us look at a simple example to understand how a constructor works in Java.

  */

// ✅ Example with a constructor:

public class Car {
    String model;
    int year;

    // Constructor
    public Car(String m, int y) {
        model = m;
        year = y;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020); // constructor is used here
        myCar.displayInfo();
    }
}

// Model: Toyota, Year: 2020

// ------------------------------------------------------------------------------------------------

// ❌ Example without a constructor (setting values manually):

public class Car {
    String model;
    int year;

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car myCar = new Car(); // default constructor (automatically provided by Java)
        myCar.model = "Toyota";  // setting values manually
        myCar.year = 2020;
        myCar.displayInfo();
    }
}

// Model: Toyota, Year: 2020



