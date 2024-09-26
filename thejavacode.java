import java.util.Scanner;

class numberGame {
    
    public static void main(String[] args) {
        
        int points = 0;
        
        System.out.println("(I have no idea what I'm doing)");
        Scanner input = new Scanner(System.in);
        System.out.println("Simple math game!!!!\nAnswer the questions correctly! That's it. \nThis is the simplest game on earth.");
        int add1 = (int) (10 * Math.random());
        int add2 = (int) (10 * Math.random());
        System.out.println("Q1: What is " + add1 + " + " + add2 + "?");
        int answer1 = input.nextInt();
        if (answer1 == add1 + add2) {
            System.out.println("Wow! You are not a baby!");
            points += 1;
        } else {
            System.out.println("The correct answer was " + (add1 + add2) + "! Wow! You're really bad!");
        }
        add1 = (int) (20 * Math.random());
        add2 = (int) (20 * Math.random());
        System.out.println("Q2: If one leg of a right-angled triangle = " + add1 + " and the other leg = " + add2 + ", what is the hypotenuse?");
        double answertwo = Math.sqrt(Math.pow(add1, 2.0) + Math.pow(add2, 2.0));
        double answer2 = input.nextDouble();
        if (answer2 == answertwo) {
            System.out.println("Wow! You got it!");
            points += 1;
        } else {
            System.out.println("The correct answer was " + answertwo + "! Wow! I feel bad for your math teacher!");
        }
        add1 = (int) (20 * Math.random());
        add2 = (int) (20 * Math.random());
        System.out.println("Q3: A polynomial of degree " + add1 + " has at least one distinct real zero. If lim x -> infinity f(x) = 0, what is the y-intercept of the horizontal asymptote if plotted on the Cartesian plane and shifted up by " + Math.sqrt(add2) + " units?");
        double answerthree = Math.sqrt(add2);
        double answer3 = input.nextDouble();
        if (answerthree == answer3) {
            System.out.println("Wow! You're good at this!");
            points += 1;
        } else {
            System.out.println("The correct answer was just " + Math.sqrt(add2) + "! Wow! You overthought!");
        }
        System.out.println("You got " + points + " possible points out of 3!");
        if (points == 3) {
            System.out.println("Good job!");
        } else {
            System.out.println("I really don't want to read your math tests!");
        }
        
    }
}
