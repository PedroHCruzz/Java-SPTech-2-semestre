package school.sptech;
import java.util.Random;
public class exercicio8 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer votosMussarela = Integer.valueOf(0);
        Integer votosCalabresa = Integer.valueOf(0);
        Integer votosQuatroQueijos = Integer.valueOf(0);

        for (Integer i = Integer.valueOf(1); i <= 10; i++) {
            Integer voto = Integer.valueOf(random.nextInt(3) + 1);
            if (voto.equals(Integer.valueOf(1))) {
                votosMussarela++;
            } else if (voto.equals(Integer.valueOf(2))) {
                votosCalabresa++;
            } else if (voto.equals(Integer.valueOf(3))) {
                votosQuatroQueijos++;
            }
        }

        System.out.println("Votos para Mussarela: " + votosMussarela);
        System.out.println("Votos para Calabresa: " + votosCalabresa);
        System.out.println("Votos para Quatro Queijos: " + votosQuatroQueijos);
        
        if (votosMussarela > votosCalabresa && votosMussarela > votosQuatroQueijos) {
            System.out.println("Sabor favorito: Mussarela");
        } else if (votosCalabresa > votosMussarela && votosCalabresa > votosQuatroQueijos) {
            System.out.println("Sabor favorito: Calabresa");
        } else if (votosQuatroQueijos > votosMussarela && votosQuatroQueijos > votosCalabresa) {
            System.out.println("Sabor favorito: Quatro Queijos");
        } else {
            System.out.println("Houve empate entre os sabores.");
        }
    }
}
