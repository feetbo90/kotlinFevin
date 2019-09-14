package android.kotlin.belajar.belajarandroidprogrammingmaster4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_radio_group.*

class RadioGroupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_group)


        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val selected = group.checkedRadioButtonId

            if(R.id.radio1 == selected)
                Toast.makeText(applicationContext, radio1.text.toString(), Toast.LENGTH_LONG).show()
            else Toast.makeText(applicationContext, radio2.text.toString(), Toast.LENGTH_LONG).show()

        }
    }
}
