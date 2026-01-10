# $Data$ $Carrier$ $Classes$

## $What$ $are$ $Data$ $Carrier$ $Classes?$

- Data Carrier Classes, also known as DTOs (Data Transfer Objects), are simple classes that are used to transfer data between different parts of a program or between different systems. They typically contain only fields and accessors (getters and setters) without any business logic.

## $Purpose$ $of$ $Data$ $Carrier$ $Classes$

- The main purpose of Data Carrier Classes is to encapsulate data and provide a structured way to transfer it. They help in reducing the number of method calls by bundling multiple data items into a single object, making the code cleaner and easier to maintain.

## $When$ $to$ $Use$ $Data$ $Carrier$ $Classes$

- Use Data Carrier Classes when you need to transfer data between different layers of an application (e.g., from the service layer to the presentation layer) or between different systems (e.g., via APIs).

## $Implementation$

- `Record` keyword in Java (introduced in Java 14) can be used to create Data Carrier Classes easily. Records automatically generate constructors, accessors, equals(), hashCode(), and toString() methods. [See here](./RecordClasses.java#L54).
  - All the variables here are `private` and `final` by default.
  - A record class **cannot extend another class** but **can implement interfaces**.
  - We can reconfigure the generated methods if needed. [See here](./RecordClasses.java#L55).
  - [Canonical Contructor](./RecordClasses.java#L63).
