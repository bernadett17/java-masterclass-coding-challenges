package controlFlow;

public class NumberInWord {

    /*Write a method called printNumberInWord. The method has one parameter number which is the whole number.
    The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9
    or other for any other number including negative numbers. You can use if-else statement or switch statement
    whatever is easier for you.
    NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
    NOTE: Do not add main method to solution code. */

    public static void main(String[] args) {

    printNumberInWord(7);
    printNumberWord(5);
    }
    public static void printNumberInWord(int number){
        String word = switch (number){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";

            default -> "OTHER";
        };
        System.out.println(word);
    }

    public static void printNumberWord(int number){
        String word = "OTHER";

        if (number == 0) {
            word = "ZERO";
        } else if (number == 1){
            word="ONE";
        }else if (number ==2){
            word = "TWO";
        } else if (number == 3){
            word = "THREE";
        }else if (number == 4){
            word = "FOUR";
        }else if (number == 5){
            word = "FIVE";
        }else if (number == 6){
            word ="SIX";
        }else if (number == 7){
            word ="SEVEN";
        }else if (number == 8){
            word = "EIGHT";
        }else if (number == 9){
            word = "NINE";
        }

        System.out.println(word);
    }
}
