public class cuieller extends ustensile{
    private double longeur;
    public cuieller(int annefabri,double longeur){
        super(annefabri);
        this.longeur=longeur;
    }
    public double calculevaleur(){
        int anne=2024-getAnnefabri();
        if(anne>50){
            return anne-50;
        }
        else {
            return 0;
        }
    }
}
