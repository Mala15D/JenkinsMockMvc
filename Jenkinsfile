pipeline {
    agent any

    stages {
        stage('Check Out') {
            steps {
                echo 'Check Out'
            }
        }
        stage('Package') {
            steps {
               bat 'mvn clean package'
            }
        }
        
        stage('JaCoCo Report') {
            steps {
               jacoco()
            }
        }
    }
}


