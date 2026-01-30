# Servlet

## What is a Servlet

- A Servlet is a Java programming language class used to extend the capabilities of servers that host applications accessed by means of a request-response programming model.
- Servelets are used to build dynamic pages as responses to web clients' requests.
- Servlets run on the server side.
- ![Servelets In Java](../assets/Servlets%20In%20Java.png)

## How Servlets Work

- A web client sends an HTTP request to the web server.
- The web server forwards the request to the servlet container.
- The servlet container loads the servlet class and creates an instance of the servlet if it is not already loaded.
- The servlet container calls the servlet's `init()` method to initialize the servlet.
- The servlet container calls the servlet's `service()` method to handle the request and generate a response.
- The servlet container sends the response back to the web server, which forwards it to the web client.
- When the servlet is no longer needed, the servlet container calls the servlet's `destroy()` method to clean up resources.

## Let us create a simple Servlet

### Prerequisites

- Install `Java` and `Apache Tomcat` on your system.
- Set up `Apache Tomcat` in your IDE (like `Eclipse` or `IntelliJ IDEA`) and its documentation.

### Setup

- After downloading Eclipse
  - Click `Perspectives` on the top right corner.
  - Select `Java EE`. This is used to get `server` option in the bottom, which helps us to run our `Servlets`.
- Now, we need to add `Apache Tomcat` server to our `Eclipse IDE`.
  - `MacOs` Config Steps:
    - Firstly, if `servers` tab is not visible, go to `Window` -> `Show View` -> `Servers`.
    - In the `Servers` tab, click on `No servers are available. Click this link to create a new server...`.
    - In the `New Server` window, select `Apache` -> `Tomcat v9.0 Server` (or the version you have installed).
    - Click `Next`.
    - Click on `Browse` and select the path where you have installed `Apache Tomcat`.
    - Click `Finish`.
    - To verify if the server is added:
      - you should see `Tomcat v9.0 Server at localhost` in the `Servers` tab.
      - You can also right-click on the server and select `Start` to start the server.
      - You can choose which port the server should run on by double-clicking on the server and changing the `HTTP/1.1` port.
      - Also check the box that says `Use Tomcat installation` if you want to see anything when you run the server without any project.
      - Now, open your browser and go to `http://localhost:8080` (or the port you have set) to see if the server is running.
  - `Windows` Config Steps:
    - Firstly, if `servers` tab is not visible, go to `Window` -> `Show View` -> `Servers`.
    - In the `Servers` tab, click on `No servers are available. Click this link to create a new server...`.
    - In the `New Server` window, select `Apache` -> `Tomcat v9.0 Server` (or the version you have installed).
    - Click `Next`.
    - Click on `Browse` and select the path where you have installed `Apache Tomcat`.
    - Click `Finish`.
    - To verify if the server is added:
      - you should see `Tomcat v9.0 Server at localhost` in the `Servers` tab.
      - You can also right-click on the server and select `Start` to start the server.
      - You can choose which port the server should run on by double-clicking on the server and changing the `HTTP/1.1` port.
      - Also check the box that says `Use Tomcat installation` if you want to see anything when you run the server without any project.
      - Now, open your browser and go to `http://localhost:8080` (or the port you have set) to see if the server is running.

### Create a Dynamic Web Project on Eclipse

1. Open `Eclipse IDE`.
2. Go to `File` -> `New` -> `Dynamic Web Project`.
3. Enter the `Project Name` (e.g., `MyFirstServlet`).
4. Select the `Target Runtime` as `Apache Tomcat v9.0` (or the version you have installed).
5. Click `Next`.
6. In the next window, you can leave the default settings and click `Next`.
7. In the next window, check the box that says `Generate web.xml deployment descriptor`.
8. Click `Finish`.

- You should be seeing something like this in the `Project Explorer`:

    ```text
    MyFirstServlet
    ├── Deployment Descriptor: MyFirstServlet
    ├── JAX-WS Web Services
    ├── Java Resources
    │   ├── src/ <!-- This is where we will be creating all our Java codes -->
    │   └── Libraries/
    ├── JavaScript Resources
    ├── build
    ├── WebContent
    │   ├── META-INF/
    │   ├── WEB-INF
    │   │   ├── lib
    │   │   └── web.xml <!-- This is the file where we configure most of the stuff -->
    │   └── index.jsp
    └── build.xml 

    Servers
    ```
