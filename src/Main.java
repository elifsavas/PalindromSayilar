public class Main {

    // Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır. (ör; 101, 363, 4004..)

    static boolean isPalindrom(int number) {
        int temp = number, lastNumber;
        int newNumber = 0;

        while (temp != 0) {
            lastNumber = temp % 10; //Burada sonraki basamağı alıyoruz.
            //System.out.println("Son Basamak:" + lastNumber);

            newNumber = (newNumber * 10) + lastNumber;
            //System.out.println("Yeni Sayı:" + newNumber);

            temp /= 10; //Burada basamak sayısını 1 eksiltiyoruz.
            // System.out.println("Eski Sayı:" + temp);

            //System.out.println("----------------");
        }

        if (newNumber == number)
            return true;
        else
            return false; //Eğer if'ten sonra return döndereceksek süslü parantez kullanmamıza gerek yok

    }

    public static void main(String[] args) {

        System.out.println(isPalindrom(523325));


    }
}
