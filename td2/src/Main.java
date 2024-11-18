public class Main {
    public static void main(String[] args) {
        ustensile[]us=new ustensile[5];
        us[0]=new assietteronde(1930,8.4);
        us[1]=new assietteronde(1940,7.3);
        us[2]=new assietteronde(1936,5.5);
        us[3]=new assietteronde(1917,8.5);
        us[4]=new assietteronde(1870,5.4);
    }
    static void affichercuieller(ustensile[]us){
        int nbcuiller=0;
        for(int i=0;i< us.length;i++){
            if(us[i] instanceof assiette){
                nbcuiller++;
            }
        }
        System.out.println("il ya"+nbcuiller+"cuieller");
    }
    static void affichesurfaceassiette(ustensile[]us){
        double som=0;
        for(int i=0;i< us.length;i++){
            if(us[i] instanceof assiette){
                som=som+((assiette)us[i]).calculesurface();
            }
        }
        System.out.println("surface totale des assiettes"+som);
    }
    static void affichervaleurtotale(ustensile[]us){
        double som=0;
        for (int i=0;i< us.length;i++){
            som=som+us[i].calculevaleur();
        }
        System.out.println("la valeur totale est"+som);
    }
}