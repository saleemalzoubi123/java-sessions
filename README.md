# Java sessions
## sessions 1: 
* data types, primitive types, wrapper types
  * Why Use Wrapper Classes?
   - Collections Framework: Java Collections (e.g., List, Set) only store objects, not primitives, so wrapper classes allow primitives to be used in collections. 
   - Utility Methods: Wrapper classes provide utility methods (e.g., Integer.parseInt, Double.toString) for data conversion and manipulation. 
   - Nullability: Wrapper objects can hold null values, which is useful in certain scenarios (e.g., databases where a field may be null). 
   - Autoboxing and Unboxing: Java automatically converts primitives to wrapper objects when necessary (autoboxing) and vice versa (unboxing). This happens implicitly, allowing for easier usage
* Object class, user defined objects
  * String
  * Arrays
  * Classes
  * Interface
  * Enums
* basic structure entity -> repository -> service
* Encapsulation:
  * Private Fields: Attributes of the class are often marked private, so they cannot be accessed directly from outside the class. 
  * Public Methods: Public "getter" and "setter" methods provide controlled access to the private fields. Getters retrieve the field values, and setters allow modification. 
  * Benefits:
    * Control: You control how the data is accessed or modified. 
    * Security: Data hiding reduces the risk of unintended interactions. 
    * Flexibility: You can change the internal implementation without affecting other parts of the program that rely on the class.

## session 2:
* Exception handling (checked and unchecked exception)
  * Checked Exceptions: are exceptions that are checked at compile-time. These exceptions must be either caught using a try-catch block or declared in the method signature using the throws keyword. They usually represent conditions that a reasonable application might want to catch.
  * Unchecked exceptions are exceptions that are not checked at compile-time. These exceptions extend the RuntimeException class and can occur at any point during the program execution. They usually represent programming errors, such as logic errors or improper use of APIs. Since they are unchecked, they do not need to be declared or caught.
  * Key Differences Between Checked and Unchecked Exceptions
  
| Feature                  | Checked Exceptions                         | Unchecked Exceptions                        |
|--------------------------|-------------------------------------------|--------------------------------------------|
| **Compile-Time Check**   | Yes                                       | No                                         |
| **Inheritance**          | Extends `Exception` but not `RuntimeException` | Extends `RuntimeException`               |
| **Handling Requirement** | Must be caught or declared                | Can be caught but not required             |
| **Typical Causes**       | External conditions (I/O failures, etc.) | Programming errors (logic mistakes, etc.)  |

* Inheritance:
  * fundamental principle of object-oriented programming (OOP) in Java, allowing a new class to derive properties and behaviors (fields and methods) from an existing class. The new class, called the subclass or child class, inherits the characteristics of the existing class, known as the superclass or parent class. 
  * Key Features of Inheritance 
    * Code Reusability: Inheritance promotes code reuse, allowing subclasses to inherit and extend the functionality of a superclass without rewriting code. 
    * Hierarchy: It establishes a hierarchical relationship between classes, where subclasses represent a more specific version of the superclass. 
    * Method Overriding: Subclasses can modify (override) inherited methods to provide specific implementations.
    * "is-a" Relationship: Inheritance represents an "is-a" relationship; for example, a Dog class can inherit from an Animal class because a dog "is an" animal.
* Composition: 
  * principle in object-oriented programming (OOP) that allows a class to include instances of other classes as part of its own state. This creates a "has-a" relationship between the classes, meaning one class (the composite) contains references to other classes (the components). Composition is often favored over inheritance because it provides greater flexibility and modularity in software design.
  * Key Features of Composition
    * "Has-a" Relationship: Composition indicates that a class contains or is composed of one or more objects from other classes. For example, a Car has an Engine. 
    * Encapsulation: Each component class can encapsulate its own behavior and data, promoting separation of concerns. 
    * Flexibility: Composition allows changing the behavior of a class at runtime by changing the components it is composed of, making the system more adaptable. 
    * Code Reusability: Components can be reused across different classes without inheriting from a common superclass.
