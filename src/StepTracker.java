
import java.util.Scanner;

public  class StepTracker {
    Convertor convertorOfKMandKKAL=new Convertor();
    Scanner scanner= new Scanner(System.in);
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

        System.out.println("Общее количество шагов за месяц: " + findSumOfSteps(monthStatistic));                              // общие шаги за месяц
        System.out.println("Максимальное пройденное количество шагов в месяце: " + findMaxSteps(monthStatistic));               // Максимальное
        System.out.println("Среднее количество шагов: " + findAverageSteps(findSumOfSteps(monthStatistic), monthStatistic));  //Среднее количество шагов;
        System.out.println("Пройденная дистанция (в км): " + convertorOfKMandKKAL.showInKm(findSumOfSteps(monthStatistic)));                        //Пройденная дистанция (в км);
        System.out.println("Количество сожжённых килокалорий: " + convertorOfKMandKKAL.showKKalory(findSumOfSteps(monthStatistic)));               //Количество сожжённых килокалорий;
        System.out.println("Лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого:" + seria(monthStatistic));
    }

    int findMaxSteps(int monthStatistic) {
        int maxSteps = 0;                                                                                                       // Максимальное метод
        for (int i = 0; i < monthToData[monthStatistic].dayofMonth.length; i++) {
            if (monthToData[monthStatistic].dayofMonth[i] > maxSteps) {
                maxSteps = monthToData[monthStatistic].dayofMonth[i];
            }
        }
        return maxSteps;
    }

    int findSumOfSteps(int monthStatistic) {
        int sumOfSteps = 0;
        for (int i = 0; i < monthToData[monthStatistic].dayofMonth.length; i++) {
            sumOfSteps = sumOfSteps + monthToData[monthStatistic].dayofMonth[i];
        }
        return sumOfSteps;
    }

    double findAverageSteps(int sum, int monthStatistic) {                                                                     //Среднее количество шагов метод;
        double average = 0;
        average = (double) sum / monthToData[monthStatistic].dayofMonth.length;
        return average;
    }



    int seria(int monthStatistic) {                                                                                                // Серия
        int maxMaxima = 0;
        int minMaxima = 0;
        for (Integer i = 0; i < monthToData[monthStatistic].dayofMonth.length; i++) {
            if (monthToData[monthStatistic].dayofMonth[i] >= poinSteps) {
                minMaxima = ++minMaxima;
                if (minMaxima > maxMaxima) {
                    maxMaxima = minMaxima;
                }
            } else if (monthToData[monthStatistic].dayofMonth[i] < poinSteps) {
                minMaxima = 0;
            }
        }
        return maxMaxima;
    }
void menu1(){
    System.out.println("За какой месяц вы хотите ввести шаги? 0-Январь, 1-Февраль...11-Декабрь");
    int month = scanner.nextInt();
    while (month<0 || month>11){
        System.out.println("Неверно введен месяц!");
        System.out.println("За какой месяц вы хотите ввести шаги? 0-Январь, 1-Февраль...11-Декабрь");
        month = scanner.nextInt();
    }
    System.out.println("За какой день вы хотите ввести шаги?");
    int day = scanner.nextInt()-1;
    while (day<0 || day>29){
        System.out.println("Неверно введен день! Введите дату от 1 до 30");
        System.out.println("За какой день вы хотите ввести шаги?");
        day = scanner.nextInt();
    }
    System.out.println("Введите количество шагов: ____");
    int steps = scanner.nextInt();
    while (steps<0){
        System.out.println("Отрицательное количество шагов недопустимо");
        System.out.println("Введите количество шагов: ____");
        steps = scanner.nextInt();
    }
    inputSteps(month,day,steps);

}
void menu3(){
    System.out.println("Введите новую цель");
    int newPoit= scanner.nextInt();

    while (newPoit<0){
        System.out.println("Отрицательное количество шагов недопустимо");
        System.out.println("Введите количество шагов для новой цели: ____");
        newPoit = scanner.nextInt();
    } changePoinSteps(newPoit);
}
void menu2(){
    System.out.println("За какой месяц вывести статистику? 0-Январь, 1-Февраль...11-Декабрь");
    int monthStatistic=scanner.nextInt();
    while (monthStatistic<0 || monthStatistic>11){
        System.out.println("Неверно выбран месяц! ");
        System.out.println("За какой месяц вывести статистику? 0-Январь, 1-Февраль...11-Декабрь");
        monthStatistic = scanner.nextInt();
    }
    showStatistic(monthStatistic);
}

}







