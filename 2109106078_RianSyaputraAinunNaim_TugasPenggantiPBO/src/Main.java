/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.io.*;
/**
 *
 * @author Lenovo-Gk
 */


public class Main {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        System.out.println("\n<><><><><><><><><> Input here! <><><><><><><><>\n");
        System.out.println("Masuk ke soal no berapa ?:");
        System.out.println("1. Soal 1");
        System.out.println("2. Soal 2");
        System.out.print("Masukkan pilihan -> "); int pilih = Integer.parseInt(br.readLine());
        System.out.println("\n<><><><><><><><><> Input here! <><><><><><><><>\n");

        switch (pilih){
            case 1:
                clear();    
                Soal_1();
                break;
            case 2:
                clear();  
                Soal_2();
                break;
            default:
                case 0:System.out.println("Inputan Unknown");
                break;
        }
        



    }
    //<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>

    // method no 1

    private static void Soal_1() {
            String String_Awal = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";
            System.out.println("\n<><><><><><><><><><><><><><>< Result! ><><><><><><><><><><><><><><>\n");
            System.out.println("String awal = '" + String_Awal + "'");
            System.out.println("\n[1]. " + kata1(String_Awal));
            System.out.println("\n[2]. " + kata2(String_Awal));
            System.out.println("\n[3]. " + kata3(String_Awal));
            System.out.println("\n[4]. " + kata4(String_Awal));
            System.out.println("\n[5]. " + kata5(String_Awal));
            System.out.println("\n<><><><><><><><><><><><><><>< Result! ><><><><><><><><><><><><><><>\n");

            
    } 

    private static String kata1 (String kata) {
        int lastIndex = kata.indexOf("tingkat") - 1;
        String hasil = kata.substring(0, lastIndex);
        return hasil;
    }

    private static String kata2 (String kata){
        String hasil, modifikasi, toLower;
        int lastIndex = kata.indexOf("tingkat") -1;
        modifikasi = "JavaScript";
        toLower = kata.replace(modifikasi, modifikasi.toLowerCase());
        hasil = toLower.substring(0, lastIndex);
        return hasil;
    }
    
    private static String kata3 (String kata){
        String hasil, toUpper;
        int lastIndex = kata.indexOf("tingkat") -1;
        toUpper = kata.toUpperCase();
        hasil = toUpper.substring(0, lastIndex);
        return hasil;
    }

    private static String kata4 (String kata){
        String hasil;
        String [] temp = kata.split(" ");
        hasil = temp[3];
        return hasil;
    }

    private static StringBuilder kata5 (String kata){
        int banyakKata = 4;
        String[] temp = kata.split(" ");
        StringBuilder hasil = new StringBuilder();
        for(int i = temp.length - banyakKata; i < temp.length; i++) {
            hasil.append(temp[i]);
            if (i < temp.length - 1){
                hasil.append(" ");
            }
        }
        return hasil;
    }
    //<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>

    // method no 2

    private static void Soal_2() throws NumberFormatException, IOException{
            String matkul;
            int kehadiran;
            double uts, uas;
            System.out.println("\n<><><><><><><><><><><> Input here! <><><><><><><><><><><>\n");
            System.out.print("Masukkan nama matkul              -> ");  matkul = br.readLine();
                    
            while(true){
                try{
                    System.out.print("Masukkan jumlah kehadiran (1 - 8) -> ");  kehadiran = Integer.parseInt(br.readLine());
                    
                    if (kehadiran >= 1 && kehadiran <= 8) {
                        break;
                    } else{
                        System.out.println("\nJumlah kehadiran lebih dari 8 atau kurang dari 1!8");
                    }
                }catch(NumberFormatException  e){
                    System.err.println("\nInputan harus Integer!");
                }
            }
            while(true){
                try{
                    System.out.print("Masukkan nilai UTS (0 - 100)      -> ");  uts = Double.parseDouble(br.readLine());
                    
                    if (uts >= 0 && uts <= 100) {
                        break;
                    } else{
                        System.out.println("\nNilai lebih dari 100 atau kurang dari 0!");
                    }
                }catch(NumberFormatException  e){
                    System.err.println("\nInputan harus Integer! ");
                }
            }
            while(true){
                try{
                    System.out.print("Masukkan nilai UAS (0 - 100)      -> ");  uas = Double.parseDouble(br.readLine());
                    
                    if (uas >= 0 && uas <= 100) {
                        break;
                    } else{
                        System.out.println("\nNilai lebih dari 100 atau kurang dari 0!");
                    }
                }catch(NumberFormatException  e){
                    System.err.println("\nInputan harus Integer! ");
                }

            }
            
            double nilai = nilaiAkhir(kehadiran, uas, uts);
            clear();
            System.out.println("\n<><><><><><><><><><><><><><>< Result! ><><><><><><><><><><><><><><>\n");
            if (nilai < 50) {
                System.out.println("Nilai Akhir anda pada mata kuliah, "+ matkul+" adalah = " + nilai + " dengan grade E");
            } else if (nilai >= 50 && nilai <= 59) {
                System.out.println("Nilai Akhir anda pada mata kuliah, "+ matkul+" adalah = " + nilai + " dengan grade D");
            }else if (nilai >= 60 && nilai <= 69) {
                System.out.println("Nilai Akhir anda pada mata kuliah, "+ matkul+" adalah = " + nilai + " dengan grade C");
            }else if (nilai >= 70 && nilai <= 84) {
                System.out.println("Nilai Akhir anda pada mata kuliah, "+ matkul+" adalah = " + nilai + " dengan grade B");
            }else if (nilai >= 85 && nilai <= 100) {
                System.out.println("Nilai Akhir anda pada mata kuliah, "+ matkul+" adalah = " + nilai + " dengan grade A");
            }
            System.out.println("\n<><><><><><><><><><><><><><>< Result! ><><><><><><><><><><><><><><>\n");

    } 

    private static void clear() {
        try{
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }catch(Exception ex){
            System.err.println("Tidak Bisa ClearScreen");
        }
    }
    
    private static double nilaiAkhir(int jumlah_kehadiran, double nilai_uas, double nilai_uts) {
        double hasil = 0;
        if(jumlah_kehadiran < 3){
            hasil = (0 * 0.2) + (nilai_uts * 0.3) + (nilai_uas * 0.5);
        }else if(jumlah_kehadiran >= 3 && jumlah_kehadiran <= 4){
            hasil = (60 * 0.2) + (nilai_uts * 0.3) + (nilai_uas * 0.5);
        }else if(jumlah_kehadiran >= 5 && jumlah_kehadiran <= 6){
            hasil = (80 * 0.2) + (nilai_uts * 0.3) + (nilai_uas * 0.5);
        }else if(jumlah_kehadiran >= 7){
            hasil = (100 * 0.2) + (nilai_uts * 0.3) + (nilai_uas * 0.5);
        }
        return hasil;
    } 
}
//<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>