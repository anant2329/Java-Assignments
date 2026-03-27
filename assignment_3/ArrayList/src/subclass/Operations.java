package subclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Operations {
    List<String> cities = new ArrayList<>(Arrays.asList("Pune","Mumbai", "Delhi", "Bengaluru", "Chennai",
                                                        "Kolkata", "Hyderabad", "Jaipur", "Agra", "Varanasi", "Udaipur"));
    public void addCity(String city){
        cities.add(city.substring(0,1).toUpperCase() + city.substring(1));
    }
    public List<String> getCities(){
        return cities;
    }
    public List<String> getCityStartsWith(String c){
        List <String> result = new ArrayList<>();
        for(String city : cities){
            if (city.startsWith(c.toUpperCase())){
                result.add(city);
            }
        }
        return result;
    }
    public String searchCity(String cityName){
        String str = cityName.substring(0,1).toUpperCase() + cityName.substring(1);
        return cities.contains(str)?"City Found : "+str : "City Not Found";
    }
}
