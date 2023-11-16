public abstract class Monstro {
    public abstract boolean estouEmPe();
}

public interface ICorredor {
    void correEAtaca();
}

public interface IRastejador {
    void rastejaEAtaca();
}

public class Cuspidor extends Monstro implements ICorredor {
    public void correEAtaca() {
        System.out.println("Eu cuspo veneno");
    }

    public int huntingTime() {
        return 92;
    }

    public boolean estouEmPe() {
        return false;
    }
}