## What is LVTI

- `LVTI` stands for `Local Variable Type Inference`. It was introduced in `Java 10` as a way to simplify code by allowing the compiler to infer the type of a local variable based on the value assigned to it.

### Before `LVTI`

- Prior to `Java 10`, you had to **explicitly declare the type of every local variable**. For example:

```java
String name = "Alice";
```

### After `LVTI`

- Now, with `LVTI`, you can use the `var` keyword instead of the explicit type:

```java
var name = "Alice";
```

- The compiler automatically infers that `name` should be of type `String` based on the assigned value `"Alice"`.
