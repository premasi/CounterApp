package rk.enkidu.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val onClickBtn = findViewById<Button>(R.id.btn_hit)
        val viewAfter = findViewById<TextView>(R.id.text_name)

        var timesClicked = 0

        onClickBtn.setOnClickListener {
            timesClicked += 1

            viewAfter.text = timesClicked.toString()
            Toast.makeText(this, "Keep Up!", Toast.LENGTH_SHORT).show()
        }
    }
}