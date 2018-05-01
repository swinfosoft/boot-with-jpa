pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'bin/mvn clean compile'
      }
    }
  }
  environment {
    MAVEN_HOME = '/var/jenkins_home/tools/hudson.tasks.Maven_MavenInstallation/Maven'
    JAVA_HOME = '/usr/lib/jvm/java-8-openjdk-amd64/jre'
  }
}