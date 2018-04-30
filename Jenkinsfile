pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package'
        echo 'Code is compiled and jar is created.'
      }
    }
    stage('Test') {
      steps {
        echo 'Testing will be done here.'
      }
    }
  }
}