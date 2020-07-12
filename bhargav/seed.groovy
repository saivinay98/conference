buildPipelineView('MUSTANG GT') {
    filterBuildQueue()
    filterExecutors()
    title('Project a CI pipeline')
    displayedBuilds(1)
    selectedJob('project-A-compile')
    alwaysAllowManualTrigger()
    showPipelineParameters()
    refreshFrequency(60)
}


