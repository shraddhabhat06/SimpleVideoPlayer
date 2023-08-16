package com.example.videoplayer

import android.net.Uri

import android.net.Uri.*
import android.net.Uri.parse
import androidx.appcompat.app.AppCompatActivity
import android.widget.VideoView
import android.os.Bundle

import android.widget.MediaController
import com.example.videoplayer.R.layout.activity_main

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        val videoView = findViewById<VideoView>(R.id.testView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        //specify the location of media file
        val uri: Uri = parse(
            "android.resource://" + packageName
                    + "/raw/test"
        )
        //Setting MediaController and URI, then starting the videoView
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }

}
