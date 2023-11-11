// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        /*
        <=== Variables ===>
        int x = 123;
        double y =3.14;
        boolean z = true;
        char sym = '@';
        String name = "Matias";

            <=== Switching Variables ===>
                 String x = "water";
        String y = "Sprite";
        String temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println(temp); // water
        System.out.println(y); // water
        System.out.println(x); // Sprite

            <=== Using Scanner to readLines ===>

        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats your name");
        String name = scanner.nextLine(); // nextLine() is used to enter a line
        System.out.println("How old are you? ");
        int age = scanner.nextInt(); // We will only be able to accept an Int
        scanner.nextLine(); // this will clear the scanner, so we can ask another question
        System.out.println("Whats your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are "+ age+" years old");
        System.out.println("Your favorite food is: " +food);

            <=== expression = operands & operators ===>
            operands = values, variables, numbers, quantity
            operators = + - / * %

        int friends = 10;
        friends = friends + 2;
        friends = friends - 2;
        friends = friends * 2;
        friends = friends / 2;
        friends = friends % 2;
        // in case we will divide and have decimals, we need to use double
        double friends = 10;
        friends = friends / 3;


        System.out.println(friends);

                <=== Small UI Activity using JOptionPane ===>

                String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:")); // since we are passing an int we need to parse it
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you?")); // since we are passing a double we need to parse it
        JOptionPane.showMessageDialog(null, "Your height is: " + height);

           <=== Using Math() ===>

        double x = 3.14;
        double y = -10;

        double z =
        Math.floor(x); // Always rounds down.
        Math.ceil(x); // always rounds UP.
        Math.round(x); // rounds up/down a double.
        Math.sqrt(y);// square root
        Math.abs(y); // Pass the absolute value ex: if is -10 = 10
        Math.max(x,y);// Finds max number
        System.out.println(z);

             <=== Calculating Hypotenuse ===>
        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x:");
        x = scanner.nextDouble();
        System.out.println("Enter side y:");
        y = scanner.nextDouble();

        z= Math.sqrt((x*x) + (y*y));
        System.out.println("The hypotenuse: " + z);

        scanner.close();

         <=== Random Values ===>
        Random random = new Random();
        int x = random.nextInt(6) +1; // to limit we pass a value
       double y = random.nextDouble();

        boolean z = random.nextBoolean();
        System.out.println(z);

           <=== If Statements ===>

        int age = 12; // in if statements, the first condition that is true is the block of code that it will run
        if(age >= 75){
        System.out.println("Ok Boomer!");
        }
        else if (age >= 18){
            System.out.println("You are an adult");
                }
        else{
            System.out.println("not an adult");
        }
            quick Note: to check if a string is equal to something is variable.equals("a")

           <=== Switch Statements ===>

        String day = "Friday";
        switch (day){
            case "Sunday" :
                System.out.println("It is Sunday!");
                break;
                case "Monday" :
                System.out.println("It is Monday!");
                break;
                case "Tuesday" :
                System.out.println("It is Tuesday!");
                break;
                case "Wednesday" :
                System.out.println("It is Wednesday!");
                break;
                case "Thursday" :
                System.out.println("It is Thursday!");
                break;
                case "Friday" :
                System.out.println("It is Friday!");
                break;
                case "Saturday" :
                System.out.println("It is Saturday!");
                break;
            default:
                System.out.println("Not a day");
        }

         <=== While Loops ===>

           Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isBlank()){
            System.out.print("Enter your name");
            name = scanner.nextLine();

        }
        System.out.println("Hello " + name);

              <=== For Loops ===>

        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

          <=== Nested For Loops ===>

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns:");
        columns = scanner.nextInt();
        System.out.println("Enter symbol");
        symbol = scanner.next(); // next() just scans the next token we type

        for(int i = 1; i<= rows; i++){
            System.out.println();
            for(int j= 1; j<= columns; j++){
                System.out.print(symbol);
            }
        }

                  <=== Arrays ===>

        String[] cars = {"Camaro", "Corvette", "Tesla"};

        cars[0] = "Mustang";

        System.out.println(cars[0]);

        for (int i = 0; i < cars.length; i++ ){
            System.out.println(cars[i]);
        }
        String[] stocks = new String[4];

                <=== 2D arrays = arrays of arrays. ===>

        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";

        cars[1][0] = "Camry";
        cars[1][1] = "Venza";
        cars[1][2] = "C-HR";

        cars[2][0] = "Ferrari";
        cars[2][1] = "GTR";
        cars[2][2] = "Lambo";

        for(int i = 0; i< cars.length; i++){
            System.out.println();
            for(int j = 0; j < cars[i].length ; j++){
                System.out.print(cars[i][j] + ", ");
            }
        }

             <=== Useful String Methods ===>


        String name = "Bro";
        boolean res = name.equals("Bro"); // This returns a boolean value, is case sensitive.
        boolean res = name.equalsIgnoreCase("bro"); // This returns a boolean value, but is not case sensitive.
        int res = name.length();
        char res = name.charAt(1);// Returns the character at certain position.
        int res = name.indexOf("B"); // returns the index of the character.
        boolean res = name.isEmpty(); // returns if its empty, T or F. it does not ignore whitespaces.
        String res = name.toUpperCase();
        String res = name.toLowerCase();
        String res = name.trim(); // Remove all empty spaces before and after the characters.
        String res = name.replace("B", "T");
        System.out.println(res);

                <=== Basics of Wrapper class ===>

         wrapper class = provides a way to use primitive data types as reference data types. Reference types have useful methods.
         Primitive   ||   wrapper = is the same name but capital letter and full name.
         boolean     ||   Boolean
         char        ||   Character
         int         ||   Integer
         double      ||   Double
         autoboxing = The automatic conversion that Java compiler makes between the primitive types and the corresponding object wrapper class
         unboxing = The reverse of autoboxing. Automatic conversion of wrapper class to primitive.

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

            <=== ArrayLists ===>

        ArrayList = resizable array. Add or remove items. Only stores reference data types

        ArrayList<String> food = new ArrayList<>();
        food.add("Pizza");
        food.add("Burger");
        food.add("Hotdog");

        food.set(0, "sushi"); // set replaces the item on the array on specif location that you set it.
        food.remove(2);// remove item
        food.clear(); // clear array to 0 items

        for (int i =0; i < food.size(); i++){
            System.out.println(food.get(i)); // get is used instead of [i]
        }



            <=== 2D ArrayLists ===>

                2D ArrayList = a dynamic list of lists.
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("onions");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("soda");
        drinkList.add("monster");


        ArrayList<ArrayList<String>> groceriesList = new ArrayList<>();
        groceriesList.add(bakeryList);
        groceriesList.add(produceList);
        groceriesList.add(drinkList);
        System.out.println(groceriesList.get(0).get(0));


               <=== for-each loop ===>

           ArrayList<String> animals = new ArrayList<>();
            animals.add("cat");
            animals.add("dog");
            animals.add("rat");
            animals.add("bird");
