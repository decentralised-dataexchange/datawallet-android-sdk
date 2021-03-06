package io.igrant.data_wallet.activity

import android.content.Context
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.igrant.data_wallet.utils.LocaleHelper

open class BaseActivity :AppCompatActivity() {

    override fun attachBaseContext(newBase: Context) {
        var newBase = newBase
        newBase = LocaleHelper.onAttach(newBase)
        super.attachBaseContext(newBase)
    }

    override fun onResume() {
        super.onResume()
        val lang: String = LocaleHelper.getLanguage(this) ?: "en"
        LocaleHelper.setLocale(this, lang)
//        window.decorView.layoutDirection = if (lang.equals(
//                "ar",
//                ignoreCase = true
//            )
//        ) View.LAYOUT_DIRECTION_RTL else View.LAYOUT_DIRECTION_LTR
    }

}