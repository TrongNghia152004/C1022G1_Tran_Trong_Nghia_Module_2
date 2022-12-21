package quan_li_anime_trung_quoc.service;

import quan_li_anime_trung_quoc.model.Anime;
import quan_li_anime_trung_quoc.repository.AnimeRepository;
import quan_li_anime_trung_quoc.repository.IAnimeRepository;

public class AnimeService implements IAnimeService {
    private IAnimeRepository repository = new AnimeRepository();
    @Override
    public void add(Anime anime) {
    repository.add(anime);
    }

    @Override
    public void displayAnime() {
        repository.displayAnime();
    }


}
