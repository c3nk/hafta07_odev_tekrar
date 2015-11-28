
package hafta07_odev_tekrar;

import javax.swing.JOptionPane;

public class Hafta07_Odev_Tekrar {

    public static void main(String[] args) {
    
        int[] seri = new int[2];
        
        for (int i = 0; seri.length > i; i++){
            
             int sayi = Integer.parseInt(JOptionPane.showInputDialog(i + ". sayıyı giriniz!"));
             
             seri[i] = sayi;
             
             System.out.println("Dizideki sırası: " + i + " Dizideki değeri: " + seri[i]);

        }
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Dörtgenin kısa kenarını girin!"));
        
        int b = Integer.parseInt(JOptionPane.showInputDialog("Dörtgenin uzun kenarını! girin"));
        
        int cevre = cevreHesaplama(a,b);
        
        int alan = alanHesaplama(a,b);
        
        System.out.println("Dörtgenin çevresi: " + cevre);
        
        System.out.println("Dörtgenin alanı: " + alan);

    }
    
    public static int cevreHesaplama(int a, int b){
        
        return (a + b) * 2;
        
    }
    
    public static int alanHesaplama(int a, int b){
        
        return a*b;
        
    }
            
    
}
