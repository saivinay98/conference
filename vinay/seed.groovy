folder("Rakshith")
folder("Rakshith/patchset")
imagesJson = '''{ "github":[{
                                "repo":"https://github.com/rakshith-gannarapu/softeng.git",
                                "directory":"Rakshith/patchset/promenade",
                                "image":"multi-node-promenade",
                                "name":"promenade",
                                "jenkinsfile_loc":"Jenkinsfile"
                            }]}'''
jsonSlurper = new JsonSlurper()
object = jsonSlurper.parseText(imagesJson)
for (entry in object.github) {
  folder("${entry.directory}")
    pipelineJob("${entry.directory}/${entry.image}") {
        logRotator{
            daysToKeep(90)
        }
        parameters {
            stringParam {
                defaultValue("${entry.repo}")
                description('sample pipelineJob')
                name ('GIT_REPO')
                trim(true)
            }
        }
        configure {
            node -> node / 'properties' / 'jenkins.branch.RateLimitBranchProperty_-JobPropertyImpl'{
                durationName 'hour'
                count '10'
            }
        }
        triggers {
            scmpoll_spec("* * * * *")
           definition {
               cps {
                 script(readFileFromWorkspace("Rakshith/patchset/${entry.jenkinsfile}"))
                   sandbox(false)
               }
           }
        }
    }
}
