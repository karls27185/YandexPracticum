import java.util.Random;
import java.util.Scanner;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link/</a>
 */
public class practicum {
    public static void main(String[] args) {
//        double rateUSD = 78.5;
//        double rubles = 14356.5;
//
//        if (rateUSD < 70.0)
//        {System.out.println("Отличный курс доллара — рекомендую купить!");}
//        {System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);}

//        double rateUSD = 78.5;
//        double rateEUR = 85.5;
//        double rubles = 14560.5;
//
//        String currency = "USD";
//        System.out.println("Вы конвертируете рубли в " + currency);
//        // Если currency равно "USD", то конвертируем в доллары, иначе в евро
//        if (currency.equals("USD")) {
//            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
//        }
//        {
//            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
//        }

//        double moneyBeforeSalary = 15000.0; // Количество денег до зарплаты
//        int daysBeforeSalary = 14;
//
//        if (moneyBeforeSalary < 3000) {
//            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
//        } else if (moneyBeforeSalary < 10000) {
//            // Здесь нужное условие уже добавили
//            if (daysBeforeSalary < 10) {
//                System.out.println("Окей, пора в Макдак!");
//            } else {
//                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
//            }
//
//        } else if (moneyBeforeSalary < 30000) {
//            // Допишите условие
//            if (daysBeforeSalary < 10) {
//                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
//            } else {
//                System.out.println("Окей, пора в Макдак!");
//            }
//
//        } else {
//            // Если до зарплаты меньше 10 дней, то едим крабов
//            if (daysBeforeSalary < 10)
//                System.out.println("Класс! Заказывайте крабов!");
//                // Иначе — доллары и ужин в хорошем ресторане
//            else
//                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
//
//        }

//        Scanner scanner = new Scanner(System.in);
//        int randomInt = new Random().nextInt(1000); // Генерирует новое число от 0 до 1000
//
//        int userInput = -1; // Это нужно, чтобы цикл запустился, если Random выдаст 0
//        System.out.println("Я загадал число от 0 до 1000.");
//        System.out.println("Ваш ход:");
//
//        // Напишите условие цикла для запуска игры
//        while (userInput != randomInt) {
//
//            userInput = scanner.nextInt(); // В этой переменной должен сохраняться ввод пользователя
//
//            if (userInput > randomInt) { // Условие проверяется в цикле
//                System.out.println("Меньше");
//            } else if (userInput < randomInt) {
//                // Второе условие
//                System.out.println("Больше");
//            } else {
//                // Печатаем, когда число угадано
//                System.out.println("Вы великолепны! Именно это я загадал.");
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        int sum = 0; // Сумма
//        int input = scanner.nextInt(); // Ввод пользователя
//
//        while (input != 0) {
//            sum = sum + input;
//            input = scanner.nextInt();
//        }
//        System.out.println("Сумма введённых чисел: " + sum);

//        Random random = new Random(); // Генерирует случайное число
//        int secretCode;
//        int pilotInput;
//
//        while (true) {// Добавьте цикл - ракета летает бесконечно
//            secretCode = random.nextInt(100); // Здесь задаётся код - случайное число от 0 до 100
//            System.out.println("Ракета SpaceY на орбите!");
//            pilotInput = random.nextInt(100); // Пилот пытается угадать код
//
//            if (secretCode == pilotInput) { // Если пилот угадал код, то цикл должен завершиться
//                System.out.println("Пилот угадал число! Летим домой!");
//                break;
//            }
//        }


    }
}
