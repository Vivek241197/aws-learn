pipeline {
    agent any
    tools {
        maven 'Maven3'
        jdk 'JAVA21'
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn -B -DskipTests clean package'
            }
        }
    }
}