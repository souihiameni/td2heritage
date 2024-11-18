public class assietteronde extends assiette{
    private double rayon;
    public assietteronde(int annefabri,double rayon){
        super(annefabri);
        this.rayon=rayon;
    }
    @Override
    public double calculesurface(){
        return 3.14*rayon*rayon;
    }
    @Override
    public double calculevaleur(){
        int age=2024-getAnnefabri();
        return age > 50 ? age-50:0;
    }
}

