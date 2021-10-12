package com.github.dreamuniverse.moduleplugin.services

import com.intellij.openapi.project.Project
import com.github.dreamuniverse.moduleplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
