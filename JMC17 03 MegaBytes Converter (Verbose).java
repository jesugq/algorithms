public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    
        String formattedConversion = "Invalid Value";
        int unconvertedKiloBytes = kiloBytes;
        int megaBytes;
        
        if (unconvertedKiloBytes >= 0) {
            megaBytes = unconvertedKiloBytes / 1024;
            kiloBytes = unconvertedKiloBytes % 1024;
            formattedConversion = unconvertedKiloBytes + " KB = " + megaBytes + " MB and " + kiloBytes + " KB";
        }
        
        System.out.println(formattedConversion);
    }
}
