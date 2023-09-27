** null is a value that means a variable doesn't hold a reference to an object. The variable exists, but it doesn't refer to anything

** A nullable type can hold null values in addition to its base type. You define a type as nullable by adding a ? to the end of it.

** To access a nullable variable's properties and functions, you must first check that it's not null

** if the compiler can't guarantee that a variable is not null in between a null check and its usage, you must access properties and functions using the safe call operator ?.

** You can chain safe calls together. 

** To execute code if (and only if) a value is not null, use ?. let

** the Elvis (?:) is a safe alternative to an if expression

** The not-null assertion operator (!!) throws a NullPointerException if the subject of your assertion is null.

** An exception is a warning that occurs in exceptional situations. It's an object of type Exception

** Use throw to throw an exception

** Catch an exception using try/catch/finally

** try and throw are expressions

** Use a safe cast as? to avoid getting a ClassCastException