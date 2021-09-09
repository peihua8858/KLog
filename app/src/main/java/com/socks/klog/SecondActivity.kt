package com.socks.klog

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.socks.library.KLog

class SecondActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.text_view).text="第二个页面"
    }

    fun onClick(view: View?) {
        KLog.d(">>>>>>>>第二个页面")
        Info().showLog()
    }
    class Info{
        fun showLog(){
            KLog.d(">>>>>>>>showLog第二个页面")
        }
    }
}