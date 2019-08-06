package android.kotlin.belajar.belajarandroidprogrammingmaster4

import android.content.Intent
import android.kotlin.belajar.belajarandroidprogrammingmaster4.`object`.Objek
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tampilan_awal.*

class TampilanAwal : AppCompatActivity() {


    var kirimNilai : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan_awal)


        segitiga.setOnClickListener {
            kirimNilai = "Ini dari TampilanAwal"
            val intent = Intent(this, Segitiga::class.java).apply {
                putExtra(Objek.kirimPesanString, kirimNilai)
            }
            startActivity(intent)
        }

    }
}
