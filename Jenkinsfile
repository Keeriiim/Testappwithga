pipeline {
    agent any
    tools{
        maven 'MyMaven'
    }

    stages {
        stage('Build') {
            steps {
                echo 'building the application...'
                sh 'mvn -B'
                echo 'build completed'
            }
        }
    }
}
