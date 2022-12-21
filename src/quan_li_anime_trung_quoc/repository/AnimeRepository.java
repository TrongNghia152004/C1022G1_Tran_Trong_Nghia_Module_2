package quan_li_anime_trung_quoc.repository;

import quan_li_anime_trung_quoc.model.Anime;

import java.util.ArrayList;
import java.util.List;

public class AnimeRepository implements IAnimeRepository {
    private static List<Anime> animeList= new ArrayList<>();
    static {
        animeList.add(new Anime(1, "Onepiece" , 999 , 1997 , "Adventure"));
        animeList.add(new Anime(2,"Naruto" , 500 , 1999 , "Action"));
        animeList.add(new Anime(3,"Kuroko no basketball" , 96 , 2012 , "Sport"));
    }

    @Override
    public void add(Anime anime) {
        animeList.add(anime);
    }

    @Override
    public void displayAnime() {
        for (Anime anime: animeList) {
            System.out.println(anime);
        }
    }
}
