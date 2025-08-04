public class TennisDemo {
    public static void main(String[] args) {
        //Crear una instancia de cada tipo de medio de comunicación (MedioGeneralista con nombre "La Tierrina", MedioSensacionalista con nombre "Adios" y MedioDeportivo con nombre "Anota"
        //Suscribir a cada uno de esos medios a lo que pueda ocurrir en el Campeonato
        MassMedia m1 = new GeneralistMedia("La Tierrina"); 
        MassMedia m2 = new TabloidMedia("Adios");
        MassMedia m3 = new SportsMedia("Anota"); 
        Championship.getInstance().suscribe(m1);
        Championship.getInstance().suscribe(m2);
        Championship.getInstance().suscribe(m3);
        InitTennisData itd = new InitTennisData();
        
    }

}
