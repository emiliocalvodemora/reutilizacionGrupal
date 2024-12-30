package src.telescopio_clase;

public class AdaptadorActualesAMesonesias extends LocalizadorActual implements LocalizadorMesonesio {

    @Override
    public void ubicarPlanares()
    {
        System.out.println("Localizador Mesonesio: inicio de ubicación de planares ==========>");
        this.ajustarGammas();
        System.out.println("Localizador Mesonesio: Ajuste de los parámetros gammas ajustados para completar las planares con alfas");
        this.ajustarAlfas();
        System.out.println("<========== Localizador Mesonesio: fin de ubicación de planares");
    }

    @Override
    public void ubicarGranulos()
    {
        System.out.println("Localizador Mesonesio: inicio de ubicación de granulos ==========>");
        this.ajustarAlfas();
        System.out.println("Localizador Mesonesio: Ajuste de los parámetros alfas ajustados para completar los gránulos");
        System.out.println("<========== Localizador Mesonesio: fin de ubicación de granulos");

    }

    @Override
    public void ubicarSemicuantos()
    {
        System.out.println("Localizador Mesonesio: inicio de ubicación de semicuantos ==========>");
        this.ajustarGammas();
        System.out.println("Localizador Mesonesio: Ajuste de los parámetros gammas ajustados para completar los semicuantos");
        System.out.println("<========== Localizador Mesonesio: Fin de ubicando de semicuantos");
    }

}
