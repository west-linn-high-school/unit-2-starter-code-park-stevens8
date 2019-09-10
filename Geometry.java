public class Geometry
{
    public static void main (String[] args) {
        int sides = 7;
        int radius = 5;
        final double PI = 3.14;
        double c;
        int a = 40;
        int b = 6;
        double y = 6.0;
        double z;
        
        z = (double) a/b;
        System.out.println("z = " + z); 
        System.out.println("A heptagon has " + sides + " sides.");
        System.out.println("A decagon has " + (radius + 5) + " sides");
        System.out.println("A dodecagon has " + (sides + radius) + " sides");
        System.out.println("The circumference of a circle with a radius");
        System.out.print("of " + radius + " is " + 2*PI*radius);
        
        
    }
}    

    
