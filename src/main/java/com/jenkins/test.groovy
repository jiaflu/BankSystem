import redis.clients.jedis.Pipeline

Jenkinsfile (Declarative Pipeline)
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building....'
            }
        }
        stage('Test'){
            steps {
                echo 'Building....'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}