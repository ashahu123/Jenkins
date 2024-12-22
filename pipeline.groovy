pipeline {
    agent any
    	stages {
        	stage('Pull') {
			steps {
				echo 'Pull Success'
            }
	}
        stage('Build') {
            steps {
                sh 'echo \'Application is Build!!\''
            }
        }
        stage('Test') {
            steps {
                echo 'Test Sucess'
            }
        }
        stage('Deploy') {
            steps {
                    echo 'Congarts!!Deploy Success'
            }
        }
    }
}