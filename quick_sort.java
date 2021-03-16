package data_structure_algo;

public class quick_sort {
    public static void main(String[] args) {
        int i;
        int[] arr={90,23,101,45,65,23,67,89,34,23};
        double start = System.nanoTime();
        quickSort(arr, 0, 9);
        double end = System.nanoTime();
        double elapsedTime = end - start;
        System.out.println("Time taken by quick sort "+elapsedTime);



        double start1 = System.nanoTime();
        insertionSort(arr);
        double end1 = System.nanoTime();
        double elapsedTime1 = end1- start1;
        System.out.println("Time taken by insertion sort "+elapsedTime1);


    }


    public static int partition(int a[], int beg, int end)
    {

        int left, right, temp, loc, flag;
        loc = left = beg;
        right = end;
        flag = 0;
        while(flag != 1)
        {
            while((a[loc] <= a[right]) && (loc!=right))
                right--;
            if(loc==right)
                flag =1;
            else if(a[loc]>a[right])
            {
                temp = a[loc];
                a[loc] = a[right];
                a[right] = temp;
                loc = right;
            }
            if(flag!=1)
            {
                while((a[loc] >= a[left]) && (loc!=left))
                    left++;
                if(loc==left)
                    flag =1;
                else if(a[loc] <a[left])
                {
                    temp = a[loc];
                    a[loc] = a[left];
                    a[left] = temp;
                    loc = left;
                }
            }
        }
        return loc;
    }
    static void quickSort(int a[], int beg, int end)
    {

        int loc;
        if(beg<end)
        {
            loc = partition(a, beg, end);
            quickSort(a, beg, loc-1);
            quickSort(a, loc+1, end);
        }
    }
    static void insertionSort(int array[])
    {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
}

