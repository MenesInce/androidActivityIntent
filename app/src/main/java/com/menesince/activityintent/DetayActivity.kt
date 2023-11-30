package com.menesince.activityintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.menesince.activityintent.databinding.ActivityDetayBinding

class DetayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gelenAd = intent.getStringExtra("ad")
        val gelenYas = intent.getIntExtra("yas",0)
        val gelenBoy = intent.getDoubleExtra("boy",0.0)
        val gelenMedeniDurum = intent.getBooleanExtra("bekarMi",false)

        binding.textView.text = "$gelenAd - $gelenYas - $gelenBoy - $gelenMedeniDurum"



    }
}