package veterinar;

public class VeterinaryReport {
    private int cats;
    private int dogs;

    public int getAnimalCount() {
        return cats + dogs;
    }

    public void showStats() {
        System.out.println("Numarul ");
    }

    public int getCats() {
        return cats;
    }

    public void setCats(int cats) {
        this.cats = cats;
    }

    public int getDogs() {
        return dogs;
    }

    public void setDogs(int dogs) {
        this.dogs = dogs;
    }


    @Override
    public String toString() {
        return "VeterinaryReport{" +
                "cats=" + cats +
                ", dogs=" + dogs +
                '}';
    }
}

