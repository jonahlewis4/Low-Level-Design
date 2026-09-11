public class Stereo {
    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    void on() {
        System.out.println(location + " stereo is on");
    }

    void off() {
        System.out.println(location + " stereo is off");
    }

    void setCd() {
        System.out.println(location + " stereo is set for CD input");
    }

    void setDvd() {
        System.out.println(location + " stereo is set for DVD input");
    }

    void setRadio() {
        System.out.println(location + " stereo is set for Radio input");
    }

    void setVolume(int volume) {
        System.out.println(location + " stereo volume set to " + volume);
    }
}