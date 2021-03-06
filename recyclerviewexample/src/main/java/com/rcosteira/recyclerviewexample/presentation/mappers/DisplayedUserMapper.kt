package com.rcosteira.recyclerviewexample.presentation.mappers

import com.rcosteira.core.ui.Mapper
import com.rcosteira.core.domain.entities.User
import com.rcosteira.recyclerviewexample.presentation.entities.DisplayedUser
import javax.inject.Inject

class DisplayedUserMapper @Inject constructor() : Mapper<User, DisplayedUser> {
    override fun mapToUI(type: User): DisplayedUser {
        return DisplayedUser(
            id = type.id.value,
            name = type.username.value
        )
    }
}