package com.ahmadabuhasan.architecturecomponent.utils;

import com.ahmadabuhasan.architecturecomponent.R;
import com.ahmadabuhasan.architecturecomponent.data.MovieEntity;

import java.util.ArrayList;
import java.util.List;

public class DataDummy {

    public static List<MovieEntity> generateDummyMovie() {
        ArrayList<MovieEntity> movie = new ArrayList<>();

        movie.add(new MovieEntity(
                "Movie 1",
                "A Star Is Born (2018)",
                "05/10/2018 (US)",
                "Drama, Percintaan",
                "2h 16m",
                "Seorang bintang musik country yang karirnya mulai memudar, Jackson Maine (Bradley Cooper) menemukan sebuah talenta yang sangat berbakat di dalam diri dari seorang musisi muda bernama Ally (Lady Gaga). Maine berhasil mengorbitkan Ally menjadi seorang bintang muda yang menjanjikan. Namun keduanya terlibat hubungan yang lebih jauh dari sekedar mentor dan anak didik. Seiring dengan meroketnya karir dari Ally dan dirinya, Maine mengalami dilema mengenai masalah ini.",
                R.drawable.poster_a_start_is_born
        ));

        movie.add(new MovieEntity(
                "Movie 2",
                "Alita: Battle Angel (2019)",
                "14/02/2019 (US)",
                "Aksi, Cerita Fiksi, Petualangan",
                "2h 2m",
                "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                R.drawable.poster_alita
        ));
        return movie;
    }
}