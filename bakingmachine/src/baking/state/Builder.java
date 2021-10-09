package baking.state;

public interface Builder {
    Builder Oven();
    Builder Timer();
    Builder Grills();
    Bakingmachine build();
}
