import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Input text:");
            String text = scanner.nextLine();
            splitText(text);

        }
    }


    public static void splitText(String text) {
        Stream.of(text.split("[^A-Za-zА-Яа-я]+"))
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);
    }
}
