package labEx4.labEx4_1to4;


public class SpecialMovie extends Movie {
    private String visualEffects;
    private String soundEffects;

    public SpecialMovie(String movie_Name,String produced_By,String visualEffects, String soundEffects){
        super(movie_Name , produced_By);
        this.soundEffects=soundEffects;
        this.visualEffects=visualEffects;

    }
    public SpecialMovie(String movie_Name, String produced_By, String directedBy, int duration, int year, String category,String visualEffects, String soundEffects){
        super(movie_Name,produced_By,directedBy, duration,year,category);
        this.soundEffects=soundEffects;
        this.visualEffects=visualEffects;
    }

    public String getVisualEffects() {
        return visualEffects;
    }

    public void setVisualEffects(String visualEffects) {
        this.visualEffects = visualEffects;
    }

    public String getSoundEffects() {
        return soundEffects;
    }

    public void setSoundEffects(String soundEffects) {
        this.soundEffects = soundEffects;
    }

    @Override
    public String showDetails() {
        return super.showDetails()+" Visual Effects: "+visualEffects+" Sound Effects: "+soundEffects;
    }
}
