package diego.app.diego.com.proyrecicler.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.ImageView.ScaleType
import diego.app.diego.com.proyrecicler.R
var mContext: Context?= null

class ImageAdapter: BaseAdapter {
    private val images = intArrayOf(
            R.drawable.ic_flag_of_bolivia,
            R.drawable.ic_flag_of_chile,
            R.drawable.ic_flag_of_el_salvador,
            R.drawable.ic_flag_of_haiti)
constructor(context: Context){
    mContext = context
}

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {

        val imageView = ImageView(mContext)
        imageView.setImageResource(images[position])
        imageView.setScaleType(ImageView.ScaleType.CENTER)
        imageView.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 200))
        return imageView
    }

    override fun getItemId(pos: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return images.size
    }

    override fun getItem(pos: Int): Int? {
        //return images.firstOrNull { x -> x == item }
        return images[pos]
    }
    fun getPos(id: Int): Int? {
        return images.indexOfFirst { x -> x == id }
    }

}