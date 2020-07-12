pipelineJob('sravani') {
    definition {
        cps {
            script(readFileFromWorkspace('seed.groovy'))
            sandbox()
        }
    }
}
