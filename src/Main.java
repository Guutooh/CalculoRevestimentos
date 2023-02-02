import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("[INFORMAÇÕES SOBRE A ÁREA]\n");

        System.out.print("Informe Altura da área: ");
        double alturaArea = sc.nextDouble();

        System.out.print("Informe Largura da área: ");
        double larguraArea = sc.nextDouble();

        System.out.println("\n[INFORMAÇÕES DO REVESTIMENTO] \n");

        System.out.print("Informe Altura do revestimento escolhido: ");
        double alturaRestimento = sc.nextDouble();

        System.out.print("Informe Largura do revestimento escolhido: ");
        double larguraRestimento = sc.nextDouble();

        System.out.println("\n[RESULTADO] \n");

        Calculo calculo = new Calculo();

        System.out.printf("Area Total do ambiente: %.2f m² \n" , calculo.calculoArea(alturaArea,larguraArea));
        System.out.printf("Area de revestimento: %.2f m² \n" ,  calculo.calculoRevestimento(alturaRestimento,larguraRestimento));
        System.out.println("Quantidade de revestimento necessário: " + (int) calculo.qtsRevestimento(calculo.calculoArea(alturaArea,larguraArea),calculo.calculoRevestimento(alturaRestimento,larguraRestimento)) +" Peças");
        System.out.println("Acrescentando uma margem de 15%: " + (int) Math.round( calculo.qtsRevestimento(calculo.calculoArea(alturaArea,larguraArea),calculo.calculoRevestimento(alturaRestimento,larguraRestimento)) * 15 /100)+" Peças");

        sc.close();


    }
}