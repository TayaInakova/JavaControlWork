package toyStore.models;

import toyStore.presenters.Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Розыгрыш игрушек
 */
public class PrizeDrawingModel implements Model {
    @Override
    public List<Toy> getToyList() {
        List<Toy> toyList = new ArrayList<>();
        SoftToy softToy = new SoftToy();
        Ball Ball = new Ball();
        Doll doll = new Doll();
        Robot robot = new Robot();
        toyList.add(Ball);
        toyList.add(softToy);
        toyList.add(doll);
        toyList.add(robot);
        return toyList;
    }


    @Override
    public boolean pressButton() {
        Scanner sn = new Scanner(System.in);
        String result = sn.next();
        return result.equals("*");
    }

    @Override
    public boolean flag() {
        Scanner s = new Scanner(System.in);
        String result = s.next();
        switch (result) {
            case "1" -> {
                return true;
            }
            case "2" -> {
                return false;
            }
            default -> {
                System.out.println("Введено некорректное значение, повторите ввод: Да - 1 / Нет - 2");
                return flag();
            }
        }
    }

    @Override
    public boolean pressGiveOutPrizeButton() {
        Scanner sc = new Scanner(System.in);
        String result = sc.next();
        return result.equals("+");
    }

    @Override
    public boolean exitTheGameButton() {
        return false;
    }

    @Override
    public Toy tryTheLuck(List<Toy> toyList) {
        int random = (int) (Math.random() * 100);
        Toy prize;
        if (random <= toyList.get(3).getPercent()) {
            prize = toyList.get(3);
        } else if (random <= toyList.get(2).getPercent()) {
            prize = toyList.get(2);
        } else if (random <= toyList.get(1).getPercent()) {
            prize = toyList.get(1);
        } else {
            prize = toyList.get(0);
        }
        return prize;
    }

    @Override
    public void writeToFile(Toy toy) {
        File f = new File("src/toyStore/prize.txt");
        try (FileWriter writer = new FileWriter(f, true)) {
            writer.write(String.format("Участник получил приз - %s\n", toy.getName()));
        } catch (IOException ex) {
            System.out.printf("Что-то пошло не так: %s", ex.getMessage());
        }
    }
}
