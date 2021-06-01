import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	Hamburger newHam = new Hamburger();
	newHam.cook();
	Sandwich newSand = new Sandwich();
	newSand.cook();
	System.out.println(newHam.shouldBeEatenIn());
	System.out.println(newHam.composition());
	System.out.println(newSand.composition());
	Hamburger oldHam = new Hamburger();
	oldHam.IsOldHamEatable();
    }
}
