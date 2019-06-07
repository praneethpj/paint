package sfllhkhan95.doodle.projects.utils

import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import sfllhkhan95.doodle.projects.models.Project
import sfllhkhan95.doodle.projects.views.ProjectView

class ProjectAdapter internal constructor(private val context: AppCompatActivity, private val gridLayoutId: Int, private val projects: List<Project>) : ArrayAdapter<Project>(context, gridLayoutId, projects) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var gridItem = convertView
        val projectView: ProjectView
        if (gridItem == null) {
            val inflater = context.layoutInflater
            gridItem = inflater.inflate(gridLayoutId, parent, false)

            projectView = ProjectView(gridItem)
            gridItem.tag = projectView
        } else {
            projectView = gridItem.tag as ProjectView
        }

        projectView.show(projects[position])
        return gridItem!!
    }

}