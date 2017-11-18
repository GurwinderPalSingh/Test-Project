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
                      git clone https://GurwinderPalSingh:Diamonds77@github.com/GurwinderPalSingh/Test-Project.git        
            }
        }

        stage ('Build') {
                          steps {
                                   sh 'echo $pwd'                
                                   sh 'echo "Build has been started"'
            }
             post {
                success {
                           sh 'echo "Build has been completed"'
                        }
                 }
               

           
            }
        }
    
}
