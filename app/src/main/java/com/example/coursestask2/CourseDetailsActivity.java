package com.example.coursestask2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CourseDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);

        ImageView imageView = findViewById(R.id.courseImage);
        TextView textView = findViewById(R.id.courseContent);

        int image = getIntent().getIntExtra("image", 0);
        String content = getIntent().getStringExtra("content");

        imageView.setImageResource(image);
        textView.setText(content);
    }
}
