package ru.skillbranch.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.extensions.TimeUtils
import ru.skillbranch.devintensive.extensions.add
import ru.skillbranch.devintensive.extensions.format
import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.utils.Utils
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun name() {
        val (firstName, lastName)=Utils.parseFullName("John Lennon")
        println(firstName)
        println(lastName)
    }
    @Test
    fun user_factory() {
        User.makeUser("Anastasiia")
        User.makeUser("Anastasiia Kir")
        User.makeUser(" ")
        User.makeUser(null)
    }
    @Test
    fun day_format() {
        println(Date().format())
        println(Date().format("HH:mm"))
        println(Date().format("hh:mm"))
        println(Date().format("yy.MM hh:mm"))
        println(Date().format("yy.mm hh:mm"))
    }
    @Test
    fun day_add() {
        println(Date().add(13).format())
        println(Date().add(-13).format())
        println(Date().add(13, TimeUtils.MINUTE).format())
        println(Date().add(-13, TimeUtils.MINUTE).format())
        println(Date().add(13, TimeUtils.HOUR).format())
        println(Date().add(-13, TimeUtils.HOUR).format())
        println(Date().add(13, TimeUtils.DAY).format())
        println(Date().add(-13, TimeUtils.DAY).format())
    }
    @Test
    fun Initials() {
        println("""
        ${Utils.toInitials("John", "Lennon")}
        ${Utils.toInitials("John", "")}
        ${Utils.toInitials(null, null)}
        ${Utils.toInitials(" ", " ")}
        """.trimIndent())
    }
    @Test
    fun translit() {
        println(Utils.transliteration("Маша Барабан"))
        println(Utils.transliteration("Миша Барабан", "_"))
    }

}
