package diego.app.diego.com.proyrecicler

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import diego.app.diego.com.proyrecicler.adapters.ImageAdapter
import diego.app.diego.com.proyrecicler.models.Country
import kotlinx.android.synthetic.main.activity_form.*
import kotlinx.android.synthetic.main.content_form.*

class FormActivity : AppCompatActivity() {
    var flag: Int? = null
    var adapter = ImageAdapter(this)
    var country: Country? = null
    var pos = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        spinnerCountry.adapter = adapter
        spinnerCountry.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>,
                                        selectedItemView: View,
                                        position: Int, id: Long) {
                flag = adapter.getItem(position)
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {
                // your code here
            }

        }

        val extras = intent.extras
        if (extras != null) {
            country = extras.getSerializable("object") as Country
            pos = extras.getInt("pos")
            EtNombre.setText(country!!.name)
            Etciudad.setText(country!!.city)
            if (country!!.flag!! > 0)
                spinnerCountry.setSelection(adapter.getPos(country!!.flag!!)!!)
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
    }

    fun onCancel(view: View) {
        onBackPressed()
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
            else -> super.onOptionsItemSelected(item)
        }
        return true
    }

    fun submit(view: View) {
        var name = EtNombre.text.toString()
        var city = Etciudad.text.toString()
        if (!name.isEmpty() && !city.isEmpty()) {
            Log.w("Form", "flag $flag")

            var intent = Intent()
            intent.putExtra("country", Country(name, "", city, flag!!))
            intent.putExtra("post", pos)
            if (pos >= 0) setResult(UPDATE, intent)
            else setResult(CREATE, intent)
            Toast.makeText(this, "Pais creado", Toast.LENGTH_LONG).show()
            finish()
        }
    }

    companion object {
        val CREATE = 0
        val UPDATE = 1
    }


}
