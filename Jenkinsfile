pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'sh mvn clean build'
      }
    }
    stage('Test') {
      steps {
        echo 'Testing will be done here.'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deployment will be done here.'
      }
    }
  }
}