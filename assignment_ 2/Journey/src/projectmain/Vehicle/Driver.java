package projectmain.Vehicle;

public interface Driver {
    int driver_min_age = 20;
    int driver_max_age = 60;

    String getDriverName();
    int getDriverAge();
    String getDriverCity();
}
