package src.megabytes_converter;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else if (kiloBytes == 0) {
            System.out.println("0 KB = 0 MB and 0 KB");
        } else {
            int convertedMegaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + convertedMegaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
