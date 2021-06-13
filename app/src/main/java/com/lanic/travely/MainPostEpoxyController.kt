package com.lanic.travely

import com.airbnb.epoxy.Typed2EpoxyController
import com.airbnb.epoxy.TypedEpoxyController

class MainPostEpoxyController : TypedEpoxyController<String>() {
    override fun buildModels(data: String?) {
        for (i in 0..10) {
            main
        }
    }
}