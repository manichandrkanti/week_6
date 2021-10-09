package baking.state;

public interface State
{
    public abstract void createBakingmachine();
    public abstract void idleBakingmachine();
    public abstract void repairBakingmachine();
    public abstract void damagedBakingmachine();
}

