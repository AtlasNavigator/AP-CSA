public class Practice2{
    public static void loops () {
        for (int i = 0; i <= 1000; i++){
            System.out.println(i);
        }
    }

    public static void nestedForLoops (){
        for (int i = 1; i < 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

