package baking.state;

public class IdleState implements State{

    Bakingmachine bakingmachine;
    public IdleState(Bakingmachine bakingmachine) {
        this.bakingmachine = bakingmachine;
    }

    @Override
    public void createBakingmachine() {
        System.out.println("Bakingmachine has been assembled");
        bakingmachine.setState(bakingmachine.getCreateState());

    }

    @Override
    public void idleBakingmachine() {
        System.out.println("Bakingmachines are madeto minimize the mechanical load");
    }

    @Override
    public void repairBakingmachine() {
        System.out.println("Assembling finished, checking baking machine now and then");
        bakingmachine.setState(bakingmachine.getRepairState());
    }

    @Override
    public void damagedBakingmachine() {
        System.out.println("Bakingmachine Destroyed");
        bakingmachine.setState(bakingmachine.getDamagedState());
    }

}



