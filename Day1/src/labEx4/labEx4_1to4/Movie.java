package labEx4.labEx4_1to4;

public class Movie {
    private static int movie_count=0;

    private String movie_Name;
    private String produced_By;
    private String directedBy;
    private int duration;
    private int year;
    private String category;
    private final String movie_id;


    public Movie(String movie_Name, String produced_By) {
        this.movie_Name = movie_Name;
        this.produced_By = produced_By;
        this.directedBy = "";
        this.duration = 0;
        this.year = 0;
        this.category = "";
        movie_count++;
        this.movie_id = generateMovieId();
    }

    public Movie(String movie_Name, String produced_By, String directedBy, int duration, int year, String category) {
        this(movie_Name, produced_By);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;

    }

    public static int getMoviesCount() {
        return movie_count;
    }


    private String generateMovieId() {
        return movie_Name +"_"+ movie_count;
    }

    public String getMovie_id() {
        return movie_id;
    }

    public static int getMovie_count() {
        return movie_count;
    }
//---->
    public String getMovie_Name() {
        return movie_Name;
    }

    public void setMovie_Name(String movie_Name) {
        movie_Name = movie_Name;
    }

    public String getProduced_By() {
        return produced_By;
    }

    public void setProduced_By(String produced_By) {
        this.produced_By = produced_By;
    }

    public String getDirectedBy() {
        return directedBy;
    }

    public void setDirectedBy(String directedBy) {
        this.directedBy = directedBy;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String showDetails(){
        return "Movie ID: " + movie_id + ", Name: " + movie_Name + ", Produced By: " + produced_By + ", Directed By: " + directedBy +", Duration: " + duration + " minutes, Year: " + year + ", Category: " + category;
    }
}
