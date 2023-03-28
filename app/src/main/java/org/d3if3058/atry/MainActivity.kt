package org.d3if3058.atry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import org.d3if3058.atry.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set OnClickListener for the button
        binding.button.setOnClickListener {
            val name = binding.Name.text.toString()
            if (TextUtils.isEmpty(name)) {
                Toast.makeText(this, R.string.name_invalid, Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val wishes = binding.Wishes.text.toString()
            if (TextUtils.isEmpty(wishes)) {
                Toast.makeText(this, R.string.wishes_invalid, Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            // Start the BirthdayCardActivity with name and wishes as extras
            val intent = Intent(this, BirthdayCardActivity::class.java).apply {
                putExtra("name", name)
                putExtra("wishes", wishes)
            }
            startActivity(intent)
        }
    }
}