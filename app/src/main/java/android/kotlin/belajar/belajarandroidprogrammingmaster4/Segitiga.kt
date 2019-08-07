package android.kotlin.belajar.belajarandroidprogrammingmaster4

import android.kotlin.belajar.belajarandroidprogrammingmaster4.`object`.Objek
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Segitiga : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)

        val message = intent.getStringExtra(Objek.kirimPesanString)
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()


    }
}
