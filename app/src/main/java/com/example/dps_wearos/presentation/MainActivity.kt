/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter and
 * https://github.com/android/wear-os-samples/tree/main/ComposeAdvanced to find the most up to date
 * changes to the libraries and their usages.
 */

package com.example.dps_wearos.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import com.example.dps_wearos.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainWorkoutBtn = findViewById<Button>(R.id.main_workout_btn)
        mainWorkoutBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, WorkoutActivity::class.java)
            startActivity(intent)
        }

        val mainSleepBtn = findViewById<Button>(R.id.main_sleep_btn)
        mainWorkoutBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, SleepActivity::class.java)
            startActivity(intent)
        }

        val mainHeartbeatBtn = findViewById<Button>(R.id.main_heartbeat_btn)
        mainWorkoutBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, HeartbeatActivity::class.java)
            startActivity(intent)
        }
    }
}
