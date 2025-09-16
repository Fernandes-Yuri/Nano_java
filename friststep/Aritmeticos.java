public class Aritmeticos {
    public static void main(String[] args) {

        // A diferença entre dividir inteiros e dividir floats
    {
        var número = 1570;

        System.out.println("1570/2  = " + (1570/2));
        System.out.println("1570/3  = " + (1570f/3f));

    
                // Operaçoes utilizando %
        {
            System.out.println("O número: " + número + " é divisível por 2? " + (número % 2 == 0));
            System.out.println("O número: " + número + " é divisível por 3? " + (número % 3 == 0));
            System.out.println("O número: " + número + " é divisível por 5? " + (número % 5 == 0));
            System.out.println("O número: " + número + " é divisível por 6? " + (número % 6 == 0));
            System.out.println("O número: " + número + " é divisível por 7? " + (número % 7 == 0));
            System.out.println("O número: " + número + " é divisível por 9? " + (número % 9 == 0));
        }
    }
        // Cuidado com o estouro de valores
    {
        byte quantidadeUvasVerdes = 50;
        byte quantidadeUvasRoxa = 120;
        byte quantidadeUvasTotais = (byte) (quantidadeUvasVerdes + quantidadeUvasRoxa);
        System.out.println("Quantidade total de uvas ultrapassando (byte): " + quantidadeUvasTotais);
    }

        // Solução 1: Usar um tipo maior
    {
        byte quantidadeUvasVerdes = 50;
        byte quantidadeUvasRoxa = 120;
        int quantidadeUvasTotais = (quantidadeUvasVerdes + quantidadeUvasRoxa);
        System.out.println("Quantidade total de uvas corrigido com (int): " + quantidadeUvasTotais);
    }

        // Operações com atribuições usando o recurso do Escopo.
    {
        var x = 1500;

        x += 10;
        System.out.println(x);
            { x /= 10;
                System.out.println(x);
            }
    }

    }
}