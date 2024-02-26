package com.hilalcifci.thy3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.hilalcifci.thy3.databinding.ActivityBeklemeeeeBinding
import com.hilalcifci.thy3.databinding.ActivityMainBinding
import  kotlin.system.exitProcess
import java.util.Timer
import kotlin.concurrent.schedule
import android.content.Intent

class beklemeeee : AppCompatActivity() {
    lateinit var binding: ActivityBeklemeeeeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBeklemeeeeBinding.inflate(layoutInflater)
    }
}
