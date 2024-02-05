pipeline {
    agent any
    tools{
        maven 'MyMaven'
    }

    stages {
        stage('Build') {
            steps {
                echo 'building the application...'
                sh 'mvn'
                echo 'build completed'
            }
        }
    }
}