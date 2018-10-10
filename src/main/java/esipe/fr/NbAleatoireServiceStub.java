package esipe.fr;

public class NbAleatoireServiceStub implements INBAleatoireService {
    private int nb;

    public NbAleatoireServiceStub(int nb){
      this.nb = nb;
    }

    @Override
    public int getNbAlea() {
        return nb;
    }
}
