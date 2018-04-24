pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'code will be build here.'
        sh 'mvn clean compile'
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
  environment {
    JAVA_HOME = '/usr/lib/jvm/jdk1.8.0_05'
    MAVEN_HOME = '/usr/local/apache-maven'
  }
}