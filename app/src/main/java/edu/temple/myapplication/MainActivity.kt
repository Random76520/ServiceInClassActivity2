package edu.temple.myapplication

import android.content.ComponentName
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var timerBinder : TimerService.TimerBinder
    var isConnected = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val serviceConnection = object : ServiceConnection {
            override fun onServiceConnected(p0: ComponentName?, p1: IBinder?) {
                timerBinder = p1 as TimerService.TimerBinder
                isConnected = true
            }

            override fun onServiceDisconnected(p0: ComponentName?) {
                isConnected = false
            }

        }

        //

        findViewById<Button>(R.id.startButton).setOnClickListener {

        }

        findViewById<Button>(R.id.pauseButton).setOnClickListener {

        }
        
        findViewById<Button>(R.id.stopButton).setOnClickListener {

        }
    }
}