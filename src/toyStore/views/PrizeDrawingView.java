package toyStore.views;

import toyStore.models.Toy;
import toyStore.presenters.View;

public class PrizeDrawingView implements View {
    /**
     * пользователль нажал на кнопку "крутить барабан"
     */
    @Override
    public void showResultOfAttempt(Toy toy) {
        if (toy != null) {
            System.out.printf("Ваш выигрыш - %s!\n", toy);
        }
        else {
            System.out.println("Вам достаётся утешительный приз - леденец!");
        }
    }

    @Override
    public void startWords() {
        System.out.println("Желаете испытать удачу?\nДа - 1 / Нет - 2");
    }

    @Override
    public void endWords() {
        System.out.println("Спасибо за внимание, до свидания!");
    }

    /**
     * пользователь нажал на кнопку "получить приз"
     */
    @Override
    public void showGiveOutPrize() {
        System.out.println("Приз выдан!");
    }
}
