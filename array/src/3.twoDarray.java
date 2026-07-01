class twoDarray {
    static void main(String[] args) {
        System.out.println("WELECOME TO 2D ARRAY: ");
        int[][] myarr = new int[3][3];
        myarr[0][0]=1;
        myarr[0][1]=2;
        myarr[0][2]=3;
        myarr[1][0]=4;
        myarr[1][1]=5;
        myarr[1][2]=6;
        myarr[2][0]=7;
        myarr[2][1]=8;
        myarr[2][2]=9;
        int i=0;
        while(i<myarr.length)
        {int j=0;
            while(j<myarr[i].length)
            {
                System.out.print(myarr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        int[][] arr = {{11,22,44},{33,55,66},{34,56,78},{12,34,58}};
        for(int k=0;k<arr.length;k++)
        {
            for(int l=0;l<arr[k].length;l++)
            {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }

    }
}
