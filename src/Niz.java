public class Niz {
    public static void main(String[] args) {


//       int a[] = new int[3];
//        mogu uglaste i pre a int [] a =....
//        a[0] = 10;
//        a[1] = 15;
//        a[2] = 20;
//        a[3] = 50; //runtime*/

 //       for (int i = 0; i < a.length; i++) {
   //         System.out.println(a[i]);
    //     }


        String [] mojNiz = {"Pera", "Zika", "Laza"};
        mojNiz[0] = "Marko";
        mojNiz[1] = "DJOLE";
        mojNiz[2] = "Djoerjde";

        for (String s:mojNiz) {//has next
            System.out.println(s);
        }

        int a[] = new int[3];
        //mogu uglaste i pre a int [] a =....
        a[0] = 10;
        a[1] = 15;
        a[2] = 20;

        for (int p: a){
            System.out.println(p);
        }


        int [] niz1d = {1, 5, 4};

        int [][] niz2d = new int[][] {
                {1,2,8},
                {3,4,10},
                {5,6,15}
        };

        for (int []z: niz2d) {
            for (int r : z) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
        //ovde mozemo imati jos [] - visedimenzionalni niz





    }
}
