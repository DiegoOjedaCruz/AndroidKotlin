package diego.app.diego.com.proyinscripcion.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import diego.app.diego.com.proyinscripcion.R

var mContext: Context? = null

class ImageAdapter : BaseAdapter {
    private val images = intArrayOf(
            R.drawable.ic_arqueologo,
            R.drawable.ic_conductor,
            R.drawable.ic_estudiante,
            R.drawable.ic_futbolista,
            R.drawable.ic_estudiante,
            R.drawable.ic_limpiador,
            R.drawable.ic_soldador
    )

    constructor(context: Context) {
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


}
