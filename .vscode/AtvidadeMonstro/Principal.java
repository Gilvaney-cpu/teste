public class Principal {
    public static void main(String[] args) {
        Monstro m1 = new Cuspidor();
        Monstro m2 = new SerialKiller();

        System.out.println("Is m2 standing: " + m2.estouEmPe());

        IRastejador c1 = new Ogro();
        c1.rastejaEAtaca();

        c1 = new TRex();

        ICorredor r1 = (ICorredor) m1;
        r1.correEAtaca();

        System.out.println(((Cacador) m2).tempoDeCaca());

        m2 = new Cacador(); // Corrigido de Hunter para Cacador
        ((Cacador) m2).cacarECapturar();

        ((ICorredor) m1).correEAtaca();

        m1 = new TRex();
        ICorredor r2 = new TRex();
        m2 = (Monstro) r2;

        System.out.println(((Cuspidor) m1).huntingTime());
        ((ICorredor) m1).correEAtaca();

        System.out.println(((Cacador) r2).tempoDeCaca());

        r1.correEAtaca();
    }
}