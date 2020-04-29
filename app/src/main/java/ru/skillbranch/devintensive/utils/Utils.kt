package ru.skillbranch.devintensive.utils

import java.util.*

object Utils {

    fun parseFullName(fullName:String?) : Pair<String?, String?> {
        val parts = fullName?.split(" ")
        val firstName : String? = parts?.getOrNull(0)
        val lastName : String? = parts?.getOrNull(1)
        return Pair(if (firstName == "") null else firstName, if (lastName == "") null else lastName)
    }
    fun toInitials(firstName:String?, lastName:String?) : String?{
        var firstInitial = ""
        var secondInitial = ""
        if ((firstName == null||firstName.trim() == "") && (lastName == null||lastName.trim() == ""))
            return null
        else if ((firstName != null||firstName?.trim() != "") && (lastName == null||lastName.trim() == ""))
            return "${firstName?.first()}"
        else if ((firstName == null||firstName.trim() == "") && (lastName != null||lastName?.trim() != ""))
            return "${lastName?.first()}"
        else
            return "${firstName?.first()}${lastName?.first()}"
    }
    fun transliteration(payload:String, divider:String = " ") : String {
        var engString = payload
        val dictionary = hashMapOf( "а" to "a", "б" to "b", "в" to "v", "г" to "g",
            "д" to "d", "е" to "e", "ё" to "e", "ж" to "zh", "з" to "z", "и" to "i", "й" to "i",
            "к" to "k", "л" to "l", "м" to "m", "н" to "n", "о" to "o", "п" to "p", "р" to "r",
            "с" to "s", "т" to "t", "у" to "u", "ф" to "f", "х" to "h", "ц" to "c", "ч" to "ch",
            "ш" to "sh", "щ" to "sh'", "ъ" to "", "ы" to "i", "ь" to "", "э" to "e", "ю" to "yu",
            "я" to "ya", " " to divider )

        for ((ru, eng) in dictionary) {
            engString = engString.replace(ru, eng, true)
        }

        return engString
    }
}
