public class Dice {

    public static int tossAndSum(int dice) {

        int sum = 0;
        for (int i = 0; i < dice; i ++) {
            sum += (int)(6 * Math.random()+1);
        }
        return sum;
    }
}
//static variables