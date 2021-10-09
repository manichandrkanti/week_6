package baking.state;

public class DamagedState implements State {

    Bakingmachine bakingmachine;
    public DamagedState(Bakingmachine bakingmachine) {
        this.bakingmachine = bakingmachine;
    }

    @Override
    public void createBakingmachine() {
        System.out.println("Buying bakingmachine");
        bakingmachine.setState(bakingmachine.getCreateState());
    }

    @Override
    public void idleBakingmachine() {
        System.out.println("Bakingmachines are used to make baked food items");
    }

    @Override
    public void repairBakingmachine() {
        System.out.println("Bakingmachine broken, can be repaired");

    }

    @Override
    public void damagedBakingmachine() {
        System.out.println("The mechanism failed");

    }

}