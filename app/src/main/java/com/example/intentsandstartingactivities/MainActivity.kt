package com.example.intentsandstartingactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpenActivity.setOnClickListener {
            //başka bir activitye geçiş yapmak için ıntent metodu çağırılır.
            Intent(this,SecondActivity::class.java).also {
                //also{} bir Scope'tur.
                startActivity(it) //bu aşamada bırakırsak uygulama crash olur çalışmaz. Bunun sebebi SecondActivity'i AndroidManifest.xml dosyasında tamamlamamız lazım.

            }
        }

    }
}