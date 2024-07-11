public class AutoNuevo  extends Auto{

    public AutoNuevo(String Modelo, String Marca, double valor){
        super(Marca, Modelo, valor);

    }

    @Override
    public void tipoAuto() {
        System.out.println("Este es un auto nuevo");
    }


}
