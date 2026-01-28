# $JDBC$

- JDBC (Java Database Connectivity) is the way we connect a Java code to a database to get data for any application.

## $Steps$ $to$ $connect$ $a$ $Java$ $application$ $to$ $a$ $Database$

1. Import the package.
   - (java.sql.\*)
2. Load and register the driver.
   - There are different drivers for different databases. We are taking the example of **SQL** here.
     - Driver Name: com.mysql.jdbc.Driver
     - Load: We load the driver from mysql-connector
     - Register: we use a method called `forName("com.mysql.jdbc.Driver")` to register the driver.
3. Connecting or establishing the connection.
   - We instantiate an interface called `Connection`. [See here](./IntroToJDBC.java#L10)
4. Create the statement. [See here](./IntroToJDBC.java#L12)
   - Three types:
     - **Statement**: Used to execute inbuilt queries
     - **Prepared Statement**: Used to execute **SQL** queries when we are passing many values that need to be created/updated/deleted. [See here](./IntroToJDBC.java#L32)
     - **Callable Statement**: Used to execute **PL (Procedural Languages)** or **stored procedures** in SQL.
5. Execute the query. [See here](./IntroToJDBC.java#L14)
   - When we do this, we get the result.
6. Process the result. [See here](./IntroToJDBC.java#L16)
   - After exeuting a query, we get some result.
   - Using the result meaningfully is done in this step.
   - To process, we use a class called `ResultSet`. ResultSet has a lot of inbuilt function to get the values
     - `getString()`: for **string** values
     - `getInt()`: for **integer** values
     - `getFloat()`: for **float** values
     - `getDouble()`: for **double** values
     - `getDate()`: for **date** values
     - `getTime()`: for **time** values
     - `getTimestamp()`: for **timestamp** values
     - `getArray()`: for **array** values
     - `getBlob()`: for **blob** values
7. Close connection.
   - After all this is done, we close:
     - the statement. [See here](./IntroToJDBC.java#L20)
     - The connection. [See here](./IntroToJDBC.java#L21)
   - It is done by getting the object of `Connection` and closing it.

## $Notes$ $to$ $Remember$

- `Connection` is an interface, so you cannot instantiate its object like how we do for a class. For that we use a method called `getConnection("url","username","password")`. The `getConnection` method is a static method of the class `DriverManager`. [See here](./IntroToJDBC.java#L10).
- The method `next()` from `ResultSet` class is used to get the next row. We can also use it directly as a boolean condition for a while loop's condition as it does two things:
  - it moves to the next row
  - checks if there are any values there
- In SQL there are four types of statement:
  - **DDL**: `Data Definition Language`. It is used to make changes in the structure of the table.
    - `ALTER`
    - `DROP`
    - `TRUNCATE`
    - `RENAME`
  - **DML**: `Data Manipulation Language`. It is used to make changes in the data of the table.
    - `SELECT`
    - `INSERT`
    - `UPDATE`
    - `DELETE`
  - **DQL**: `Data Query Language`. It is used to fetch the data from a database.
    - `WHERE`
    - `JOIN`
    - `GROUP BY`
    - `ORDER BY`
  - **TCL**: `Transaction Control Language`. It is used to manage database transactions.
    - `COMMIT`
    - `ROLLBACK`
    - `SAVEPOINT`
