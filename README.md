# Java 10 Examples

This project shows some examples on how to use the JEP286, the Local-Variable Type Inference, implemented on Java Version 10.

## Basic examples:

It's possible to use on primitive types:

```java
var i = 10; // It's an int
```

Refer to `org.java10.examples.BasicExample` class.


It's possible to use on Java API classes:

```java
var hello = "Hello!";
```

Refer to `org.java10.examples.ObjectExample` class.

## Complex example:

It's possible to build developed objects:

```java
var Product = new Product("Good Laptop", 1000f, 10f);
```

Refer to `org.java10.examples.ComplexObjectExample` class.

## Adding behaviour

It's possible to add a new method to existing class

```java
var modifiedProduct = new Product("An internet product", 8f, 0.5f) {
    public float applyInternetPrice() {
        return getPrice() - 1f + getTax();
    }
};
```

Refer to `org.java10.examples.ProductExample` class.

## Mixing interfaces

It's possible to mix interfaces.

```java
var seaplane = (Navigable & Flyer) Vehicle::create;
```

Refer to `org.java10.examples.MixinExample` class.
