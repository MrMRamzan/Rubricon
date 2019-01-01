package com.mad.rubricon;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class LabEvaluationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_evaluation);
        ArrayList<Course> courses = getCoursesList();
        CourseListCustomAdapter adapter = new CourseListCustomAdapter(courses, this);
        ListView coursesListView = (ListView) findViewById(R.id.mCourseList);
        coursesListView.setAdapter(adapter);
        Toolbar toolbar = findViewById(R.id.toolbar_lab_eval);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle("Lab Evaluation");
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_white);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public ArrayList<Course> getCoursesList(){
        // get list of Courses  from Database

            // code goes here....

        // Dummy Data for Testing
        ArrayList<Course> crses = new ArrayList<Course>();
        crses.add(new Course(1,"CS-125L", "Introduction to Computing"));
        crses.add(new Course(2,"CS-112L", "Programming Fundamentals"));
        crses.add(new Course(3,"CS-121L", "Assembly Programming"));
        crses.add(new Course(4,"CS-123L", "Object Oriented Programming"));
        crses.add(new Course(5,"CS-145L", "Data Structures"));

        return crses;
    }

}
