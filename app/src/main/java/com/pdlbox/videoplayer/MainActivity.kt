package com.pdlbox.videoplayer

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.pdlbox.videoplayer.activitys.VideoPlayActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun playVideo(view: View) {
        VideoPlayActivity.Builder()
            .setVideoTitle("速度与激情特别行动")
            .setVideoSource("http://vfx.mtime.cn/Video/2019/06/29/mp4/190629004821240734.mp4")
            .setActivityOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
            .start(this)
    }
}