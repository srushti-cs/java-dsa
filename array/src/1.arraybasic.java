import java.util.Scanner;

class arraybasic {
    static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        int[] myarr= new int[5];
        myarr[0]=11;
        myarr[1]=22;
        myarr[2]=33;
        myarr[3]=44;
        myarr[4]=55;
        //myarr[5]==6;
        System.out.println("ARRAY TYPE 1: ");
        System.out.println(myarr[0]);
        System.out.println(myarr[1]);
        System.out.println(myarr[2]);
        System.out.println(myarr[3]);
        System.out.println(myarr[4]);
        System.out.println();

        int[] secarr = {10,20,30,40,50};
        System.out.println("ARRAY TYPE 2:");
        System.out.println(myarr[0]);
        System.out.println(myarr[1]);
        System.out.println(myarr[2]);
        System.out.println(myarr[3]);
        System.out.println(myarr[4]);

        Scanner input = new Scanner(System.in);
        System.out.println("ARRAY TYPE 3: ");
        System.out.println("ENTER THE SIZE OF ARRAY: ");
        int size = input.nextInt();
        int[] thirdarr = new int[size];
//        System.out.println("ARRAY TYPE 3: ");
//        System.out.println("ENTER THE SIZE OF ARRAY: ");

        for(int i=0;i<=size;i++)
        {
            System.out.println("enter the number you want to insert in index position" + "=" + i);
            int index=input.nextInt();
            System.out.println(index);
//            System.out.println(thidarr[i]);
        }
        System.out.println(thirdarr[0]);



    }
}
