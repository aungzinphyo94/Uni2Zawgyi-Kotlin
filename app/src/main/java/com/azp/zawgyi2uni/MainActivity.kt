package com.azp.zawgyi2uni

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import me.myatminsoe.mdetect.MDetect
import me.myatminsoe.mdetect.Rabbit

class MainActivity : AppCompatActivity() {

    lateinit var typeface: Typeface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (MDetect.isUnicode()) run {
            this.typeface = MainApplication.typefaceManager.getUni()
            textOne.text = getString(R.string.sample_text)
            textOne.typeface = typeface

            textTwo.text = "သီဟိုဠ်မှ ဉာဏ်ကြီးရှင်သည် အာယုဝဍ္ဎနဆေးညွှန်းစာကို ဇလွန်ဈေးဘေး ဗာဒံပင်ထက် အဓိဋ္ဌာန်လျက် ဂဃနဏဖတ်ခဲ့သည်။"
            textTwo.typeface =typeface

        } else run {
            this.typeface = MainApplication.typefaceManager.getZgyi()
            textOne.text = Rabbit.uni2zg(getString(R.string.sample_text))
            textOne.typeface = typeface

            textTwo.text = Rabbit.uni2zg("သီဟိုဠ်မှ ဉာဏ်ကြီးရှင်သည် အာယုဝဍ္ဎနဆေးညွှန်းစာကို ဇလွန်ဈေးဘေး ဗာဒံပင်ထက် အဓိဋ္ဌာန်လျက် ဂဃနဏဖတ်ခဲ့သည်။")
            textTwo.typeface = typeface

        }
    }
}