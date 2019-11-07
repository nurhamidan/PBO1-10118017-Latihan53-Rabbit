package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Ini adalah class main, dimana class yang pertama dijalankan.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit theRabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is " + theRabbit.getName());
        System.out.println("Peter is Vegetarian? " + theRabbit.isVegetarian());
        System.out.println("Peter eats " + theRabbit.getEats());
        System.out.println("Peter has " + theRabbit.getNoOfLegs() + " legs.");
        System.out.println("Peter color is " + theRabbit.getColor());
    }
    
}
