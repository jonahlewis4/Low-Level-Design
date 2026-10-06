public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(1000);
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        while(gumballMachine.state != gumballMachine.soldOutState) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }

        System.out.println(gumballMachine);
    }
}