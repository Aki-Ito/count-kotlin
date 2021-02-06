package app.ito.akki.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number : Int = 0
        textView.text = "0"

        plusButton.setOnClickListener{
            number = number+1
            numberTextView.text = number.toString()
        }
    }
}