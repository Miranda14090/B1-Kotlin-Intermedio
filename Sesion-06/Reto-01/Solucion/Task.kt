package com.isaiin.todoapp.model

import java.util.*

class Task(
    name: String,
    creationDate: String,
    estimatedFinishDate: String) {

    var name: String = ""
    var creationDate: String = ""
    var estimatedFinishDate: String = ""
    private var completed: Boolean = false

    init {
        this.name = name
        this.creationDate = creationDate
        this.estimatedFinishDate = estimatedFinishDate
    }

    fun isCompleted(): Boolean {
        return completed
    }

    fun setCompleted() {
        completed = true
    }
}