package com.angels.pooyeshgaran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.angels.pooyeshgaran.databinding.ActivityMainBinding
import com.angels.pooyeshgaran.databinding.UserModel

class MainActivity : AppCompatActivity() {

    lateinit var mainDataBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val model = UserModel()
        model.userName = "sami"
        mainDataBinding.userModel = model
        mainDataBinding.testUrl = "https://i.redd.it/g5acbfi5hkm01.jpg";
    }
}