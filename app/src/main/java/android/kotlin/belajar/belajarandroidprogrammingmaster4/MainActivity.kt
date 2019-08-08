package android.kotlin.belajar.belajarandroidprogrammingmaster4

import android.content.Context
import android.content.Intent
import android.kotlin.belajar.belajarandroidprogrammingmaster4.`object`.Objek
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

        val sharedPreferences = application.getSharedPreferences("login", Context.MODE_PRIVATE)
        val nama = sharedPreferences.getString(Objek.username, Objek.kosong)
        val pswd = sharedPreferences.getString(Objek.password, Objek.kosong)
        if(nama != "" && pswd != "") {
            val intent = Intent(this@MainActivity, TampilanAwal::class.java)
            startActivity(intent)
        }

        btn.setOnClickListener {
            user = username.text.toString()
            pass = password.text.toString()
//            input.putString(Objek.username, user)
//            input.putString(Objek.password, pass)
//            input.commit()

            val sharedPref2 = application.getSharedPreferences("login",Context.MODE_PRIVATE)
            with (sharedPref2.edit()) {
                putString(Objek.username, user)
                putString(Objek.password, pass)
                commit()
            }

            val iniUsername = sharedPref2.getString(Objek.username, Objek.kosong)
            val iniPass = sharedPref2.getString(Objek.password, Objek.kosong)
            Toast.makeText(this, "Ini username : $iniUsername dan password : $iniPass", Toast.LENGTH_LONG).show()
        }

        btn2.setOnClickListener {
            val sharedPreferences = application.getSharedPreferences("login", Context.MODE_PRIVATE)
            val input = sharedPreferences.edit()
            input.remove(Objek.username)
            input.remove(Objek.password)
            input.commit()
            val iniUsername = sharedPreferences.getString(Objek.username, Objek.kosong)
            val iniPass = sharedPreferences.getString(Objek.password, Objek.kosong)
            Toast.makeText(this, "Ini username : $iniUsername dan password : $iniPass", Toast.LENGTH_LONG).show()
        }
    }

    /*
    username : fevin
    pasword : 12345
     */
}
