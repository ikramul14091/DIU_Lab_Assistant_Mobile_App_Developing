
package project;


public class StudentReportCard {
   

    int arr[] = new int[100];
    String name[] = new String[100];
    int i, j;

    void SortstudentResult(int[] arr, String[] name) {
        int n = arr.length;
        int temp = 0;
        String temp1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (name[j].compareTo(name[i]) > 0) {
                    temp1 = name[j];
                    name[j] = name[i];
                    name[i] = temp1;
                }
            }
        }
    }
    //Display ReportCard

    void displayresult(int[] arr, String[] name) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + " " + arr[i]);
        }
    }
    //Search

    void Search(int[] arr,  int key,int first,int last) {
        //int n = arr.length;

        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Report Card Found");
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }

    }
    //Delete

    int [] deleteitem(int[] arr, int index) {

        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }


        int[] anotherArray = new int[arr.length - 1];


        for (int i = 0, k = 0; i < arr.length; i++) {


            if (i == index) {
                continue;
            }


            anotherArray[k++] = arr[i];
        }


        return anotherArray;
    }
    }