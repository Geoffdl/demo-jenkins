pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Building Java app'
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage('Execute in parallel') {

            parallel {

                stage("run with maven"){

                    steps {
                        echo 'Test run with maven'
                        sh 'mvn exec:java -Dexec.mainClass="fr.diginamic.Main"'
                    }

                }

                stage("run with jar"){

                    steps {
                        echo 'Test run w/o maven'
                        sh 'java -jar target/demo-jenkins-1.0-SNAPSHOT-jar-with-dependencies.jar'
                    }

                }

            }

        }
    }
}
