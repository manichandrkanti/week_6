package baking.state;


public class Bakingmachine
{
    IdleState idleState;
    RepairState repairState;
    CreateState createState;
    DamagedState damagedState;
    State state;

    Bakingmachine()
    {
        idleState = new IdleState(this);
        repairState= new RepairState(this);
        damagedState = new DamagedState(this);
        createState=new CreateState(this);
        state=createState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public IdleState getIdleState() {
        return idleState;
    }

    public RepairState getRepairState() {
        return repairState;
    }

    public CreateState getCreateState() {
        return createState;
    }

    public DamagedState getDamagedState() {
        return damagedState;
    }

    public void createBakingmachine()  {
        state.createBakingmachine();
    }

    public void idleBakingmachine()  {
        state.idleBakingmachine();
    }

    public void repairBakingmachine() {
        state.repairBakingmachine();
    }
    public void damagedBakingmachine() {
        state.damagedBakingmachine();
    }

    public String toString() {
        StringBuffer sbuffer=new StringBuffer();

        sbuffer.append("\nBakingmachine State  \nBakingmachine "+state);

        return sbuffer.toString();
    }
}
