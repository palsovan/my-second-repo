# JSON Parser Project

This project implements a simple JSON parser using Jackson's ObjectMapper in Java. It also includes an Ant build file for easy compilation and execution, as well as a GitHub Actions workflow for continuous integration.

## Project Structure

- `src/main/java/JsonParser.java`: Contains the main JSON parsing logic
- `build.xml`: Ant build file for compiling and running the project
- `.github/workflows/build.yml`: GitHub Actions workflow file

## Requirements

- Java 11 or higher
- Apache Ant
- Jackson library (add the JAR files to the `lib` directory)

## Building and Running

To build the project:

```
ant compile
```

To run the project:

```
ant run
```

To create a JAR file:

```
ant jar
```

## GitHub Actions

The project includes a GitHub Actions workflow that automatically builds and runs the project on every push to the main branch or when a pull request is created.

## Usage

The `JsonParser` class provides the following methods:

- `parse(String json)`: Parses a JSON string into a JsonNode
- `parseObject(String json, Class<T> valueType)`: Parses a JSON string into a specified object type
- `toJson(Object obj)`: Converts an object to a JSON string

Example usage can be found in the `main` method of the `JsonParser` class.
