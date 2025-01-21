import java.awt.Color;
public class onethree {
    public static void main(String[] args) {
        int red= 193;
        int green= 255;
        int blue= 183;
     

        float[] hsbVal = Color.RGBtoHSB(red,green,blue,null);


        float hue = hsbVal[0]*360;
        float saturation = hsbVal[1]*100;
        float brightness = hsbVal[2]*100;

        System.out.println("Hue "+ hue +"°");
        System.out.println("Saturation: " + saturation + "%");
        System.out.println("Brightness: " + brightness + "%");

    }
}

class ColourChecking{
    // public static void main(String[] args) {
    //     int red= 193;
    //     int green= 255;
    //     int blue= 183;
     

    //     float[] hsbVal = Color.RGBtoHSB(red,green,blue,null);


    //     float hue = hsbVal[0]*360;
    //     float saturation = hsbVal[1]*100;
    //     float brightness = hsbVal[2]*100;

    //     System.out.println("Hue "+ hue+"°");
    //     System.out.println("Saturation: " + saturation + "%");
    //     System.out.println("Brightness: " + brightness + "%");

    }

// }