import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int x;
        int y = 0;
        try {
            System.out.println("Welcome to the live Q/A with authors Leo Tolstoy and Franz Kafka! ");
            while (y < 8) {
                System.out.println("");
                System.out.println("//Type in the console the corresponding number next to the question you would like to ask//");
                System.out.println("Which author would you like to ask a question to? Leo Tolstoy (Type \"1\") or Franz Kafka? (Type \"2\")");
                System.out.println("");


                x = input.nextInt();
                if (x == 1) {
                    System.out.println("Hello! I am Leo Tolstoy. What question would you like to ask me today");
                    System.out.println("What is your favorite color? (1) ");
                    System.out.println("What is one of your favorite quotes? (2)");
                    System.out.println("Who is Gerasim and why is he important to the story? (3)");
                    System.out.println("What is your opinion on life and death? (4)");

                    int question_number = input.nextInt();

                    if (question_number == 1) {
                        System.out.println("I would probably say white is my favorite color. I think white represents purity and innocence. This is one Ivan Ilyich had in my book The Death of Ivan Ilyich");
                    }

                    if (question_number == 2) {
                        System.out.println("I would probably say a very significant quote in The Death of Ivan Ilyich is this one.");
                        System.out.println("Ivan Ilyich's life had been most simple and commonplace- and most horrifying");
                        System.out.println("This quote talks about how Ivan's life was so simple. A simple life is generally considered a virtue; however, I believe that Ivan's life was simple in a wrong way.");
                        System.out.println("He chooses his friends based on their social standing.");
                        System.out.println("Furthermore, I fully see a simple life as the least ideal life. A simple life is just simply boring");
                        y++;
                    }
                    if (question_number == 3) {
                        System.out.println("I think Gerasim is a perfect example of a human that posseses a trait that more humans need");
                        System.out.println("Gerasim has a lot of compassion for humans. He understands that even if the screaming that Ivan produces is unbearable,");
                        System.out.println("he is still compassionate and understands that");
                        y++;
                    }
                    if (question_number == 4) {
                        System.out.println("That is a rather complex question; however, I think a little insight on my perspective of life and death");
                        System.out.println("Can be seen in one of the quotes in The Death of Ivan Ilyich");
                        System.out.println("Maybe I did not live as I ought to have done,' it suddenly occurred to him. But how could that be, when I did everything properly?' he replied, and immediately");
                        System.out.println("dismissed from his mind this, the sole solution of all the riddles of life and death, as something quite impossible.");
                        System.out.println("I think that the solution of riddles of life and death are unknown and always will be.");
                        y++;
                    }

                } //end x == 1

                else if (x == 2) {

                    System.out.println("This is Franz Kafka.");
                    System.out.println("Hi, I'm Franz Kafka. What questions would you like to ask me?");
                    System.out.println("What is your favorite color? (1)");
                    System.out.println("What made you come up with this strange story? (2)");
                    System.out.println("What is one of your favorite quotes in The Metamorphosis (3)");
                    System.out.println("How did Gregor die? (4)");
                    int question_number = input.nextInt();
                    if(question_number == 1){
                        System.out.println("I would probably say my favorite color is brown. It is the color of all colors as you get it when you combine primary colors");
                        System.out.println("It also kind of represents my writing. In The Metamorphosis there is a lot of negative emotions. Brown is a symbol of negative emotions");
                    }
                    if(question_number == 2){
                        System.out.println("When you're in isolation for a long time, weird things start coming to your head. ");
                        System.out.println("This was also during surrealism and expressionism which added even weirder ideas to my head");
                    }
                    if(question_number == 3){
                        System.out.println("I can't choose between two. So I will say both of them");
                        System.out.println("“He must go,” cried Gregor’s sister, “that’s the only solution, Father.");
                        System.out.println("You must just try to get rid of the idea that this is Gregor. The fact that we’ve believed it for so long is the root of all our trouble.”");
                        System.out.println("In this quote, Gregor's sister has finally given up on Gregor. The family has finally lost all sympathy for Gregor as a bug.");
                        System.out.println("Lapsing into silence and communicating almost unconsciously with their eyes, they reflected that it was high time they found a decent husband for her.");

                    }
                    if(question_number == 4){
                        System.out.println("The answer is...");
                        System.out.println("Only I know the answer. And I will never tell you. Here some possibilities though.");
                        System.out.println("Gregor probably could've died from hunger.");
                        System.out.println("The apple could've infected his body.");
                        System.out.println("Perhaps Gregor committed suicide");
                    }

                } else {
                    System.out.println("Sorry, Leo Tolstoy nor Franz Kafka do not recognize what you are trying to say");
                } //end exception
                if (y == 8) {
                    System.out.println("That is all the questions we have today. Sorry if you didn't get to ask all of them. You can always restart the code ^-^");
                }

            }//end while
        }//end try

            catch (InputMismatchException e) {
                System.out.println("Sorry, Leo Tolstoy nor Franz Kafka do not recognize what you are trying to say. (You caused an input mismatch exception error. Restart the code)");
            } // end catch

    }//end main

}// end class