import java.util.Scanner;

class Test
{
    public static int medie(int numarDeNote){
        System.out.println("Introdu numerele:");
        Scanner scanner = new Scanner(System.in);
        int nrDeNote = 0;
        int suma = 0;
        for (int i=0; i<numarDeNote; i++) {
            nrDeNote++;
            suma = suma + scanner.nextInt();
        }
        return suma/nrDeNote;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numar de note:");
        int numarDeNote = scanner.nextInt();
        int rezultat = medie(numarDeNote);
        System.out.println("Nota este" + rezultat);
    }
}