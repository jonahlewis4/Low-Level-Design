

class GumballMachine {
    enum State {
        SOLD_OUT,
        NO_QUARTER,
        HAS_QUARTER,
        SOLD
    };
    State state = State.SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if(count > 0 ) {
            state = State.NO_QUARTER;
        }
    }

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

    public void ejectQuarter() {
        if (state == State.HAS_QUARTER) {
            System.out.println("Quarter returned");
            state = State.NO_QUARTER;
        } else if (state == State.NO_QUARTER) {
            System.out.println("You haven't inserted a quarter");
        } else if (state == State.SOLD) {
            System.out.println("Sorry, you already turned the crank");
        } else if (state == State.SOLD_OUT){
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        }
    }

    public void turnCrank() {
        if (state == State.SOLD) {
            System.out.println("Turning twice doesn't get you another gumball!");
        } else if (state == State.NO_QUARTER) {
            System.out.println("You turned but there's no quarter");
        } else if (state == State.SOLD_OUT) {
            System.out.println("You turned, but there are no gumballs");
        } else if (state == State.HAS_QUARTER) {
            System.out.println("You turned...");
            state = State.SOLD;
            dispense();
        }
    }

    public void dispense() {
        if (state == State.SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if(count == 0) {
                System.out.println("Oops, out of gumballs!");
                state = State.SOLD_OUT;
            } else {
                state = State.NO_QUARTER;
            }
        } else if (state == State.NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == State.SOLD_OUT){
            System.out.println("No gumball dispensed");
        } else if (state == State.HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nInventory: ").append(count).append(" gumball").append(count != 1 ? "s" : "");
        result.append("\nMachine is ");

        switch (state) {
            case SOLD_OUT:
                result.append("sold out");
                break;
            case NO_QUARTER:
                result.append("waiting for quarter");
                break;
            case HAS_QUARTER:
                result.append("waiting for turn of crank");
                break;
            case SOLD:
                result.append("delivering a gumball");
                break;
        }
        result.append("\n");
        return result.toString();
    }
}
