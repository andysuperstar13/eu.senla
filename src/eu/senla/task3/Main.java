package eu.senla.task3;

public class Main {
    public static void main(String[] args){
        int catTask1 = 1;
        while (catTask1 <=10){
            Cat cat = new Cat();
            System.out.println(catTask1 +") name:"+cat.getName()+", age:"+cat.getAge());
            catTask1++;
        }

        for (int catTask2 = 1; catTask2 <= 10; catTask2++){
            Cat cat2 = new Cat();
            cat2.setName("Tim");
            cat2.setAge(3);
            System.out.println(catTask2 +") name:"+cat2.getName()+", age:"+cat2.getAge());
        }

        int catTask3 = 1;
        do {
            Cat cat3 = new Cat("Tor", 4);
            System.out.println(catTask3 +") name:"+cat3.getName()+", age:"+cat3.getAge());
            catTask3++;
        } while (catTask3<+10);

        String[] names = {"Kot1","Kot2","Kot3","Kot4","Kot5"};
        int[] ages = {1,3,5,7,9,};
        int x1 = 0, x2 = 0, catTask4 = 1;
        Cat[] cat4 = new Cat[5];
        for (Cat cats: cat4){
            cats = new Cat(names[x1], ages[x2]);
            System.out.println(catTask4 +") name:"+names[x1]+", age:"+ages[x2]);
            catTask4++; x1++; x2++;
        }
    }
}

