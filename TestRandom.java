public class TestRandom {
    public static void main(String[] args){
        int n_times = Integer.parseInt(args[0]); 
        int greater = 0;
        int smaller =0;

        for(int i =0; i < n_times; i++){
            double n_random = Math.random();
            if (n_random > 0.5){
                greater++;
            }
            else  {
                smaller++; 
            }
             }
            
            if(smaller == 0){
                System.out.println(">0.5:  "+ greater + " times");
                System.out.println("<= 0.5: "+ smaller + " times");
                
            }
            else{
            double ratio = (double) greater/smaller;
            System.out.println("> 0.5:  "+ greater + " times");
            System.out.println("<= 0.5: "+ smaller + " times");
            System.out.println("Ratio:  " + ratio);
            }
            }
        

        
    
    

    }
    

