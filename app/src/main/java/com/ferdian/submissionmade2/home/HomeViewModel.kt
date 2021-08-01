package com.ferdian.submissionmade2.home

import androidx.lifecycle.*
import com.ferdian.core.data.Resource
import com.ferdian.core.domain.model.User
import com.ferdian.core.domain.usecase.UserUseCase

class HomeViewModel(userUseCase: UserUseCase) : ViewModel() {
    private var username: MutableLiveData<String> = MutableLiveData()

    fun setSearch(query: String) {
        if (username.value == query) {
            return
        }
        username.value = query
    }

    //val users = userUseCase.getAllUsers(query).asLiveData()
    val users: LiveData<Resource<List<User>>> = Transformations
        .switchMap(username) {
            userUseCase.getAllUsers(it).asLiveData()
        }
}