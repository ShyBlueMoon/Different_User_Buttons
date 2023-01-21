package luana.estudos.testinguserbuttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import luana.estudos.testinguserbuttons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        const val NAME_USER_TAG:String = "luana.estudos.testinguserbuttons"
        private const val nameOfTheApp:String = "LogTUB"
        private const val activity:String = "MainActivity:: "
    }

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        chooseNameButtonListener()
    }

    private fun chooseNameButtonListener() {
        binding.btnLewis.setOnClickListener() {
            sendNameLewis()
        }

        binding.btnJohn.setOnClickListener() {
            sendNameJohn()
        }

        binding.btnMary.setOnClickListener() {
            sendNameMary()
        }

    }


    private fun sendNameLewis() {
        binding.apply {
            //Here we get the text from the user buttons to string
            val userNameLewis = btnLewis.text.toString()

            //Here we send the text in the buttons to the other Activity
            val intentSendName = Intent(this@MainActivity, HelloActivity::class.java)
            intentSendName.putExtra(NAME_USER_TAG, userNameLewis)
            startActivity(intentSendName)

        }
    }

    private fun sendNameJohn() {
        binding.apply {
            //Here we get the text from the user buttons to string
            val userNameJohn = btnJohn.text.toString()

            //Here we send the text in the buttons to the other Activity
            val intentSendName = Intent(this@MainActivity, HelloActivity::class.java)
            intentSendName.putExtra(NAME_USER_TAG, userNameJohn)
            startActivity(intentSendName)

        }
    }

    private fun sendNameMary() {
        binding.apply {
            //Here we get the text from the user buttons to string
            val userNameMary = btnMary.text.toString()

            //Here we send the text in the buttons to the other Activity
            val intentSendName = Intent(this@MainActivity, HelloActivity::class.java)
            intentSendName.putExtra(NAME_USER_TAG, userNameMary)
            startActivity(intentSendName)

        }
    }
}