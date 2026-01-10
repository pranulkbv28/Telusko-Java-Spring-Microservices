# $Threads$

## $What$ $are$ $Threads?$

- A thread is a **lightweight process** that can run **concurrently** with other threads within the same program.
- Smallest unit which we can work upon.
- Each thread has its own **call stack** but shares the same **heap memory** with other threads in the same process.
- Threads are used to perform multiple tasks simultaneously, improving the efficiency and responsiveness of applications.
- For an operation, its default thread priority is `5`. The minimum priority is `1` and the maximum is `10`.
- If you are trying to work with `Threads`, make sure you use them with immutable objects to avoid unexpected behavior due to shared data. [See here to understand what are immutable objects in Java](../DataTypes/README.md#-2)
- Or if the method requires mutable objects, then amke it `Thread Safe`.
  - `Thread Safe` means you have to make sure that only one thread can access the mutable object at a time.

## $Creating$ $Threads$ $in$ $Java$

- When wedo not use `threads`, and we are calling on two or more methods, the methods are executed one after another, in a sequential manner. -> [Example](./WithoutThreads.java)
- There are two main ways to create threads in Java:
  1. By extending the `Thread` class. -> [Example](./ExtendingThread.java)
      - Using functions like `start()`, `run()`, `sleep()`, `join()`, `getPriority()`, `setPriority()`, etc.
      - After extending the `Thread` class, we need to override the `run()` method to define the code that will be executed by the thread. [See here](./ExtendingThread.java#L4)
      - Then we create an instance of the subclass and call the `start()` method to begin the thread's execution. [See here](./ExtendingThread.java#L34)
  2. By implementing the `Runnable` interface. -> [Example](./ImplementingRunnable.java)
      - This approach is preferred when the class needs to extend another class along with being able to run with `Threads`, as Java supports multiple implementation of interfaces but only single inheritance of classes.
      - `Thread` class also implements the `Runnable` interface.
      - We need to implement the `run()` method of the `Runnable` interface to define the code that will be executed by the thread. [See here](./ImplementingRunnable.java#L4)
      - Then we create an instance of the `Thread` class, passing the `Runnable` object as a parameter. [See here](./ImplementingRunnable.java#L34)
      - We call the `start()`, as `Runnable` **does not** have any method called `start()` method to begin the thread's execution. [See here](./ImplementingRunnable.java#L37)
      - We can also use `Lambda Expressions` to create threads when implementing the `Runnable` interface.
          - This approach provides a more concise way to define the `run()` method using a lambda expression. [See here](./ImplementingRunnable.java#L33)

## $Race$ $Condition$

- A race condition occurs when multiple threads access shared data and try to change it at the same time.
- If the access to the shared data is not properly synchronized, it can lead to inconsistent or unexpected results.
- To avoid race conditions, we can use synchronization mechanisms such as the `synchronized` keyword, `Locks`, or other concurrency utilities provided by Java.
- [In this code](./WithoutSynchronised.java), when we try to print the value of count, we see that we get `less than 2000` even though we are incrementing it `2000` times.
- This is because both the threads are trying to access and modify the value of count at the same time, leading to a race condition.
- One way to solve this is by using the `join()` method to ensure that one thread completes its execution before the other thread starts. [See here](./WithJoinMethod.java)
  - Keep in mind, that while using the `join()` method, we need to handle the `InterruptedException` that may be thrown if the thread is interrupted while waiting.
  - There is a caveat to using the `join()` method. If we increase the number of iterations, the time taken to complete the execution will also increase leading to not getting the expected results.
- A better way to solve this is by using the `synchronized` keyword to make the method thread-safe. [See here](./WithSynchronised.java)
  - By using the `synchronized` keyword, we ensure that only one thread can access the `increment()` method at a time, preventing race conditions and ensuring that the final value of count is as expected.

## $Thread$ $States$

- A thread can be in one of the following states:
  1. `New`: The thread is created but not yet started.
  2. `Runnable`: The thread is ready to run and waiting for CPU time (schedulor).
  3. `Running`: The thread is currently executing.
  4. `Blocked/Waiting`: The thread is waiting for a resource or another thread to complete. Example when it is running and we use the `sleep()` or `wait()` methods. [See here](./ExtendingThread.java#L20)
      - To come out of this state, we can use the `notify()` or `notifyAll()` methods.
      - By doing so, you do not go to the `Running` state directly, you go to the `Runnable` state and wait for the CPU to allocate time to you.
  5. `Terminated/Dead`: The thread has completed its execution or has been terminated.
- ![Thread States](../../assets/Thread%20States.png)
