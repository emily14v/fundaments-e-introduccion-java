
public class youtuber{
    public int cancionesMaximas (){
        int duracionDeVideos=15;
        int duracionMinEnMinutos=2;
        int duracionMinEnSegundos=30;
        int duracionMax=3;
        int duracionMin=duracionMinEnMinutos*60/duracionMinEnSegundos;
        int res=duracionDeVideos/duracionMax;
        return res;
    }
}
