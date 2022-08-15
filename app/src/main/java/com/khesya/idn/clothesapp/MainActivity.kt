package com.khesya.idn.clothesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.khesya.idn.clothesapp.data.ClothesData
import com.khesya.idn.clothesapp.data.ClothesDataObject
import com.khesya.idn.clothesapp.ui.DetailClothesActivity
import com.khesya.idn.clothesapp.ui.ListClothesAdapter
import com.khesya.idn.clothesapp.ui.ProfileActivity

class MainActivity : AppCompatActivity() {
    private lateinit var rvClothes: RecyclerView
    private var list: ArrayList<ClothesData> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvClothes = findViewById(R.id.rv_clothes)
        rvClothes.setHasFixedSize(true)
        list.addAll(ClothesDataObject.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvClothes.layoutManager = LinearLayoutManager(this)
        val listClothesAdapter = ListClothesAdapter(list)
        rvClothes.adapter = listClothesAdapter

        listClothesAdapter.setOnItemClickCallback(object : ListClothesAdapter.OnItemClickCallback{
            override fun onItemClickedData(data: ClothesData) {
                showSelectionClothes(data)
            }
        })

    }

    private fun showSelectionClothes(data: ClothesData) {
        val detailClothesActivity =
            Intent(this@MainActivity, DetailClothesActivity::class.java).apply{
                putExtra(DetailClothesActivity.EXTRA_PHOTO, data.photo)
                putExtra(DetailClothesActivity.EXTRA_CLOTHES, data.clothes)
                putExtra(DetailClothesActivity.EXTRA_PRICE, data.price)
                putExtra(DetailClothesActivity.EXTRA_DETAILS, data.detail)
        }
        startActivity(detailClothesActivity)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(SelectedMode: Int) {
        R.id.action_user;run {
            val moveIntent = Intent(this@MainActivity, ProfileActivity::class.java)
            moveIntent.putExtra(ProfileActivity.EXTRA_PHOTO, R.drawable.potoprofile)
            moveIntent.putExtra(ProfileActivity.EXTRA_NAME, "Khesya Amelia Putri")
            moveIntent.putExtra(ProfileActivity.EXTRA_EMAIL, "khesyaap0209@gmail.com")
            startActivity(moveIntent)
        }
    }

}