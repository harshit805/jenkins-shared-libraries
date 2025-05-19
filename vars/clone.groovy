def call(String url, String branch){

  git url: "$(url)", git branch: "$(branch)"
}
