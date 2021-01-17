package com.dzakyhdr.movieapp.data

import com.dzakyhdr.movieapp.R

object DummyData {
    fun getMovie(): List<MovieEntity> {
        val movie = ArrayList<MovieEntity>()

        movie.add(
            MovieEntity(
                "1",
                "Alita: Battle Angel",
                "2019",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                "Action, Science Fiction, Adventure",
                "02/14/2019 (US)",
                R.drawable.poster_alita
            )
        )

        movie.add(
            MovieEntity(
                "2",
                "Aquaman",
                "2018",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "Action, Adventure, Fantasy",
                "12/21/2018 (US)",
                R.drawable.poster_aquaman
                
            )
        )

        movie.add(
            MovieEntity(
                "3",
                "Bohemian Rhapsody",
                "2018",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "Music, Drama",
                "11/02/2018 (US)",
                R.drawable.poster_bohemian

            )
        )

        movie.add(
            MovieEntity(
                "4",
                "Cold Pursuit",
                "2019",
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                "Action, Crime, Thriller\n",
                "02/08/2019 (US)",
                R.drawable.poster_cold_persuit

            )
        )
        movie.add(
            MovieEntity(
                "5",
                "Creed 2",
                "2018",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                "Drama",
                "11/21/2018 (US)",
                R.drawable.poster_creed

            )
        )
        movie.add(
            MovieEntity(
                "6",
                "Fantastic Beasts: The Crimes of Grindelwald",
                "2018",
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "Adventure, Fantasy, Drama",
                "11/16/2018 (US)",
                R.drawable.poster_crimes

            )
        )
        movie.add(
            MovieEntity(
                "7",
                "Glass",
                "2019",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "Thriller, Drama, Science Fiction",
                "01/18/2019 (US)",
                R.drawable.poster_glass
            )
        )
        movie.add(
            MovieEntity(
                "8",
                "How to Train Your Dragon: The Hidden World",
                "2019",
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                "Animation, Family, Adventure",
                "02/22/2019 (US)",
                R.drawable.poster_how_to_train

            )
        )
        movie.add(
            MovieEntity(
                "9",
                "Avengers: Infinity War",
                "2018",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "Adventure, Action, Science Fiction",
                "04/27/2018 (US)",
                R.drawable.poster_infinity_war

            )
        )
        movie.add(
            MovieEntity(
                "10",
                "Mary Queen of Scots",
                "2018",
                "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
                "History, Drama",
                "12/21/2018 (US)",
                R.drawable.poster_marry_queen

            )
        )


        return movie

    }

    fun getTvMovie(): List<TvEntity>{
        val tvShow = ArrayList<TvEntity>()

        tvShow.add(
            TvEntity(
                "1",
                "Arrow",
                "2012",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "Crime, Drama, Mystery, Action & Adventure",
                R.drawable.poster_arrow
            )
        )
        tvShow.add(
            TvEntity(
                "2",
                "Doom Patrol",
                "2019",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "Sci-Fi & Fantasy, Action & Adventure, Comedy\n",
                R.drawable.poster_doom_patrol
            )
        )
        tvShow.add(
            TvEntity(
                "3",
                "Looking Back at it All: The Dragon Ball Z Year-End Show!",
                "1993",
                "This movie is very different from the previous TV specials (Dragon Ball Z: Bardock - The Father of Goku and Dragon Ball Z: The History of Trunks), as it is a look back at what had happened in Dragon Ball Z in 1993. In this film, which is believed to take place some time around the 25th World Martial Arts Tournament, Gohan and Goten are having a hot bath outside in the middle of winter. Goku (who is still dead) suddenly appears in front of his sons with the help of his Instant Transmission, and joins them in the tub. While there, the three Saiyans reflect back on the events that occurred during the Cell Games. Inside the house after Chi-Chi appeared, Goku tells his sons about Pikkon and the Other World Tournament. Later, the four members of the Son family appear dressed nicely. Gohan says that the adult division of the Tournament will begin this next year (in 1994), and the special comes to an end.",
                "Action, Animation, Comedy",
                R.drawable.poster_dragon_ball
            )
        )
        tvShow.add(
            TvEntity(
                "4",
                "Fairy Tail: Dragon Cry ",
                "2017",
                "Natsu Dragneel and his friends travel to the island Kingdom of Stella, where they will reveal dark secrets, fight the new enemies and once again save the world from destruction.",
                "Action, Adventure, Comedy, Fantasy, Animation",
                R.drawable.poster_fairytail
            )
        )
        tvShow.add(
            TvEntity(
                "5",
                "Family Guy",
                "1999",
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                "Animation, Comedy",
                R.drawable.poster_family_guy
            )
        )
        tvShow.add(
            TvEntity(
                "6",
                "The Flash",
                "2014",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "Drama, Sci-Fi & Fantasy",
                R.drawable.poster_flash
            )
        )
        tvShow.add(
            TvEntity(
                "7",
                "Naruto Shippūden",
                "2007",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "Animation, Action & Adventure, Sci-Fi & Fantasy\n",
                R.drawable.poster_naruto_shipudden
            )
        )
        tvShow.add(
            TvEntity(
                "8",
                "God Friended Me",
                "2018",
                "A self-proclaimed \"pesky atheist\" is encouraged to help strangers by someone claiming to be God who friends him on Facebook.",
                "Drama, Family, Mystery\n",
                R.drawable.poster_god
            )
        )
        tvShow.add(
            TvEntity(
                "9",
                "Gotham",
                "2014",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "Drama, Fantasy, Crime",
                R.drawable.poster_gotham
            )
        )
        tvShow.add(
            TvEntity(
                "10",
                "Grey's Anatomy",
                "2005",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "Drama",
                R.drawable.poster_grey_anatomy
            )
        )

        return tvShow

    }


}