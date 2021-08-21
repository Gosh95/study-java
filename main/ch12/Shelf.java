package ch12;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelfList;

    public Shelf() {
        shelfList = new ArrayList<>();
    }

    public ArrayList<String> getShelfList() {
        return shelfList;
    }

    public void setShelfList(ArrayList<String> shelfList) {
        this.shelfList = shelfList;
    }

    public int getShelfListSize() {
        return shelfList.size();
    }
}
