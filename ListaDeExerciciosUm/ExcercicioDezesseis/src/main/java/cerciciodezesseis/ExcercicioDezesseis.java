package cerciciodezesseis;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ExcercicioDezesseis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String horaInicial, horaFinal;
        Date horaInicialDate = null, horaFinalDate = null;
        long diferenca;
        System.out.println("Digite o horario inicial");
        horaInicial = scan.next();

        System.out.println("Digite o horario final");
        horaFinal = scan.next();

        SimpleDateFormat format = new SimpleDateFormat("HHmm");

        try {
            horaInicialDate = format.parse(horaInicial);
            horaFinalDate = format.parse(horaFinal);

        } catch (Exception e) {

        }

        diferenca = horaFinalDate.getTime() - horaInicialDate.getTime();
        long resultado = TimeUnit.MILLISECONDS.toHours(diferenca);
        System.out.println("Duração do jogo:" + resultado);
    }
}
