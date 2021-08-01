package com.ferdian.submissionmade2.di

import com.ferdian.core.domain.usecase.UserInteractor
import com.ferdian.core.domain.usecase.UserUseCase
import com.ferdian.submissionmade2.detail.DetailViewModel
import com.ferdian.submissionmade2.follow.FollowViewModel
import com.ferdian.submissionmade2.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<UserUseCase> { UserInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { FollowViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}