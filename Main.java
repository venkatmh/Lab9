import java.io.*;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    String name;
    int age;
    String color;
    ArrayList<Person> people = new ArrayList<Person>();

    Person person1 = new Person("Mahathi Venkatesh", 21, "yellow");
    Person person2 = new Person("A", 28, "red");
    Person person3 = new Person("B", 19, "purple");
    Person person4 = new Person("C", 60, "blue");
    Person person5 = new Person("D", 14, "green");

    people.add(person1);
    people.add(person2);
    people.add(person3);
    people.add(person4);
    people.add(person5);

    //write

    try {
      FileWriter toWriteFile;
      toWriteFile = new FileWriter("data.txt");
      BufferedWriter output = new BufferedWriter(toWriteFile);

      for(Person person: people){
        output.write(person.getName());
        output.newLine();

        output.write(Integer.toString(person.getAge()));
        output.newLine();

        output.write(person.getColor());
        output.newLine();
      }

      output.flush();
      output.close();


    } catch (IOException exception) {
      System.out.println("An error occurred: " + exception);
    }

    //read

    try {
      FileReader myFile;
      myFile = new FileReader("data.txt");
      BufferedReader reader = new BufferedReader(myFile);
      people.clear();

      while (reader.ready()) {
        name = reader.readLine();
        age = Integer.parseInt(reader.readLine());
        color = reader.readLine();
        people.add(new Person(name, age, color));
      }

      for(Person person: people){
        System.out.printf("%-10s %n", person.getName() + person.getAge() + person.getColor());
      }

      reader.close();

    } catch (IOException exception) {
      System.out.println("An error occurred: " + exception);
    }
  }
}