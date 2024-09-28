package br.edu.fatecpg.autenticavel.view;

import java.util.Scanner;

import br.edu.fatecpg.autenticavel.model.SistemaDeSeguranca;

public class Teste {

    public static void main(String[] args) {
        SistemaDeSeguranca sistema = new SistemaDeSeguranca();
        Scanner scanner = new Scanner(System.in);

        while (!sistema.isAutenticado()) {
            System.out.print("Digite o usuário: ");
            String usuario = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            sistema.login(usuario, senha);
        }

        System.out.println("Digite 'logout' para sair.");
        String comando = scanner.nextLine();
        if (comando.equalsIgnoreCase("logout")) {
            sistema.logout();
        }

        scanner.close();
    }

}
