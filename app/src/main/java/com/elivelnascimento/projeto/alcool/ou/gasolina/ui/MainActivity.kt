package com.elivelnascimento.projeto.alcool.ou.gasolina.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import com.elivelnascimento.projeto.alcool.ou.gasolina.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculoResultado()
    }

    fun calculoResultado()
    {

        var valorGasolina = 0
        val seekBar = findViewById<SeekBar>(R.id.seek_bar)
        val txtGasolina = findViewById<TextView>(R.id.text_texto_inicial)
        val txtResultado = findViewById<TextView>(R.id.text_resultado)
        seekBar.max = 10000

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                valorGasolina = progress
                var texto = "R$ "
                texto += formataValor( valorGasolina/100.0)
                text_texto_inicial.text = texto
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                txtResultado.text = "Selecione o valor da gasolina "
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                txtResultado.text = "Clique em calcular para saber o Resultado "
            }


        })
    }

    private fun formataValor(valor: Double): Any? {

        return String.format(Locale.FRANCE, "%.2f", valor)
    }
}
