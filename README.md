# Calculator App with JSON Parser

This project implements a simple calculator application and a JSON parser using Maven as the build system. It includes a basic calculator functionality and JSON parsing capabilities using Jackson's ObjectMapper.

## Project Structure

- `src/main/java/com/example/calculator/Calculator.java`: Contains the main calculator logic
- `src/main/java/com/example/calculator/JsonParser.java`: Contains the JSON parsing logic
- `pom.xml`: Maven configuration file for managing dependencies and building the project

## Requirements

- Java 8 or higher
- Apache Maven

## Building and Running

To build the project:

```
mvn clean package
```

To run the Calculator app:

```
java -cp target/calculator-app-1.0-SNAPSHOT.jar com.example.calculator.Calculator
```

To run the JsonParser:

```
java -cp target/calculator-app-1.0-SNAPSHOT.jar com.example.calculator.JsonParser
```

## Usage

### Calculator

The `Calculator` class provides the following methods:

- `add(double a, double b)`: Adds two numbers
- `subtract(double a, double b)`: Subtracts the second number from the first
- `multiply(double a, double b)`: Multiplies two numbers
- `divide(double a, double b)`: Divides the first number by the second

Example usage can be found in the `main` method of the `Calculator` class.

### JsonParser

The `JsonParser` class provides the following methods:

- `parse(String json)`: Parses a JSON string into a JsonNode
- `parseObject(String json, Class<T> valueType)`: Parses a JSON string into a specified object type
- `toJson(Object obj)`: Converts an object to a JSON string

Example usage can be found in the `main` method of the `JsonParser` class.

## Dependencies

The project uses the following external dependency:

- Jackson Databind: For JSON parsing and object mapping

The dependency is managed by Maven and will be automatically downloaded when building the project.
