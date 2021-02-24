package assignment4;

class Question3 {
    public void sortColors(int[] arr) {
        int[] count = new int[3];


        for(int i = 0 ; i < arr.length ; i ++){
            count[arr[i]] ++;
        }

        int index = 0 ;

        for(int i = 0; i < 3; i ++){
            while(count[i] > 0){
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }
}