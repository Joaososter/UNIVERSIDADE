public class Aluno {
    // Atributos privados da classe
    private String nome;
    private String ra;
    private double[] notas;
    private double presenca; // em porcentagem (0 a 100)
    private boolean isEAD;

    // Construtor da classe Aluno (presencial)
    public Aluno(String nome, String ra, double[] notas, double presenca) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
        this.presenca = presenca;
        this.isEAD = false; // Consideramos que é presencial por padrão
    }

    // Construtor da classe Aluno (EAD)
    public Aluno(String nome, String ra, double[] notas) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
        this.isEAD = true; // EAD, não há presença
        this.presenca = 100; // Colocamos 100% como default em EAD, já que não conta presença
    }

    // Método para calcular a nota final
    public double calcularNotaFinal() {
        double notaFinal = 0.0;

        // Verifica o número de notas e aplica a fórmula correspondente
        if (notas.length == 2) {
            // Média aritmética simples para 2 notas
            notaFinal = (notas[0] + notas[1]) / 2;
        } else if (notas.length == 3) {
            // Média ponderada para 3 notas: segunda nota com peso 2 e terceira com peso 4
            notaFinal = (notas[0] + (notas[1] * 2) + (notas[2] * 4)) / 7;
        } else if (notas.length == 4) {
            // Fórmula específica para 4 notas: ac1, ac2, ag e af
            notaFinal = (notas[0] * 0.15) + (notas[1] * 0.30) + (notas[2] * 0.10) + (notas[3] * 0.45);
        }

        return notaFinal;
    }

    // Método para verificar se o aluno está aprovado
    public boolean verificarAprovacao() {
        double notaFinal = calcularNotaFinal();

        if (isEAD) {
            // Em EAD só conta a nota final
            return notaFinal >= 5.0;
        } else {
            // Presencial: nota final >= 5 e presença >= 75%
            return notaFinal >= 5.0 && presenca >= 75.0;
        }
    }

    // Método para imprimir os dados do aluno
    public void imprimirDados() {
        double notaFinal = calcularNotaFinal();
        String situacao = verificarAprovacao() ? "Aprovado" : "Reprovado";

        // Imprime as informações do aluno
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.printf("Nota Final: %.2f\n", notaFinal);
        System.out.println("Situação: " + situacao);
    }

    // Métodos getter e setter (se necessário)

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public double[] getNotas() {
        return notas;
    }

    public double getPresenca() {
        return presenca;
    }

    public boolean isEAD() {
        return isEAD;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setPresenca(double presenca) {
        this.presenca = presenca;
    }

    public void setIsEAD(boolean isEAD) {
        this.isEAD = isEAD;
    }

}

