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
                sh 'mvn exec:java -Dexec.mainClass="fr.diginamic.Main"'
            }
        }
    }
}
