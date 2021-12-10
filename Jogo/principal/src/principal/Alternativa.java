package principal;

public class Alternativa {

    private String enunciado;
    private boolean status;

    public void Alternativa() {

    }

    public void respostas(int index) {
        String[][] respostas = {{"Uma técnica para incluir primitivas dentro de uma lista de Matrizes",
            "Uma técnica para limitar a visibilidade de uma classe para outra",
            "Uma ténica de depuração",
            "Uma técnica para criar mais de um método principal"},
        {"Definir o tipo de retorno do método como void",
            "Usar uma instrução de retorno e definir o tipo de retorno do método como non-void",
            "Passar uma varável como um argumento para o método",
            "Definir uma variável como um membro de campo do método"},
        {"O Java fornece automaticamente um cronstrutor para cada classe.",
            "Você precisa criar um cronstrutor padrão.",
            "O construtor padrão deve ter pelo menos um argumento.",
            "O construtor padrão sempre retorna um valor nulo."},
        {"Um pacote não contém um grupomde classes relacionadas.",
            "Um pacote contém um grupo de classes relacionadas.",
            " Um pacote faz com que seja difícil localizar as classes relacionadas.",
            "Os pacotes da biblioteca de classes Java não contém classes relacionadas."},
        {"charArt()", "compare to", "length", "findLength()"},
        {"Integer", "Double", "Number", "Random"},
        {"Instance", "System", "void", "new"},
        {"A legibilidade do código diminui", "A execução do compilador aumenta",
            "o desempenho do código diminui", "o uso da memória aumenta"},
        {"Verdadeiro", "Falso"},
        {"static", "break", "const", "final"}};

        String[] respostasEnun = {"{A}", "{B}", "{C}", "{D}"};

        for (int i = 0; i < respostas[index].length; i++) {
            System.out.println(respostasEnun[i] + respostas[index][i]);
        }

    }

}
