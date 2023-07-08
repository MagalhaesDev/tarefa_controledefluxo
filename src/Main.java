public class Main {
    public static void main(String[] args) {
        int nota1 = 8;
        int nota2 = 3;
        int nota3 = 5;
        int nota4 = 2;

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7) {
            System.out.printf("Aluno aprovado: nota %d", media);
        } else if (media >= 5) {
            System.out.printf("Aluno de recuperação: nota %d", media);
        } else {
            System.out.printf("Aluno reprovado: nota %d", media);
        }
    }
}