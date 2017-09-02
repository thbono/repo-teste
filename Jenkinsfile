node {
    stage('Checkout') {
       checkout scm
    }

    stage('Clean') {
        bat "mvnw.cmd clean"
    }
}