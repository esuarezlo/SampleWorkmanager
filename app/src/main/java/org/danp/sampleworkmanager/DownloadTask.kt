package org.danp.sampleworkmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class DownloadTask(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {
    private val TAG: String = "SampleWorkmanager"
    override fun doWork(): Result {
        download()
        return Result.success()
    }

    fun download(): Unit {
        Log.d(TAG, "DownloadTask")
    }
}