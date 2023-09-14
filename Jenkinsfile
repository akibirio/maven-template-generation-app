pipeline {
    agent any

    environment{
        DOCKER_CREDENTIALS = credentials('docker-credentials-id')
    }
    tools{
        maven "M3"
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout your code from the Git repository
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                // Build your Spring Boot application and run tests
                sh 'mvn clean package'
            }
        }

        stage('Dockerize') {
            steps {
                // Build a Docker image and tag it with the specified name and version
                script {
                    docker.build("akibirio/maven-template-generator:v1-latest")
                }
            }
        }

        stage('Deploy to Docker Registry') {
            steps {
                // Push the Docker image to your Docker registry (e.g., Docker Hub)
                script {
                    withDockerRegistry([credentialsId: "docker-credentials-id", url: 'https://index.docker.io/v1/']) {
                        docker.image("akibirio/maven-template-generator:v1-latest").push()
                    }
                }
            }
        }

        stage('Deploy to Kubernetes (Optional)') {
            when {
                // Add conditions to trigger this stage, e.g., after successful tests
                expression { currentBuild.resultIsBetterOrEqualTo('SUCCESS') }
            }
            steps {
                // Deploy the Docker image to Kubernetes (K8s) cluster
                // You'll need K8s configuration and tools installed
                sh 'kubectl apply -f k8s-deployment.yaml'
            }
        }
    }

    post {
        success {
            sh "echo Build and Deploy successful."//Add post-build actions if needed
        }
    }
}
