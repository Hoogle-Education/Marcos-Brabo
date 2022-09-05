package application;

import java.util.Scanner;

import entities.Conta;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Conta acc1 = new Conta("123-A", "Joao da Victor", "JV");
		Conta acc2 = new Conta("321-B", "Ana Beatriz", "Bia");
		
		acc1.depositar(200);
		acc2.depositar(500);
		
		System.out.println( acc1.sacar(100) );
		System.out.println( acc1.sacar(300) );
		
		System.out.println(acc1.getSaldo());
		System.out.println(acc2.getSaldo());
		
		acc2.transferir(200, acc1);

		System.out.println("------");
		System.out.println(acc1.getSaldo());
		System.out.println(acc2.getSaldo());
		
	}

}
