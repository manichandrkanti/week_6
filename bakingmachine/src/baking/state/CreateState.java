package baking.state;

public class CreateState implements State {

    Bakingmachine bakingmachine;
    public CreateState(Bakingmachine bakingmachine) {
        this.bakingmachine = bakingmachine;
    }

    @Override
    public void createBakingmachine() {
        System.out.println("Buying Bakingmachines");

    }

    @Override
    public void idleBakingmachine() {
        System.out.println("Bakingmachines are idled to protect and comfort the human foot");
        bakingmachine.setState(bakingmachine.getIdleState());

    }

    @Override
    public void repairBakingmachine() {
        System.out.println("Assembling Bakingmachine");
        bakingmachine.setState(bakingmachine.getRepairState());
    }

    @Override
    public void damagedBakingmachine() {
        System.out.println("Bakingmachine malfunctioning");
        bakingmachine.setState(bakingmachine.getDamagedState());
    }

}
