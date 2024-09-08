# Java Low-Level Design Patterns

This repository contains the implementation of various Low-Level Design (LLD) patterns in Java. These patterns help in designing robust, scalable, and maintainable software architectures. The repository covers Creational, Structural, and Behavioral design patterns.

## Design Patterns Implemented

### 1. Singleton Pattern
The Singleton pattern ensures a class has only one instance and provides a global point of access to it.

- **Use case**: Managing shared resources like database connections, logging instances, etc.

### 2. Abstract Factory Pattern
The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

- **Use case**: Building UI components or themes across different platforms.

### 3. Adapter and Facade Patterns
- **Adapter Pattern**: The Adapter pattern allows incompatible interfaces to work together by acting as a bridge.
    - **Use case**: Integrating third-party libraries or APIs with your application.

- **Facade Pattern**: The Facade pattern provides a simplified interface to a complex subsystem.
    - **Use case**: Simplifying complex API interactions for clients.

### 4. Builder Pattern
The Builder pattern separates the construction of a complex object from its representation so that the same construction process can create different representations.

- **Use case**: When building objects with numerous optional parameters (e.g., constructing a `House` with various optional rooms and features).

### 5. Decorator and Flyweight Patterns
- **Decorator Pattern**: The Decorator pattern allows behavior to be added to individual objects dynamically.
    - **Use case**: Adding new responsibilities to objects without altering their class (e.g., UI components with optional decorations).

- **Flyweight Pattern**: The Flyweight pattern minimizes memory usage by sharing as much data as possible with similar objects.
    - **Use case**: Optimizing performance in systems with numerous similar objects (e.g., characters in a text editor).

### 6. Factory Pattern
The Factory pattern provides a method for creating objects without exposing the instantiation logic to the client.

- **Use case**: Decoupling the creation of objects from the code that uses them (e.g., creating different shapes like Circle, Square).

### 7. Facade and Behavioral Design Patterns
This section includes additional patterns from the **Facade** and **Behavioral Design** categories such as:

- **Command Pattern**: Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.

- **Chain of Responsibility Pattern**: Allows a request to be passed down a chain of handlers until one of the handlers processes it.

### 8. Observer Pattern
The Observer pattern defines a one-to-many dependency between objects, where if one object changes state, all its dependents are notified and updated automatically.

- **Use case**: Implementing event-driven systems (e.g., UI listeners or a stock market price update system).

### 9. Strategy Pattern
The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.

- **Use case**: Implementing multiple algorithms (e.g., different sorting strategies) where clients can dynamically choose which algorithm to use.

### 10. Prototype and Factory Patterns
- **Prototype Pattern**: The Prototype pattern creates new objects by cloning an existing object.
    - **Use case**: Avoiding costly creation of objects through cloning (e.g., creating instances of a complex object graph).

- **Factory Pattern**: Covered earlier, but combined here with Prototype for comparison in specific cases.

## How to Run the Code

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/lld-design-patterns-java.git
   cd lld-design-patterns-java
