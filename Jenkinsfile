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
        
         stage('sonar analysis') {
            steps {
                withSonarQubeEnv('ZensarCodeAnalysis'){
                    bat 'mvn sonar:sonar'
                  }
            }
        }
          stage('JaCoCo Report') {
            steps {
               jacoco()
            }
        }
        
        stage('Build Docker Image') {
            steps {
               bat 'docker build -t malas/test .'
            }
        }
        
        stage('Push Docker Image to Docker Hub') {
            steps {
                    bat 'docker login -u username -p password'
                bat 'docker push malas/test'
            }
        }
    }
         
}


