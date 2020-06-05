package com.sumanta.sdnews.util

import android.content.Context
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast

fun Context.toast(message: String){
    Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
}

fun ProgressBar.show(){
    visibility = View.VISIBLE
}

fun ProgressBar.hide(){
    visibility = View.GONE
}


class Constants {
    companion object {
        const val BASE_URL_I = "https://api.simplifiedcoding.in/course-apis/mvvm/"
        const val CURRENT_USER_ID = 0
    }
}