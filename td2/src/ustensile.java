abstract class ustensile {
    private int annefabri;
    public ustensile(int annefabri){
        this.annefabri=annefabri;
    }
    public int getAnnefabri(){
        return annefabri;
    }
    public abstract double calculevaleur();
}

