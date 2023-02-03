import java.util.Random;


public class TahtiNelio {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        int[] p = {2,4,6,3};
        for (int pa : p) {
            System.out.println("Testataan parametrilla " + pa);
            StringBuilder nelio = nelio(pa);
            
            if (nelio.charAt(nelio.length() -1) == '\n') {
                nelio.deleteCharAt(nelio.length() -1);
            }
            System.out.println(nelio);
            System.out.println("");
        }
    }
    
    public static StringBuilder nelio(int sivunPituus){
        StringBuilder tahdet = new StringBuilder();
        int j = 0;
        for(int i = 0; i < sivunPituus; i++){
            tahdet = tahdet.append("*");

        }

        return tahdet;
    }


}
