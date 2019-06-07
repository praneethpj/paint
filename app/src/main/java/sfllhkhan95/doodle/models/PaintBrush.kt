package sfllhkhan95.doodle.models

import android.content.Context
import android.graphics.Paint
import androidx.core.content.ContextCompat

import sfllhkhan95.doodle.R

/**
 * @author saifkhichi96
 * @since 23/10/2017
 */
class PaintBrush(val context: Context) : Paint(), Cloneable {

    var strokeColor: Int = 0
    var fillColor: Int = 0
    var size = DEFAULT_SIZE
        set(size) {
            field = DEFAULT_SIZE + size
        }

    init {
        strokeColor = ContextCompat.getColor(context, DEFAULT_STROKE_COLOR)
        fillColor = ContextCompat.getColor(context, DEFAULT_FILL_COLOR)

        this.color = strokeColor
        this.style = Style.STROKE
        this.strokeJoin = Join.ROUND
        this.strokeCap = Cap.ROUND
        this.xfermode = null
        this.alpha = 0xff
    }

    public override fun clone(): PaintBrush {
        return try {
            super.clone() as PaintBrush
        } catch (e: CloneNotSupportedException) {
            this
        }
    }

    companion object {
        private const val DEFAULT_STROKE_COLOR = R.color.red_900
        private const val DEFAULT_FILL_COLOR = R.color.red_900a
        private const val DEFAULT_SIZE = 5
    }

}