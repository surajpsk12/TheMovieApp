🎬 TheMovieApp - Android MVVM Movie Listing App

An Android application built with MVVM architecture, Retrofit, LiveData, and DataBinding that fetches and displays a list of popular movies using The Movie Database (TMDb) API.


📱 Features

- 🧰 MVVM (Model-View-ViewModel) Architecture
- 🌐 Fetch movies using Retrofit from [TMDb API](https://www.themoviedb.org/)
- 📡 LiveData for observing data changes
- 🔄 Swipe-to-Refresh functionality
- 🖼️ Glide integration for loading movie posters
- 💅 Modern UI using CardViews and ConstraintLayout
- 🧪 Unit testing and structured clean code


🧑‍💻 Tech Stack

| Layer         | Library / Tool           |
|---------------|--------------------------|
| Networking    | Retrofit + GSON Converter|
| Image Loading | Glide                    |
| UI            | XML, Data Binding, RecyclerView |
| Architecture  | MVVM (ViewModel, LiveData, Repository) |
| Refresh       | SwipeRefreshLayout       |



🔌 API Reference

- TMDb API Base URL: https://api.themoviedb.org/3/
- Image Base URL: https://image.tmdb.org/t/p/w500/

To get your API key:
1. Sign up on [TMDb](https://www.themoviedb.org/)
2. Navigate to your account > Settings > API
3. Copy your key and place it in the app.


// Replace YOUR_API_KEY with your actual TMDb API key
@GET("movie/popular")
Call<Result> getPopularMovies(@Query("api_key") String apiKey);


🏗️ Architecture Diagram

View (Activity, XML)
     ↓
ViewModel (MainActivityViewModel)
     ↓
Repository (MovieRepository)
     ↓
Retrofit API Call (MovieApiService)
     ↓
Model (Movie, Result)


🚀 Getting Started

Prerequisites

* Android Studio Hedgehog or newer
* Min SDK 24+
* TMDb API Key

#Steps to Run

1. Clone the repo
2. Open in Android Studio
3. Add your TMDb API key in `MovieApiService.java`
4. Build and Run the project


📂 Folder Structure

TheMovieApp/
├── data/
│   └── api/ (Retrofit Interface)
├── model/
│   └── Movie.java, Result.java
├── repository/
├── ui/
│   ├── MainActivity.java
│   └── adapter/ (RecyclerView Adapter)
├── viewmodel/
└── res/layout/
    └── activity_main.xml, item_movie.xml


#🤝 Contributions

Feel free to fork this repo, improve it, and send pull requests. If you like this project, give it a ⭐!


#📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.


#🙋‍♂️Author

Suraj Kumar
📧 [LinkedIn](https://www.linkedin.com/in/surajvansh12)
💻 [GitHub](https://github.com/surajpsk12)


