pipeline {
 
    agent any 

    tools {
        maven 'maven3.5'
        jdk 'java1.8'
    }
    stages {
        stage ('CHECKOUT') {
            steps {
                      sh 'cd /opt/gitRepo/testing'
                      checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '891c4be8-a91b-40db-ac42-9069fc83068e', url: 'https://github.com/GurwinderPalSingh/Test-Project.git']]])
            }
        }

        stage ('Build') {
            steps {
                    
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
