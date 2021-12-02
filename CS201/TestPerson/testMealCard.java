package TestPerson;

public class testMealCard {
    public static void main(String[] args) {
        MealCard m1= new MealCard();
        MealCard m2= new MealCard();
        m1.buyFood(100);

        m2.buyPoints(800);

        m2.buyFood(80);

        m1.buyFood(20);

        System.out.println(m2.getPoints());

    }
}
