public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        System.out.println(remote);
        remote.undoButtonWasPushed();
        remote.offButtonWasPushed(0);
        remote.onButtonWasPushed(0);
        System.out.println(remote);
        remote.undoButtonWasPushed();
    }
}