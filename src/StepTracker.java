
import java.sql.SQLOutput;
import java.util.Scanner;

public  class StepTracker {
    int poinSteps = 10000; // целевое количество шагов

    void changePoinSteps(int newPoints) {
        poinSteps = newPoints;
        System.out.println("Успешно! Новая цель:" + newPoints + " шагов");
    }

    MonthData[] monthToData; // создали массив класса MonthData

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
        // Заполните класс самостоятельно
        int[] dayofMonthfMonth = new int[30]; // создали массив с 30 днями
    }

    /* void inputSteps(int month,int day, int steps) {      ВОТ ТУТ НЕ ПОНЯТНО?!?!?!?!?!?!
         monthToData[month][day]=steps;

     }*/
    void showStatistic(int monthStatistic) {  // не дописал
        System.out.println("Количество пройденных шагов по дням : ");
        for (int i = 0; i < 31; i++) {
        }
    }
}
//    Сохранение количества шагов за день. Пользователь должен указать номер месяца (начиная с 0), номер дня и количе
//    ство шагов, пройденных в этот день. Количество
//    шагов должно быть неотрицательным. Для ускорения прототипирования на данном этапе считается, что в месяце ровно
//    30 дне
//        й. Если за какой-то день статистика не сохранялась, то считаем количество шагов в этот день равным 0.





