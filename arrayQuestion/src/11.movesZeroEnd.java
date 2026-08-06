import java.util.Arrays;

class movesZeroEnd {
    static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int index =0;
        //pehle loop me hum check karte hain non-zero hai ki nahi if nonzero hai then usko copy karte hai aur index aage badate hai
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[index]=arr[i];
                index++;
            }
        }
        //second loop remaining elements ko zero kar dete hai index ki usi value se jaha loop khatam hua yani non zero elements khatham hue
        while(index<arr.length)
        {
            arr[index]=0;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
