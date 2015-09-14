![Java Core Interfaces](https://github.com/craterdog/java-core-interfaces/blob/master/docs/images/AppleCore.jpg)

### Java Core Interfaces
This project contains a set of Java core interaces that can be used to augment the common `Object`
methods and basic language interfaces.

### Highlighted Components
The following highlights the main core interfaces that this project provides:
 * *Primitive* - implemented by classes that define immutable primitive types
 * *Composite* - implemented by classes that define composite structures that require special formatting
 * *Sequential* - implemented by classes that allow their elements to be accessed sequentially
 * *Iterator* - implemented by classes that can iterate through the elements in a sequence
 * *Manipulator* - implemented by subclasses of Iterator that also allow elements to be inserted and removed from the sequence

### Quick Links
For more detail on this project click on the following links:
 * [javadocs](http://craterdog.github.io/java-core-interfaces/latest/index.html)
 * [wiki](https://github.com/craterdog/java-core-interfaces/wiki)
 * [release notes](https://github.com/craterdog/java-core-interfaces/wiki/releases)
 * [website](http://craterdog.com)

### Getting Started
To get started using these interfaces, include the following dependency in your maven pom.xml file:

```xml
    <dependency>
        <groupId>com.craterdog</groupId>
        <artifactId>java-core-interfaces</artifactId>
        <version>x.y</version>
    </dependency>
```

The source code, javadocs and jar file artifacts for this project are available from the
*Maven Central Repository*. If your project doesn't currently use maven and you would like to,
click [here](https://github.com/craterdog/maven-parent-poms) to get started down that path quickly.
