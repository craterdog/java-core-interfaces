#Java Core Interfaces

This project contains a set of Java core interaces that can be used to augment the common `Object`
methods and basic language interfaces. The following core interfaces are included in this project:

 * *Composite* - to be implemented by classes that define composite structures that require special formatting.
 * *Sequencial* - to be implemented by classes that allow their elements to be accessed sequencially (an extension
the `java.lang.Iterable` interface).

To get started using these interfaces, include the following dependency in your maven pom.xml file:

```xml
    <dependency>
        <groupId>com.craterdog</groupId>
        <artifactId>java-core-interfaces</artifactId>
        <version>3.0</version>
    </dependency>
```
