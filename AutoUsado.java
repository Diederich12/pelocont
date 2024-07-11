public class AutoUsado extends Auto {

    public AutoUsado(String marca, String modelo, double valor) {
        super(marca, modelo, valor);
    }

    @Override
    public void tipoAuto() {
        System.out.println("Este es un auto usado");
    }
}
