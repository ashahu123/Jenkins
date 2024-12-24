Day5.txt
 *Scripted Pipeline:
 - How to write
 - Pull stage using scripted pipeline


 Scripted pipeline:

node {
    stage('PULL') {
        git branch: 'main', url: 'https://github.com/ashahu123/HelloWorld1.git'
    }
    stage('Build') {
        echo 'Congrats...Build Success...!!!'
    }
    stage('Test') {
        echo 'Congrats...Test Success...!!!'
    }
    stage('Deploy') {
        echo 'Congrats...Deploy Success...!!!'
    }
}

* Declarative Pipeline:


