package com.lanic.travely

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lanic.travely.base.BaseActivity
import com.lanic.travely.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(
    layoutId = R.layout.activity_main
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_main_fragment) as NavHostFragment

        with(binding) {
            bnvMain.setupWithNavController(navHostFragment.navController)
        }
    }
}