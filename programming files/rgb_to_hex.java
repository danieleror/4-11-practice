
public class rgb_to_hex {
    
    public static void main(String[] args) {
        //initialize the r g and b variables
        int r = 255;
        int g = 127;
        int b = 0;
        //ititalize hexColor with function rgbToHex
        String hexColor = rgbToHex(r, g, b);
        //print the r g b values and the new hexColor
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }
    
    //change rgb to hex function
    public static String rgbToHex(int r, int g, int b) {
        //using the r g b given values find new values in hex
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
        //return it to the main function
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


