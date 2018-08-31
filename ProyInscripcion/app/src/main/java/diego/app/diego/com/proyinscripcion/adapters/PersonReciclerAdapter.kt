package diego.app.diego.com.proyinscripcion.adapters

import android.app.AlertDialog
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import diego.app.diego.com.proyinscripcion.R
import diego.app.diego.com.proyinscripcion.model.Person

class PersonReciclerAdapter :
    RecyclerView.Adapter<PersonReciclerAdapter.ViewHolder> {

        private var myDataset: ArrayList<Person> = ArrayList()

        constructor(myDataset: ArrayList<Person>) {
            this.myDataset = myDataset;
        }



    override fun onCreateViewHolder(parent: ViewGroup,
                                        viewType: Int): PersonReciclerAdapter.ViewHolder {
            // create a new view
            val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.recicler_personas, parent, false) as View
            // set the view's size, margins, paddings and layout parameters

            return ViewHolder(view)
        }

        // Replace the contents of a view (invoked by the layout manager)
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            // - get element from your dataset at this position
            // - replace the contents of the view with that element
            holder.nombreTextView!!.text = myDataset[position].nombre
            holder.cargoTextView!!.text = myDataset[position].cargo
            holder.identificacionTextView!!.text = myDataset[position].identificacion.toString()
            holder.itemView.setOnClickListener{
                Log.w("Form", "flag ${holder.nombreTextView}")
            }
            if (myDataset[position].flag != null)

                holder.flagImageView!!.setImageResource(myDataset[position].flag!!)
        }



        // Return the size of your dataset (invoked by the layout manager)
        override fun getItemCount() = myDataset.size

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            var identificacionTextView: TextView? = null
            var cargoTextView: TextView? = null
            var nombreTextView: TextView? = null
            var flagImageView: ImageView? = null

            init {
                flagImageView = view.findViewById(R.id.imagen)
                cargoTextView = view.findViewById(R.id.cargo)
                nombreTextView = view.findViewById(R.id.nombre)
                identificacionTextView = view.findViewById(R.id.identificacion)
            }




        }


    }