package org.d3if3058.atry

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.d3if3058.atry.databinding.BirthdayCardBinding

class BirthdayCardActivity : AppCompatActivity() {

    private lateinit var binding: BirthdayCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BirthdayCardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val wishes = intent.getStringExtra("wishes")

        binding.HappyBirthdaytext.text = "Happy Birthday $name!"
        binding.Wishestext.text = wishes
    }
}