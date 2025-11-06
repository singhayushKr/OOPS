package Constructor;

public class Car {
  private String make;
  private String model;
  private int year;

  public Car(String make,String model,int year){
      if(make==null || make.isEmpty()) this.make="Unknown make";
      else this.make=make;

      if(model==null || model.isEmpty()) this.model="Unknown model";
      else this.model=model;

      if(year<=0) this.year=2000;//let 2000 be default year
      else this.year=year;

  }
  public static void main(String[] args) {
      Car car1 = new Car("", "", 2025);
      System.out.println(car1.model);
      System.out.println(car1.make);
      System.out.println(car1.year);

  }

}
