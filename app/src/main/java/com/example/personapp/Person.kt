package com.example.personapp

open class Person  (val name: String, val age: Int) {
    fun isOld() : Boolean {
        if (age>50)
            return true
        else
            return false
    }
    override fun toString() : String {
        if (isOld())
            return "$name, $age is old"
        else
            return "$name, $age is young"
   }
}

