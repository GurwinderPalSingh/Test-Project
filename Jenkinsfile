pipeline {
 
    agent any 

    tools {
        maven 'maven3.5'
        jdk 'java1.8'
    }
    stages {
        stage ('CHECKOUT') {
            steps {
                      checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '891c4be8-a91b-40db-ac42-9069fc83068e', url: 'https://github.com/GurwinderPalSingh/Test-Project.git']]])
            }
        }

        stage ('Build') {
            steps {
                     sh "${maven}/bin/maven -B verify"
                         echo 'Build has been started'
            }
             post {
                success {
                           echo 'Build has been completed'
                        }
                 }
               

           
            }
        }
    
}
