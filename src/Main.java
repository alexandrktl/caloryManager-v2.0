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
                 StepTracker.stepTrackerMethod();
             }

                 else if ( userInput!=1  && userInput!=2  && userInput!=3 ) {
                     System.out.println("Введите правильную команду !");
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
