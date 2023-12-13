public class Ex4c {
    public static void main(String[] args) {
       int nLanc=300; 
       int[] dado = new int[13];
       for(int i=0; i<nLanc; i++){
           int d1= (int)(Math.random()*6)+1;
           int d2= (int)(Math.random()*6)+1;
           dado[d1+d2]++;
       }
       for(int i=2; i<=12; i++){
           System.out.print(""+i+": ");
           for(int j=0; j<dado[i]; j++)
               System.out.print("x");
           System.out.println(" ("+dado[i]+")");
       }
    }    
}