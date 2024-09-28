package br.edu.fatecpg.autenticavel.model;

public class SistemaDeSeguranca implements Autenticavel {
    private final String usuarioCorreto = "admin";
    private final String senhaCorreta = "1234";
    private boolean autenticado = false;

    @Override
    public boolean login(String usuario, String senha) {
        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            autenticado = true;
            System.out.println("Login bem-sucedido! Bem-vindo, " + usuario + "!");
        } else {
            System.out.println("Usuário ou senha incorretos. Tente novamente.");
        }
        return autenticado;
    }

    @Override
    public void logout() {
        if (autenticado) {
            System.out.println("Logout realizado com sucesso.");
            autenticado = false;
        } else {
            System.out.println("Você não está logado.");
        }
    }

    public boolean isAutenticado() {
        return autenticado;
    }
}
