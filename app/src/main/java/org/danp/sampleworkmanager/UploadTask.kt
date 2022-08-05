package org.danp.sampleworkmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class UploadTask(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {
    private val TAG: String = "SampleWorkmanager"

    override fun doWork(): Result {
        upload()
        return Result.success()
    }

    private fun upload():Unit{
        Log.d(TAG, "UploadTask")
    }

}