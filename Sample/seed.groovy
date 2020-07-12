pipelineJob("$Sample/$Ram}") {



    displayName('Ram')

    description('Sample Job to create pipeline Job')



    logRotator{

        daysToKeep(90)

    }



    definition {

        cps {

            sandbox()

            script(readFileFromWorkspace("$Sample/Jenkinsfile"))

        }

    }
}

