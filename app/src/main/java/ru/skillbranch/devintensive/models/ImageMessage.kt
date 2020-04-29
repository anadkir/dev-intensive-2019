package ru.skillbranch.devintensive.models

import android.service.voice.AlwaysOnHotwordDetector
import java.util.*

class ImageMessage(
    id: String,
    from: User?,
    chat: Chat,
    isIncoming: Boolean = false,
    date: Date = Date(),
    val image: String
) : BaseMessage(id, from, chat, isIncoming, date) {
    override fun formatMessage() {
        TODO("Not yet implemented")
    }
}