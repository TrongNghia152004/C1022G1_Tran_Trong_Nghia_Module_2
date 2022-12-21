package quan_li_anime_trung_quoc.model;

public class Anime {
    private int id;
    private String name;
    private int episodes;
    private int yearOfManufacture;
    private String category;

    public Anime(int id , String name, int episodes, int yearOfManufacture, String category) {
        this.id = id;
        this.name = name;
        this.episodes = episodes;
        this.yearOfManufacture = yearOfManufacture;
        this.category = category;
    }

    public Anime() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", episodes=" + episodes +
                ", yearOfManufacture=" + yearOfManufacture +
                ", category='" + category + '\'' +
                '}';
    }
}
