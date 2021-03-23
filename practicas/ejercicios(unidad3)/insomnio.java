
public class insomnio{
    public int calcularTiempo (){
        int horaDurmio=2;
        int minDurmio=45;
        int horaDesperto=11;
        int minDesperto=25;
        int horaDurmioEnMin=horaDurmio*60+minDurmio;
        int horaDespertoEnMin=horaDesperto*60+minDesperto;
        int res=horaDespertoEnMin-horaDurmioEnMin;
        return res;
    }
}
