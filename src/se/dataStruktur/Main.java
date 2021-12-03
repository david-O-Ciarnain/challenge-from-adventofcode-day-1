package se.dataStruktur;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        List<Integer> input = new ArrayList<>();
        String string;
        File file = new File("D:\\programering\\file\\testFileName.txt");

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                string = scan.nextLine();
                input.add(Integer.valueOf(string));
            }
            System.out.println(part1(input));
            System.out.println(part2(input));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int part1(List<Integer> input) {
        int checkNum = 0, i = 0;
        while (i < input.size() - 1) {
            if (input.get(i) < input.get(i + 1)) {
                checkNum++;
            }
            i++;
        }
        return checkNum;
    }

    public static int part2(List<Integer> input) {
        int checkNumThree = 0, checkNum = 0;
        while (checkNumThree < input.size() - 3) {
            if (input.get(checkNumThree) + input.get(checkNumThree + 1) + input.get(checkNumThree + 2) < input.get(checkNumThree + 1) + input.get(checkNumThree + 2) + input.get(checkNumThree + 3))
                checkNum++;
            checkNumThree++;
        }
        return checkNum;
    }
}
