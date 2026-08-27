package org.example.computador;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("Intel", "i7", 4.5);
        Memoria memoria = new Memoria("Kingston", "XP852", "16 gb");
        Dispositivo_De_Armazenamento dispositivo_de_armazenamento = new Dispositivo_De_Armazenamento("Kingston","nvme M.2","M.2");
        Placa_mae placa_mae = new Placa_mae("ASUS","MSI A520M-A Pro","LGA 1152");

        System.out.println(memoria);
        System.out.println(placa_mae);
        System.out.println(dispositivo_de_armazenamento);
        System.out.println(processador);

    }
}
