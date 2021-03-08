public class ru {
    public static String[] generarPremio(int cantidad) {
        String[] premioaleatorio = new String[cantidad];
       String[] premios = {"Pc gamer" , "mando de ps4", "gameboy color", "Una casa", "Comida inlimitada"};
       
       for (int i = 0; i < cantidad; i++){
           premioaleatorio[i] = premios[(int)(Math.floor(Math.random()*((premios.length -1) -0 +1)+0))];
       } return premioaleatorio;
       
    }
    public static  void mostrar(String[] premioGenerado){
        for (int i = 0; i < premioGenerado.length; i++){
            System.out.println("Felicidades  Ganastes "+premioGenerado[i]);
        }
    }
    public static void main(String[] args){
        mostrar(generarPremio(1));
    }

    }

