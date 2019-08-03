package data;

public class ClassCKInfo {
    private String name;
    private String belongingPackage;
    private int loc;
    private int rfc;
    private int nom;
    private int wmc;

    public ClassCKInfo(String name, String belongingPackage, int loc, int rfc, int nom, int wmc) {
        this.name = name;
        this.belongingPackage = belongingPackage;
        this.loc = loc;
        this.rfc = rfc;
        this.nom = nom;
        this.wmc = wmc;
    }

    public ClassCKInfo(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBelongingPackage() {
        return belongingPackage;
    }

    public void setBelongingPackage(String belongingPackage) {
        this.belongingPackage = belongingPackage;
    }

    public int getLoc() {
        return loc;
    }

    public void setLoc(int loc) {
        this.loc = loc;
    }

    public int getRfc() {
        return rfc;
    }

    public void setRfc(int rfc) {
        this.rfc = rfc;
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    public int getWmc() {
        return wmc;
    }

    public void setWmc(int wmc) {
        this.wmc = wmc;
    }
}
