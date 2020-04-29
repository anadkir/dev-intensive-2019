package ru.skillbranch.devintensive.models

import java.util.*

abstract class BaseMessage (
    val id: String,
    val from: User?,
    val chat: Chat,
    val isIncoming: Boolean = false,
    val date: Date = Date()
)
{
    abstract fun formatMessage()
    companion object AbstractFactory{
        private var lastId : Int = -1
        fun makeMessage(from : User?, chat : Chat, date : Date, type : String, payload : Any, isIncoming : Boolean = false) : BaseMessage {
            lastId++
            return when(type){
                "image" -> ImageMessage("$lastId", from = from, chat = chat, date = date, image = payload as String)
                else -> TextMessage("$lastId", from, chat, date = date, text = payload as String)
            }
        }
    }
}