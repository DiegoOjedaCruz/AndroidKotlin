package diego.app.diego.com.myapplication

import android.os.Bundle
import android.service.autofill.RegexValidator
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        //btnSumar.setOnClickListener{
        //    Log.d(TAG,"click en btnsumar")

        //btnSumar.setOnClickListener(this)

    }
    //override fun onClick(view: View?) {
    //   Log.d(TAG,"click en btnsumar")


    fun procesar(view: View) {
        var strNumber = etnumber1.text.toString()
        var strNumber2 = etnumber2.text.toString()
        if (validation(strNumber, strNumber2)) {
            var num1 = strNumber.toDouble()
            var num2 = strNumber2.toDouble()
            var res = 0.0
            when (view!!.id) {
                R.id.btnSumar -> {
                    res = num1.plus(num2)
                }
                R.id.btnResta -> {
                    res = num1.minus(num2)
                }
                R.id.btnMultiplicar -> {
                    res = num1.times(num2)
                }
                R.id.btnDvision -> {
                    res = num1.div(num2)
                }

            }
            txvResultado.text = "resultado $res"

            Log.d(TAG, "RES$res")


        }
    }


    private fun validation(strNumber: String, strNumber2: String): Boolean {
        if (strNumber.isEmpty()) {
            etnumber1.setError(getText(R.string.required_field))
            return false
        } else
            return true
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
