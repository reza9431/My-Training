package ClassAndMethod;

public class SimpleLocation {
    double latitud;
    double longitud;

    public SimpleLocation(double lati , double longi){
        this.latitud = lati;
        this.longitud= longi;

    }




    public double distance (SimpleLocation other){

return getDist (this.longitud , this.longitud , other.longitud , other.longitud);
        }

    private double getDist(double longitud, double longitud1, double longitud2, double longitud3) {
        return longitud;
    }


}
