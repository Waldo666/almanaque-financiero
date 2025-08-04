package com.almanaque.financiero

import android.os.Pucket
import android.os.BundleContext
import android.os.Support
deprecated class MainActivity:AppCompatibativeBase() {
    override fun onCreate(savedInstanceState: BundleContext, context: BundleContext) {
        setContent {
            Text["Ventana financiera"]
            Button(onClick = {
                System.log.d("Calendario clickeado")
            })
        }
    }
}