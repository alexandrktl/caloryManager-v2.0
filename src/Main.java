import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner scanner= new Scanner(System.in);
        StepTracker StepTracker = new StepTracker();


        System.out.println("Вас приветствует менеджер каллорий ;)");
        printMenu();
        int userInput  = scanner.nextInt();
        while (userInput!=0){

             if (userInput==1) {
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
                 StepTracker.inputSteps(month,day,steps);

             } else if (userInput==3){
                 System.out.println("Введите новую цель");
                 int newPoit= scanner.nextInt();

                 while (newPoit<0){
                     System.out.println("Отрицательное количество шагов недопустимо");
                     System.out.println("Введите количество шагов для новой цели: ____");
                     newPoit = scanner.nextInt();
                 } StepTracker.changePoinSteps(newPoit);
             }

              else if ( userInput!=1  && userInput!=2  && userInput!=3 ) {
                     System.out.println("Введите правильную команду !");
                 }else {                                                             // Статистика
                 System.out.println("За какой месяц вывести статистику? 0-Январь, 1-Февраль...11-Декабрь");
                 int monthStatistic=scanner.nextInt();
                 while (monthStatistic<0 || monthStatistic>11){
                     System.out.println("Неверно выбран месяц! ");
                     System.out.println("За какой месяц вывести статистику? 0-Январь, 1-Февраль...11-Декабрь");
                     monthStatistic = scanner.nextInt();
                 }
                 StepTracker.showStatistic(monthStatistic);
             }
            printMenu();
            userInput=scanner.nextInt();



        }System.out.println("Программа завершена.");

    }
    public static void printMenu(){
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения.");

    }

}
