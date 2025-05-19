def creds(){
  withCredentials([usernamePassword(
                    'credentialsId':"dockerhubcreds", 
                    passwordVariable:"dockerHubPass", 
                    usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"        
                sh "docker image tag notes-app:latest harrycreations/notes-app:latest"
                sh "docker push ${env.dockerHubUser}/notes-app:latest"
  }
