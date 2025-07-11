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
        }
    }
}
