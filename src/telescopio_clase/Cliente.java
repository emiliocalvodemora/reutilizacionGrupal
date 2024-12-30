package src.telescopio_clase;

public class Cliente {

    LocalizadorMesonesio locM;

    public Cliente()
    {
        locM = new AdaptadorActualesAMesonesias();
    }
    public static void main (String [] args)
    {
        // TODO esto creo que no lo he puesto bien porque no concuerda exactamente con el fragmento de codigo del word
        /*
         public static void main (String [] args)
            {
                LocalizadorMesonesio locM;
                     ···
                locM.ubicarGranulos();
                locM.ubicarPlanares();
                locM.ubicarSemicuantos();
             }
        * */
        Cliente usuario_mesonesios = new Cliente();
        usuario_mesonesios.locM.ubicarGranulos();
        usuario_mesonesios.locM.ubicarPlanares();
        usuario_mesonesios.locM.ubicarSemicuantos();
    }

}
