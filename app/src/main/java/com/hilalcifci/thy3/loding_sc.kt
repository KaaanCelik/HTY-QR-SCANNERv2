package com.hilalcifci.thy3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilalcifci.thy3.databinding.ActivityLodingScBinding
import com.hilalcifci.thy3.databinding.ActivityMainBinding

class loding_sc : AppCompatActivity() {
    lateinit var binding: ActivityLodingScBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loding_sc)
    }
}