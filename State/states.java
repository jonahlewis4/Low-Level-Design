enum State {
    SOLD_OUT,
    NO_QUARTER,
    HAS_QUARTER,
    SOLD
};

class StateMachine {
    State state = State.SOLD_OUT;

    public void insertQuarter() {
        if(state == State.HAS_QUARTER) {
            System.out.println("You can't insert another quarter");
        } else if (state == State.SOLD_OUT) {
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (state == State.SOLD) {
            System.out.println("Please wait, we're already giving you a gumball");
        } else if (state == State.NO_QUARTER) {
            state = State.HAS_QUARTER;
            System.out.println("You inserted a quarter");
        }
    }
}
