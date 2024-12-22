pipeline {
    agent any
    	stages {
        	stage('Pull') {
			stages {
				echo 'Pull Sucess'
            }
	}
        stage('Build') {
            steps {
                sh 'echo \'Application is Builed!!\''
            }
        }
        stage('Test') {
            steps {
                echo 'Test Sucess'
            }
        }
        stage('Deploy') {
            steps {
                    echo 'Deploy Success'
            }
        }
    }
}