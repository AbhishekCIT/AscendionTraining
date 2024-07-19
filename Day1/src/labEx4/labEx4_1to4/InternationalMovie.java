package labEx4.labEx4_1to4;

public class InternationalMovie extends Movie {
    private String country;
    private String language;

    public InternationalMovie(String movie_Name,String produced_By,String country, String language){
        super(movie_Name , produced_By);
        this.country=country;
        this.language=language;

    }
    public InternationalMovie(String movie_Name, String produced_By, String directedBy, int duration, int year, String category,String country, String language){
        super(movie_Name,produced_By,directedBy, duration,year,category);
        this.country=country;
        this.language=language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String showDetails() {
        return super.showDetails()+" Country: "+ country+" Language: "+language;
    }
}
