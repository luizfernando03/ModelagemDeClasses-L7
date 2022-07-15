package Pais;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pais brasil = new Pais("Brasil ", "BRA", 8515767.049) {
            @Override
            public void setPaisesVizinhos(List<String> listVizinhos) {

            }
        };
        boolean paisVizinho = brasil.ePaisVizinho("Uruguai");

        if (paisVizinho) {
            System.out.println(" País é vizinho ");
        } else {
            System.out.println(" País não é vizinho");
        }
        brasil.setPopulacao(214.848);
        brasil.calculaDensidade();
    }
}
