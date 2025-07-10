pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Execute') {
            steps {
                echo 'Executing Java Hello World application...'
                sh 'java -cp target/classes fr.diginamic.demo.jenkins.Main'
            }
        }
    }

}
