import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator<MenuItem>{

    ArrayList<MenuItem> list;
    int position = 0;
    public PancakeHouseIterator(ArrayList<MenuItem> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public MenuItem next() {
        MenuItem result = list.get(position);
        position++;
        return result;
    }
}
