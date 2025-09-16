public class Main { 
    
    public static void main(String[] args) {


        {
            byte idade = 28;
            short ano = 1999; 
            int quantidade = 1500; 
            long vendas = 1_000_000_000L;

            float tamanho = 1.86F;
            double saldo = 1.000_000_000;

            char sexo = 'M';

            String nome = "Frederico Gusmão";

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");  
            System.out.println("Ano de nascimento: " + ano);
            System.out.println("Sexo: " + sexo);
            System.out.println("Tamanho: " + tamanho + "m");
            System.out.println("Quantidade de produtos: " + quantidade);
            System.out.println("Saldo em conta: R$" + saldo); 
            System.out.println("Vendas: " + vendas);
        }
        
        {
        byte idade = 28, quantidaeDependentes = 2;
        short dataNascimento = 1999, mes = 11, dia = 7;
        float altura = 1.86F, peso = 85.4F;
        String nome = "Frederico Gusmão";

        System.out.println("Informações: " + nome + ", idade: " + idade + ", dependentes: " + quantidaeDependentes + ", nascimento: " + dia + "/" + mes + "/" + dataNascimento + ", altura: " + altura + "m, peso: " + peso + "kg.");
        }
    }
}