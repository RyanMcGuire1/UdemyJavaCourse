package MegaBytesConverter;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobytes){
        if(kilobytes < 0){
            System.out.println("Invalid Value");
        }else{
            long megaBytes = kilobytes / 1024;
            long remainderKilobytes = kilobytes % 1024;
            System.out.println(kilobytes + " KB = " + megaBytes + " MB and " + remainderKilobytes + " KB");
        }
    }
}
