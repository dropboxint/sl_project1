def call(){
  sh 'git log --name-status HEAD^..HEAD'
}
