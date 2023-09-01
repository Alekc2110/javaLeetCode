package com.java.task.practice;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {10, 3, 15, 8, 25, 1, 0, 55, 89, 11, 3, 155, -1, 1050, 3000};
//        int[] arr1 = {1, 5, 8, 10, 15, 18, 19, 25, 35};
        int[] arr1 = {1, 1, 8, 10, 8, 10, 55, 35, 25, 35, 25};
//        System.out.println(findUniqueElementInArray(arr1));
//        reversOrderArray(arr1);

//        Arrays.stream(arr1).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        mergeSortArray(arr);
//        System.out.println(Arrays.toString(arr));

//        Singleton instance = Singleton.getInstance();
//        Singleton instance1 = Singleton.getInstance();
//        Singleton instance2 = Singleton.getInstance();
//        Singleton instance3 = Singleton.getInstance();
//        String s = "cabcabb";
//        String num = "155";
//        System.out.println(Character.getNumericValue('b'));
//        System.out.println(s.indexOf(97, 2));
//        StringBuilder stringBuilder = new StringBuilder(s);
//        int c = stringBuilder.charAt(0);
//        System.out.println(c);

        Client c1 = new Client();
        c1.setName("John");
        c1.setEmail(Optional.of("dsa@gmail.com"));

        Client c2 = new Client();
        c2.setName("Anna");
        c2.setEmail(Optional.of("  "));

        Ticket t1 = new Ticket();
        t1.setDate(LocalDate.now());
        t1.setPrice(550.00);
        t1.setDestination("Paris");
        t1.setClient(c1);

        Ticket t2 = new Ticket();
        t2.setDate(LocalDate.now().plusDays(10));
        t2.setPrice(700.00);
        t2.setDestination("Kiev");
        t2.setClient(c1);

        Ticket t3 = new Ticket();
        t3.setDate(LocalDate.now().plusDays(20));
        t3.setPrice(330.00);
        t3.setDestination("NewYork");
        t3.setClient(c2);

        List<Ticket> tickets = List.of(t1, t2, t3);

        printTicketByDate(LocalDate.now(), tickets);
        System.out.println(checkPresenceOfTicketForClient(c1, tickets));
        System.out.println(getAveragePrice(tickets).getAsDouble());
        System.out.println(checkIfAllClientHaveEmail(tickets));
        returnAllDestinations(tickets).ifPresent(System.out::print);

    }

    private static void printTicketByDate(LocalDate date, List<Ticket> tickets) {
        tickets.stream().filter(t -> t.getDate().equals(date)).forEach(System.out::println);

    }

    private static boolean checkPresenceOfTicketForClient(Client c, List<Ticket> tickets) {
        return tickets.stream().anyMatch(t -> t.getClient().equals(c));

    }

    private static OptionalDouble getAveragePrice(List<Ticket> tickets) {
        return tickets.stream().mapToDouble(t-> t.getPrice()).average();
    }

    private static boolean checkIfAllClientHaveEmail(List<Ticket> tickets) {
        return tickets.stream().allMatch(t-> {
            Optional<String> email = t.getClient().getEmail();
            if(email.isPresent()){
                String str = email.get();
                return !str.isBlank();
            }
            return false;
        });
    }

    private static Optional<String> returnAllDestinations(List<Ticket> tickets) {
//        return tickets.stream().map(Ticket::getDestination).reduce((s1, s2)-> s1 + "," + s2);
        return Optional.of(tickets.stream().map(Ticket::getDestination).collect(Collectors.joining(",")));
    }


    public static int findUniqueElementInArray(int[] arr) {
        int result = 0;
        for (int j : arr) {
            result ^= j;
        }
        return result;
    }

    static <T extends String> void show(T t) {
        System.out.println(t.isEmpty());
    }

    static void reversOrderArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    static void selectionSort(int[] arr) {
//        int countInnerLoop = 0;
//        int countOutLoop = 0;
        for (int i = 1; i < arr.length; i++) {
//            countOutLoop++;
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
//                countInnerLoop++;
                swap(arr, j - 1, j);

            }
        }
//        System.out.println("countOutLoop " + countOutLoop);
//        System.out.println("countInnerLoop " + countInnerLoop);
    }

    static void bubbleSort(int[] arr) {
//        int countInnerLoop = 0;
//        int countOutLoop = 0;
        for (int i = 0; i < arr.length; i++) {
//            countOutLoop++;
            for (int j = 0; j < arr.length - 1 - i; j++) {
//                countInnerLoop++;
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
//        System.out.println("countOutLoop " + countOutLoop);
//        System.out.println("countInnerLoop " + countInnerLoop);
    }

    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);

    }

    private static void quickSort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return;
        }
        int pivot = arr[rightIndex];

//        int pivotIndex = new Random().nextInt(rightIndex-leftIndex) + leftIndex;
//        swap(arr, pivotIndex,rightIndex);
//        int pivot = arr[rightIndex];

        int leftPointer = partitionArray(arr, pivot, leftIndex, rightIndex);

        quickSort(arr, leftIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, rightIndex);


    }

    private static int partitionArray(int[] arr, int pivot, int lowIndex, int highIndex) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);

        return leftPointer;
    }

    private static void swap(int[] arr, int index, int index2) {
        int temp = arr[index];
        arr[index] = arr[index2];
        arr[index2] = temp;
    }

    public static void mergeSortArray(int[] arr) {
        int inputArrLength = arr.length;

        if (inputArrLength < 2) {
            return;
        }

        int middleIndex = inputArrLength / 2;

        int[] leftArr = new int[middleIndex];
        int[] rightArr = new int[inputArrLength - middleIndex];

//        for (int i = 0; i < middleIndex; i++) {
//            leftArr[i] = arr[i];
//        }
        System.arraycopy(arr, 0, leftArr, 0, middleIndex);

//        for (int i = middleIndex; i < inputArrLength; i++) {
//            rightArr[i - middleIndex] = arr[i];
//        }
        System.arraycopy(arr, middleIndex, rightArr, 0, inputArrLength - middleIndex);

        mergeSortArray(leftArr);
        mergeSortArray(rightArr);

        mergeArr(arr, leftArr, rightArr);

    }

    private static void mergeArr(int[] arr, int[] leftArr, int[] rightArr) {
        int leftArrLength = leftArr.length;
        int rightArrLength = rightArr.length;
        //pointers of 3 array
        int i = 0, j = 0, k = 0;

        while (i < leftArrLength && j < rightArrLength) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

//        while (i<leftArrLength){
//            arr[k] = leftArr[i];
//            k++;
//            i++;
//        }
        if (i < leftArrLength) {
            System.arraycopy(leftArr, i, arr, k, leftArrLength - i);
        }

//        while (j < rightArrLength) {
//            arr[k] = rightArr[j];
//            k++;
//            j++;
//        }
        if (j < rightArrLength) {
            System.arraycopy(rightArr, j, arr, k, rightArrLength - j);
        }
    }
}
