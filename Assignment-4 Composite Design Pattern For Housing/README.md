# Composite Design Pattern Example: Building with Generic Housing Structures

This Java program demonstrates the implementation of the Composite Design Pattern using an example of a building composed of generic housing structures. The project consists of classes representing the building itself, floors, and rooms.

## Table of Contents

- [Project Overview](#project-overview)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributors](#contributors)
- [License](#license)
## Project Overview

The project demonstrates the Composite Design Pattern, where a complex structure (the building) is composed of smaller, similar structures (floors and rooms). The program allows you to interact with the building and its components, such as entering and exiting rooms.

## Getting Started

To run this project locally, follow these steps:

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/yourusername/composite-building.git
   cd composite-building
   javac *.java
   java Main

## Usage
Upon running the program, you can interact with the building and its components:

- Enter and exit the building, floors, and rooms.
- View the current location within the building.
- Explore the structure hierarchy.
## Project Structure
The project is organized into several classes:

- Main: The main class for running the program.
- IStructure: An interface defining common methods for structures.
- Housing: A composite class representing the building and its components.
- Room: A leaf class representing individual rooms.

## Contributors
- Forhan Shahriar Fahim

## Project Structure

The project structure is visualized in the following UML class diagram:

![Composite Design Pattern](Composite%20Design%20Pattern.png)

This diagram illustrates the structure of the project, including the relationships between classes and interfaces.

