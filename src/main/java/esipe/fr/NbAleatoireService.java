package esipe.fr;

import java.util.concurrent.ThreadLocalRandom;

public class NbAleatoireService implements INBAleatoireService {

    private int min,max;

    public NbAleatoireService(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public int getNbAlea() {
       return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
