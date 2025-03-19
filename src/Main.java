/*
VAR
blusas, novelos, conta: Real

INICIO

Ler blusas
Ler novelos

conta ← novelos / blusas

Escreva "A confecção gastou " + conta + " novelos por blusa"

FIM

TESTE DE MESA

| Blusas | Novelos | Conta (novelos / blusas) | Saída |
|--------|--------|-------------------------|----------------------------------------------------|
| 10     | 50     | 5.0                     | "A confecção gastou 5.0 novelos por blusa"         |
| 5      | 20     | 4.0                     | "A confecção gastou 4.0 novelos por blusa"         |
| 8      | 32     | 4.0                     | "A confecção gastou 4.0 novelos por blusa"         |
| 4      | 10     | 2.5                     | "A confecção gastou 2.5 novelos por blusa"         |

*/

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double blusas,novelos,conta;

        //String
        String sblusa,snovelo;

        //Blusas
        sblusa = JOptionPane.showInputDialog(null,"Quantas blusas foram feitas?");
        blusas = Double.parseDouble(sblusa);

        //Novelos
        snovelo = JOptionPane.showInputDialog(null,"Quantos novelos foram gastos?");
        novelos = Double.parseDouble(snovelo);

        //Main code

        conta = novelos/blusas;

        //Output

        JOptionPane.showMessageDialog(null,"A confecção gastou " + conta + " novelos por blusa");
    }
}