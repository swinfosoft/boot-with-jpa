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
    MAVEN_HOME = '/var/jenkins_home/tools/hudson.tasks.Maven_MavenInstallation/Maven'
    JAVA_HOME = '/docker-java-home'
  }
}