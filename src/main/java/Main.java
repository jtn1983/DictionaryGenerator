import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Input text:");
            String text = scanner.nextLine();
            List<String> listWords = splitText(text);
        }
    }

    public static List<String> splitText(String text) {
        return new ArrayList<>(Arrays.stream(text.split("[^A-Za-zА-Яа-я]+"))
                .collect(Collectors.toSet()))
                .stream().sorted()
                .collect(Collectors.toList());
    }
}
