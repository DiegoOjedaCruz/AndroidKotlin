package diego.app.diego.com.proyrecicler

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        spinnerCountry.adapter = adapter
        spinnerCountry.onItemSelectedListener= object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(paretView: AdapterView<*>,selectedItemView:View,position:Int
            ,id:Long){
                flag = adapter.getItem(position)

            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        }
    }
    fun onCancel(view: View) {

    }
    fun submit (view: View){
     var name = EtNombre.text.toString()
        var city = Etciudad.text.toString()
        if(!name.isEmpty() && !city.isEmpty()){
            Log.w("Form", "flag $flag")
            var intent = Intent()
            intent.putExtra("country", Country(name, "", city, flag!!))
            setResult(1, intent)
            Toast.makeText(this, "Pais creado", Toast.LENGTH_LONG).show()
            finish()
        }
    }
    

}
