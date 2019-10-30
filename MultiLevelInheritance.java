// change the name of the class when running on local machine

interface Vehicle
{ 
    public String getBrandname();
    
}
interface w4 extends Vehicle
{ 
    public String getCarname();
    
}
interface w2 extends Vehicle
{ 
    public String getBikename();
    
}

class Car implements w4
{
    //@Override
    public String getCarname(){
        return "";
    }
    //@Override
  public String getBrandname(){
      return "";
  }
}
class Car1 extends Car {
    public String getCarname(){
        return "Car1 name";
    }
  public String getBrandname(){
      return "Car1 Brand";
  }
}
class Car2 extends Car {
    public String getCarname(){
        return "Car2 name";
    }
  public String getBrandname(){
      return "Car2 Brand";
  }
}

class Bike implements w2
{
    //@Override
     public String getBikename(){
         return "";
     }
    // @Override
     public String getBrandname(){
         return "";
     }
  
}

class Bike1 extends Bike {
    public String getBikename(){
        return "Bike1 name";
    }
     public String getBrandname(){
         return "Bike1 name";
     }
}

class Bike2 extends Bike {
    public String getBikename(){
        return "Bike2 name";
    }
     public String getBrandname(){
         return "Bike2 name";
     }
}
public class TestMain 
{
    public static void main(String[] args) {
        
        TestMain test = new TestMain();
        Car2 car2 = new Car2();
        System.out.println(test.get4wheelername(car2));
        
        
        Car1 car1 = new Car1();
        System.out.println(test.get4wheelername(car1));
        
        Bike2 bike2 = new Bike2();
        System.out.println(test.get2wheelername(bike2));
        
        Bike1 bike1 = new Bike1();
        System.out.println(test.get2wheelername(bike1));
        
        System.out.println(test.getBrandname(bike1));
        System.out.println(test.getBrandname(car1));
        
    //    System.out.println("Hello World");
    }
    
    public <T extends Car> String get4wheelername(Car carObj) {
        return carObj.getCarname();
    }
    public <T extends Bike>String get2wheelername(Bike bikeObj) {
        return bikeObj.getBikename();
    }
    
    public <T extends Vehicle> String getBrandname(Vehicle vehObj) {
        return vehObj.getBrandname();
    }
    }
    
    
