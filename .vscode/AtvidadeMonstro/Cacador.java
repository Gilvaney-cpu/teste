public abstract class Cacador extends Monstro {
    protected String arma = "Rifle .45";

    public abstract int tempoDeCaca();

    void cacarECapturar() {
        System.out.println("Ele caça e captura outros monstros, mas ele não pode matar!");
    }
}