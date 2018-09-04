

package grrrrrrrrrrrr;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Prices {
    Scanner l1= new Scanner (System.in);
    private double size;
    private double price = 1.16;
    Prices (double size, double price){
        this.size=size;
        this.price=price;
    }
    public double setSize() {
        this.size = l1.nextInt();
        return this.size;
    }

    public double setPrice() {
        this.price = l1.nextInt();
        return this.price;
    }
    public double getPizzaPrice(double price, double size, double pizzaprice){
        pizzaprice = size*price;
        return pizzaprice;
    }
}
