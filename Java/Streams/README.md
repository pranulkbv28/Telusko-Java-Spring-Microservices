# $Streams$

## $What$ $is$ $Streams?$

- In `Java`, a stream is a sequence of elements that can be processed in parallel or sequentially. They were introduced in Java 8 as a way to perform operations on collections of data in a more functional and declarative style.
- Characteristics of `Streams`:
  - **Not a Data Structure**: Streams don't store data themselves. They operate on existing collections or data sources.
  - **Functional in Nature**: Operations on streams are typically chained together to form a pipeline of operations.
  - **Lazy Evaluation**: Streams are lazy, meaning that operations are only performed when the terminal operation is called.
  - **Consumable**: Once a stream has been processed by a terminal operation, it cannot be reused.
  - **Parallelism**: Streams can be easily parallelized to take advantage of multiple cores.
  - **Singlw Use**: Streams can only be traversed once. After a terminal operation is invoked, the stream is considered consumed. [See here](./StreamsInJava.java#L30)

## $Common$ $Operations$

- **Intermediate Operations**: These operations return a new stream and are lazy. Examples include:
  - `filter()`: Filters elements based on a predicate.
  - `map()`: Transforms each element using a function.
  - `sorted()`: Sorts the elements of the stream.
  - `distinct()`: Removes duplicate elements.
  - `limit()`: Limits the number of elements in the stream.
- **Terminal Operations**: These operations produce a result or a side effect and trigger the processing of the stream. Examples include:
  - `forEach()`: Performs an action for each element.
  - `collect()`: Collects the elements into a collection or other data structure.
  - `reduce()`: Reduces the elements to a single value using an accumulator function.
  - `count()`: Counts the number of elements in the stream.
  - `anyMatch()`, `allMatch()`, `noneMatch()`: Check for matching conditions.

## $Why$ $Use$ $Streams?$

Streams offer several benefits over traditional collection processing:

- **Declarative Style**: You express what you want to do, rather than how to do it.
- **Concise Code**: Stream operations often result in shorter and more readable code.
- **Efficiency**: Streams can optimize operations and potentially leverage parallel processing.
- **Composability**: Stream operations can be chained together to create complex processing pipelines.

## $Concepts$

- [Streams in Java](./StreamsInJava.java)
