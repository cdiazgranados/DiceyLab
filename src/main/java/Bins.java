import java.text.DecimalFormat;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Bins {
    //tree map
    private final TreeMap<Integer, Integer> theBins;
    private Integer totalIncrements = 0;

    public Bins(final Integer firstInteger, final Integer lastInteger) {
        theBins = new TreeMap<Integer, Integer>();
        for (Integer i = firstInteger; i <= lastInteger; i++) {
            theBins.put(i, 0); //this is creating specific keys and values in the range
        }
    }

    public void incrementBin(final Integer binNumber) {
        theBins.put(binNumber, theBins.get(binNumber) + 1); //adds one to the value of the binNumber
        totalIncrements++; // This is used later in the code to get the
                            //percent total
    }

    public Integer getBin(final Integer binNumber) { //
        return theBins.get(binNumber); //gets the value of the key
    }

    public float getBinPercentOfTotal(final Integer binNumber) {
        DecimalFormat decfor = new DecimalFormat("0.00");
        return theBins.get(binNumber) / (float) totalIncrements;
//        return Double.parseDouble(decfor.format(theBins.get(binNumber) / (float) totalIncrements)); //divides the value with the total increments
    }

    public Integer numberOfBins() {
        return theBins.size(); //siz of the tree map
    }

    public Set<Map.Entry<Integer, Integer>> entrySet() {
        return theBins.entrySet();
    } //returns the whole treemap
}
