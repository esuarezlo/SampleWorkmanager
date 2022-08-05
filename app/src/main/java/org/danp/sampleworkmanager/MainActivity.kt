package org.danp.sampleworkmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.work.OneTimeWorkRequest
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTask: Button = findViewById<Button>(R.id.btnTask)

        btnTask.setOnClickListener(View.OnClickListener {

            val uploadTaskRequest = OneTimeWorkRequestBuilder<UploadTask>().build()
            val downloadTaskRequest = OneTimeWorkRequestBuilder<DownloadTask>().build()
//            WorkManager.getInstance(this)
//                .enqueue(Arrays.asList(uploadTaskRequest, downloadTaskRequest))
//            WorkManager.getInstance(this)
//                .enqueue(uploadTaskRequest)
            WorkManager.getInstance(this).beginWith(downloadTaskRequest).then(uploadTaskRequest)
                .enqueue()



        })


    }
}