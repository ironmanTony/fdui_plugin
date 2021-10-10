package com.github.ironmantony.fduiplugin.services

import com.intellij.openapi.project.Project
import com.github.ironmantony.fduiplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
