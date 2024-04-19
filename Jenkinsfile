pipeline {
    agent any

    environment {
        SONARQUBE_TOKEN = credentials('sonarqube')
    }

    tools {
        maven 'M3'
     }

    stages {

        stage('Build') {
            steps {
                // Incluye los comandos para construir tu proyecto aquí
                // Por ejemplo, para un proyecto Maven:
                sh 'mvn clean package'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                // Ejecuta el análisis de SonarQube
                // Aquí usamos Maven nuevamente como ejemplo:
                sh 'mvn sonar:sonar -Dsonar.projectKey=listas-enlazadas -Dsonar.host.url=http://9001 -Dsonar.login=${SONARQUBE_TOKEN}'
            }
        }
    }

    post {
        always {
             echo 'Hello, MVN'
             sh 'mvn -version'
        }
    }
}
