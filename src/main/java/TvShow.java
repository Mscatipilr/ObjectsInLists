public class TvShow {
    private String name;
    private int episodeCount;
    private String genre;

    public TvShow(String name, int episodeCount, String genre) {
        this.name = name;
        this.episodeCount = episodeCount;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }
    public int getEpisodeCount() {
        return episodeCount;
    }
    public String getGenre() {
        return genre;
    }
    @Override
    public String toString() {
        return "The name of the TV show is " + name + ", with " + episodeCount + " episodes. The genre is " + genre + ".";
    }

}
