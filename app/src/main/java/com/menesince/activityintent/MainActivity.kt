package com.menesince.activityintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.menesince.activityintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDetay.setOnClickListener {
            // Snackbar.make(it,"Burdayım",Snackbar.LENGTH_SHORT).show()
            // binding.textView.text = "Oldu"

            val intent = Intent(this@MainActivity,DetayActivity::class.java)
            intent.putExtra("ad","Ahmet")
            intent.putExtra("yas",23)
            intent.putExtra("boy",1.88)
            intent.putExtra("bekarMi",true)
            startActivity(intent)
        }



    }
}