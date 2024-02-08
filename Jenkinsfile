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

        stage('Test') {
            steps {
                echo 'testing the application...'
                sh 'mvn test'
                echo 'test completed'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }


    }
}
