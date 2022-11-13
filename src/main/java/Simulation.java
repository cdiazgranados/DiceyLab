public class Simulation {
    int numberOfDies;
    int numberOfTosses;

    int totalNumberOfSides;
    Dice diceObj = new Dice();
    Bins bins;

    public Simulation(int numberOfDies, int numberOfTosses) {
         this.numberOfDies = numberOfDies;
         this.numberOfTosses = numberOfTosses;
         this.totalNumberOfSides = numberOfDies * 6;
         bins = new Bins(numberOfDies, totalNumberOfSides);
    }


    public void runSimulation() {
        for (int i = 0; i < numberOfTosses; i++) {
            bins.incrementBin(diceObj.tossAndSum(numberOfDies));
        }
    }

    public void printTree() {
        System.out.println(bins.entrySet());
    }

    public String printResults() {
        String result = "";

        for (int i = numberOfDies; i <= totalNumberOfSides; i++) {

            result += i + " " + ":" + "   " + bins.getBin(i) + ":" + " " + bins.getBinPercentOfTotal(i) + "\n";
        }

        return result;
    }

}
