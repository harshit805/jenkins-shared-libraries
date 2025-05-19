def call(String ProjectName, String ImageTag, String DockerHubUser) {
    def image = docker.build("${DockerHubUser}/${ProjectName}:${ImageTag}")
    docker.withRegistry('https://index.docker.io/v1/', 'dockerhubcreds') {
        image.push()
    }
}
