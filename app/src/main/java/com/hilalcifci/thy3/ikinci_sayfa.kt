package com.hilalcifci.thy3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilalcifci.thy3.databinding.ActivityIkinciSayfaBinding
import com.hilalcifci.thy3.databinding.ActivityMainForgetPasswordBinding

class ikinci_sayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityIkinciSayfaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.gecisbutton.setOnClickListener{
            intent= Intent(applicationContext,loding_sc::class.java)
            startActivity(intent)

        }
    }
}