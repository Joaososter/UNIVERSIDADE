public class Main {
    public static void main(String[] args) {
        // Criando um array de notas para um aluno
        double[] notasPresencial = {7.0, 6.5, 5.0, 9.0}; // Exemplo com 4 notas (ac1, ac2, ag, af)
        
        // Instanciando um aluno presencial com presença de 80%
        Aluno alunoPresencial = new Aluno("João Pedro", "123456", notasPresencial, 80.0);
        
        // Chamando o método para imprimir os dados do aluno presencial
        alunoPresencial.imprimirDados();
        
        // Criando um array de notas para outro aluno (EAD)
        double[] notasEAD = {2.0, 4.5, 5.5}; // Exemplo com 3 notas
        
        // Instanciando um aluno EAD (sem presença)
        Aluno alunoEAD = new Aluno("Isabella", "654321", notasEAD);
        
        // Chamando o método para imprimir os dados do aluno EAD
        alunoEAD.imprimirDados();
    }
}
