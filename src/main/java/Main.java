public class Main {

    public static void main(String[] args){
        Simulation sim = new Simulation(3, 1000000);
        sim.runSimulation();
        sim.printTree();
        System.out.println((sim.printResults()));
    }
}
