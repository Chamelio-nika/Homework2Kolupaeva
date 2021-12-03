package nika.homework2kolupaeva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "Poem"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"Я вчера заметил в парке")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "На сосне рисунок яркий,")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Разглядеть его хотел...")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Вдруг сложились половинки")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Этой радужной картинки,")
    }


    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "И рисунок улетел!")
    }

    }
