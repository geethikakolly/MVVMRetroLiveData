package com.example.mvvmretrolivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmretrolivedata.api.ApiInterface
import com.example.mvvmretrolivedata.api.Utils
import com.example.mvvmretrolivedata.model.Jokes
import com.example.mvvmretrolivedata.repository.MemesRepo
import com.example.mvvmretrolivedata.viewmodel.MemesViewModel
import com.example.mvvmretrolivedata.viewmodel.MemesViewModelFactory
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var memesViewModel: MemesViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiInterface = Utils.getInstance().create(ApiInterface::class.java)

        val memesRepo = MemesRepo(apiInterface)

        memesViewModel = ViewModelProvider(this, MemesViewModelFactory(memesRepo)).get(MemesViewModel::class.java)

        memesViewModel.memes.observe(this, {
            Log.d("test","onCreate: $(it.toString()}")
            it.data.memes.iterator().forEach {
                Log.d("","name : ${it.name}\nimage : ${it.url}")
            }

        })
    }
}