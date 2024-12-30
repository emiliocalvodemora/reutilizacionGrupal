package src.telescopio_objeto;

public class Cliente {

    public static void main (String [] args)
    {
        LocalizadorMesonesio locM = new AdaptadorActualesAMesonesias();
        locM.ubicarGranulos();
        locM.ubicarPlanares();
        locM.ubicarSemicuantos();
    }

}
