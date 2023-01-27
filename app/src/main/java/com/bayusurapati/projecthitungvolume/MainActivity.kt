package com.bayusurapati.projecthitungvolume

import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.bayusurapati.projecthitungvolume.R
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtpanjang: EditText? = null
        var txtlebar: EditText? = null
        var txttinggi: EditText? = null
        var btnhitung: Button? = null
        var txthasil: TextView? = null

        txtpanjang = findViewById(R.id.panjang)
        txtlebar = findViewById(R.id.lebar)
        txttinggi = findViewById(R.id.tinggi)
        btnhitung = findViewById(R.id.hitung)
        txthasil = findViewById(R.id.hasil)

        val inputlebar = findViewById<TextView>(R.id.lebar)
        val inputtinggi = findViewById<TextView>(R.id.tinggi)
        val inputpanjang = findViewById<TextView>(R.id.panjang)

        btnhitung.setOnClickListener(View.OnClickListener {
            val p: Int
            val l: Int
            val t: Int
            val v: Int
            if (txtpanjang.getText().toString().isEmpty()) {
                txtpanjang.setError("harap diisi dahulu")
                return@OnClickListener
            }
            if (txtlebar.getText().toString().isEmpty()) {
                txtlebar.setError("harap diisi dahulu")
                return@OnClickListener
            }
            if (txttinggi.getText().toString().isEmpty()) {
                txttinggi.setError("harap diisi dahulu")
                return@OnClickListener
            }
            p = txtpanjang.getText().toString().toInt()
            l = txtlebar.getText().toString().toInt()
            t = txttinggi.getText().toString().toInt()
            v = p * l * t
            txthasil.setText(v.toString())
        })
    }
}