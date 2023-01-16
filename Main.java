import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        double muz,elma,armut,domts,ptlcn,tutar;

        System.out.println("Muzun kilogramı:0,95  \n" +
                "Elmanın kilogramı:3,67 \n" +
                "Armutun kilogramı:2,14\n" +
                "Domatesin kilogramı:1,11 \n" +
                "Patlıcanın kilogramı:5,00 ");

        System.out.print("Muz kaç kilo ? :");
        muz = input.nextDouble();
        System.out.print("Elma kaç kilo ? :");
        elma = input.nextDouble();
        System.out.print("Armut kaç kilo ? :");
        armut = input.nextDouble();
        System.out.print("Domates kaç kilo ? :");
        domts = input.nextDouble();
        System.out.print("Patlıcan kaç kilo ? :");
        ptlcn = input.nextDouble();

        tutar = (muz*0.95)+(elma*3.67)+(armut*2.14)+(domts*1.11)+(ptlcn*5);
        System.out.print("Alışverşinizin tutarı : " +tutar);

    }
}