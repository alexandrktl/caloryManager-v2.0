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
                 StepTracker.menu1();
             } else if (userInput==3){
                 StepTracker.menu3();
             }
              else if ( userInput!=1  && userInput!=2  && userInput!=3 ) {    // Ради одной фразы создавать новый метод не вижу смысла РЕВЬЮЕРУ
                     System.out.println("Введите правильную команду !");
                 }else {
                  StepTracker.menu2();// Статистика
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
