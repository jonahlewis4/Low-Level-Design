public class CeilingFan {
    String roomName;
    public CeilingFan(String roomName) {
        this.roomName = roomName;
    }

    public void setToHigh() {
        System.out.println(roomName + " ceiling fan is on high");
    }
    public void off() {
        System.out.println(roomName + " ceiling fan is off");
    }
}
