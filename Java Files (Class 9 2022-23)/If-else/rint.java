class rint{
    public static void main(String arg[]){
        double a = 2.5;
        double b = 1.5;
        // double c = Math.rint(a); // rint method finds closest even integer which is 2
        // double d = Math.rint(b); // rint method finds closest even integer which is 2

        double c = Math.round(a); // round method converts to next integer if .5 or above in decimal
        double d = Math.round(b); // round method converts to next integer if .5 or above in decimal
        System.out.println(c);
        System.out.println(d);
    }
}