public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int age = 20;
        if (age >= 18) System.out.println("Если возраст человека равен " + age + " , то он совершеннолетный");
        if (age < 18) System.out.println("Если возраст человека равен "+age+ " , то он не достиг совершеннолетия, нужно немного подождать");

        int temperature = 3;
        if (temperature <= 5) System.out.println("На улице холодно, нужно надеть шапку");
        if (temperature > 5) System.out.println("Сегодня тепло, можно идти без шапки");

        int speed = 70;
        if (speed >60) System.out.println("Если скорость "+speed+" ,то придется заплатить штраф");
        if (speed <=60) System.out.println("Если скорость "+speed+" , то можно ездить спокойно");

        int age1=10;
        if (age1>2 && age1<6) System.out.println("Если возраст человека равен "+age1+" , то ему нужно ходить в детский сад");
        if (age1>=7 && age1<17) System.out.println("Если возраст человека равен "+age1+" , то ему нужно ходить в школу");
        if (age1>= 17 && age1<24) System.out.println("Если возраст человека равен "+age1+" , то его место в университете");
        if (age1>=24) System.out.println("Если возраст человека равен "+age1+" , то ему пора ходить на работу");

        int age2=3;
        if (age2<=5) System.out.println("Если возраст ребенка равен "+age2+" , то ему нельзя кататься на аттракционе");
        if (age2>5 && age2<=14) System.out.println("Если возраст ребенка равен "+age2+" , то ему можно кататься на аттракционе в сопровождении взрослого");
        if (age2>=14) System.out.println("Если возраст ребенка равен "+age2+" , то ему можно кататься на аттракционе без сопровождения взрослого");

        int number=130;
        if (number<=102) System.out.println("В вагоне есть место");
        else System.out.println("В вагоне места нет");
        if (number<=60) System.out.println("Свободно сидячее место");
        if (number>60 && number<=102) System.out.println("Свободно стоячее место");
        if (number>102) System.out.println("Вагон забит");

        int one=10;
        int two=47;
        int three=20;
        if (one>two && one>three) System.out.println("Наибольшее число " + one);
        else if (two>one && two>three)
            System.out.println("Наибольшее число "+two);
         else System.out.println("Наибольшее число "+three);
                }


    }