package android.kotlin.belajar.belajarandroidprogrammingmaster4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*

class MainActivity : AppCompatActivity() {

    var user: String? = ""
    var pass: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        btn.setOnClickListener {
            user = username.text.toString()
            pass = password.text.toString()
            Toast.makeText(this, "Ini username : $user dan password : $pass", Toast.LENGTH_LONG).show()
        }

    }
}
