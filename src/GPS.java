public class GPS {

    private float latitude;
    private float longitude;

    private static GPS instancia;

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    private GPS() {

    }

    public static GPS getInstance(){
        if(instancia == null){
            instancia = new GPS();
        }
        return instancia;
    }
    public void Inicializar(){

    }

}
