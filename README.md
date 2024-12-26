##Instructions for Setting Up and Running the Project
A)Prerequisites
  1)Spring Tool Suite (STS) Installed:
  2)Download and install Spring Tool Suite if not already available.
  3)Ensure you have JDK 8 or higher installed, as STS requires Java to work.
  4)Install Postman to test the API endpoints, or use a web browser for GET requests.
B)Clone the Repository
C)Open STS.
D)In the menu, go to File > Import > Git > Projects from Git.
  1)Choose Clone URI and enter the repository URL:  https://github.com/your-username/your-repo-name.git
  2)Click through the wizard to import the project into your workspace.
C)Run the Application(Run as springboot app)
  1)In the Project Explorer, locate the project.
  2)Right-click the project folder, then select Run As > Spring Boot App.

*The console will display the application startup logs, including:
*Tomcat started on port(s): 8080 (http)
*Test the Application
*Open a web browser and navigate to the base URL:  http://localhost:8080/home
*Alternatively, test endpoints using Postman:
*Set the request URL (e.g., http://localhost:8080/courses).
Choose the appropriate HTTP method (GET, POST, etc.).
Provide any required request body or headers.
Notes
To modify configurations (e.g., port number), update the application.properties or application.yml file located in the src/main/resources directory.
If the application requires a database, ensure the database server is running, and update the database credentials in the configuration file.


## Test the Application

### Test GET Request
1. Open Postman or your browser.
2. Send a GET request to `http://localhost:8080/courses`.
3. You should see the following response:
*i have updated some ids but result should be same.
![SPRINGBOOT_API2](https://github.com/user-attachments/assets/025cba14-af21-46f4-919c-6364ae585a33)


### Test POST Request
1. Open Postman.
2. Set the HTTP method to **POST** and send a request to `http://localhost:8080/courses`.
3. Include any necessary request body (e.g., JSON data).
4. You should see the following response:
![SPRINGBOOT_API3](https://github.com/user-attachments/assets/a0a22a69-18cd-44cb-bc02-9e6ca538870c)


You can try other http requests also, i have added codes for that too.
