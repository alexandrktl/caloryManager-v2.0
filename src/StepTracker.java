
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public  class StepTracker {
    int poinSteps = 10000; // целевое количество шагов

    int changePoinSteps(int newPoints) {
        poinSteps = newPoints;
        System.out.println("Успешно! Новая цель:" + newPoints + " шагов");
        return newPoints;
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
        int[] dayofMonth = new int[30]; // создали массив с 30 днями
    }

    void inputSteps(int month, int day, int steps) {                                 // Если шаги были ранее внесены - будет сумировать, потом можно будет добавить меню чтобы изменить или стереть шаги за этот день
        if (monthToData[month].dayofMonth[day] == 0) {
            monthToData[month].dayofMonth[day] = steps;
        } else {
            monthToData[month].dayofMonth[day] += steps;

        }
        System.out.println("Шаги успешно введены.");
    }

    void showStatistic(int monthStatistic) {  // не дописал
        System.out.println("Количество пройденных шагов по дням : ");                                                           // дни  и их шаги
        for (int i = 0; i < monthToData[monthStatistic].dayofMonth.length; i++) {

            System.out.println(i + 1 + " день: " + monthToData[monthStatistic].dayofMonth[i]);
        }

        System.out.println("Общее количество шагов за месяц: " + findSumOfSteps(monthStatistic)) ;                              // общие шаги за месяц
        System.out.println("Максимальное пройденное количество шагов в месяце: " + findMaxSteps(monthStatistic));               // Максимальное
        System.out.println("Среднее количество шагов: " + findAverageSteps( findSumOfSteps(monthStatistic) , monthStatistic ));  //Среднее количество шагов;
        System.out.println("Пройденная дистанция (в км): " + showInKm( findSumOfSteps(monthStatistic)));                        //Пройденная дистанция (в км);
        System.out.println("Количество сожжённых килокалорий: " + showKKalory(findSumOfSteps(monthStatistic)) );               //Количество сожжённых килокалорий;
        System.out.println("Лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого:" + seria(monthStatistic));   }
        int findMaxSteps(int monthStatistic) {
        int maxSteps = 0;                                                                                                       // Максимальное метод
        for (int i = 0; i < monthToData[monthStatistic].dayofMonth.length; i++) {
            if ( monthToData[monthStatistic].dayofMonth[i]> maxSteps) {
                maxSteps = monthToData[monthStatistic].dayofMonth[i];
            }
        }
        return maxSteps;
    }
    int findSumOfSteps(int monthStatistic){
        int sumOfSteps = 0;
        for (int i = 0; i < monthToData[monthStatistic].dayofMonth.length; i++) {
            sumOfSteps = sumOfSteps + monthToData[monthStatistic].dayofMonth[i];
        } return sumOfSteps;
    }
    double findAverageSteps(int sum , int monthStatistic ) {                                                                     //Среднее количество шагов метод;
        double average =0;
        average= (double) sum / monthToData[monthStatistic].dayofMonth.length ;
        return average;
    }
    double showInKm( int sum){                                                                                                          //Пройденная дистанция (в км);
        double distanceInKm=0;
        distanceInKm=(double) sum * 0.75 / 1000;
        return distanceInKm;
    }
    double showKKalory( int sum){                                                                                                   //Калории
        double kkalory= (double) sum *50 /1000;
        return kkalory;
    }
    int seria( int monthStatistic){                                                                                                // Серия
        int maxMaxima=0;
        int minMaxima=0;
        for (Integer i=0; i< monthToData[monthStatistic].dayofMonth.length; i++) {
            if (monthToData[monthStatistic].dayofMonth[i] >= poinSteps) {
                minMaxima=++minMaxima;
                if (minMaxima>maxMaxima) {
                    maxMaxima = minMaxima;
                }
            } else if (monthToData[monthStatistic].dayofMonth[i] < poinSteps) {
                minMaxima=0;
            }
        }
        return maxMaxima;
    }





}
//    Сохранение количества шагов за день. Пользователь должен указать номер месяца (начиная с 0), номер дня и количе
//    ство шагов, пройденных в этот день. Количество
//    шагов должно быть неотрицательным. Для ускорения прототипирования на данном этапе считается, что в месяце ровно
//    30 дне
//        й. Если за какой-то день статистика не сохранялась, то считаем количество шагов в этот день равным 0.





