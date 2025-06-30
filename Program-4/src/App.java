public class App {
    public static void main(String[] args) throws Exception {
        int arr1[] = {1,2,8,9,12,46,76,82,15,20,30};

        for (int i=1;i<=9;i++) {
            int count = 0;
            for(int j=0; j<=arr1.length-1; j++) {
                if(arr1[j]%i == 0) {
                    count ++;
                }
            }
            System.out.println(i +": " +count);
        }
    }
}
