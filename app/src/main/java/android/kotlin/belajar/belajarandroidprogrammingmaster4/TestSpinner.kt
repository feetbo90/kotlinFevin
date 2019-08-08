package android.kotlin.belajar.belajarandroidprogrammingmaster4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast


class TestSpinner : AppCompatActivity(), AdapterView.OnItemSelectedListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_spinner)

        val spinner = findViewById<Spinner>(R.id.planets_spinner)
        val adapter = ArrayAdapter.createFromResource(this@TestSpinner,
                R.array.planets_array, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this@TestSpinner, "$parent.getItemAtPosition(position)}", Toast.LENGTH_LONG ).show()
    }

}
