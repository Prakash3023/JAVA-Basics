public class intofound {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 34, 7 };
        // boolean found=false;
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == 3) {
                System.out.println("key element found at " + (i));
                // found=true;
                //break;
            }
            //if(!found)
            else{
                System.out.println("element not foound");
            }
        }
       
    }
}
