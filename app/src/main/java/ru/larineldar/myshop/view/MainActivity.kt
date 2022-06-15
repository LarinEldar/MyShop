package ru.larineldar.myshop.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.larineldar.myshop.R
import ru.larineldar.myshop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initBottomNavigation()
    }

    private fun initBottomNavigation(){
        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> {}
                R.id.catalog -> {}
                R.id.cart -> {}
                R.id.profile -> {}
            }
            return@setOnNavigationItemSelectedListener true
        }
    }
}