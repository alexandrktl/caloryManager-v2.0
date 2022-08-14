import java.util.Scanner;

public  class StepTracker {
    int poinSteps = 10000; // целевое количество шагов
    Scanner scanner= new Scanner(System.in);

    MonthData[] monthToData; // создали массив класса MonthData

    /* А можно так:
    String[] monthToData; // Объявили переменную-массив, её ещё нельзя использовать
    monthToData = new String[4]; // Массив готов к использованию, его элементы пока пусты
     */
    void stepTrackerMethod() {
        System.out.println("За какой месяц вы хотите ввести шаги? 0-Январь, 1-Февраль...");
        int month = scanner.nextInt();
        System.out.println("За какой день вы хотите ввести шаги?");
        int day = scanner.nextInt()-1;
        System.out.println("Введите количество шагов: ____");
        int steps = scanner.nextInt();

        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();

            //month = i;
            //steps=dayOfMonth[day];

        }


    }

    class MonthData {   // описываем класс, в нем должен быть массив            он по сути месяц в котором 30 дней
        // Заполните класс самостоятельно
        int[] dayOfMonth = new int[30];


            }

        }
//    Сохранение количества шагов за день. Пользователь должен указать номер месяца (начиная с 0), номер дня и количе
//    ство шагов, пройденных в этот день. Количество
//    шагов должно быть неотрицательным. Для ускорения прототипирования на данном этапе считается, что в месяце ровно
//    30 дне
//        й. Если за какой-то день статистика не сохранялась, то считаем количество шагов в этот день равным 0.