* Inheritance vs. Composition: While inheritance is useful for "is-a" relationships, composition is often preferred for "has-a" relationships, where a class contains an instance of another class rather than inheriting from it.
* Polymorphism:
  * fundamental concept in object-oriented programming (OOP) that allows objects to be treated as instances of their parent class rather than their actual class. It enables a single interface to represent different underlying forms (data types), allowing for methods to be used in different contexts.
  * Types of Polymorphism 
    1. Compile-Time Polymorphism (Static Binding):
       * Achieved through method overloading and operator overloading.
       * The decision about which method to invoke is made at compile time.
    2. Runtime Polymorphism (Dynamic Binding):
       * Achieved through method overriding, where a subclass provides a specific implementation of a method that is already defined in its superclass. 
       * The decision about which method to invoke is made at runtime based on the object type.
  * Benefits of Polymorphism 
    * Code Reusability: Polymorphism allows for the creation of more generic code that can work with objects of various types. 
    * Flexibility and Maintenance: Changes to the class hierarchy (such as adding new subclasses) do not require changes to the code that uses the base class type. 
    * Dynamic Method Resolution: The right method is determined at runtime, allowing for more dynamic and flexible program behavior.
* Access Modifiers
  * Public: Accessible from any other class in any package.
  * Protected: Accessible within the same package and by subclasses in other packages. 
  * Default (Package-Private): Accessible only within the same package.
  * Private: Accessible only within the class it is declared in.
  * | Modifier    | Class | Package | Subclass | World |
    |-------------|-------|---------|----------|-------|
    | `public`    | ✅    | ✅       | ✅        | ✅    |
    | `protected` | ✅    | ✅       | ✅        | ❌    |
    | `default`   | ✅    | ✅       | ❌        | ❌    |
    | `private`   | ✅    | ❌       | ❌        | ❌    |

* Overloading
* Overriding

## session 3: 
* Generic: a way to create classes, interfaces, and methods with type parameters, allowing code to be more flexible and reusable while ensuring type safety at compile-time. By using generics, you can write code that can handle different data types without needing to write multiple versions for each type.
  * Generic Classes: A generic class can accept one or more type parameters. This is typically represented by a letter
  * Generic Methods: Generic methods allow you to specify a type parameter at the method level, making the method work with any type.
  * Bounded Types: You can restrict the type parameters to a certain range by using bounded types
  * Wildcards in Generics: Java also provides wildcards (?) in generics to make code even more flexible, commonly used in method parameters.
  * Generic Interfaces

## session 4:
  * Creational Patterns: 
    * Singleton pattern: Ensures only one instance of a class exists, providing a global access point.
    * Factory pattern: Provides a method for creating objects, allowing subclasses to alter the type of objects created.
    * Builder pattern: Allows for step-by-step construction of complex objects.
    * Abstract Factory: Creates new objects by cloning an existing object.
    * Prototype: Creates families of related or dependent objects without specifying their concrete classes.

## session 5:
* Structural Patterns
  * Adapter: Allows incompatible interfaces to work together by wrapping an object.
  * Decorator: Adds behavior to objects dynamically without altering the original class.
  * Facade: Provides a simplified interface to a complex system.
  * Proxy: Acts as a placeholder or surrogate for another object, controlling access to it.
  * Composite: Treats individual objects and compositions of objects uniformly.

## session 6:
* Behavioral Patterns:
  * Observer: Defines a one-to-many dependency, where changes to one object trigger updates to others.
  * Strategy: Encapsulates different algorithms or behaviors and allows them to be used interchangeably.
  * Command: Encapsulates requests as objects, allowing for parameterization, queuing, and logging.
  * Chain of Responsibility: Passes requests along a chain of handlers, each deciding whether to process the request.
  * State: Allows an object to change behavior when its internal state changes.
  * Template Method: Defines the skeleton of an algorithm, deferring specific steps to subclasses.
  * Mediator: Reduces complexity by allowing objects to communicate through a mediator instead of directly.

## session 7:
* Concurrency Patterns (specific to multi-threading scenarios in Java)
  * Thread Pool: Manages a pool of worker threads to minimize the cost of thread creation. 
  * Read-Write Lock: Optimizes resource access for read-heavy systems by allowing multiple readers but exclusive writes. 
  * Future: Represents a result of an asynchronous computation that can be retrieved once available. 
  * Producer-Consumer: Coordinates work between producers of data and consumers that process it.

## session 8:
* Popular Use Cases of Design Patterns 
  * DAO Pattern: Separates data access logic from business logic, typically implemented using DAO classes for CRUD operations. 
  * MVC Pattern: Common in web applications, separating concerns into Model, View, and Controller components.

