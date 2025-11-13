

public class TimeCalc {
    public static void main(String[] args) {

 String time = args[0];
 int n = Integer.parseInt(args[1]);
 char h1 = time.charAt(0);
 char h2 = time.charAt(1);
 String hoursString = ("" + h1 + h2);
 int hours = Integer.parseInt(hoursString);
 char m1 = time.charAt(3);
 char m2 = time.charAt(4);
 String minutesString = ("" + m1 + m2);
 int minutes = Integer.parseInt(minutesString);
 int n_hours = n / 60;
 int n_minutes = n % 60;
 int new_hours = (n_hours + hours);
 if (new_hours >= 24 ) {
 new_hours = (new_hours % 24 );
 }
 int carry = 0;
 int new_min = (n_minutes + minutes);
 if (new_min >=60){
    carry = (new_min / 60);
    new_min  = (new_min % 60);
 }
 new_hours = (new_hours + carry) %24; 

 
 
System.out.printf("%02d:%02d\n", new_hours, new_min);
 }
 
    
 
    
 }


 

 

 


    

