package com.example.musicapp

import android.util.Log

class Song (SongName: String, SongArtist: String, SongYear: Int, SongDuration: String,){

    // adding variables for song object's attributes
    var name : String = ""
    var artist : String = ""
    var year : Int = 0
    var duration : String = ""

    //Added secondary constructor for if user only know the name and artist
    constructor(SongName: String, SongArtist: String,) : this (SongName,SongArtist,0, "")

    // initialise the  variable/attributes for the song objects
    init {
        name = SongName
        artist = SongArtist
        year = SongYear
        duration = SongDuration
    }

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
    //Added function to display song attributes
    fun DisplaySong(): String{
        return "$name - $artist ()$duration"
    }
}