# Template Generator Microservice

This Spring Boot microservice allows you to dynamically generate Maven project structures based on user input. You can provide the `groupId` and `artifactId` for your Maven project, and this microservice will create the corresponding project directory structure with a sample Java class.

## Getting Started

These instructions will help you get the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven build tool
- A code editor or Integrated Development Environment (IDE)

### Running the Microservice

1. Clone this repository to your local machine.

2. Build the project using Maven:
   ```shell
   mvn clean install

3. Run the Application
    ```shell
    mvn spring-boot:run

4. Access the microservice via a web browser or tools like Postman

### API Ednpoint
- POST `/api/v1/templates/generate`
    ```json
    {
        "groupId": "com.example",
        "artifactId": "my-maven-project"
    }

### Contributing

Contributions are welcome! Feel free to open issues or submit pull requests to help improve this microservice.


### License

This project is licensed under the MIT License - see the [MIT](https://choosealicense.com/licenses/mit/)file for details.

### Acknowledgments

- This project was created using Spring Boot.
- Special thanks to the Spring community for their contributions to open-source software.