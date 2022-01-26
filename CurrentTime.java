public class CurrentTime {
    public static void main(String[] args) {   
        Long currentTime = System.currentTimeMillis() ;
        currentTime /= 1000;
        Long second = currentTime%60;
        currentTime /= 60;
        Long min = currentTime%60;
        currentTime /= 60;       
        Long hour = currentTime%24;   
        System.out.print("Current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(min);
        System.out.print(":");
        System.out.print(second);
        System.out.print(" GMT");
    }
}
