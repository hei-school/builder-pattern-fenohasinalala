# DESIGN PATTERN - BUILDER

This project consists in creating a car and its manual using design pattern builder with director.

## Requirements

### JDK installation

Depending on the OS, [download and install](https://docs.oracle.com/en/java/javase/17/install/overview-jdk-installation.html) (Java) JDK 17

## Linter and Coding standard

### Coding standard

The coding standard used is Google java style guide.

#### Linter

The linter used is checkstyle, configured with gradle.

#### Formatter

The formatter used is Google-java-format, executed with the script format.sh as follows:

```shell
    ./format.sh
```

### Usage

- To clean previous builds:

```shell
    ./gradlew clean
```

- To build:

```shell
    ./gradlew assemble
```

- To run tests:

```shell
    # Clean & Build then run:
    ./gradlew test checkstyleMain checkstyleTest
```

- To run the application:

```shell
    # Set Environment variables on CLI and then run:
    ./gradlew bootRun
```

## License

This project is licensed under the [MIT License](LICENSE.md).


[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/eYTuOlgZ)
