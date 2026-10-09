public class PersonBeanImpl implements PersonBean{
    String name;
    String gender;
    String interests;
    int elo;
    int eloCount = 0;


    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getGender() {
        return "";
    }

    @Override
    public String getInterests() {
        return "";
    }

    @Override
    public int getElo() {
        return 0;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setGender(String gender) {

    }

    @Override
    public void setInterests(String interests) {

    }

    @Override
    public void setElo(int elo) {

    }
}
