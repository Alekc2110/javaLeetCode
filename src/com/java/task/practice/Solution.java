package com.java.task.practice;

import java.lang.constant.ClassDesc;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.right = right;
            this.left = left;
        }
    }


    public static void main(String[] args) {
        int[] arr = {10, 3, 15, 8, 25, 1, 0, 55, 89, 11, 3, 155, -1, 1050, 3000};
//        int[] arr = {1, 5, 8, 10, 15, 18, 19, 25, 35};
//        int[] arr1 = {1, 1, 8, 10, 8, 10, 55, 35, 25, 35, 25};
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

//        Client c1 = new Client();
//        c1.setName("John");
//        c1.setEmail(Optional.of("dsa@gmail.com"));
//
//        Client c2 = new Client();
//        c2.setName("Anna");
//        c2.setEmail(Optional.of("  "));
//
//        Ticket t1 = new Ticket();
//        t1.setDate(LocalDate.now());
//        t1.setPrice(550.00);
//        t1.setDestination("Paris");
//        t1.setClient(c1);
//
//        Ticket t2 = new Ticket();
//        t2.setDate(LocalDate.now().plusDays(10));
//        t2.setPrice(700.00);
//        t2.setDestination("Kiev");
//        t2.setClient(c1);
//
//        Ticket t3 = new Ticket();
//        t3.setDate(LocalDate.now().plusDays(20));
//        t3.setPrice(330.00);
//        t3.setDestination("NewYork");
//        t3.setClient(c2);
//
//        List<Ticket> tickets = List.of(t1, t2, t3);

//        System.out.println(reverseAllWordsInSentence2("Is there anybody going to listen to my story."));
//        System.out.println(reverseSentence("Is there anybody going to listen to my story"));
//        System.out.println(reverseSentence2("a good   example"));

        // Пример кодирования строки в Base64
//        String originalString = "Hello, Base64!";
//        byte[] encode = Base64.getEncoder().encode(originalString.getBytes());
//        System.out.println("Encoded String: " + Arrays.toString(encode));

        // Пример декодирования строки из Base64
//        byte[] decodedBytes = Base64.getDecoder().decode(encode);
//        String decodedString = new String(decodedBytes);
//        System.out.println("Decoded String: " + decodedString);

//        String[] str = convert(String.class, List.of("Val1", "Val2", "Val3"));
//        System.out.println(Arrays.asList(str));
//        int[] arr = new int[]{1, 2, 3, 3, 10, 3, 1, 15, 1, 5, 11, 50, 80, 11};
//        int[] arr = new int[]{100};
//        System.out.println(majorityElement(arr));

//        String input = "a-beautiful_rose";
//        String input1 = "a-beautiful_ros-e";
//        String input2 = "a-beautiful_rose_";
//        System.out.println(toCamelCase2(input));

//        Client one = Client.builder().name("One").address("One -address").build();
//        Client one1 = Client.builder().name("One").address("One -address").build();
//        Client two = Client.builder().name("Two").address("Two -address").build();
//        Client three = Client.builder().name("Three").address("Three -address").build();
//
//        HashMap<Client, String> map = new HashMap<>(Map.of(one, "ONE", two, "TWO"));
//
//        System.out.println(map);
//
//        System.out.println(map.get(one1));
////        System.out.println(map.get(two));
//
//        map.put(three, "THREE");
//
//        System.out.println(map.get(three));
//
//        System.out.println(map.entrySet());

//        int[] arr = {1, 6, 6, 7, 8, 10, -255, -1, -10, 25, -500};
//         String[]arr = {"aaa", "bbbb", "ehdhdh"};
//        System.out.println(findMin(arr));


    }

    public static <T extends Comparable<T>> T findMin(T[] arr) {
        T min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min.compareTo(arr[i]) > 0)
                min = arr[i];
        }
        return min;
    }

    public static <T> T findMin(T[] arr, Comparator<T> comparator) {
        T min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (comparator.compare(min, arr[i]) > 0)
                min = arr[i];
        }
        return min;
    }


    public static String toCamelCase(String string) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '-' || string.charAt(i) == '_') {
                if (i == string.length() - 1) {
                    break;
                } else {
                    builder.append(Character.toUpperCase(string.charAt(i + 1)));
                    i++;
                }
            } else {
                builder.append(string.charAt(i));
            }

        }
        return builder.toString();
    }

    public static String toCamelCase2(String string) {
        String[] split = string.split("[-_]");

        return Arrays.stream(split, 1, split.length)
                .map(str -> str.replace(str.charAt(0), Character.toUpperCase(str.charAt(0))))
                .reduce(split[0], String::concat);
    }


    public static int majorityElement(final int[] A) {
        Arrays.sort(A);
        return A[A.length / 2];
    }


    @SuppressWarnings("unchecked")
    public static <T> T[] convert(Class<T> clazz, List<T> values) {


        T[] ts = (T[]) Array.newInstance(clazz, values.size());
        for (int i = 0; i < values.size(); i++) {
            ts[i] = values.get(i);
        }
        return ts;
    }


    public static String reverseSentence(String s) {
        StringBuilder builder = new StringBuilder();
        String[] strings = s.trim().split("\s+");
        for (int i = strings.length - 1; i >= 0; i--) {

            builder.append(strings[i]).append(" ");
        }
        return builder.toString();
    }

    public static String reverseSentence2(String s) {

        String[] s1 = s.split(" +");
        ArrayList<String> strings = new ArrayList<>(List.of(s1));
        Collections.reverse(strings);


        Collector<String, StringBuilder, StringBuilder> coll = Collector.of(
                StringBuilder::new,
                (st, str) -> st.append(str).append(" "),
                StringBuilder::append
        );
        return strings.stream().collect(coll).toString();

    }

    public static String reverseSentence3(String s) {
        StringBuilder builder = new StringBuilder();
        String[] s1 = s.split(" +");
        Stream.of(s1).collect(Collectors.toCollection(LinkedList::new))
                .descendingIterator()
                .forEachRemaining(str -> builder.append(str).append(" "));
        return builder.toString();
    }

    public static String reverseAllWordsInSentence(String sentence) {
        StringBuilder revBuilder = new StringBuilder();
        StringBuilder resBuilder = new StringBuilder();
        char[] chars = sentence.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            while (i < chars.length && !Character.isSpaceChar(chars[i])) {
                revBuilder.append(chars[i]);
                i++;
            }
            revBuilder.reverse();
            resBuilder.append(revBuilder).append(" ");
            revBuilder = new StringBuilder();
        }
        return resBuilder.toString();
    }

    public static String reverseAllWordsInSentence2(String sentence) {
        StringBuilder resBuilder = new StringBuilder();
        int wordStart = 0;
        int wordEnd = 0;
        char[] chars = sentence.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isSpaceChar(chars[i])) {
                wordStart = i;
                while (i < chars.length && !Character.isSpaceChar(chars[i])) {
                    i++;
                }
                wordEnd = i - 1;
            }
            while (wordStart <= wordEnd) {
                resBuilder.append(chars[wordEnd]);
                wordEnd--;
            }
            resBuilder.append(" ");

        }
        return resBuilder.toString();
    }


    public static int findElementInSortedList(List<Integer> list, Integer el) {
        if (el == null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == null) {
                    return i;
                }
            }
            return -1;
        }

        return findElementInSortedList(list, 0, list.size() - 1, el);
    }

    private static int findElementInSortedList(List<Integer> list, int start, int end, Integer el) {


        while (start <= end) {

            int medIndex = start + (end - start) / 2;

            if (Objects.equals(list.get(medIndex), el)) {
                return medIndex;
            }

            if (el < list.get(medIndex)) {
                return findElementInSortedList(list, start, medIndex - 1, el);
            }

            if (el > list.get(medIndex)) {
                return findElementInSortedList(list, medIndex + 1, end, el);
            }

        }

        return -1;
    }

    public static void inorderTraversal(TreeNode current) {

        if (current != null) {

            inorderTraversal(current.left);

            System.out.print(current.val + ";");

            inorderTraversal(current.right);

        }

    }

    private static void printTicketByDate(LocalDate date, List<Ticket> tickets) {
        tickets.stream().filter(t -> t.getDate().equals(date)).forEach(System.out::println);

    }

    private static boolean checkPresenceOfTicketForClient(Client c, List<Ticket> tickets) {
        return tickets.stream().anyMatch(t -> t.getClient().equals(c));

    }

    private static OptionalDouble getAveragePrice(List<Ticket> tickets) {
        return tickets.stream().mapToDouble(t -> t.getPrice()).average();
    }

    private static boolean checkIfAllClientHaveEmail(List<Ticket> tickets) {
        return tickets.stream().allMatch(t -> {
            Optional<String> email = t.getClient().getEmail();
            if (email.isPresent()) {
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

    private static void swap(int[] arr, int index, int index2) {
        int temp = arr[index];
        arr[index] = arr[index2];
        arr[index2] = temp;
    }
}
