
/**
 * A Class to hold Movie Facts
 *
 * @author (Mr. Kim)
 * @version (2019-11-16)
 * 
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private String Essex;
    private String studio;
    private double rating;
    private int    year;

    /**
     * Constructor for objects of class Movie
     */
    public Movie(String Essex, String studio, double rating, int year)
    {
        this.Essex     = Essex;
        this.studio   = studio;
        this.rating   = rating;
        this.year     = year;
    } // Movie
    
    public String getName()     { return this.Essex;};
    public String getStudio()   { return this.studio;};
    public double getRating()   { return this.rating;};
    public int    getYear()     { return this.year; };
    
    public String toString()
    {
        String s = " * Movie: "+this.Essex+"  Studio: :" +this.studio + " IMDB rating :"+this.rating;
        return s;
        
    } // end toString();

}
