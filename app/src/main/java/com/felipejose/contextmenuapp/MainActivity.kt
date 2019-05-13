package com.felipejose.contextmenuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val corItens = findViewById<ListView>(R.id.lista) as ListView

        val itens = arrayOf("Sapato", "Tênis", "Camisa", "Short", "Calça", "Camiseta", "Chuteira", "Blusa", "Chuteria", "Jeans", "Boné", "Chapéu")

        val itensAdap : ArrayAdapter<String> = ArrayAdapter(this@MainActivity,android.R.layout.simple_list_item_1,itens)

        corItens.adapter = itensAdap

        registerForContextMenu(corItens)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu!!.setHeaderTitle("Selecione um item abaixo")

        menu.add(0,v!!.id,0,"Vermelho")
        menu.add(0,v.id,0,"Azul")
        menu.add(0,v.id,0,"Verde")
        menu.add(0,v.id,0,"Amarelo")
        menu.add(0,v.id,0,"Roxo")
        menu.add(0,v.id,0,"Branco")
        menu.add(0,v.id,0,"Preto")
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        if (item!!.title == "Vermelho") {
            Toast.makeText(this@MainActivity,"O Vermelho foi selecionado.", Toast.LENGTH_SHORT).show()
        }
        else if (item.title == "Azul"){
            Toast.makeText(this@MainActivity, "O Azul foi selecionado.", Toast.LENGTH_SHORT).show()
        }
        else if (item.title == "Verde"){
            Toast.makeText(this@MainActivity, "O Verde foi selecionado.", Toast.LENGTH_SHORT).show()
        }
        else if (item.title == "Amarelo"){
            Toast.makeText(this@MainActivity,"O Amarelo foi selecionado.", Toast.LENGTH_SHORT).show()
        }
        else if (item.title == "Roxo"){
            Toast.makeText(this@MainActivity, "O Roxo foi selecionado.", Toast.LENGTH_SHORT).show()
        }
        else if (item.title == "Branco"){
            Toast.makeText(this@MainActivity, "O Branco foi selecionado.", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this@MainActivity, "O Preto foi selecionado.", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}
