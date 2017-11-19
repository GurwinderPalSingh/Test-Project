pipeline {
   environment {
     WorkSpace = "/opt/Jenkins/workspace/Test_Pipeline1"
	 MvnHome = "/opt/maven"
   }

   agent none
    
    stage ('CHECKOUT')
		{
			checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '891c4be8-a91b-40db-ac42-9069fc83068e', url: 'https://github.com/GurwinderPalSingh/Test-Project.git']]])
		}
    stage ('BUILD') 
		{
            sh 'chown maven:mave workspace -R'     
            sh 'su - maven -s /bin/bash'
			sh 'echo $whoami'       
        }
    
    
}
