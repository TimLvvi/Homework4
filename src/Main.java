public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:"); // Задача 1
        byte age = 31;
        if (age >= 18) {
             System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
         } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();

        System.out.println("Задача 2:"); // Задача 2
        byte temperature = 1;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        // в условии задачи не прописано, что выводить при 5 градусах, в связи с чем оператор else не использовал.
        System.out.println();

        System.out.println("Задача 3:"); // Задача 3
        short speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        // в условии задачи не прописано, что выводить при скорости 60 км/ч, в связи с чем оператор else не использовал.
                System.out.println();

        System.out.println("Задача 4:"); // Задача 4
        byte age1 = 20;
        if (age1 >= 2 && age1 <= 6) { // не совсем понял формулировку "от 2 до 6" (включая возраст 2 и 6 или нет). Предварительно включил
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад.");
        }
        if (age1 >= 7 && age1 <= 17) { // не совсем понял формулировку "от 7 до 17" (включая возраст 7 и 17). Предварительно включил
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу.");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        }
        if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        }
        System.out.println();

        System.out.println("Задача 5:"); // Задача 5
        byte age2 = 9;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе.");
        }
        if (age2 >= 5 && age2 < 14) { //по формулировке задачи, если ребенку равно ровно 5, то неизвестно можно ли ему кататься или нет (принял >=)
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (age2 >= 14) { //по формулировке задачи, если ребенку равно 14, то неизвестно можно ли ему кататься или нет (принял >=)
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();

        System.out.println("Задача 6:"); // Задача 6
        short allCapacity = 102;
        short seatingCapacity = 60;
        short people = 120; // людей уже в вагонне, не считая вас
        if (people < seatingCapacity) {
            System.out.println("Если в вагоне на данный момент уже " + people + " людей, то для вас найдется сидячее место.");
        } else if (people >= seatingCapacity && people < allCapacity) {
                System.out.println("Если в вагоне на данный момент уже " + people + " людей, то для вас остались только стоячие места.");
            } else {
                System.out.println("К сожалению, вагон забит, свободных мест нет");
            }
        System.out.println();

        System.out.println("Задача 7:"); // Задача 7
        int one = 50;
        int two = 200;
        int three = 201;
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число " + two);
        } else if (three > one && three > two){
            System.out.println("Самое большое число " + three);
        } else {
            System.out.println("Какие-то из введеных чисел равны, присвойте переменным другие значения не равные друг другу, согласно условиям задачи");
        }
    }
}