package src.telescopio_clase;

public class Cliente {

    public static void main (String [] args)
    {
        LocalizadorMesonesio locM;
        locM = new AdaptadorActualesAMesonesias();
        locM.ubicarGranulos();
        locM.ubicarPlanares();
        locM.ubicarSemicuantos();
    }

}
