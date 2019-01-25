package reflectionPRW10;

import reader.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class AliceApp {
    public static void main(String[] args) {
        List<String> entries = readAliceBook();
        System.out.println(entries.size());
        displayNumberOfDistinctWords(entries);


    }

    private static void displayNumberOfDistinctWords(List<String> entries) {
        long count = entries.stream()
                .filter(e -> e.equals("distinc"))
                .count();
        System.out.println(count);
    }

    private static List<String> readAliceBook() {
        FileReader reader = new FileReader();
        return (List<String>) reader.asStream("reflectionPRW10/alice.txt")
                .map(line -> line.replaceAll(",", " "))
                .map(line -> line.replaceAll(";", " "))
                .map(line -> line.replaceAll("’s", " "))
                .map(line -> line.replaceAll("’", " "))
                .map(line -> line.replaceAll("‘", " "))
                .map(line -> line.replaceAll(":", " "))
                .map(line -> line.replaceAll("#", " "))
                .map(line -> line.replaceAll("/", " "))
                .map(line -> line.replaceAll("-", " "))
                .map(line -> line.replaceAll(".", " "))
                .map(line -> line.replaceAll("//*", " "))
                .map(line -> line.replaceAll("\\(", " "))
                .map(line -> line.replaceAll("\\(", " "))
                .map(line -> line.replaceAll("\\[", " "))
                .map(line -> line.replaceAll("\\]", " "))
                .collect(Collectors.toList());

    }
}
