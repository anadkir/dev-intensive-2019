package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*

const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR


fun Date.format(pattern:String="HH.mm.ss dd.MM.yy"):String {
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

fun Date.add(value:Int, unit:TimeUtils = TimeUtils.SECOND):Date {
    this.time += when(unit) {
        TimeUtils.SECOND -> value * SECOND
        TimeUtils.MINUTE -> value * MINUTE
        TimeUtils.HOUR -> value * HOUR
        TimeUtils.DAY -> value * DAY
    }

    return this
}

enum class TimeUtils {
    SECOND,
    MINUTE,
    HOUR,
    DAY
}