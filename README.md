# Vehicle Rental Management System (OOP)

## Project Overview
This project is a Java-based application designed to manage vehicle rentals using core Object-Oriented Programming (OOP) principles. The system allows for the registration of different vehicle types (Cars and Bikes) and dynamically calculates rental costs based on specific pricing logic for each vehicle type.

## Key Features
- **Vehicle Hierarchy**: A robust base class structure that defines common attributes like registration numbers and brands.
- **Dynamic Pricing**: Implementation of specialized rental calculation logic for Cars (including service fees) and Bikes.
- **Interactive UI**: A console-based interface that accepts real-time user input for vehicle details and rental duration.
- **OOP Implementation**: Full use of Inheritance, Polymorphism, and Method Overriding.

## Technical Architecture
- **Base Class**: `Vehicle`
- **Subclasses**: `Car`, `Bike`
- **Logic**: 
  - `Car`: (Rent per day * days) + Service Fee
  - `Bike`: (Rent per day * days)

## Problems Faced & Solutions

### 1. Input Buffer Issues
**Problem**: While using the `Scanner` class, switching from `nextDouble()` or `nextInt()` to `nextLine()` caused the program to skip user input fields because of the leftover newline character in the buffer.
**Solution**: I implemented an extra `sc.nextLine()` call immediately after reading numeric values to clear the buffer before reading the next string input.

### 2. Code Redundancy
**Problem**: Initially, I was writing duplicate code for common attributes (like brand and vehicle number) in every subclass.
**Solution**: I utilized the `super()` keyword in subclass constructors to pass shared data to the parent class constructor, ensuring a DRY (Don't Repeat Yourself) approach and cleaner code.

### 3. Dynamic Calculation
**Problem**: Ensuring that the correct calculation method was called when using a generic `Vehicle` reference.
**Solution**: Leveraged **Method Overriding** and **Dynamic Method Dispatch** (Polymorphism). This allowed the JVM to determine the correct method to execute at runtime based on whether the object was a `Car` or a `Bike`.

## Learnings
- **Polymorphism**: Mastered how to use a single parent-class reference to handle multiple subclass objects flexibly.
- **Constructor Chaining**: Understood how `super()` maintains the integrity of the object hierarchy.
- **Resource Management**: Learned the importance of closing input streams (Scanner) to prevent memory leaks.
- **Real-world Modeling**: Gained insight into how physical business entities can be translated into efficient class structures.

---
*Created as part of the OOP Design & Implementation Project.*
