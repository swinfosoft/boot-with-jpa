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
  environment {
    MAVEN_HOME = '/home/jenkins/apache-maven-3.5.3'
    JAVA_HOME = '/docker-java-home'
  }
}