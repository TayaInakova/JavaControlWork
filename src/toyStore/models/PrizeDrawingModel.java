package toyStore.models;

import toyStore.presenters.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Розыгрыш игрушек
 */
public class PrizeDrawingModel implements Model {

    private Toy prize = null;

    @Override
    public Toy tryTheLuck(List<Toy> toyList) {
        int random = (int) (Math.random() * 100);
        System.out.println(random);
        if (random <= toyList.get(2).getPercent()) {
            this.prize = toyList.get(2);
        } else if (random <= toyList.get(1).getPercent()) {
            this.prize = toyList.get(1);
        } else if (random <= toyList.get(0).getPercent()) {
            this.prize = toyList.get(0);
        }
        return this.prize;
    }

    @Override
    public void fillBasket(Basket basket, Toy toy) {
        basket.addToy(toy);
    }

    @Override
    public Toy getPrize() {
        return this.prize;
    }

    @Override
    public void writeToFile(Toy toy) {

    }

    @Override
    public List<Toy> getToyList() {
        List<Toy> toyList = new ArrayList<>();
        SoftToy softToy = new SoftToy();
        Doll doll = new Doll();
        Robot robot = new Robot();
        toyList.add(softToy);
        toyList.add(doll);
        toyList.add(robot);
        return toyList;
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
                System.out.println("Введено некорректное значение, повторите ввод:");
                return flag();
            }
        }
    }
}
