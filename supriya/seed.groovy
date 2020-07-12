pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "supriya"'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''
            }
        }
    }
}
