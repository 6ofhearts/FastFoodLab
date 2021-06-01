import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public interface FastFood {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date CookDate = new Date();
    String composition();
    String name();

    default void IsOldHamEatable (){
        if (FastFood.this.oldDate().equals(shouldBeEatenIn())){
            System.out.println(FastFood.this.name()+" можно есть!");
        }
        else {
            System.out.println(FastFood.this.name()+" нельзя есть!");
        }

    }

    default Calendar date (Date date1){
       return date(date1);
    };

    default Calendar oldDate(){
        Calendar oldDate = new GregorianCalendar();
        oldDate.add(Calendar.DATE, -5);
        return oldDate;
    };
    default Calendar wasCookedAt(Date date){
        FastFood.this.wasCookedAt(date);
      return wasCookedAt(date);
    };

    default String shouldBeEatenIn() {
        Calendar expirationIn = new GregorianCalendar();
        expirationIn.setTime(CookDate);
        expirationIn.add(Calendar.DATE, 2);
        Date shouldBeEaten = expirationIn.getTime();
        String returnDate = dateFormat.format(shouldBeEaten);
        return "Годен до: "+returnDate;
    };

    default String cookedString(){
        return dateFormat.format(CookDate);
    };

    void cook();
}
class Hamburger implements FastFood{



    public String composition() {

        return "Состав гамбургера: булка, котлета, салат, овощи";
    }

    @Override
    public String name() {
        return "Гамбургер";
    }


    public void cook() {
        Hamburger freshHamburger = new Hamburger();
        System.out.println("Гамбургер приготовлен в " + freshHamburger.cookedString() +" !");

    }
}

class Sandwich implements FastFood{

    public String name(){
        return "Сэндвич";
    }

    public String composition() {
        return new String("Состав сэндвича: другая длинная булка, какая-то котлета, возможно овощи, и салат");
    }


    public String shouldBeEatenIn() {
       // return null;
        return null;
    }

    public void cook() {
        Sandwich freshSandwich = new Sandwich();
        System.out.println("Сэндвич приготовлен в " + freshSandwich.cookedString() +" !");
    }
}