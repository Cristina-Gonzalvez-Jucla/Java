package models;

public class Habilitat {
    private String nomHabilitat;
    private String level;

    public Habilitat(String nomHabilitat, String level) {
        this.nomHabilitat = nomHabilitat;
        this.level = level;
    }

    protected String getName() {
        return this.nomHabilitat;
    }

    protected String getLevel() {
        return this.level;
    }
}
