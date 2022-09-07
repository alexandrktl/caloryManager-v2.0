public class Convertor {
    double showInKm(int sum) {                                                                                                          //Пройденная дистанция (в км);
        double distanceInKm = 0;
        distanceInKm = (double) sum * 0.75 / 1000;
        return distanceInKm;
    }

    double showKKalory(int sum) {                                                                                                   //Калории
        double kkalory = (double) sum * 50 / 1000;
        return kkalory;
    }
}
