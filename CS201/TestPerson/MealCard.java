package TestPerson;

public class MealCard {
    private int points;
    public MealCard(){
        this.points=100;
    }

    public int getPoints() {
        return points;
    }
    public void buyPoints(int bpoints) {
         points+=bpoints;
    }
    public void buyFood(int fpoints){
        if(points<=0)
            System.out.println("the purchase of food items is not allowed.Buy more points!");
        else
            points-=fpoints;
    }

}
