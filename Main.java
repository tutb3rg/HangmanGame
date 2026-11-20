import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String secretWord = "СТОШКА";
        char[] guessedWord = new char[secretWord.length()];

        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '*';
        }
        int maxMistakes = 6;
        int currentMistakes = 0;
        System.out.println("Добро пожаловать в гэмбл");
        System.out.println("Слово: ");
        System.out.println(guessedWord);


        Scanner Scaner = new Scanner(System.in);
        while (currentMistakes < maxMistakes) {
            System.out.println("\nВведите букву: ");


            String input = Scaner.nextLine().toUpperCase();
            char letter = input.charAt(0);

            boolean isHit = false;
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == letter) {
                    guessedWord[i] = letter;
                    isHit = true;

                }
            }
            if (isHit == false) {
                currentMistakes++;
                System.out.println("Ты не попал! Ошибок: " + currentMistakes + "из" + maxMistakes);
            } else {
                System.out.println("Попал! Такая буква есть!");
            }
            System.out.println("Слово: ");
            System.out.println(guessedWord);

            boolean isWin = true;
            for (int i = 0; i < guessedWord.length; i++) {
                if (guessedWord[i] == '*') {
                    isWin = false;
                    break;
                }
            }

                if (isWin == true) {
                    System.out.println("\nПоздравляю ты выиграл!");
                    System.out.println("Загаданное слово: " + secretWord);
                    break;
                }

        }


        if (currentMistakes == maxMistakes){
            System.out.println("\nТы проиграл! У тебя не осталось жизней. Загаданное слово: " + secretWord);
        }
        Scaner.close();


    }
}