package models;

public class Directiu extends Treballador {
    private boolean cotxeEmpresa;
    private boolean tarjetaCreditEmpresa;

    public Directiu(String nom, String cognom, String adreça, boolean cotxeEmpresa, boolean tarjetaCreditEmpresa) {
        super(nom, cognom, adreça);
        this.cotxeEmpresa = cotxeEmpresa;
        this.tarjetaCreditEmpresa = tarjetaCreditEmpresa;
    }

    @Override
    public String display() {
        return "\nNom: " + getNom() + "\nCognom: " + getCognom() + "\nAdreça: " +
                getAdreça() + "\nDisposa de Cotxe de la Empresa: " + cotxeEmpresa +
                "\nDisposa de tarjeta de crèdit a càrrec de l'empresa: " + tarjetaCreditEmpresa;
    }
}
