public class Escopo {
    public static void main(String[] args) {

        String frase;
        {
            frase = "Aprendi o conceito de escopo em Java \n"; 
        
            {
                String fraseInterna = "Os blocos mais internos podem acessar variáveis dos blocos mais externos";
                frase = frase + fraseInterna;
                {
                    fraseInterna = fraseInterna + ", mas o contrário não é verdadeiro.";
                    frase = frase + fraseInterna;
                }
            }

            String fraseInterna = "Testando redeclaração de variável em outro bloco";  
            frase = frase + fraseInterna;
            
        } 
        System.out.println(frase);

    }

        
}

