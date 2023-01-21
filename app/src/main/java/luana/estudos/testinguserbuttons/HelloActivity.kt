package luana.estudos.testinguserbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import luana.estudos.testinguserbuttons.MainActivity.Companion.NAME_USER_TAG
import luana.estudos.testinguserbuttons.databinding.ActivityHelloBinding

class HelloActivity : AppCompatActivity() {

    private lateinit var binding:ActivityHelloBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelloBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        showName()
    }

    private fun showName() {
        //Capture Intent and extract the string name
        val showName = intent.getStringExtra(NAME_USER_TAG)

        //Capture layout of textView and show string
        val textView = findViewById<TextView>(R.id.nameGoesHereView).apply {
            text = showName
        }
    }
}