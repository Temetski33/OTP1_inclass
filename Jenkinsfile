pipeline {
    agent any

    tools {
          maven 'Maven3'
      }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Temetski33/OTP1_inclass.git'
            }
        }
        stage('Build') { steps { script { def mvnHome = tool 'Maven3' bat "${mvnHome}\\bin\\mvn clean install" } } }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Code Coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }
    }
}