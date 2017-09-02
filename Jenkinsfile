node {
    stage('Checkout') {
       checkout scm
    }
    stage('Clean') {
        bat "mvnw.cmd clean"
    }
    stage('Compile') {
        bat "mvnw.cmd compile"
    }
    stage('Test') {
        bat "mvnw.cmd test"
    }
    stage('Package') {
        bat "mvnw.cmd package -DskipTests"
    }
    stage('Archive') {
        archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
    }
}