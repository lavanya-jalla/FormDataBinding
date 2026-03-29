## Spring MVC — Form Data Binding (Thymeleaf)

This project demonstrates binding form data fromtextbox, dropdown, radio buttons, and checkboxes in a Spring MVC application using Thymeleaf.
Showing confirmation with submitted data

## Features

Capture student data from a form
Fields include:

First name (textbox)

Last name (textbox)

Country (dropdown)

Favorite Languages (check boxes)

Favorite Operating System (radio button)

Display submitted data on a result page Spring MVC + Thymeleaf integration

## Project Structure

src/
 └── main/
      ├── java/com/example/mvc/
      │       ├── controller/StudentController.java
      │       └── model/Student.java
      │
      └── resources/templates/
              ├── student-form.html
              └── student-confirmation.html
              

## Running the Project

Import into Eclipse / IntelliJ

Run Spring Boot application

Open in browser:
http://localhost:8080/showStudentForm

Enter details

Submit

## Technologies Used

Java 17+

Spring Boot / Spring MVC

Thymeleaf

Maven

HTML5

## Output Flow

Form Input → Bind to Student → Controller → Confirmation Page
View confirmation page

## Author

Lavanya Jalla

Spring Learner
