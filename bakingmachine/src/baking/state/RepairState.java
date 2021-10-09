package baking.state;

public class RepairState implements State {

    Bakingmachine bakingmachine;
    public RepairState(Bakingmachine bakingmachine) {
        this.bakingmachine = bakingmachine;
    }

    @Override
    public void createBakingmachine() {
        System.out.println("Bakingmachine can have repairs");
        bakingmachine.setState(bakingmachine.getCreateState());
    }

    @Override
    public void idleBakingmachine() {
        System.out.println("Bakingmachines must be repaired by proffesionals");
        bakingmachine.setState(bakingmachine.getIdleState());
    }

    @Override
    public void repairBakingmachine() {
        System.out.println("An idle baking machine can get damaged");
    }

    @Override
    public void damagedBakingmachine() {
        System.out.println("bakingmachine broke");
        bakingmachine.setState(bakingmachine.getDamagedState());
    }


}