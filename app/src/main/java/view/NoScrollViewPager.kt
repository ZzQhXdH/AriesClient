package view

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

class NoScrollViewPager : ViewPager
{
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)


    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean
    {
        return false
    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean
    {
        return true
    }
}