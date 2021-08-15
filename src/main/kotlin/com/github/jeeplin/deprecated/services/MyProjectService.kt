package com.github.jeeplin.deprecated.services

import com.github.jeeplin.deprecated.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
