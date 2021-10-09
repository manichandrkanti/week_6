package baking.state;

public class Main {

    public static void main(String[] args) {

        BakingmachineBuilder bake=new BakingmachineBuilder();
        Bakingmachine machine=bake.Oven().Timer().Grills().build();

        machine.createBakingmachine();

        machine.damagedBakingmachine();

        machine.repairBakingmachine();

        machine.idleBakingmachine();

        machine.createBakingmachine();

    }

}

