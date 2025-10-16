package CurdApp;

import java.util.ArrayList;
import java.util.List;

public class DairyManager {
    private List<Dairy> dairyList = new ArrayList<Dairy>();
    static DairyManager instance = null;

    private DairyManager() {
    }

    static DairyManager getInstance() {
        if (instance == null) {
            instance = new DairyManager();
        }
        return instance;
    }

    void addDairy(Dairy dairy) {
        dairyList.add(dairy);
    }

    void removeDairy(Dairy dairy) {
        dairyList.remove(dairy);
    }

    void getDairyList() {
        System.out.println("- - - - Dairy List - - - -");
        for (Dairy dairy : dairyList) {
            System.out.println(dairy.getName() + "," + dairy.getAddress());
        }
    }

    ArrayList<Dairy> searchByLocation(String location) {
        ArrayList<Dairy> searchDairy = new ArrayList<Dairy>();
        for (Dairy dairy : dairyList) {
            if (dairy.getAddress().equals(location)) {
                searchDairy.add(dairy);
            }
        }
        return searchDairy;
    }

    ArrayList<Dairy> searchByName(String name) {
        ArrayList<Dairy> search = null;

        for (Dairy dairy : dairyList) {
            if (dairy.getName().equals(name)) {
                search.add(dairy);
                System.out.println(dairy.getName() + "," + dairy.getAddress());
            }
        }
        return search;
    }
}
