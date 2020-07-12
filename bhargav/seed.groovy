buildPipelineView('MUSTANG GT') {
    filterBuildQueue(boolean filterBuildQueue = false)
    filterExecutors(boolean filterBuildQueue = false)
    title('Project a CI pipeline')
    displayedBuilds(1)
    showPipelineParametersInHeaders(boolean showPipelineDefinitionHeader = true)
    selectedJob('project-A-compile')
    alwaysAllowManualTrigger(boolean alwaysAllowManualTrigger = true)
    showPipelineParameters(boolean showPipelineParameters = true)
    showPipelineDefinitionHeader(boolean showPipelineDefinitionHeader = true)
    refreshFrequency(60)
}


