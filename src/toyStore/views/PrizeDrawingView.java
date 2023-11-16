package toyStore.views;

import toyStore.models.Toy;
import toyStore.presenters.View;

public class PrizeDrawingView implements View {
    @Override
    public void startEndlessGameWord() {
        System.out.println("Начинаем розыгрыш призов!\n Чтобы начать нажмите \"*\"");
    }

    @Override
    public void startWords() {
        System.out.println("Желаете испытать удачу?\nДа - 1 / Нет - 2");
    }

    /**
     * пользователль нажал на кнопку "испытать"
     */
    @Override
    public void showResultOfAttempt(Toy toy) {
        System.out.printf("Ваш выигрыш - %s!\n", toy.getName());
    }

    /**
     * пользователь нажал на кнопку "получить приз"
     */
    @Override
    public void showGiveOutPrize() {
        System.out.println("Приз выдан!");
    }

    @Override
    public void showBasketIsNoEmpty() {
        System.out.println("В корзине остались призы:");
    }

    @Override
    public void showBasketIsEmpty() {
        System.out.println("корзина с призами пуста!");
    }

    @Override
    public void endWords() {
        System.out.println("Спасибо за внимание, до свидания!");
    }

    @Override
    public void endGame() {
        System.out.println("Конец игры!");
    }
}
