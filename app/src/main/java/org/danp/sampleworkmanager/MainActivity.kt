package org.danp.sampleworkmanager

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTask: Button = findViewById<Button>(R.id.btnTask)

        btnTask.setOnClickListener(View.OnClickListener {

//            val uploadTaskRequest = OneTimeWorkRequestBuilder<UploadTask>().build()
            val downloadTaskRequest = OneTimeWorkRequestBuilder<DownloadTask>().build()

            WorkManager.getInstance(this).enqueue(downloadTaskRequest)


        })


    }
}