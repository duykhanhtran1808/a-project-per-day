package day01;

public class ZooManager {
    private String zooName;
    private int zooSize;
    private int experience = 0;
    private int level = 0;

    public void setName(String nameToSet) {
        zooName = nameToSet;
    }

    public String getName() {
        return zooName;
    }

    public void setSize(int sizeToSet) {
        if(sizeToSet > 0) {
            zooSize = sizeToSet;
        }
    }

    public int getSize() {
        return zooSize;
    }

    public void openTour() {
        experience += 1;
        checkLevel();
    }

    private void checkLevel() {
        if(experience >= 2 && experience < 4) {
            level = 1;
        } else if(experience >= 4 && experience < 8) {
            level = 2;
        } else if(experience >= 8 && experience < 16) {
            level = 3;
        } else if(experience >= 16 && experience < 32) {
            level = 4;
        } else if(experience >= 32) {
            level = 5;
        }
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return experience;
    }


}
