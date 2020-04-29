package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils
import java.util.*

class User (
    val id : String,
    var firstName : String?,
    var lastName : String?,
    var avatar : String?,
    var rating : Int = 0,
    var respect : Int = 0,
    var lastVisit : Date? = Date(),
    var isOnline : Boolean = false
)
{
    init {
        println("""
            firstName=$firstName,
            lastName=$lastName,
        """.trimIndent())
    }
    companion object Factory {
        private var lastId : Int = -1
        fun makeUser(fullName:String?) : User {
            lastId++

            val (firstName, lastName)= Utils.parseFullName(fullName)

            return User(id= "$lastId", firstName = firstName, lastName = lastName, avatar = null)
        }
    }
}