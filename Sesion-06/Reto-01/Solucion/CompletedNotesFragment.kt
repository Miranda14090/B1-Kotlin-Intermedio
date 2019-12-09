package com.isaiin.todoapp.completed


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.isaiin.todoapp.R
import com.isaiin.todoapp.model.Task
import com.isaiin.todoapp.pending.TaskAdapter


class CompletedNotesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_completed_notes, container, false)

        initComponents(view)

        return view
    }

    fun initComponents(view: View) {
        //Hardcoded data
        val tasks = mutableListOf<Task>()
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))
        tasks.add(Task("Task 01", "00-00-0000", "00-00-0000"))

        tasks.forEach { it.setCompleted() }

        //RecyclerView
        val taskList = view.findViewById<RecyclerView>(R.id.tasksList)
        taskList.setHasFixedSize(true)
        val adapter = this.context?.let { TaskAdapter(it, tasks) }
        taskList.adapter = adapter
    }

    companion object {
        fun newInstance(): CompletedNotesFragment = CompletedNotesFragment()
    }
}