## session 9: 
* Data structure:
  * Array
    - Description: Fixed-size data structure to store elements of the same type in contiguous memory locations.
    - Usage: Suitable for cases where the size of the data set is known and constant.
  * ArrayList
    - Description: Resizable array that grows dynamically as more elements are added.
    - Usage: Ideal for lists with a variable size. Elements can be accessed in constant time, but adding/removing elements from the middle requires shifting.
  * LinkedList
    - Description: Implements a doubly linked list, where each node contains a data element and pointers to the next and previous nodes.
    - Usage: Efficient for frequent insertions/deletions at both ends, but slower for accessing elements by index.
  *  Stack
     - Description: Follows Last In First Out (LIFO) order. It can be implemented using Deque, ArrayList, or LinkedList.
     - Usage: Used in scenarios where the most recent data is processed first, such as expression evaluation, undo operations, and recursive function management.
  * PriorityQueue
     - Description: A special type of queue where elements are ordered by priority.
     - Usage: Commonly used in scenarios that require sorting based on priority, such as Dijkstra’s algorithm or event-driven simulations.
  * HashSet 
    - Description: Implements a set using a hash table, ensuring unique elements without order.
    - Usage: For collections with unique elements, where order is not important. Common in scenarios that need fast access and uniqueness, like removing duplicates. 
  * LinkedHashSet
    - Description: Extends HashSet and maintains insertion order.
    - Usage: Suitable when uniqueness is required, but the order of insertion is also important.
  * TreeSet
    - Description: Implements a balanced tree structure (Red-Black tree), maintaining elements in sorted order.
    - Usage: Used when sorting and uniqueness are both required.
  * HashMap
    - Description: Implements a map using a hash table, storing key-value pairs with fast access to values based on keys.
    - Usage: Best for key-value associations when fast retrieval is essential, like caches and dictionaries.
  * LinkedHashMap
    - Description: Extends HashMap and maintains the order of insertion.
    - Usage: When the order of key-value pairs is important.
  * TreeMap
    - Description: Implements a map based on a Red-Black tree, maintaining keys in sorted order.
    - Usage: Used when sorting of keys is required, like storing hierarchical or ordered data.
  * Deque (Double-Ended Queue)
    - Description: Allows insertions and deletions at both ends.
    - Usage: Suitable for scenarios requiring insertions and deletions from both ends, like palindrome checks.
* | Data Structure     | Description                                                                             | Example Classes                        |
  |--------------------|-----------------------------------------------------------------------------------------|----------------------------------------|
  | **Array**          | A fixed-size, indexed collection of elements of the same type.                          | `int[]`, `String[]`                    |
  | **ArrayList**      | A resizable array implementation in the Java Collections Framework.                     | `ArrayList<Integer>`, `ArrayList<String>` |
  | **LinkedList**     | A doubly linked list, providing fast insertions and deletions.                          | `LinkedList<Integer>`, `LinkedList<String>` |
  | **Stack**          | A LIFO (Last In, First Out) structure for elements.                                     | `Stack<Integer>`, `Stack<String>`      |
  | **Queue**          | A FIFO (First In, First Out) structure for elements.                                    | `Queue<Integer>`, `LinkedList`, `PriorityQueue` |
  | **HashMap**        | A hash table-based implementation of the Map interface, with key-value pairs.           | `HashMap<Key, Value>`                  |
  | **TreeMap**        | A Map implementation that sorts entries by keys in natural order.                       | `TreeMap<Key, Value>`                  |
  | **HashSet**        | A collection that contains no duplicate elements, backed by a hash table.               | `HashSet<Element>`                     |
  | **TreeSet**        | A sorted Set implementation that stores unique elements in natural order.               | `TreeSet<Element>`                     |
  | **PriorityQueue**  | A queue that orders elements according to their natural ordering or a provided comparator. | `PriorityQueue<Element>`               |
  | **Deque**          | A double-ended queue, allowing insertion and removal from both ends.                    | `ArrayDeque<Element>`, `LinkedList`    |
  | **Map**            | A structure that maps keys to values, allowing key-based access to values.              | `Map<Key, Value>`, `HashMap`, `TreeMap` |
  | **Set**            | A collection that does not allow duplicate elements.                                    | `Set<Element>`, `HashSet`, `TreeSet`   |


