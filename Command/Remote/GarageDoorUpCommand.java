public class GarageDoorUpCommand implements Command{
    GarageDoor door;
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        door = garageDoor;
    }

    @Override
    public void execute() {
        door.lightOn();
        door.up();
    }
}
