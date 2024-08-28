pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'mibirra:latest'
        CONTAINER_NAME_DEV = 'MiBirra'
        PORT_DEV = '10117'
        PORT_CONTAINER = '80'
    }

    stages {
        stage('Construcción de Docker') {
            when {
                expression { currentBuild.result == 'SUCCESS' }
            }
            steps {
                script {
                    sh "docker build -t ${DOCKER_IMAGE} ."
                }
            }
        }

        stage('Ejecutar Docker') {
            steps {
                script {
                    sh "docker run -d -p ${PORT_DEV}:${PORT_CONTAINER} --name ${CONTAINER_NAME_DEV} ${DOCKER_IMAGE}"
                }
            }
        }
    }

    post {
        always {
            script {
                echo 'Limpiando imágenes de Docker no utilizadas...'
                sh "docker image prune -f"
            }
        }

        success {
            script {
                echo '¡Pipeline completado con éxito!'
            }
        }

        failure {
            script {
                echo '¡Pipeline fallido!'
            }
        }
    }
}