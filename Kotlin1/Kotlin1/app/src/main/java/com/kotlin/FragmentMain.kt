package com.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.kotlin.databinding.ActivityFragmentMainBinding

class FragmentMain : AppCompatActivity() {

    lateinit var binding: ActivityFragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragment1btn.setOnClickListener{
            replaceFragment(Fragment1())
        }

        binding.fragment2btn.setOnClickListener{
            replaceFragment(Fragment2())
        }
    }

    private fun replaceFragment(fragment : Fragment) {
        val fragmentManager =supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}