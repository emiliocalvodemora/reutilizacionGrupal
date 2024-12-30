package src.telescopio_objeto;

public class AdaptadorActualesAMesonesias implements LocalizadorMesonesio{
    private LocalizadorActual localizadorActual;

    public AdaptadorActualesAMesonesias() {
        localizadorActual = new LocalizadorActual();
    }
    @Override
    public void ubicarPlanares()
    {
        System.out.println("Localizador Mesonesio: inicio de ubicación de planares ==========>");
        localizadorActual.ajustarGammas();
        System.out.println("Localizador Mesonesio: Ajuste de los parámetros gammas ajustados para completar las planares con alfas");
        localizadorActual.ajustarAlfas();
        System.out.println("<========== Localizador Mesonesio: fin de ubicación de planares");
    }

    @Override
    public void ubicarGranulos()
    {
        System.out.println("Localizador Mesonesio: inicio de ubicación de granulos ==========>");
        localizadorActual.ajustarAlfas();
        System.out.println("Localizador Mesonesio: Ajuste de los parámetros alfas ajustados para completar los gránulos");
        System.out.println("<========== Localizador Mesonesio: fin de ubicación de granulos");

    }

    @Override
    public void ubicarSemicuantos()
    {
        System.out.println("Localizador Mesonesio: inicio de ubicación de semicuantos ==========>");
        localizadorActual.ajustarGammas();
        System.out.println("Localizador Mesonesio: Ajuste de los parámetros gammas ajustados para completar los semicuantos");
        System.out.println("<========== Localizador Mesonesio: Fin de ubicando de semicuantos");
    }
}
