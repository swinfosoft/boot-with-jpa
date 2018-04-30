pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean compile'
      }
    }
  }
  environment {
    mvnHome = ' tool \'Maven\''
  }
}