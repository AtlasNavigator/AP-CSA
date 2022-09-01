public class Practice2{
    public static void loops () {
        for (int i = 0; i <= 1000; i++){
            System.out.println(i);
        }
    }
    /*
     * 1 1 1 1 1 
     * 2 2 2 2 2 
     * 3 3 3 3 3 
     * 4 4 4 4 4
     */
    public static void nestedForLoops (){
        for (int i = 1; i < 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    /*
     * 5 5 5 5 5 5 
     * 4 4 4 4 4 4 
     * 3 3 3 3 3 3 
     * 2 2 2 2 2 2 
     * 1 1 1 1 1 1 
     */
    public static void nestedForLoops2 () {
        for (int i = 5; i > 0; i--){
            for (int j = 5; j >= 0; j--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
    /*
     * 5 5 5 5 5 
     * 4 4 4 4 
     * 3 3 3 
     * 2 2 
     * 1 
     */
    public static void nestedForLoops3 () {
        for (int i = 5; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
    public static void nestedForLoops4(){
        
    }
    
    /*
     * 5 
     * 4 4 
     * 3 3 3 
     * 2 2 2 2 
     * 1 1 1 1 1 
     */
    public static void nestedForLoops5 () {
        for (int i = 5; i >= 1 ; i--){
            for (int j = 5; j >= i; j--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

