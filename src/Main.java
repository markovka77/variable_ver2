public class Main {
    public static void main(String[] args) {
                task1();
                task2();
                task3();
                task4();
                task5();
                task6();
                task7();
                task8();

            }

            private static void task8() {
                System.out.println("Задача 1");
                int q = 1;
                byte w = 2;
                short e = 30000;
                long r = 401200;
                float t = 5.123123f;
                double y = 6.123123123;
                System.out.println("Значение переменной q с типом int равно " + q);
                System.out.println("Значение переменной w с типом byte равно " + w);
                System.out.println("Значение переменной e с типом short равно " + e);
                System.out.println("Значение переменной r с типом long равно " + r);
                System.out.println("Значение переменной t с типом float равно " + t);
                System.out.println("Значение переменной y с типом double равно " + y);

            }

            private static void task7() {
                System.out.println("Задача 2");
                float q = 27.12f;
                long w = 987678965549L;
                double e = 2.786f;
                char r = 569;
                short t = -159;
                int y = 27897;
                byte u = 67;

            }

            private static void task6() {
                System.out.println("Задача 3");
                byte ludPal = 23;
                byte anaSer = 27;
                byte ekaAnd = 30;
                short quantityPaper = 480;
                int totalStudents = ludPal + anaSer + ekaAnd;
                int paperForOneStudents = quantityPaper / totalStudents;
                System.out.println("На каждого ученика рассчитано " + paperForOneStudents + " листов бумаги");

            }

            private static void task5() {
                System.out.println("Задача 4");
                byte quantityBottlePerMin = 8; // 16/2=8, количество производимых машиной бутылок за одну минуту
                byte time1min = 20;
                short time2minPerDay = 24 * 60; // кол-во минут в сутках
                int time3minPer3Day = time2minPerDay * 3; // кол-во минут в трёх сутках
                int time4minPer1month = time2minPerDay * 30; //  кол-во минут в одном 30 дневном месяце
                int quantityBottleTime1 = quantityBottlePerMin * time1min;
                int quantityBottleTime2 = quantityBottlePerMin * time2minPerDay;
                int quantityBottleTime3 = quantityBottlePerMin * time3minPer3Day;
                int quantityBottleTime4 = quantityBottlePerMin * time4minPer1month;
                System.out.println("За " + time1min + " минут машина произвела " + quantityBottleTime1 +
                        " штук бутылок");
                System.out.println("За стуки машина произвела " + quantityBottleTime2 +
                        " штук бутылок");
                System.out.println("За трое суток машина произвела " + quantityBottleTime3 +  " штук бутылок");
                System.out.println("За месяц машина произвела " + quantityBottleTime4 + " штук бутылок");

            }

            private static void task4() {
                System.out.println("Задача 5");
                byte quanPaint = 120; // общее кол-во краски на школу
                byte brownPaint = 4;
                byte whitePaint = 2;
                int totalPaint = brownPaint + whitePaint; //  общее кол-во краски на один класс
                int rooms = 120 / totalPaint; // кол-во классов в школе
                int brownPaintRooms = rooms * brownPaint;
                int whitePaintRooms = rooms * whitePaint;
                System.out.println("В школе, где " + rooms +
                        " классов, нужно " + whitePaintRooms + " банок белой краски и " + brownPaintRooms +
                        " банок коричневой краски");


            }

            private static void task3() {
                System.out.println("Задача 6");
                byte banana = 80;
                byte icecream = 100;
                byte egg = 70;
                float milk = 105 / 100;
                byte quantBananas = 5;
                byte quantIcecreams = 2;
                byte quantEggs = 4;
                int quantMilk = 200;
                float totalWeigthgramm = quantBananas * banana + quantIcecreams
                        * icecream + quantEggs * egg + quantMilk * milk;
                float totalWeigthKg = totalWeigthgramm / 1000;


                System.out.println("Вес завтравка спортсмена " + totalWeigthgramm + " грамм или "
                        + totalWeigthKg + " кг");


            }

            private static void task2() {
                System.out.println("Задача 7");
                int lossWeigth = 7 * 1000;
                int lossWeigth1 = 250;
                int lossWeigth2 = 500;
                int midLossWeigth = ( lossWeigth1 + lossWeigth2 ) / 2;
                int dayLoss1 = lossWeigth / lossWeigth1;
                int dayLoss2 = lossWeigth / lossWeigth2;
                int midDayLoss = lossWeigth / midLossWeigth;
                System.out.println("Для потери 7 кг в весе спортсмену понадобится от "
                        + dayLoss2 + " до " + dayLoss1 + " дней. А в среднем нужно "
                        + midDayLoss + " дней.");

            }

            private static void task1() {
                System.out.println("Задача 8");
                int mari = 67760;
                int den = 83690;
                int kris = 76230;
                float mari10 = mari + mari / 100f * 10;
                float den10 = den + den / 100f * 10;
                float kris10 = kris + kris / 100f * 10;
                System.out.println("Мария получала " + mari + ", " +
                        "а теперь будет получать " + mari10);
                System.out.println("Денис получал " + den + "," +
                        " а теперь будет получать " + den10);
                System.out.println("Кристина получала" + kris + ", " +
                        "а теперь будет получать " +  kris10);
                float mariOldYear = mari * 12;
                float denOldYear = den * 12;
                float krisOldYear = kris * 12;
                float mariNewYear = mari10 * 12;
                float denNewYear = den10 * 12;
                float krisNewYear = kris10 * 12;
                float difMariYear = mariNewYear - mariOldYear;
                float difDenYear = denNewYear - denOldYear;
                float difKrisYear = krisNewYear - krisOldYear;
                System.out.println("Разница между годовым доходом Марии с " +
                        "нынешней зарплатой и после повышения составит " + difMariYear);
                System.out.println("Разница между годовым доходом Дениса с " +
                        "нынешней зарплатой и после повышения составит " + difDenYear);
                System.out.println("Разница между годовым доходом Кристины с " +
                        "нынешней зарплатой и после повышения составит " + difKrisYear);

            }
        }

