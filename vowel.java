//Question 4

import java.util.Scanner;

class vowel{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    System.out.println("Enter a character:");
    char c = in.next().charAt(0);

    switch(c){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            System.out.println("Vowel");
            break;
        default:
            System.out.println("Consonant");
    }
    }
    
}