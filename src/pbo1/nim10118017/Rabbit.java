package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Ini adalah class turunan dari class animal.
 * 
 */
public class Rabbit extends Animal {
    private String color;
    private String name;

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
        this.name = name;
    }
}
