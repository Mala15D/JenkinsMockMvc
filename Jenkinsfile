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
               echo 'Building Docker Image'
            }
        }
        
        stage('Push Docker Image to Docker Hub') {
            steps {
                echo 'Building Docker Image'
            }
        }
    }
         
}


