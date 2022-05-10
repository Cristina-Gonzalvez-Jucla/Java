package models;

public class GonzalvezCristina_Character {
    private static String nom;
    private static int altura;
    private static int massa;
    private static String colorCabell;
    private static String colorPell;
    private static String colorUlls;
    private static String anyNaixament;
    private static String genera;
    private static String planetaNaixament;
    private static String especia;

    public GonzalvezCristina_Character(String nom, int altura, int massa, String colorCabell, String colorPell, String colorUlls, String anyNaixament, String genera, String planetaNaixament, String especia) {
        this.nom = nom;
        this.altura = altura;
        this.massa = massa;
        this.colorCabell = colorCabell;
        this.colorPell = colorPell;
        this.colorUlls = colorUlls;
        this.anyNaixament = anyNaixament;
        this.genera = genera;
        this.planetaNaixament = planetaNaixament;
        this.especia = especia;
    }

    @Override
    public String toString() {
        return
                "\nnom= " + nom +
                "\naltura= " + altura +
                "\nmassa= " + massa +
                "\ncolorCabell= " + colorCabell +
                "\ncolorPell= " + colorPell +
                "\ncolorUlls= " + colorUlls +
                "\nanyNaixament= " + anyNaixament +
                "\ngenera= " + genera +
                "\nplanetaNaixament= " + planetaNaixament +
                "\nespecia= " + especia;
    }

    public static void comprvacioNA (){
        if (nom.equals("NA")){
            nom = "No te nom";
        }
    }
}
