pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building Java app'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Execute') {
            steps {
                echo 'Executing Java app'
                sh 'mvn exec:java -Dexec.mainClass="fr.diginamic.Main"'
            }
            steps {
                echo 'Test run w/o maven'
                sh 'java -jar demo-jenkins-1.0-SNAPSHOT-jar-with-dependencies.jar'
            }
        }
    }
}
