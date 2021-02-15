package com.example.personapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var p = Person("Martin",24)
        Log.d("Person",p.toString())

        val list = ArrayList<Person>()
        val p1 = Person("Lars",54)
        val p2 = Person("Anja",50)
        val p3 = Person("Anders",22)

        list.add(p)
        list.add(p1)
        list.add(p2)
        list.add(p3)
        list.add(Person("Mia",20))

        button.setOnClickListener {
            var text = ""
            for (person in list) {
                Log.d("Person", person.toString())
                text = text + person.toString() + "\n"
            }
            Log.d("allpersons", text)
            val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_LONG)
            toast.show()
        }
    }
}