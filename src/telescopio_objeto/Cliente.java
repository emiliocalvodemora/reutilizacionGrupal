package src.telescopio_objeto;

public class Cliente {
    //TODO código por contrastar, no sé si es la forma de aplicar el patrón adapter con objetos
    LocalizadorMesonesio locM;
    public Cliente (){
        locM = new AdaptadorActualesAMesonesias();
    }

    public static void main (String [] args)
    {
        Cliente usuario_mesonesios = new Cliente();
        usuario_mesonesios.locM.ubicarGranulos();
        usuario_mesonesios.locM.ubicarPlanares();
        usuario_mesonesios.locM.ubicarSemicuantos();
    }

}
