
abstract class Bharatvanshi {
    abstract void fight();
}

class Kauravs extends Bharatvanshi

{

    protected int kindness;

    protected int obedience;

    public Kauravs() {
        kindness = obedience = 0;
    }

    public void SetKindness(int x) {
        kindness = x;
    }

    public void SetObedience(int x) {
        obedience = x;
    }

    public int GetKindness() {
        return (kindness);
    }

    public int GetObedience() {
        return (obedience);
    }

    @Override
    public void fight()

    {

        System.out.println(" Kauravs fight ");

    }

    public void kind()

    {

        System.out.println(" kindness = " + kindness);

    }

    public void obey()

    {

        System.out.println(" obedience = " + obedience);

    }

}

class Pandavs extends Bharatvanshi

{

    protected int kindness;

    protected int obedience;

    public Pandavs() {
        kindness = obedience = 10;
    }

    public void SetKindness(int x) {
        kindness = x;
    }

    public void SetObedience(int x) {
        obedience = x;
    }

    public int GetKindness() {
        return (kindness);
    }

    public int GetObedience() {
        return (obedience);
    }

    @Override
    public void fight()

    {

        System.out.println(" Kauravs fight ");

    }

    public void kind()

    {

        System.out.println(" kindness = " + kindness);

    }

    public void obey()

    {

        System.out.println(" obedience = " + obedience);

    }

}

class first

{

    public static void main(String args[])

    {

        Pandavs Arjun = new Pandavs();

        Pandavs Bheem = new Pandavs();

        int kindness = Arjun.GetKindness();

        Bheem.SetKindness(kindness - 1);

        Kauravs kauravs[] = new Kauravs[100];

        Kauravs Vikran = new Kauravs();

        Vikran.SetKindness(10);

        Vikran.SetObedience(10);

        kauravs[0] = Vikran;

        for (int iLoop = 1; iLoop < 100; iLoop++)

        {

            kauravs[iLoop] = new Kauravs();

        }

    }

}
