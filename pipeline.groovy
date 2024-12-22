Simple pipeline  run on master node itself :

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


----

Run a pipeline on Slave Node:

pipeline {
    agent { label 'node1' }  // Specify the slave node by label
    stages {
        stage('Build') {
            steps {
                echo 'Building on slave node'
                // Add build steps here
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests on slave node'
                // Add test steps here
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying on slave node'
                // Add deploy steps here
            }
        }
    }
}

---