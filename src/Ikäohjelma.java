public class Ikäohjelma {
    public static void main(String[] args) {
        int age = 100;

        if (age >= 0 && age < 18) {
            System.out.println("Olet alaikäinen.");
            
            if (age >= 15 && age <= 17) {
                System.out.println("Voit ajaa mopoa!");
                
                if (age >= 16 && age <= 17) {
                    System.out.println("Voit ajaa kevaria.");
                }
            }
        } else if (age == 18) {
            System.out.println("Olet täysi-ikäinen ja saat ajaa autoa");
        } else if (age == 100) {
            System.out.println("***********************");
            System.out.println("*Onnea 100-Vuotiaalle!*");
            System.out.println("***********************");
        }else if (age >= 20 && age % 10 == 0) {
            System.out.println("Olet aikuinen ja on vuosikymmenpäiväsi! Onnea!");
        }  else if (age > 58 && age < 65) {
            System.out.println("Voit jäädä varhaiseläkkeelle!");
        } else if (age == 65) {
            System.out.println("Hyvää eläkettä!");
        } else if (age >= 40 && age <= 50) {
            System.out.println("Parasta keski-ikää!");
        } else {
            System.out.println("Olet aikuinen.");
        }
        
    }
    
}
