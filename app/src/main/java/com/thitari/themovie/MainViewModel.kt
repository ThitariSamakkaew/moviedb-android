package com.thitari.themovie

import com.thitari.themovie.ui.base.BaseViewModel
import javax.inject.Inject

abstract class MainViewModel : BaseViewModel()

class MainViewModelImpl @Inject constructor() : MainViewModel()
