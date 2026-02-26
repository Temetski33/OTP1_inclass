pipeline {
    agent any

    def mvnHome = tool 'Maven3.9'
    sh "${mvnHome}/bin/mvn clean package"


    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Temetski33/OTP1_inclass.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install' // sh for linux and ios
            }
        }
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