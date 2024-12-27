package src.telescopio_clase;

public class LocalizadorMesonesio {
    LocalizadorActual localizadorActual = new LocalizadorActual();
    public void ubicarPlanares()
    {
        localizadorActual.ajustarGammas();
        localizadorActual.ajustarAlfas();
    }

    public void ubicarGranulos()
    {
        localizadorActual.ajustarAlfas();
    }

    public void ubicarSemicuantos()
    {
        localizadorActual.ajustarGammas();
    }
}
