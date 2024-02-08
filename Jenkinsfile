pipeline {
    agent any
    tools{
        maven 'MyMaven'
    }

    stages {
        stage('Build') {
            steps {
                echo 'building the application...'
                sh 'mvn -B clean package'
                echo 'build completed'
            }
        }
    }
}
