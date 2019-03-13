public class Exo1 implements Runnable {
    private int nbr;

    public Exo1() {
        this.nbr = 0;
    }

    private int getNbr() {
        return nbr;
    }

    private void setNbr(int nbr) {
        this.nbr = nbr;
    }

    @Override
    public void run()
    {
        for (int i=0; i<= 100; i++)
        {
            System.out.println(this.getNbr());
            this.setNbr(this.getNbr() + 1 );
        }
    }
}
