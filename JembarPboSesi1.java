//Nama : Muhamad Jembar Fadillah
//Kelas : TI21F
//NIM : 20210040149

import javax.swing.JOptionPane;

//no. 1
public class JembarPboSesi1 {
    public static void main(String[]args){
        System.out.println("Belajar JAVA");
        System.out.println("sangat mudah sekali");
        System.out.println("dan sangat menyenangkan");
    
//no. 2
    String input = JOptionPane.showInputDialog("Matkul apa yang anda pelajari?");
    JOptionPane.showMessageDialog(null, "Belajar" + input + "sangat mudah");
    }
}