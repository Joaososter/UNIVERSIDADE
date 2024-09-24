Projeto aluno e sistemas de notas


Este projeto em Java implementa um sistema simples para gerenciar informações de alunos, calcular suas notas finais e verificar se foram aprovados ou reprovados, levando em consideração a modalidade de ensino (presencial ou EAD).


🚀 Começando


Uma conceituada universidade calcula a nota final de seus alunos de duas formas a depender da quantidade de avaliações.

Até 2 avaliações a nota final será a média aritmética das notas. Caso tenha 3 notas será a média ponderada, onde a segunda nota tem o dobro do peso da primeira e a terceira tem o dobro do peso da segunda.

Caso haja 4 notas, ac1, ac2, ag e af, a nota final será dada pela equação:

MF = (ac1 * 0,15) + (ac2 * 0,30) + (ag * 0,10) + (af * 0,45).

Nessa mesma universidade, um aluno será aprovado se sua nota for >= 5 e possuir ao menos 75% de presença. Contudo, nas disciplinas no formato EAD, não há presença e a aprovação será apenas baseada na nota, com o mesmo valor de corte das disciplinas presenciais.

Crie a classe aluno que implementa essas funções e os atributos que julgar necessários. Além disso, crie construtores e um método que imprime o nome, RA, nota final e situação (Aprovado/Reprovado).


📋 Pré-requisitos

Java JDK (versão 11 ou superior)
Visual Studio Code ou outra IDE de sua preferência.


🔧 Instalação

Clone o repositório para o seu ambiente local: (git clone https://github.com/Joaososter/UNIVERSIDADE.git)
Abra o projeto no VS Code.
Compile e execute as classes no terminal ou usando a extensão de Java no VS Code.

🛠️ Construído com

Java - Linguagem de programação usada
Visual Studio Code - IDE utilizada para o desenvolvimento

📌 Versão

Versão 1.0 Implementação inicial
Versão 1.1 Ajustes para entrega


✒️ Autores

Joao Soster - Trabalho Inicial - Programacao Orientada a Objetos
