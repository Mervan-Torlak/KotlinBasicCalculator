package com.mervanyusatorlak.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mervanyusatorlak.viewbindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun plusClicked(view:View){
        val num1=binding.num1Text.text.toString().toDoubleOrNull()
        val num2=binding.num2Text.text.toString().toDoubleOrNull()
        if(num1!=null&&num2!=null){
            val result=num1+num2
            binding.textView.text="Result: ${result}" //result.toString()
        }
        else if(num1==null){
            binding.textView.text="Enter number 1 correctly"
        }
        else{
            binding.textView.text="Enter number 2 correctly"
        }
    }
    fun minusClicked(view:View){
        val num1=binding.num1Text.text.toString().toDoubleOrNull()
        val num2=binding.num2Text.text.toString().toDoubleOrNull()
        if(num1!=null&&num2!=null){
            val result=num1-num2
            binding.textView.text="Result: ${result}"
        }
        else if(num1==null){
            binding.textView.text="Enter number 1 correctly"
        }
        else{
            binding.textView.text="Enter number 2 correctly"
        }
    }
    fun timeClicked(view:View){
        val num1=binding.num1Text.text.toString().toDoubleOrNull()
        val num2=binding.num2Text.text.toString().toDoubleOrNull()
        if(num1!=null&&num2!=null){
            val result=num1*num2
            binding.textView.text="Result: ${result}"
        }
        else if(num1==null){
            binding.textView.text="Enter number 1 correctly"
        }
        else{
            binding.textView.text="Enter number 2 correctly"
        }
    }
    fun divideClicked(view:View){
        val num1=binding.num1Text.text.toString().toDoubleOrNull()
        val num2=binding.num2Text.text.toString().toDoubleOrNull()
        if(num1!=null&&num2!=null){
            val result=num1/num2
            binding.textView.text="Result: ${result}"
        }
        else if(num1==null){
            binding.textView.text="Enter number 1 correctly"
        }
        else{
            binding.textView.text="Enter number 2 correctly"
        }
    }
}