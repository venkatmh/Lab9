class Person{
  //initialize variables

  private String name;
  private int age;
  private String color;
  
  //constructor
  Person(String userName, int userAge, String userColor){
    name = userName;
    age = userAge;
    color = userColor;
  }

  //accessor methods
  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public String getColor(){
    return color;
  }
}