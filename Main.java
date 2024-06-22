//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // convenciones
        Convencion ARFF = new Convencion("ARFF");
        //SALONES
        Salon escenario = new Salon(2000,20000);
        Salon principal = new Salon(3000,30000);
        //SECCIONES
        Seccion artistas = new Seccion("artistas");
        Seccion figuras = new Seccion("figuras");
        Seccion meetandgreet = new Seccion("meet and greet");
        Seccion aperitivos = new Seccion("aperitivos");
        Seccion juegos = new Seccion("juegos");
        Seccion accesorios = new Seccion("accesorios");
        //Stands
        Stand chico1 = new Stand(200,1 , "chico", false);
        Stand chico2 = new Stand(200, 2, "chico", false);
        Stand chico3 = new Stand(200, 3, "chico", false);
        Stand chico4 = new Stand(200,4 , "chico", false);
        Stand chico5 = new Stand(200, 5, "chico", false);

        Stand mediano1 = new Stand(400,1, "mediano", false);
        Stand mediano2 = new Stand(400,2, "mediano", false);
        Stand mediano3 = new Stand(400,3, "mediano", false);
        Stand mediano4 = new Stand(400,4, "mediano", false);
        Stand mediano5 = new Stand(400,5, "mediano", false);

        Stand grande1 = new Stand(600,1,"grande", true);
        Stand grande2 = new Stand(600,2,"grande", true);
        Stand grande3 = new Stand(600,3,"grande", true);
        Stand grande4 = new Stand(600,4,"grande", true);
        Stand grande5 = new Stand(600,5,"grande", true);



    }
}