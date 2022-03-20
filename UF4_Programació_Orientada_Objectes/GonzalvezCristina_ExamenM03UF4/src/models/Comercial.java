package models;

public class Comercial extends Treballador {
    private boolean cotxeEmpresa;
    private boolean tarjetaCreditEmpresa;
    private String zonaOnTreballa;

    public Comercial(String nom, String cognom, String adreça, String zonaOnTreballa, boolean cotxeEmpresa, boolean tarjetaCreditEmpresa) {
        super(nom, cognom, adreça);
        this.zonaOnTreballa = zonaOnTreballa;
        this.cotxeEmpresa = cotxeEmpresa;
        this.tarjetaCreditEmpresa = tarjetaCreditEmpresa;
    }
    @Override
    public String display() {
        return "\nNom: " + getNom() + "\nCognom: " + getCognom()
                + "\nAdreça: " + getAdreça() + "\nZona On Treballa: " + zonaOnTreballa
                + "\nDisposa de Cotxe de la Empresa: " + cotxeEmpresa + "\nDisposa de tarjeta de crèdit a càrrec de l'empresa: " +
                tarjetaCreditEmpresa;
    }

    @Override
    public void creacioEmpleat(String nom, String cognom, String adreca, int numeroSS, String posicioTreball) {
        System.out.println("Nom: " + nom + "\nCognom: " + cognom + "\nAdreça: " + adreca +
                "\nNumero Seguretat Social: " + numeroSS + "\nIdentificador Intern: "+ generadorIdentificador(nom, "COMERCIAL"));
        System.out.println();
    }
}
