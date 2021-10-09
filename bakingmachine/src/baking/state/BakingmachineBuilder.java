package baking.state;


public class BakingmachineBuilder implements Builder{

    BakingmachineBuilder(){

    }

    @Override
    public Builder Oven() {
        System.out.println("Baking machina is a heating machine for food");
        return this;
    }

    @Override
    public Builder Timer() {
        System.out.println("The baking machina is a type of oven");
        return this;
    }

    @Override
    public Builder Grills() {
        System.out.println("Grills are added in the baking machine to store food");
        return this;
    }

    @Override
    public Bakingmachine build() {
        Bakingmachine s=new Bakingmachine();
        System.out.println("The heating process takes place");
        return s;
    }
}