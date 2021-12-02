package kg.kamila.midterm2

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exit = findViewById<ImageView>(R.id.search)
        exit.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }
    }
}
