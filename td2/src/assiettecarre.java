public class assiettecarre extends assiette{
    private double cote;
    public assiettecarre(int annefabri,double cote){
        super(annefabri);
        this.cote=cote;
    }
    @Override
    public double calculesurface(){
        return cote*cote;
    }
    public double calculevaleur(){
     int anne=2024-getAnnefabri();
     if(anne>50){
         return 5*(anne-50);
     }
     else {
         return 0;
     }
    }
}
