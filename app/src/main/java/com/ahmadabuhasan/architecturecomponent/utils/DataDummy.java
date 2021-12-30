package com.ahmadabuhasan.architecturecomponent.utils;

import com.ahmadabuhasan.architecturecomponent.R;
import com.ahmadabuhasan.architecturecomponent.data.MovieEntity;
import com.ahmadabuhasan.architecturecomponent.data.TVShowEntity;

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

        movie.add(new MovieEntity(
                "Movie 3",
                "Aquaman (2018)",
                "26/12/2018 (AU)",
                "Aksi, Petualangan, Fantasi",
                "2h 23m",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                R.drawable.poster_aquaman
        ));

        movie.add(new MovieEntity(
                "Movie 4",
                "Bohemian Rhapsody (2018)",
                "30/10/2018 (ID)",
                "Musik, Drama, Sejarah",
                "2h 15m",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                R.drawable.poster_bohemian
        ));

        movie.add(new MovieEntity(
                "Movie 5",
                "Cold Pursuit (2019)",
                "08/02/2019 (US)",
                "Aksi, Kejahatan, Cerita Seru",
                "1h 59m",
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                R.drawable.poster_cold_persuit

        ));

        movie.add(new MovieEntity(
                "Movie 6",
                "Glass (2019)",
                "18/01/2019 (US)",
                "Cerita Seru, Drama, Cerita Fiksi",
                "2h 9m",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                R.drawable.poster_glass
        ));

        movie.add(new MovieEntity(
                "Movie 7",
                "Avengers: Infinity War (2018)",
                "27/04/2018 (US)",
                "Petualangan, Aksi, Cerita Fiksi",
                "2h 29m",
                "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                R.drawable.poster_infinity_war
        ));

        movie.add(new MovieEntity(
                "Movie 8",
                "Mortal Engines (2018)",
                "14/12/2018 (US)",
                "Petualangan, Cerita Fiksi",
                "2h 9m",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                R.drawable.poster_mortal_engines
        ));

        movie.add(new MovieEntity(
                "Movie 9",
                "Robin Hood (2018)",
                "21/11/2018 (US)",
                "Petualangan, Aksi, Cerita Seru",
                "1h 56m",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                R.drawable.poster_robin_hood
        ));

        movie.add(new MovieEntity(
                "Movie 10",
                "Spider-Man: Into the Spider-Verse (2018)",
                "14/12/2018 (US)",
                "Aksi, Petualangan, Animasi, Cerita Fiksi, Komedi",
                "1h 57m",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                R.drawable.poster_spiderman
        ));
        return movie;
    }

    public static List<TVShowEntity> generateDummyTVShow() {
        ArrayList<TVShowEntity> tvshow = new ArrayList<>();

        tvshow.add(new TVShowEntity(
                "TVShow 1",
                "Doom Patrol (2019)",
                "Februari 15, 2019",
                "Sci-fi & Fantasy, Drama",
                "49m",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                R.drawable.poster_doom_patrol
        ));

        tvshow.add(new TVShowEntity(
                "TVShow 2",
                "Family Guy (1999)",
                "Januari 31, 1999",
                "Animasi, Komedi",
                "22m",
                "Seri animasi animasi Freakin 'Sweet yang sakit, terpelintir, dan salah, menampilkan petualangan keluarga Griffin yang disfungsional. Peter yang kikuk dan Lois yang sudah lama menderita memiliki tiga anak. Stewie (bayi yang brilian tetapi sadis yang bertekad membunuh ibunya dan mengambil alih dunia), Meg (yang tertua, dan merupakan gadis yang paling tidak populer di kota) dan Chris (anak tengah, dia tidak terlalu cerdas tetapi memiliki hasrat untuk film ). Anggota terakhir keluarga itu adalah Brian - anjing yang bisa bicara dan lebih dari sekadar hewan peliharaan, ia menjaga Stewie, sementara menghirup Martinis dan memilah-milah masalah hidupnya sendiri.",
                R.drawable.poster_family_guy
        ));

        tvshow.add(new TVShowEntity(
                "TVShow 3",
                "The Flash (2014)",
                "Oktober 7, 2014",
                "Drama, Sci-fi & Fantasy",
                "44m",
                "Setelah akselerator partikel menyebabkan badai aneh, Penyelidik CSI Barry Allen disambar petir dan jatuh koma. Beberapa bulan kemudian dia terbangun dengan kekuatan kecepatan super, memberinya kemampuan untuk bergerak melalui Central City seperti malaikat penjaga yang tak terlihat. Meskipun awalnya senang dengan kekuatan barunya, Barry terkejut menemukan bahwa dia bukan satu-satunya \"manusia meta\" yang diciptakan setelah ledakan akselerator - dan tidak semua orang menggunakan kekuatan baru mereka untuk kebaikan. Barry bermitra dengan S.T.A.R. Lab dan mendedikasikan hidupnya untuk melindungi yang tidak bersalah. Untuk saat ini, hanya beberapa teman dekat dan rekan yang tahu bahwa Barry secara harfiah adalah manusia tercepat, tetapi tidak lama sebelum dunia mengetahui apa yang menjadi Barry Allen ... The Flash.",
                R.drawable.poster_flash
        ));

        tvshow.add(new TVShowEntity(
                "TVShow 4",
                "Gotham (2014)",
                "September 22, 2014",
                "Drama, Kejahatan, Sci-fi & Fantasy",
                "43m",
                "Semua orang tahu nama Komisaris Gordon. Dia adalah salah satu musuh terbesar dunia kejahatan, seorang pria yang reputasinya identik dengan hukum dan ketertiban. Tapi apa yang diketahui tentang kisah Gordon dan kenaikannya dari detektif pemula ke Komisaris Polisi? Apa yang diperlukan untuk menavigasi berbagai lapisan korupsi yang diam-diam memerintah Kota Gotham, tempat bertelurnya penjahat paling ikonik di dunia? Dan keadaan apa yang menciptakan mereka - persona yang lebih besar dari kehidupan yang akan menjadi Catwoman, The Penguin, The Riddler, Two-Face dan The Joker?",
                R.drawable.poster_gotham
        ));

        tvshow.add(new TVShowEntity(
                "TVShow 5",
                "Naruto Shippuden (2007)",
                "Februari 15, 2007",
                "Animasi, Aksi & Petualangan, Sci-fi & Fantasy",
                "25m",
                "Naruto Shippuuden adalah kelanjutan dari serial TV animasi asli Naruto. Kisah ini berkisah tentang Uzumaki Naruto yang lebih tua dan sedikit lebih matang dan upayanya untuk menyelamatkan temannya Uchiha Sasuke dari cengkeraman Shinobi seperti ular, Orochimaru. Setelah 2 setengah tahun, Naruto akhirnya kembali ke desanya Konoha, dan mulai mewujudkan ambisinya, meskipun itu tidak akan mudah, karena Ia telah mengumpulkan beberapa musuh (lebih berbahaya), seperti organisasi shinobi. ; Akatsuki.",
                R.drawable.poster_naruto_shipudden
        ));

        tvshow.add(new TVShowEntity(
                "TVShow 6",
                "NCIS (2003)",
                "NCIS (2003)",
                "Kejahatan, Aksi & Petualangan, Drama",
                "45m",
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                R.drawable.poster_ncis
        ));

        tvshow.add(new TVShowEntity(
                "TVShow 7",
                "Riverdale (2017)",
                "Januari 26, 2017",
                "Misteri, Drama, Kejahatan",
                "45m",
                "Ditetapkan di masa sekarang, seri ini menawarkan pandangan subversif yang berani pada Archie, Betty, Veronica dan teman-teman mereka, menjelajahi surealitas kehidupan kota kecil, kegelapan dan keanehan yang menggelegak di bawah fasad Riverdale yang sehat",
                R.drawable.poster_riverdale
        ));

        tvshow.add(new TVShowEntity(
                "TVShow 8",
                "Shameless (2004)",
                "Januari 13, 2004",
                "Komedi, Drama",
                "1h",
                "The story of a young group of siblings pretty much abandoned by their parents, surviving by their wits - and humor - on a rough Manchester council estate. Whilst they won't admit it, they need help and find it in Steve, a young middle class lad who falls for Fiona, the oldest sibling, and increasingly finds himself drawn to this unconventional and unique family. Anarchic family life seen through the eyes of an exceptionally bright fifteen year old, who struggles to come of age in the context of his belligerent father, closeted brother, psychotic sister and internet porn star neighbors.",
                R.drawable.poster_shameless
        ));

        tvshow.add(new TVShowEntity(
                "TVShow 2",
                "",
                "",
                "",
                "",
                "",
                R.drawable.poster_family_guy
        ));

        tvshow.add(new TVShowEntity(
                "TVShow 2",
                "",
                "",
                "",
                "",
                "",
                R.drawable.poster_family_guy
        ));
        return tvshow;
    }
}