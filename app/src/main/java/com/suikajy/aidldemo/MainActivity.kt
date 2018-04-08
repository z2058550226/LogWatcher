package com.suikajy.aidldemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import com.suikajy.debugtool.LogTools
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mText: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et_log.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.e("****** TAG ******", "$s")
                mText = s.toString().trim()
                Log.e("****** TAG ******", "$mText")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        })
        btn_send_log.setOnClickListener({
            //            if (TextUtils.isEmpty(mText)) {
//                LogTools.e("this is an empty log!!")
//            } else {
            LogTools.i(et_log.text.toString().trim())
//            }
        })
    }
}
