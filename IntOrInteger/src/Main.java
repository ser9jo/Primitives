public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

        for (int a = 0; a < 65536; a++){
            if (a == 'ё' || a == 'Ё') {
                System.out.println(a + " - " + (char) a);
            } else if (a >= 'А' && a <= 'я') {
                System.out.println(a + " - " + (char) a);
            }
        }
    }
}