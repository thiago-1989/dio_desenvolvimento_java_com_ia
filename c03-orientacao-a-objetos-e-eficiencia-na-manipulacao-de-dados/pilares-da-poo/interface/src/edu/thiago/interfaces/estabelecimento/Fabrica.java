package edu.thiago.interfaces.estabelecimento;

import edu.thiago.interfaces.equipamentos.digitalizadora.Scanner;
import edu.thiago.interfaces.equipamentos.impressora.Impressora;
import edu.thiago.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional multifuncional = new EquipamentoMultifuncional();
        Impressora impressora = new EquipamentoMultifuncional();
        Scanner scanner = new Scanner();

        impressora.imprimir();
        multifuncional.imprimir();
        multifuncional.copiar();
        multifuncional.digitalizar();
        scanner.digitalizar();
    }
}
