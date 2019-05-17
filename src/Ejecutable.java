import java.util.Scanner;

public class Ejecutable {

    public static void series (Serie[] series) {
        Scanner sc = new Scanner (System.in);
        String titulo, temp, genero, creador, compañia, horas;
            for(int i = 0; i<5; i++){
            System.out.println("Introduce el título de la " + (i+1) + "º serie");
            titulo=sc.nextLine();
            System.out.println("Introduce el nº de temporadas para ese título");
            temp = sc.nextLine();
            System.out.println("Introduce el género");
            genero = sc.nextLine();
            System.out.println("Introduce el creador");
            creador = sc.nextLine() ;
            series[i]= new Serie (titulo, genero, creador);
            series[i].setnumtemporadas(Integer.parseInt(temp));
            }
            System.out.println("");
    }
    
    public static void juegos(Videojuego[] juegos){
        Scanner sc = new Scanner (System.in);
        String titulo, temp, genero, creador, compañia, horas;
        for(int i = 0; i<5; i++){
            System.out.println("Introduce el título del " + (i+1) + "º juego");
            titulo=sc.nextLine();
            System.out.println("Introduce el nº horas estimadas para ese título");
            horas = sc.nextLine();
            System.out.println("Introduce el género");
            genero = sc.nextLine();
            System.out.println("Introduce la compañia");
            compañia = sc.nextLine();
            juegos[i]= new Videojuego(titulo, genero, compañia);
            juegos[i].sethorasestimadas(Integer.parseInt(horas));
        }
        System.out.println("");
    }

public static void alquilaciones(Serie[] series){
        Scanner sc = new Scanner (System.in);
        Serie a = null;
        String serie;
        int cSeries = 0;
        int cJuego = 0;
        Videojuego[] juegos = new Videojuego[5];
        String juego1;
        String juego2 = null;
        int as = 0;
        boolean alquilar = false;
        Videojuego b = null;
        
        do{
            System.out.println("Vas a alquilar algo? (si o no) ");
            String respuesta = sc.nextLine();
            if(respuesta.equals("si")){
                System.out.println("¿Qué serie desea alquilar?");
                System.out.println("0 - No me gusta ninguna");
                for(int i = 0; i<5; i++){
                    if(series[i].isPrestado()==false){
                    System.out.println((i+1) + " - " +  series[i].getTitulo());
                    }
                }
                serie = sc.nextLine();
                if(!serie.equals("0")){
                    series[Integer.parseInt(serie)-1].alquilar();
                    cSeries++;
                }
                
                System.out.println("");
                System.out.println("¿Qué juego desea alquilar?");
                System.out.println("0 - No me gusta ninguno");
                for(int i = 0; i<5; i++){
                    if(juegos[i].isPrestado()==false){
                    System.out.println((i+1) + " - " +  juegos[i].getTitulo());
                     }
                }
                juego1 = sc.nextLine();
                if(!juego1.equals("0")){      
                    juegos[Integer.parseInt(juego1)-1].alquilar();
                    cJuego++;
                }
                System.out.println("");
                System.out.println("Desea alquilar algún otro artículo?");
                if(sc.nextLine().equals("No")){
                    alquilar=true;
                }
            }else{
                alquilar=true;
            }
        }while(alquilar==false);
}

public static void muestradatos(Videojuego[] juegos, Serie[] series){
        
        int ab = 0;
        int cSeries = 0;
        int cJuego = 0;
        int as = 0;
        String serie2 = null;
        String juego2 = null;
        
        System.out.println("Se han alquilado " + cSeries + " series y " + cJuego + " videojuegos");
        System.out.println("");
        System.out.print("En nuestro archivo, el videojuego con más horas es: ");
        for(int i = 0 ; i<5; i++){
            as = Integer.MIN_VALUE;
            if(juegos[i].gethorasestimadas()>as){
                as=juegos[i].gethorasestimadas();
            }
        }
        
        for (int i = 0; i < 5; i++) {
            if(juegos[i].gethorasestimadas()==as){
                juego2=juegos[i].getTitulo();
            }
        }
        System.out.println(juego2 + " con " + as + " horas.");
        
        System.out.print("Y la serie con más temporadas es: ");
        for(int i = 0 ; i<5; i++){
            ab = Integer.MIN_VALUE;
            if(series[i].getnumtemporadas()>ab){
                ab=series[i].getnumtemporadas();
                
            }
        }
        
        for (int i = 0; i < 5; i++) {
            if(series[i].getnumtemporadas()==ab){
                serie2=series[i].getTitulo();
            }
        }
        
        System.out.println(serie2 + " con " + as + " temporadas.");

}

    public static void main(String[] args) {
        Videojuego[] juegos = new Videojuego[5];
        Serie[] series = new Serie[5];
        series(series);
        juegos(juegos);
        alquilaciones(series);
        muestradatos(juegos,series);
    }
    
}
