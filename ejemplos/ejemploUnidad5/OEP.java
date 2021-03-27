
public class OEP{
    public String verificar(persona persona){
        String res;
        int edadPersona=persona.getEdad();
        String nombrePersona=persona.getNombre();
        if(edadPersona>=18){
            res=nombrePersona+" esta hablitado";
        }else{
            res=nombrePersona+" no esta habilitado";
        }
        return res;
    }
}
