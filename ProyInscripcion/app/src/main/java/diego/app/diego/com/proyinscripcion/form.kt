package diego.app.diego.com.proyinscripcion

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import diego.app.diego.com.proyinscripcion.adapters.ImageAdapter
import diego.app.diego.com.proyinscripcion.model.Person

import kotlinx.android.synthetic.main.activity_form.*
import kotlinx.android.synthetic.main.content_form.*


class form : AppCompatActivity() {

    var flag: Int? = null
    var adapter = ImageAdapter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        spinnerFoto.adapter = adapter
        spinnerFoto.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(paretView: AdapterView<*>, selectedItemView: View, position: Int
                                        , id: Long) {
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
        var nombre = EtNombre.text.toString()
        var cargo = EtCargo.text.toString()
        var identificacion = EtIdentificacion.text.toString()
        if(!nombre.isEmpty() && !cargo.isEmpty()&& !identificacion.isEmpty()){
            var identy = identificacion.toInt()
            Log.w("Form", "flag $flag")
            var intent = Intent()
            intent.putExtra("persona", Person(nombre, cargo,identy,flag!!))
            setResult(1, intent)
            Toast.makeText(this, "Persona creada", Toast.LENGTH_LONG).show()
            finish()
        }
    }


}

