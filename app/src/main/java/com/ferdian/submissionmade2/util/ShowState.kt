package com.ferdian.submissionmade2.util


import com.ferdian.submissionmade2.databinding.FavoriteFragmentBinding
import com.ferdian.submissionmade2.databinding.FollowFragmentBinding
import com.ferdian.submissionmade2.databinding.HomeFragmentBinding

interface ShowState {
    fun onSuccessState(homeFragmentBinding: HomeFragmentBinding? = null,
                  followFragmentBinding: FollowFragmentBinding? = null,
                  favoriteFragmentBinding: FavoriteFragmentBinding? = null)

    fun onLoadingState(homeFragmentBinding: HomeFragmentBinding? = null,
                  followFragmentBinding: FollowFragmentBinding? = null,
                  favoriteFragmentBinding: FavoriteFragmentBinding? = null)

    fun onErrorState(homeFragmentBinding: HomeFragmentBinding? = null,
                followFragmentBinding: FollowFragmentBinding? = null,
                favoriteFragmentBinding: FavoriteFragmentBinding? = null,
                message: String?)
}
