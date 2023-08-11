import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen Dizi Sayısını Giriniz");

        int listLength = inp.nextInt();
        System.out.println("Lütfen Dizi Sayısını Giriniz");
        int [] list = new int[listLength];
        for (int i =0; i<listLength;i++){
            int value = inp.nextInt();
            list [i]  =value;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));



    }
}