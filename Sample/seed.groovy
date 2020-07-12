folder(JOB_FOLDER)



pipelineJob("${JOB_FOLDER}/${JOB_NAME}") {



    displayName('Ram')

    description('Sample Job to create pipeline Job')



    logRotator{

        daysToKeep(90)

    }



    definition {

        cps {

            sandbox()

            script(readFileFromWorkspace("${JOB_FOLDER}/Jenkinsfile"))

        }

    }
}

