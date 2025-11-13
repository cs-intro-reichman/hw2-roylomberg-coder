public class Collatz {
    public static void main(String[] args){
int n = Integer.parseInt(args[0]);
String mode = args[1];
int count = 0;
int z=1;

if (mode.equals("v")){
   for(int i=1; i <= n; i++){
       z=i;
       System.out.print(z);
        do {
            if ((z % 2)==0){
                  z = z/2;
    }
               else{
                   z = (z * 3) +1;
    }
    System.out.print(" " +z);

    count++;
            

        }
        while(z != 1);
         
      
 System.out.print(" (" +(count + 1)+ ")");
 System.out.println();
 count =0;
}


}
else if (mode.equals("c")) {
    for (int i = 1; i <= n; i++) {
        z = i;
        
        while (z != 1) {
            if ((z % 2) == 0) {
                z = z / 2;
            } else {
                z = (z * 3) + 1;
            }
        }
    }
}

System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");


}   
}
