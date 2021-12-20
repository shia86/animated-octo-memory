package com.github.shia86.animatedoctomemory.services

import com.intellij.openapi.project.Project
import com.github.shia86.animatedoctomemory.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
