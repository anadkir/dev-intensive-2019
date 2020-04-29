package ru.skillbranch.devintensive.extensions

import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.models.UserView
import ru.skillbranch.devintensive.utils.Utils

fun User.toUserView() : UserView {
    //val nickName = Utils.transliteration("$firstName $lastName")
    val initials = Utils.toInitials(firstName, lastName)

    return UserView(
        id,
        fullName = "$firstName $lastName",
        avatar = avatar,
        initials = initials,
        nickname = ""
    )
}