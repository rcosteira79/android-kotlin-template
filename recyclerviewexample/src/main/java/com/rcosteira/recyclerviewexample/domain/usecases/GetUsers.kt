package com.rcosteira.recyclerviewexample.domain.usecases

import com.rcosteira.core.interactors.UseCase
import com.rcosteira.core.interactors.UseCase.None
import com.rcosteira.recyclerviewexample.domain.entities.User
import com.rcosteira.recyclerviewexample.domain.repositories.Repository
import javax.inject.Inject

class GetUsers @Inject constructor(private val repository: Repository) : UseCase<List<User>, None>() {
    override suspend fun run(params: None) = repository.getUsersAsync()
}