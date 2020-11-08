/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan36;

/**
 *
 * @author Lenovo
 */
public class SaldoTarget {
       private double saldo_awal, bunga, saldo_target;
    Scanner scanner = new Scanner(System.in);
    public double getSaldo_awal() {
        System.out.print("Saldo Awal\t\t: ");
        saldo_awal = scanner.nextDouble();
        return saldo_awal;
    }

    public double getBunga() {
        System.out.print("Bunga/Bulan (%)\t: ");
        bunga = scanner.nextDouble();
        return bunga / 100;
    }

    public double getSaldo_target() {
        System.out.print("Saldo target\t: ");
        saldo_target = scanner.nextDouble();
        return saldo_target;
    }
}
