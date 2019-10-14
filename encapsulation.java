/*
  In java encapsulation refers to combining the variables and data together as a single unit.
  Suppose there are two classes , the variables of classA are set to public and variables to classB are set to private.
  The difference between the two of them is from classA we can access all of its methods and the methods are open to any object 
  that is created within this class.
  In classB there is an advantage as all the variables of classB are set to private we can make the methogs readonly or 
  wirte only by skipping the getter or setter methods which will increase the control over the data.
  We cant access the data from other class, thus we can achieve data hiding easily..
*/
class A {
  
  public int rollno;
  public String name;
  
  public A(int rollno, String name){
    
    this.rollno = rollno;
    this.name = name;
  } 
  
  public static getDetails(){
    System.out.println(rollno);
    System.out.println(name);
  }
}

class B {
    
    private int id;
    private String name;
    
    public int getId(){
      return this.id;
    }
    public String getName(){
      return this.name;
    }

}



/*
  if we observe both the classes here , if we create another class C i can access all the variables from class A but i can only
  read the values from class B and cant do anything other than that.
*/





