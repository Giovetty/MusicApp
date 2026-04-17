package com.example.musicapp

import android.util.Log

class Song {
    // adding variables for song object's attributes
    var name : String = ""
    var artist : String = ""
    var year : Int = 0
    var duration : String = ""

    //function to play a song
    fun Play(){
        Log.v ("Song","$name is playing.")

    }
    //function to pause a song
    fun Pause(){
        Log.v ("Song","$name is in pause.")

    }
    //function to stop a song
    fun Stop(){
        Log.v ("Song","$name is not playing.")

    }
    //function to favourite a song
    fun Favourite() : Boolean{
        Log.v ("Song","$name is your favourite.")
        return true
    }
}