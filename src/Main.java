public class Main {
    public static void main(String[] args) {
        for (int perv = 1; perv < 11; perv++) {                  //начало цикла "for", который начинается с переменной "perv" со значением 1 до числа 11 с шагом 1
            for (int two = 1; two < 11; two++) {                 //начало вложенного цикла "for", который начинается с переменной "two" со значением 1 до числа 11 с шагом 1
                int tab = perv * two;                            //объявление переменной "tab" и присваивание значения произведения переменной "perv" и "two"
                System.out.println(perv + "*" + two + "=" + tab);//вывод на консоль строки, содержащей значения переменных "perv", "two" и "tab"
            }
            System.out.println(" ");                             //вывод на консоль пустой строки для разделения таблиц умножения
        }
    }
}