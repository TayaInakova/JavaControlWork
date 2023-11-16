package toyStore;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Sweepstakes {

    public static List<Toy> createToyList() {
        List<Toy> toyList = new ArrayList<>();
        toyList.add(new Toy("Мяч", 158828, 100));
        toyList.add(new Toy("Плюшевый мишка", 164478, 75));
        toyList.add(new Toy("Кукла Маша", 135889, 50));
        toyList.add(new Toy("Робот", 152228, 25));
        return toyList;
    }

    public static boolean pressButton(String text) {
        System.out.println(text);
        Scanner sn = new Scanner(System.in);
        String result = sn.next();
        return result.equals("*");
    }

    public static Toy tryTheLuck(List<Toy> toyList) {
        toyList.sort(Comparator.comparingInt(Toy::getPercent));
        int random = (int) (Math.random() * 100);
        Toy prize = new Toy("Утешительный приз", 458112, 100);
        for (Toy toy : toyList) {
            if (random <= toy.getPercent()) {
                return toy;
            }
        }
        return prize;
    }

    public static void writeToFile(Toy toy) {
        File f = new File("src/toyStore/prize.txt");
        try (FileWriter writer = new FileWriter(f, true)) {
            writer.write(String.format("Участник получил приз - %s\n", toy.getName()));
        } catch (IOException ex) {
            System.out.printf("Что-то пошло не так: %s", ex.getMessage());
        }
    }

    public static List<Toy> startGame() {
        boolean button = pressButton("Желаете испытать удачу?\nДа - \"*\" / Нет - любой другой символ");
        List<Toy> toyList = createToyList();
        List<Toy> winningList = new ArrayList<>();
        while (button) {
            Toy toy = tryTheLuck(toyList);
            if (giveOutPrizeNow(toy) == null) {
                winningList.add(toy);
            }
            button = pressButton("Попробовать снова?\nДа - \"*\" / Нет - любой другой символ");
        }
        System.out.println("Розыгрыш завершён!\n");
        return winningList;
    }

    public static Toy giveOutPrizeNow(Toy toy) {
        System.out.printf("Ваш выигрыш - %s\n", toy.getName());
        if (pressButton("Желаете получить приз? Если да - нажмите \"*\" / Нет - любой другой символ")) {
            writeToFile(toy);
            System.out.println("Приз выдан!");
            return toy;
        }
        return null;
    }

    public static void giveAllToys(List<Toy> toys) {
        if (!toys.isEmpty()) {
            boolean button = pressButton("У вас остались призы, желаете забрать? Если да - нажмите \"*\" / Нет - любой другой символ");
            Iterator<Toy> iterator = toys.iterator();
            List<Toy> removeToys = new ArrayList<>();
            while (iterator.hasNext() && button) {
                Toy toy = iterator.next();
                Toy removeToy = giveOutPrizeNow(toy);
                if (removeToy != null) {
                    removeToys.add(removeToy);
                }
            }
            toys.removeAll(removeToys);
            System.out.println("Все призы выданы.");
        }
    }
}
