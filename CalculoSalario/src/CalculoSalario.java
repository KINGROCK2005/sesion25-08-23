import java.util.Scanner;
public class CalculoSalario {
        static final double tasIns = 7;
        static final double  tasIr = 15.6;
        static final double tasaInsPat = 22.5;
        static final double tasaSind = 1.0;
        static final double tasAntig = 15.0;
    public static void main(String[] args)
    {
      

        double salaBr = 0, dedTot = 0, inet = 0, inT = 0, inA = 0;
        double ins = 0, ir = 0, afSin = 0, dedIns = 0, dedIr = 0;

        Scanner lector= new Scanner(System.in);
        System.out.println("Ingrese su salario Bruto/basico: ");
        salaBr = lector.nextDouble(); 
        inA = salaBr * (tasAntig/100);
        inT = salaBr + inA;
        dedIns = inT * 

        System.out.println("Reporte salario semana: ");
        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("Salario Bruto: " + salaBr);
        System.out.println("Ingresos por antiguedad: " + inA);
        System.out.println("Ingresos totales :" + inT);
        System.out.println("Ingreso ");
    }

}
