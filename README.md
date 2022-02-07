# TheMovie

A simple Android client for [The Movie DB](https://www.themoviedb.org/) where we can browse through popular, upcoming and top movies lists.

<img src="./demo/themovie-demo.gif" width="20%" height="20%">

## Architecture and Tech-stack

* Built MVVM architecture
* [Android Architecture Components](https://developer.android.com/topic/libraries/architecture), specifically [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) and [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)
* [Jetpack's Navigation Component](https://developer.android.com/guide/navigation) for navigation between screens
* Kotlin [Coroutines](https://developer.android.com/kotlin/coroutines) and [Flow](https://developer.android.com/kotlin/flow) for background work such as network calls etc.
* [Dagger 2](https://dagger.dev/) for dependency injection
* [Glide](https://github.com/bumptech/glide) for image loading
