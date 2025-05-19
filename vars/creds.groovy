def creds(){
   withCredentials([usernamePassword(
                    'credentialsId':"dockerhubcreds", 
                    passwordVariable:"dockerHubPass", 
                    usernameVariable:"dockerHubUser")])
  }
