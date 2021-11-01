public class Array {
    public static void main(String[] args) {
        int[][] Student = {
                {4,43,1,0},
                {4,2,1,13},
                {4,4,6,7},
                {3,57,1,6}
        };
        for(int i=0; i<=3;i++){
            int total = 0;
            for(int j=0; j<=3; j++)
                total = total + Student[i][j];
            {

                System.out.println(total);
            }

        }
    }
}