//        String[] animals = {"cat", "dog", "bird"};

        for (String i : animals) { // we specify the type of the index we are iterating. The ":" means in. So Strings in animals
            System.out.println(i);
        }

            <=== printf() ===>

        boolean myBool = true;
        char myChar = '#';
        String myString = "Matias";
        int myInt = 12;
        double myDouble = 12.12234;
        // Conversion Character
        System.out.printf("%b", myBool);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);
        // Width - min. #of characters to be written as output
        System.out.printf("Hello %3s", myString);
        //Precision
        System.out.printf("$%.2f", myDouble);


           <=== final keyboard ===>

        final double PI = 3.14159; // final means you cannot update it. Common practice is to use uppercase to name the variable.
        //pi = 4;
        System.out.println(PI);

              <=== Objects ===>

        // object = an instance of a class that may contain attributes and methods.
        //Car car = new Car();
        //car.drive();

        //   constructor = special method that is called when an object is instantiated/ created.

        Human human1 = new Human("matias", 9, 274.2);
        Human human2 = new Human("Pepe", 19, 232.2);
        System.out.println(human1.name);
        System.out.println(human2.name);

        human1.eat();
        human2.drink();

DiceRoller dice1 = new DiceRoller();
        */

        // toString() = special method that all objects inherit, return a string that "textually represents" an object.
Car car = new Car();

        System.out.println(car.toString());
    }

    // method = a block of code that gets executed when its called

   static void hello(String word){
        System.out.println("hello " + word);
    }

    // Overloaded methods

    static int add(int a, int b){
        System.out.println("Overloaded 1");
        return a + b;
    }
    static int add(int a, int b,int c){
        System.out.println("Overloaded 2");

        return a + b + c;
    }
    static String add(int a, int b,String c){


return ("Hola" + c +" you are " + a*b + " years old");

    }
    static int add(int a, int b, int c, int d){
        System.out.println("Overloaded 3");
        return a + b + c + d;
    }
}