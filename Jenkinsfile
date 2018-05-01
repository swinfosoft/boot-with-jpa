pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '$MAVEN_HOME/bin/mvn clean compile'
      }
    }
  }
  environment {
    MAVEN_HOME = '/var/jenkins_home/tools/hudson.tasks.Maven_MavenInstallation/Maven'
  }
}