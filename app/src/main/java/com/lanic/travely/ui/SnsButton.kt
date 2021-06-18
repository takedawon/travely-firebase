package com.lanic.travely.ui

import android.app.Service
import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.lanic.travely.R

class SnsButton : LinearLayout {

    @JvmOverloads
    constructor(context: Context, attributeSet: AttributeSet? = null, defStyleAttr: Int = 0) : super(
        context,
        attributeSet,
        defStyleAttr
    ) {
        initView()
        if (attributeSet != null) {
            getAttrs(attributeSet, defStyleAttr)
        }
    }

    private fun getAttrs(attributeSet: AttributeSet, defStyleAttr: Int) {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.SnsButton, defStyleAttr, 0)
        setTypeArray(typedArray)
    }

    lateinit var layout: LinearLayout
    lateinit var symbol: ImageView
    lateinit var snsText: TextView

    private fun initView() {
        val layoutInflater = context.getSystemService(Service.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = layoutInflater.inflate(R.layout.custom_sns_button, this, false)
        addView(view)

        layout = findViewById(R.id.ll_layout)
        symbol = findViewById(R.id.iv_symbol)
        snsText = findViewById(R.id.tv_sns_text)
    }

    private fun setTypeArray(typedArray: TypedArray) {
        val backgroundRes = typedArray.getResourceId(
            R.styleable.SnsButton_background_drawable, R.drawable.shape_naver_r8
        )

        layout.setBackgroundResource(backgroundRes)

        val symbolDrawable = typedArray.getResourceId(
            R.styleable.SnsButton_symbol_drawable,
            R.drawable.ic_kakao_logo
        )

        symbol.setImageResource(symbolDrawable)

        val text = typedArray.getText(R.styleable.SnsButton_text)
        val textColor = typedArray.getColor(R.styleable.SnsButton_text_color, ContextCompat.getColor(context, R.color.white))
        snsText.text = text
        snsText.setTextColor(textColor)

        typedArray.recycle()
    }
}