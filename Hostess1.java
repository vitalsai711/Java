package hostess1;

import java.util.ArrayList;

/**
 *
 * @author vital
 */
public class Hostess1 {

    static Thread thread = new Thread();
    public static void main(String[] args) throws InterruptedException {
        int ctol_1_2 = 7, ctol_2_3 = 7, ctol_3_4 = 7, ctol_4_5 = 7;
        int c1 = 2, c2 = 3, c3 = 4, c4 = 5;
        int s = 0, q = 0;
        int t_z = 3; // интервал захода новых групп людей
        ArrayList<Integer> spicok = new ArrayList<Integer>();
        int gruppa = 0;
        int kol = 0;
        for(int i = 60; i>=0; i--){
            if(i == 0){
                System.out.println("Осталось " + i + " секунд");
                break;
            }
            if(i%10>4 || i%10==0){
                System.out.println("Осталось " + i + " секунд");
            }else if((i%10 <=4) &&(i%10>1)){
                System.out.println("Осталось " + i + " секунды");
            }else if(i%10 == 1){
                System.out.println("Осталось " + i + " секунда");
            }
            if(i == 60) System.out.println("Ресторан открыт");
            if(i == 1) System.out.println("Ресторан закрыт");
            if(spicok.size()!=0){
                s++;
            }
            //приход новых групп и запись в очередь
            if(t_z == 0){ 
                t_z = 3;
                kol = (int) ((Math.random()*((5-1)+1))+1);
                spicok.add(kol);
                System.out.println("Пришла группа состоящая из " + kol + " человек");
            }
            t_z--;
            
            //исщем наибольшую группу 
            //if(p == 1);
            if(spicok.size()>0){
                int k = spicok.get(0);
                for(int j = 0; j<=spicok.size()-1; j++){
                    if(k<spicok.get(j)){
                        k = spicok.indexOf(j);
                    }
                }
                gruppa = k;
            }
            
            if(s==3){
                spicok.remove(0);
                System.out.println("Ушла группа людей в составе " + gruppa + " человек.");
            }
            
            if(ctol_1_2 < 7 && ctol_1_2 >= 0 ) {
                if(ctol_1_2==0) {
                    ctol_1_2 = 8;
                }
                if(ctol_1_2 < 7 && ctol_1_2 >= 0 ) System.out.println("Стол на 2 человек занят");
                ctol_1_2--; 
            }
            if(ctol_2_3 != 7){
                if(ctol_2_3==0) {
                    ctol_2_3 = 8;
                }
                if(ctol_2_3 < 7 && ctol_2_3 >= 0 ) System.out.println("Стол на 3 человек занят");
                ctol_2_3--;
            }
            if(ctol_3_4 != 7){
                if(ctol_3_4==0) {
                    ctol_3_4 = 8;
                }
                if(ctol_3_4 < 7 && ctol_3_4 >= 0 ) System.out.println("Стол на 4 человек занят");
                ctol_3_4--;
            }
            if(ctol_4_5 != 7){
                if(ctol_4_5==0) {
                    ctol_4_5 = 8;
                }
                if(ctol_4_5 < 7 && ctol_4_5 >= 0 ) System.out.println("Стол на 5 человек занят");
                ctol_4_5--;
            }
            
            
            if(ctol_1_2 == 7) {
                System.out.println("Стол на 2 человек свободен");
                if(c1>=gruppa && gruppa>0){
                    System.out.println("Стол на 2 человек занят группой состоящая из " + gruppa + " человек");
                    if(gruppa == 2 || gruppa == 1) {
                        spicok.remove(0);
                        gruppa = 0;
                    }
                    ctol_1_2--;
                }
            }
            if(ctol_2_3 == 7){
                System.out.println("Стол на 3 человек свободен");
                if(c2>=gruppa && gruppa>0){
                    System.out.println("Стол на 3 человек занят группой состоящая из " + gruppa + " человек");
                    if(gruppa == 3 || gruppa==2 || gruppa==1){
                        spicok.remove(0);
                        gruppa = 0;
                    }
                    ctol_2_3--;
                }
            }
            if(ctol_3_4 == 7){
                System.out.println("Стол на 4 человек свободен");
                if(c3>=gruppa && gruppa>0){
                    System.out.println("Стол на 4 человек занят группой состоящая из " + gruppa + " человек");
                    if(gruppa == 4 || gruppa == 3 || gruppa == 2 || gruppa == 1){
                        spicok.remove(0);
                        gruppa = 0;
                    }
                    ctol_3_4--;
                }
            }
            if(ctol_4_5 == 7){
                System.out.println("Стол на 5 человек свободен");
                if(c4>=gruppa && gruppa>0){
                    System.out.println("Стол на 5 человек занят группой состоящая из " + gruppa + " человек");
                    if(gruppa == 5 || gruppa == 4 || gruppa == 3 || gruppa == 2 || gruppa == 1){
                        spicok.remove(0);
                        gruppa = 0;
                    }
                    ctol_4_5--;
                }
            }
            thread.sleep(1000);
        }
        
    }
    
}
