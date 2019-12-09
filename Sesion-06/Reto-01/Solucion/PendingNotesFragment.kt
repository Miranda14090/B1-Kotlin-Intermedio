package com.isaiin.todoapp.pending


import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

import com.isaiin.todoapp.R
import com.isaiin.todoapp.model.Task
import kotlinx.android.synthetic.main.fragment_pending_notes.*

class PendingNotesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pending_notes, container, false)

        initComponents(view)

        return view
    }

    private fun initComponents(view: View) {
        //FAB
        val fab: View = view.findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            
        }

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

        //RecyclerView
        val taskList = view.findViewById<RecyclerView>(R.id.tasksList)
        taskList.setHasFixedSize(true)
        val adapter = this.context?.let { TaskAdapter(it, tasks) }
        taskList.adapter = adapter

    }

    companion object {
        fun newInstance(): PendingNotesFragment = PendingNotesFragment()
    }


}
