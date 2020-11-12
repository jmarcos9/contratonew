package contrato;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class tste {
    static Scanner scan = new Scanner(System.in);
    static SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-/MM/yyyy");

    public static void main(String[] args) throws ParseException {


        System.out.print("Digite dia Nascimento (Ano/mês/dia - Ex. 1981-09-01): ");
        String sDataAno = scan.nextLine();

        //Date data = formatoData.parse(sData);

		LocalDate agora = LocalDate.now();
		LocalDate data2 = LocalDate.parse(sDataAno);
		Period periodo = Period.between(data2, agora);
		int anos = periodo.getYears();
        System.out.println(anos);
        if (anos < 18){
            System.out.println("Menor de 18 anos");
        }

    }

}