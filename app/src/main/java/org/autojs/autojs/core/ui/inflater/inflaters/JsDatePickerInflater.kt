package org.autojs.autojs.core.ui.inflater.inflaters

import android.content.Context
import android.view.ViewGroup
import org.autojs.autojs.core.ui.inflater.ResourceParser
import org.autojs.autojs.core.ui.inflater.ViewCreator
import org.autojs.autojs.core.ui.widget.JsDatePicker

class JsDatePickerInflater(resourceParser: ResourceParser) : DatePickerInflater<JsDatePicker>(resourceParser) {

    override fun getCreator(): ViewCreator<in JsDatePicker> = object : ViewCreator<JsDatePicker> {
        override fun create(context: Context, attrs: HashMap<String, String>, parent: ViewGroup?): JsDatePicker {
            return JsDatePicker(context)
        }
    }

}