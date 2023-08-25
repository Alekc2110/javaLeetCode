package com.java.task.task01.task0101;

/* 
Я думаю, быть программистом - это круто
*/


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;


public class Solution {

    public static void main(String[] args) {
//        AnotherUser anotherUser = new AnotherUser();
//        anotherUser.run();
//
//        System.out.println(Integer.toBinaryString(2));
//
//        User u = new User();
//        u.strike();


//        Parent parent = new Parent("123");


//        Employee son = new EmployeeSon("a");
//        EmployeeSon son1 = new EmployeeSon("a","b");


//        son.printEmployee();
//        System.out.println();
//        son1.printEmployee();
//        System.out.println();
//        System.out.println(son);
//        System.out.println(son1);
//        System.out.println(son2);
//        System.out.println(10>=Integer.parseInt("7"));
//
//        System.out.println(Singelton.SINGELTON.compareTo(Exam.SECOND));
//        System.out.println(Singelton.SINGELTON.compareTo(Singelton.SINGELTON1));
//        System.out.println(Singelton.valueOf(Exam.class, "FIRST1"));

//        Vararg vararg = new Vararg("a", "b", "c");
//        Vararg vararg1 = new Vararg("a", "b", "c", "d", "e", "f");
//
//        System.out.println(vararg.viewList.get(0));
//        System.out.println(vararg.viewList.stream().filter(s -> s.equals("d")).findFirst().orElse("no such"));
//
//        System.out.println(vararg);
//        System.out.println(vararg1);
//


//        Random rand = new Random();
//        int[] numbers = new int[1_000];
//
//        for (int j = 0; j < numbers.length; j++) {
//             numbers[j] = rand.nextInt(1000);
//        }


//     int[] unsortedArray = {5, 8, 3, 11, 2, 37, 1, 11, 15};
//        int[] sortedArray = {1, 2, 3, 5, 8, 11, 15};
//        int[] sortedArray2 = {1, 2, 12, 55};
//        sortedArray[0] = 505;
//
//        System.out.println(Arrays.toString(sortedArray));
//
//        Arrays.stream(sortedArray).forEach(el-> System.out.print(el + " "));
//
//        System.out.println(Arrays.mismatch(sortedArray, sortedArray2));


//        List<Integer> list  = Arrays.stream(unsortedArray).boxed().collect(Collectors.toList());
//
////        final int i = bubbleSortWithCountIterations(unsortedArray);
////        System.out.println(Arrays.toString(unsortedArray));
////        System.out.println(i);
//        reverseArray(unsortedArray);
//        System.out.println(Arrays.toString(unsortedArray));
//
//        reverseArrayList(list);
//        System.out.println(list);


//
//        bubbleSortV1(unsortedArray);
//        System.out.println(Arrays.toString(unsortedArray));


//        int[] sortedArray = {1, 3, 4, 7, 8, 9, 10, 11, 12, 13, 15};
//        int[] unsortedArray = {1, 3, 40, 25, 80, 91, 11, 2, 33, 15};
//        int[] unsortedArray1 = {3, 1, 9, 2, 7, 10, 6, 8, 4, 5};
//        final int bbsort = bbsort(unsortedArray);
//        System.out.println(Arrays.toString(unsortedArray));
//        System.out.println(bbsort);
//        System.out.println(binarySearch(sortedArray, -5));
//       System.out.println(binarySearchRecursive(sortedArray, 10, 0, sortedArray.length));
//        quickSort(unsortedArray1, 0, unsortedArray1.length-1);
//        System.out.println(calcSqrt(89));
//       System.out.println(countFibonachiNumber(10));
//       System.out.println(countFibonachiNumberRecursive(10));
//        System.out.println(countFibonachiNumberWithArray(1));

//        _________________________________________________________________________________________________
//
//        System.out.println(factorialRecursive(-5));
//        System.out.println(getFactorial(-5));
//        System.out.println(fibonachiRecursive(8));
//       fibon(50,150);


//        binar(10);
//        System.out.println();
//        System.out.println(Integer.toBinaryString(1000));

//        System.out.println(binarySearch(sortedArray, 35));

//
//        BaseModel baseModel = new BaseModel(1L, "Ivan", "Drago");
//        User user1 = new User(2L, "firstUser");
//        //    BaseModel baseModel1 = user1;
//        //   User user2 = (User) baseModel1 ;
//
//        BaseModel user3 = new User(5L, "user3", LocalDate.MIN);
//
//        User user4 = (User) user3;


//        user4.lastName = "user4";
//        user4.id = 10L;
//        user4.firstName = "user4FN";
//
//        System.out.println(user3);
//
//        System.out.println(user4);


//        System.out.println(Integer.toHexString(444635));
//        System.out.println(Integer.parseUnsignedInt(Integer.toHexString(444635), 16));
//        Runnable run1 = new MyRunnable();
//        Runnable run2 = new MyRunnable();
//
//        Thread t1 = new Thread(run1, "th1");
//        Thread t2 = new Thread(run1, "th2");
//
//        t1.start();
//
//        t2.start();
//        t2.join();


//       Map<String, Object> map  = new TreeMap<>();
//     //  map.put(null, null);
//       map.put("null", null);
//
//        System.out.println(map.get("null"));
//
//        File file = new File("Hello1.txt");
//
//
//
//        // creates a FileWriter Object
//        FileWriter writer = new FileWriter(file);
//
//        // Writes the content to the file
//        writer.write("This\n is\n an\n example\n");
//        writer.flush();
//        writer.close();
//
//        // Creates a FileReader Object
//        FileReader fr = new FileReader(file);
//        char [] a = new char[10];
//        // fr.read(a);   // reads the content to the array
//
//        int i;
//        while((i = fr.read())!= -1){
//            System.out.print((char)i);
//        }
//        for(char c : a)
//            System.out.print(c);   // prints the characters one by one
//        fr.close();
//
//

//        ByteArrayOutputStream bOutput = new ByteArrayOutputStream(5);
//        InputStreamReader cin = null;

//        // Instantiate a Date object
//        Date date = new Date();
//        System.out.println(date);
//
//        // display formatted date
//        System.out.printf("%s %tb %2$td, %2$tY", "Due date:", date);
//        System.out.println();
//
//       System.out.println(Integer.toBinaryString(515));
//
//
//        String value = "jjj";
//        System.out.println(value.compareTo("jj"));
//


        // Employee dima = new Employee();
        //  System.out.println(dima.getName());
        // Employee ivan = new Employee("Max1", 100);
        //  System.out.println(dima.getName());

//        System.out.println(Employee.Node.node);
//
//
//        System.out.println(Employee.empAge(1));
//        System.out.println(Employee.name);
//
//       System.out.println(calcSqrt(9));
//        String s = cutCommandFromFullText("/testanother@_Bot just text");
//        System.out.println(s);
//        Solution sol = new Solution();
//        boolean b = sol.users.stream().anyMatch(a -> a.getId().equals(2L));
//
//        System.out.println(b);
//        Solution sol = new Solution();
//        for (int i = 1; i<31; i++ ) {
//
//            sol.array.add(i);
//
//        }
//       Collections.reverse(sol.array);
//        for (int i: sol.array) {
//            System.out.println(i);
//        }

//        System.out.println(Solution.fourLetters("I lovec Java"));

//        int x = 8;
//        System.out.println(Integer.toOctalString(x));
//        System.out.println(Integer.toBinaryString(x));
// -----------------------------------------------------------------------------
// RANDOM
//        int random1 = (int) (Math.random() * 2)-1;

//        Random random = new Random();
//        LongStream longs = random.longs(5, 15);


//
//        for (int i = 0; i < 100; i++) {
//            System.out.print((int)(Math.random()*1000) + " ");
//        }
//        System.out.println();
//        Random random = new Random();
//        for (int i = 0; i < 100; i++) {
//            System.out.print(random.nextInt(50, 100) + " ");
//        }
//    }
//        System.out.println(random1);
//        int[] ints = new int[5];
//       for (int i = 1; i<=ints.length; i++){
//           ints[i-1] = i;
//       }
//        for (int i : ints ) {
//            System.out.println(i);
//        }
//        System.out.println(ints.length);
//
//
// -------------------------------------------------------------------------------
//        List<Integer> list = new ArrayList<>(10);
//        int j =  1;
//        for (int i = 0 ; i<55; i++){
//
//            list.add(j++);
//
//
//        }
//        System.out.println(list.toString());
//        System.out.println(list.size());
//        Field field = list.getClass().getDeclaredField("elementData");
//        field.setAccessible(true);
//        Object[] elementData = (Object[]) field.get(list);
//
//
//        System.out.println(elementData.length);
// -------------------------------------------------------------------------------
// System.out.println(getFactorial(-3));

//        System.out.println(factorial(6));
//        System.out.println(streamFactorial(0));
//       List<Integer> list  =  Arrays.asList(1,2,3,4,5,6);
//        System.out.println(list.getClass());
//            for (int i = 1; i < list.get(3); i++)
//                System.out.println(list.get(i));
//        char arr[] = {3,1,4,1,5,9,2,6,5,3,5,8,9};
//        LinkedList<Integer> fifo = new LinkedList<Integer>();
//
//        for (int i = 0; i < arr.length; i++)
//            fifo.add (new Integer (arr[i]));
//
//        System.out.println(fifo);
//        System.out.println();
//
//        System.out.print (fifo.removeFirst() + ".");
//        while (! fifo.isEmpty())
//            System.out.print (fifo.removeFirst());
//        System.out.println();
//        int[] array = {3, 3, 5, 4, 4, 3};
//        selectionSort(array);
//_____________________________________________________________________________________________

//int a[] ={};
//int j = 'ё';
// int x= 3;
// int y= 5;
//        System.out.println(x/y);
//       System.out.println(9%4);
//
//        User user1 = new User(1L, "dd");
//        User user2 = user1;
//
//
//        TestBat test = new TestBat(3L, "dd", "kd");
//_______________________________________________________________________________________________
//        BigInteger integer = new BigInteger(String.valueOf(Integer.MAX_VALUE));
//        System.out.println(integer);
//
//
//        BaseModel _1stUser = new User();
//        //_1stUser.strike(); don`t see
//        ((User)_1stUser).strike();
//
//        User usernew = new User();
//        TestBat userN = new TestBat();
//        userN.jump();
//        User.jumpStatic();
//
//        _1stUser.runFast();
//        usernew.runFast();
//        TestBat _2stUser = new AnotherUser();
//
//
//
//        _1stUser.setFirstName("Vasya");
//        _1stUser.setLastName("Ivanov");
//
//        _2stUser.setFirstName("Petia");
//        _2stUser.setLastName("Petrov");
//
//        User user2 = (User)_1stUser;
//        ((User) _1stUser).strike();
//        user2.strike();
//
//        TestBat user = user2;
        //User user3 = (User) new TestBat(); //wrong!!!
//        AnotherUser anotherUser = new AnotherUser();
//
//        ((User) _1stUser).setBirthDay(LocalDate.now());
//
//        LocalDate birthDay = ((User) _1stUser).getBirthDay();
//        System.out.println(birthDay);
//
//        System.out.println(user2.name);
//
//
//        _1stUser.run();
//        _2stUser.run();
//
//
//        _1stUser.jump();
//        _2stUser.move();
//        anotherUser.move();
//-----------------------------------------------------------
 String in = "ivanov;";
 String in1 = "ivanov;Ivan Ivanov;";
 String in2 = "ivanov;Ivan Ivanov;ivanov@mail.com";
 String in3 = "Login;Name;Email\n" +
         "ivanov;Ivan Ivanov;ivanov@mail.com\n" +
         "петров;Петр Петров;petrov@google.com\n" +
         "obama;Barack Obama;obama@google.com\n" +
         "bush;Джордж Буш;bush@mail.com";

//     convert1(in);
//     convert1(in1);
//     convert1(in2);
     convert1(in3);
//        String str = "I, s, I, I,mr, mr, I, I";
//        String pat = "\\b(([a-zA-Z[а-яА-ЯёЁ]]+[,]*)+)(?:[\\W]+\\1\\b)+";
//        String res = str.replaceAll(pat, "$1");
//        System.out.println(res);
//------------------------------------------------------------
//        for (char i = 'а'; i <='я' ; i++) {
//            System.out.print((int)i + "/");
//        }
//        System.out.println();
//        for (char i = 'А'; i <='Я' ; i++) {
//            System.out.print((int)i + "/");
//        }
//        int i = 32;
//        System.out.println((char)i);
//-------------------------------------------------------------
//        String input = "younger younger anybody assured changed younger";
//
//        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
//
//        // Use compile(regex) if you want case sensitive.
//        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
//
//        Matcher m = p.matcher(input);
//        while (m.find()) {
//            input = input.replaceAll(m.group(), m.group(1));
//        }
//
//        System.out.println(input);
//-----------------------------------------------------------
//        // Pattern pattern = Pattern.compile("\\b([a-zA-Z[а-яА-ЯёЁ]]+[,]*)(?:[^a-zA-Z[а-яА-ЯёЁ]]+\\1\\b)+");
//        Pattern pattern = Pattern.compile("\\b(\\w+)[,]*+(\\s+\\1\\b)+");
//        Matcher matcher = pattern.matcher(input);
//
//        while (matcher.find()) {
//            System.out.println(matcher.group()+"//");
//            System.out.println(matcher.group(1));
//
//            input = input.replaceAll(
//                    matcher.group(),
//                    matcher.group(1));
//
//        }
//---------------------------------------------------------------
//        MessageDigest digest = MessageDigest.getInstance("MD5");
//
//        digest.update("password to hash".getBytes());
//
//        byte[] hash = digest.digest();
//
//        System.out.println(Arrays.toString(hash));
//        ---------------------------------------------------------------

//        String[] st = new String[]{"1", "2", "3", "4"};
//        System.out.println(array1[0]);
//        System.out.println(st[0]);
//        int[] arr = new int[]{4, 5, 6, 7};
//        List list = new ArrayList<>(5);
//
//        Object[] integers = list.toArray(array1);
//        Object[] objects = list.toArray(st);
//        System.out.println(array1[0]);
//        System.out.println(objects[0]);

// -----------------------------------------------------------------------
//        List<Integer> integers1 = Arrays.asList(array1);//exception!!!
//        List<Integer> list = new ArrayList<>(Arrays.asList(array1));
//
//        list.remove(0);
//        integers1.forEach(System.out::print);
//        System.out.println();
//        list.forEach(System.out::print);
//
//
//        final String s = cutCommandFromFullText("java@mail.ru");
//        System.out.println(s);


//        List<Integer> integers3 = List.of(1,2,3,4);// exception!!!
//        integers3.remove(0);
//        integers3.forEach(System.out::print);

//        List<Integer> integers4 = new ArrayList<>(List.of(1, 2, 3, 4));// exception!!!
//        for (Integer i:integers4 ) {  //Cannot remove in iterator. Only iterator.remove()!!!
//            integers4.remove(i);
//        }
//        integers4.forEach(System.out::print);

//        List<Integer> integers6 = new ArrayList<>(List.of(1, 2, 3, 4)); //working!!!
//        integers6.removeAll(integers6); // 1st var.
//        System.out.println(integers6);
//        Iterator<Integer> iterator = integers6.iterator(); //2nd variant
//        while (iterator.hasNext()){
//            iterator.next();
//            iterator.remove();
//        }
//        System.out.println(integers6);

//        for (Integer i: integers6) { //  exception!!!
//            integers6.remove(i);
//        }
//        System.out.println(integers6.size() + "!!!");
//-----------------------------------------------------------------------------------------
//
//        List<Integer> integers5 = new ArrayList<>(List.of(1, 2, 3, 4));// no exception!!!
//        integers5.remove(0);
//        integers5.forEach(System.out::print);
//
//
//        List<Integer> integers2 = new ArrayList<>(Arrays.asList(array1));// no exception!!!
//        integers2.remove(0);
//        integers2.forEach(System.out::print);
//
//
//
//        list.addAll(Arrays.asList(array1));
//        list.remove(1);
//
//        list.forEach(System.out::print);
//
//        List<Integer> collect = Stream.of(array1).collect(Collectors.toCollection(ArrayList::new));
//        collect.remove(null);
//        System.out.println();
//
//        collect.forEach(System.out::print);
//
//       collect.removeAll(collect);
//        System.out.println(collect.size());
//
//       Map<String, Integer> map = new LinkedHashMap<>();
//       map.put("aaa", 111);
//       map.put("bbb", 250);
//       map.put("ccc", 333);
//        System.out.println(map);
//        System.out.println("bbb " + map.get("bbb"));
//        System.out.println("bbb1 " + map.getOrDefault("bbb1", 777));
//------------------------------------------------------------------------------

//
//        Thread t = new Thread(() -> {
//            try {
//                Thread.sleep(5000);
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                System.out.println("finally");
//
//            }
//        });
//        t.setName("!!!");
//        t.start();
//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
// ***************************************************************************
//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Collections.reverse(integers); // 1st var.
//        reverseArrayList(integers);// 2nd var.
//        integers.stream().sorted(Comparator.reverseOrder()).forEach(el -> System.out.print(el + " ")); // 3rd var.
//        System.out.println(integers);
// ****************************************************************************
//
//        Child child = new Child("child");
//        Child child =  new Child("parent");
//
//
//         child = new Child("p2");
//         child.doParent();
//
//
//        Child c2 = new Parent("parent"); //compile exception!!!
//        Child c3 = (Child) parent; // runtime ClassCastException!!!
//        Parent p4 = child;
// ****************************************************************************
//        int[] arr = new int[]{4, 6, 8, 5};
//
//        System.out.println(findDuplicatesInArray(arr));

//        IntStream.rangeClosed(1, 1000)
//                .forEach(el -> System.out.println(ThreadLocalRandom.current().nextInt(1, 50)));
// **********************************************************************************************************Sorting
        int[] arr = {10, 3, 15, 8, 25, 1, 0};
        int[] arr1 = new int[]{1, 5, 8, 10, 15, 18, 19, 25, 35};
//        System.out.println(Arrays.stream(arr).reduce(0, Integer::sum));
//        System.out.println(Arrays.stream(arr).reduce(Integer::sum));
//        quickSort(arr);
//        insertionSortArr2v(arr);
//        System.out.println(Arrays.toString(arr));
//
//        User user = new User();
//        user.someMethod();

//        Arrays.stream(arr).mapToObj(String::valueOf).reduce((i1, i2)-> i1 + "," + i2).ifPresent(System.out::println);
//        System.out.println(Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(",")));

//        Function<Integer, Integer> timesTwo = x -> x*2;
//        Function<Integer, Integer> minusOne = x -> x-1;
//
//        System.out.println(minusOne.andThen(timesTwo).andThen(minusOne).apply(10));
//        System.out.println(minusOne.andThen(timesTwo).apply(10));

//        System.out.println(binarySearchInArrayRecursive(arr, 10, 0, arr.length - 1));
//        System.out.println(binarySearchInArrayRecursive(arr, 1, 0, arr.length - 1));
//        System.out.println(binarySearchInArrayRecursive(arr, 35, 0, arr.length - 1));
//        System.out.println(binarySearchInArrayRecursive(arr, 36, 0, arr.length - 1));
//        System.out.println(binarySearchInArrayRecursive(arr, 16, 0, arr.length - 1));
//        System.out.println(binarySearchInArrayRecursive(arr, 255, 0, arr.length - 1));
//
//        System.out.println();
//        System.out.println(binarySearchInArray(arr, 10));
//        System.out.println(binarySearchInArray(arr, 1));
//        System.out.println(binarySearchInArray(arr, 35));
//        System.out.println(binarySearchInArray(arr, 36));
//        System.out.println(binarySearchInArray(arr, 16));
//        System.out.println(binarySearchInArray(arr, 255));

// **********************************************************************************************************
//        MyMath myMath = new MyMath();
//        Function<Integer, Integer> triple = MyMath::triple;
//        Function<Integer, Integer> square = y -> {
//            return myMath.someAnother(y);
//        };
//
//        System.out.println(triple.apply(3));
//        System.out.println(square.apply(2));
//        System.out.println(MyMath.combine2And3((i1, i2) -> MyMath.triple(i1)));
//
//        System.out.println(MyMath.combine2And3(MyMath::add));
//        System.out.println(MyMath.combine2And3(MyMath::subtract));
// **********************************************************************************************************
//          Predicate<String> check = s-> {
//              boolean empty = s.isEmpty();
//              System.out.println("is empty! " + empty);
//              return empty;
//          };
//          Predicate<String> check2 = s-> {
//              boolean blank = s.isBlank();
//              System.out.println("is blank! " + blank);
//              return blank;
//          };
//          Predicate<String> combine = check.or(check2);
//          combine.test("  ");
// **********************************************************************************************************

//        System.out.println(romanToInt("XXIV"));
//        System.out.println(romanToInt("XXVII"));
//        System.out.println(romanToInt("XXIX"));
//        System.out.println(romanToInt("MMXXXIII"));
// ***********************************************************************************************************
        // SORTING ALGORITHMS
//        int[] arr = IntStream.rangeClosed(0, 100000).map(el -> new Random().nextInt(100)).toArray();
////        int[] arr = IntStream.rangeClosed(0, 1_000_000).toArray();
//        Instant start = java.time.Instant.now();
//        quickSort(arr);
//        Instant end = java.time.Instant.now();
//        //System.out.println(Arrays.toString(arr));
//        System.out.println("time millis for method: " + (end.getNano() - start.getNano()) / 1_000_000 + "ms");
//
//        int[] arr1 = IntStream.rangeClosed(0, 100000).map(el -> new Random().nextInt(100)).toArray();
//        Instant startSelSort = java.time.Instant.now();
//        selectionSortArr(arr1);
//        Instant endSelSort = java.time.Instant.now();
//        //System.out.println(Arrays.toString(arr1));
//        System.out.println("time millis for method: " + (endSelSort.getNano() - startSelSort.getNano()) / 1_000_000 + "ms");
//
        // System.out.println(new Record(1, "name"));
//        Record r = new Record("lastName");
//        System.out.println(r);

//        int[] arr1 = {10, 3, 15, 8, 25, 1, 0};
//        int[] arr2 = new int[]{10, 3, 15, 8, 25, 1, 0};
//        int[] arr3 = new int[10];
//        arr3[0] = 10;

//        int[] arr1 = {1, 2, 10};
//        int[] arr2 = {0, 3, 15, 250, 300, 500, 1000};
        //[1,1,2,3,4,4]
        //   int[] res = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();


//        int[] result = merge2IntSortedArrays(arr1, arr2);
//        int[] result = mergeIntArrays(arr1, arr2);

//        MergeSort.sort(arr1, 0, arr1.length -1);
//        System.out.println(Arrays.toString(arr1));
//        String s = "abcdef";
//        System.out.println(s.indexOf("cde", 0));

//        func(10, 2, (int1, int2) -> System.out.println(int1 - int2));
//        for (var j : arr2) {
//            System.out.println(j);
//        }
// ********************************************************************* ковариантность/контрвариантность
//        List<Parent> parents = new ArrayList<>();
//        List<Child> children = new ArrayList<>(List.of(new Child("1"), new Child("2")));
//        List<GrandParent> grandParents = new ArrayList<>();
//
//        Child child =new Child("ch1");
//        Parent parent = new Parent("par1");
//        GrandParent grandParent = new GrandParent();
//        Some some = new Some();

// !!!!!!*** инвариантность
//        parents.add(child);
//        parents.add(parent);
//        parents.add(some);
////        parents.add(grandParent); // throws ClassCastException
//        Child child1 = (Child) parents.get(0);
////        Child child2 = (Child) parents.get(1); // throws ClassCastException
//        Parent parent1 = parents.get(2);
//        Some some1 = (Some) parents.get(2); // some extends Parent and lies in another package
//        GrandParent gr1 = parents.get(1);
//        Object object = parents.get(0);
        // ***

// !!!!!!*** ковариантность List<? extends Parent>
        List<? extends Parent> extendsParents = new ArrayList<>(
                List.of(new Parent("parent"), new Child("ch")));
//          extendsParents = children; // ошибки компиляции нет!!!
//          extendsParents = parents; // ошибки компиляции нет!!!
//          extendsParents = grandParents; //  ошибка компиляции
//    **** adding to collection
//        extendsParents.add(new Object()); // ошибка компиляции
//        extendsParents.add(new Parent("parent")); // ошибка компиляции
//        extendsParents.add(new Some()); // ошибка компиляции
//        extendsParents.add(child1); // ошибка компиляции
//        extendsParents.add(grandParent); // ошибка компиляции
//    **** reading from collection
//        Parent parent2 = extendsParents.get(0);
//        GrandParent grandParent1 = extendsParents.get(0);
//        BaseModel bs = extendsParents.get(0);
//        Object object1 = extendsParents.get(0);
////        Child child2 = (Child) extendsParents.get(0); // throws ClassCastException
//        Child child2 = (Child) extendsParents.get(1);
// ********************************************************************* ковариантность/контрвариантность

// !!!!!!*** контрвариантность List<? super Parent>
        List<? super Parent> superParents = new ArrayList<>(List.of(
                new Parent("parent"), new Child("ch"), new GrandParent(1L, "grand", "surname")));

//        superParents = parents;
//        superParents = grandParents;
//          superParents = Collections.singletonList(grandParents);
//        superParents = children; // ошибка компиляции;
//    **** adding to collection
//        superParents.add(new Object()); // ошибка компиляции;
//        superParents.add(new GrandParent()); // ошибка компиляции;
//        superParents.add(new Parent(""));
//        superParents.add(new Child(""));
////    **** reading from collection
//        Object object2 = superParents.get(0);
////        GrandParent object2 = (GrandParent) superParents.get(0);
//        Parent par1 = (Parent) superParents.get(0);
//        Child ch1 = (Child) superParents.get(1);
//        GrandParent object = (GrandParent) superParents.get(2);
////        Child ch2 = (Child) superParents.get(2); // throws ClassCastException
        // ***

//        Map<String, String> map = Map.of("1", "one", "2", "two");
//        List<Map.Entry<String, String>> entries = new ArrayList<>(map.entrySet().stream().map(Map.Entry::copyOf).toList());
//        entries.clear();
//        map.forEach((k,v)-> System.out.println(k + ":" + v));
        System.out.println(countFibonachiNumber(5));

    }

    public static void reversOrderArray(int[] arr){
        for( int i = 0; i < arr.length/2; i++ )
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void printList(List<? extends Parent> list){
        for (var obj: list) {
            System.out.println(obj);
        }
    }


    //merge two arrays into one and sort it
    private static int[] mergeIntArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);

        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        //Arrays.sort(result);
        quickSortArr(result, 0, result.length - 1);

        return result;
    }

    // merge sort of two sorted arrays
    private static int[] merge2IntSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int pointer = 0;
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[pointer] = arr1[i];
                i++;
            } else {
                result[pointer] = arr2[j];
                j++;
            }
            pointer++;
        }

        while (i < arr1.length) {
            result[pointer] = arr1[i];
            i++;
            pointer++;
        }

        while (j < arr2.length) {
            result[pointer] = arr2[j];
            j++;
            pointer++;
        }
        return result;
    }


    private static <T, V> void func(T from, V to, BiConsumer<T, V> func) {
        System.out.println("start inner function logic");
        for (int i = 0; i < 10; i++) {
            func.accept(from, to);
        }
        System.out.println("end inner function logic");

    }

    private <T, U, V> void threeFunc(T from, U to, V size, ThreeConsumer<T, U, V> func) {
        for (int i = 0; i < 1000; i++) {
//            timer = Stopwatch.createStarted();
            func.accept(from, to, size);
//            timer.stop();
//            elapsed += timer.elapsed(TimeUnit.MICROSECONDS);
        }
//        System.out.printf(PRINT_OUT_FORMAT, elapsed / CYCLES_1000);
    }

    @FunctionalInterface
    public interface ThreeConsumer<T, U, V> {
        void accept(T t, U u, V v);
    }


    /**
     * find string with max occurrences of character 'x' in list
     *
     * @param list of strings
     * @return string
     */
    private static String findStringMaxCharInArr(List<String> list, char x) {
        String maxString = "";
        int maxCount = 0;

        for (String s : list) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == x) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxString = s;
                maxCount = count;
            }
        }
        return maxString;
    }

    public static void insertionSortArr2v(int[] array) {
        System.out.println(Arrays.toString(array));
        //start sort from 2nd el because 1st is already sorted by default
        for (int i = 1; i < array.length; i++) {
            //while prev. elem is bigger or reached 0 index of array, than swap elements
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                swap(array, j);
                System.out.println(Arrays.toString(array));
            }
        }
    }

    private static void swap(int[] array, int j) {
        int temp = array[j - 1];
        array[j - 1] = array[j];
        array[j] = temp;
    }


    /**
     * peek 2nd element from start as temp and check inside loop if previous elements
     * are bigger than temp and if yes -> copy it to right position in array
     * if no -> skip inner loop and insert temp element in last shifted(copied) position
     *
     * @param array - array of integers
     */
    public static void insertionSortArr(int[] array) {
        //start sort from 2nd el because 1st is already sorted by default
        for (int i = 1; i < array.length; i++) {
            int currentTempValue = array[i];

            int previousIndex = i - 1;
            while (previousIndex >= 0 && array[previousIndex] > currentTempValue) {
                //while prev. elem is bigger, than picked copy it to position to the right
                array[previousIndex + 1] = array[previousIndex];
                previousIndex--;
            }
            // when find smaller elem, then break the while loop and copy tempElem to last shifted position
            array[previousIndex + 1] = currentTempValue;
        }
    }

    /**
     * Implementation of quickSort with 2 variants:
     * 1st - peek pivot as element of higher index in array
     * 2nd - peek middle element as pivot
     *
     * @param array - array of integers
     */
    public static void quickSort(int[] array) {
        quickSortArr(array, 0, array.length - 1);
    }

    private static void quickSortArr(int[] arr, int lowIndex, int highIndex) {
        //check if arr has 1 element, then we don`t need to sort it anymore
        if (lowIndex >= highIndex) {
            return;
        }
// ------------------------------------------------------------------------------------
//        // peek the element for pivot for 1var partition method ***
        int pivIndex = new Random().nextInt(highIndex-lowIndex) + lowIndex;
        int piv = arr[pivIndex];
//        // when we peek random el for pivot, then we swap it with last el in array - arr[highIndex]
        swap(arr, pivIndex, highIndex);
// ------------------------------------------------------------------------------------
        // peek the middle!!! element for pivot for 2var partition method ***
//        int piv = arr[lowIndex + (highIndex - lowIndex) / 2];
// ------------------------------------------------------------------------------------

        // do arr partition for higher and lower elements around pivot element
        int leftPointer = arrPartition(arr, lowIndex, highIndex, piv); // 1 var
//        int leftPointer = arrPartition2Var(arr, lowIndex, highIndex, piv); // 2 var

        // recursive sort left part of arr that is lower than piv element
        quickSortArr(arr, lowIndex, leftPointer - 1);

//        // recursive sort right part of arr that is higher than piv element
        quickSortArr(arr, leftPointer + 1 , highIndex);

//        // recursive sort right part of arr that is higher than piv element for partition var2!******
//        quickSortArr(arr, leftPointer, highIndex);
    }


    private static int arrPartition(int[] arr, int lowIndex, int highIndex, int piv) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        //move leftPointer to right and rightPointer to left until they meet each other
        while (leftPointer < rightPointer) {

            //1st loop: when moving to right, then compare el - arr[leftPointer] with
            // el piv until we find el > piv, then stop this loop
            while (arr[leftPointer] <= piv && leftPointer < rightPointer) {
                leftPointer++;
            }
            //2nd loop: when moving to left, then compare el - arr[rightPointer] with
            // el piv until we find el < piv, then stop this loop
            while (arr[rightPointer] >= piv && leftPointer < rightPointer) {
                rightPointer--;
            }
            //swap elements - from 1st loop with 2nd loop
            swap(arr, leftPointer, rightPointer);
        }
        // last swap piv element with the last left element from while loop arr[leftPointer]
        swap(arr, leftPointer, highIndex);

        return leftPointer;
    }

    private static int arrPartition2Var(int[] arr, int lowIndex, int highIndex, int piv) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        //move leftPointer to right and rightPointer to left until they meet each other
        while (leftPointer <= rightPointer) {

            //1st loop: when moving to right, then compare el - arr[leftPointer] with
            // el piv until we find el > piv, then stop this loop
            while (arr[leftPointer] < piv) {
                leftPointer++;
            }
            //2nd loop: when moving to left, then compare el - arr[rightPointer] with
            // el piv until we find el < piv, then stop this loop
            while (arr[rightPointer] > piv) {
                rightPointer--;
            }
            //swap elements - from 1st loop with 2nd loop
            if (leftPointer <= rightPointer) {
                swap(arr, leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
        }

        return leftPointer;
    }

    public static int romanToInt(String s) {
        int num = 0;
        char prev = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    if (prev == 'C') {
                        num += 800;
                    } else {
                        num += 1000;
                    }
                    prev = 'M';
                    break;
                case 'D':
                    if (prev == 'C') {
                        num += 300;
                    } else {
                        num += 500;
                    }
                    prev = 'D';
                    break;
                case 'C':
                    if (prev == 'X') {
                        num += 80;
                    } else {
                        num += 100;
                    }
                    prev = 'C';
                    break;
                case 'L':
                    if (prev == 'X') {
                        num += 30;
                    } else {
                        num += 50;
                    }
                    prev = 'X';
                    break;
                case 'X':
                    if (prev == 'I') {
                        num += 8;
                    } else {
                        num += 10;
                    }
                    prev = 'X';
                    break;
                case 'V':
                    if (prev == 'I') {
                        num += 3;
                    } else {
                        num += 5;
                    }
                    break;
                case 'I':
                    num += 1;
                    prev = 'I';
                    break;
            }
        }
        return num;
    }

    static class MyMath {

        Integer some(Integer x) {
            System.out.println(x + "***");
            return x;
        }

        Integer someAnother(Integer y) {
            System.out.println(y + "***");
            return y * y;
        }

        static Integer triple(Integer x) {
            return x * 3;
        }

        static Integer square(Integer x) {
            return x * x;
        }

        static Integer add(Integer x, Integer y) {
            return x + y;
        }

        static Integer subtract(Integer x, Integer y) {
            return x - y;
        }

        static Integer combine2And3(BinaryOperator<Integer> func) {
            return func.apply(2, 3);
        }

    }


    public static int binarySearchInArray(int[] sortedArray, int element) {
        int lowIndex = 0;
        int highIndex = sortedArray.length - 1;

        while (lowIndex <= highIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;
            int middleElement = sortedArray[middleIndex];
            if (element == middleElement) {
                return middleIndex;
            }
            if (element < middleElement) {
                highIndex = middleIndex - 1;
            } else {
                lowIndex = middleIndex + 1;
            }
        }

        return -1;
    }

    public static int binarySearchInArrayRecursive(int[] sortedArray, int element, int lowIndex, int highIndex) {

        if (lowIndex <= highIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;
            int middleElement = sortedArray[middleIndex];
            if (element == middleElement) {
                return middleIndex;
            }
            if (element < middleElement) {
                return binarySearchInArrayRecursive(sortedArray, element, lowIndex, middleIndex - 1);
            } else {
                return binarySearchInArrayRecursive(sortedArray, element, middleIndex + 1, highIndex);
            }
        }
        return -1;
    }

    public static int fourLetters(String names) {
        int counter = 0;
        String[] splitted = names.split(" ");
        for (String i : splitted) {
            if (i.length() == 4) {
                counter++;
            }
        }
        return counter;
    }

    public static Integer findDuplicatesInArray(int[] array) {
        int result;
        for (int i = 0; i < array.length - 1; i++) {
            result = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (result == array[j]) {
                    return result;
                }
            }
        }
        return null;
    }

    public static int stringCompare(String str1, String str2) {
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if ((int) str1.charAt(i) != (int) str2.charAt(i)) {
                return (int) str1.charAt(i) - (int) str2.charAt(i);
            }

        }

        // Edge case for strings like
        // String 1="Geeky" and String 2="Geekyguy"
        if (str1.length() < str2.length() || str1.length() > str2.length()) {
            return (str1.length() - str2.length());
        }

        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }

    static void reverseArray(int[] arr) {
        int middleIndex = arr.length / 2;
//        int startElIndex = 0;
//        int lastElIndex = arr.length-1;
        for (int i = 0; i < middleIndex; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
//           startElIndex++;
//           lastElIndex--;
        }
    }

    static void reverseArrayList(List<Integer> list) {
        int middleIndex = list.size() / 2;

        for (int i = 0; i < middleIndex; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
    }

    static void bubbleSortV1(int[] arr) {
        int countOutLoop = 0;
        int countInnerLoop = 0;

        for (int i = 0; i < arr.length; i++) {
            countOutLoop++;
            for (int j = 0; j < arr.length - i - 1; j++) {
                countInnerLoop++;
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        System.out.println("countOutLoop " + countOutLoop);
        System.out.println("countInnerLoop " + countInnerLoop);
    }

    static void selectionSortV1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int picked = arr[i];
            int j = i - 1;
            while (j >= 0 && picked < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = picked;
        }

    }

    public static int bubbleSortWithCountIterations(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
                count++;
            }

        }
        return count;
    }

    public static int factorialRecursive(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorialRecursive(number - 1);
    }

    public static int fibonachyRecursive(int number) {

        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonachyRecursive(number - 1) + fibonachyRecursive(number - 2);
    }


    public static int binarySearch(int[] array, int element) {

        int startIndex = 0;
        int endIndex = array.length;
        int positionIndex = -1;
        int middleIndex;

        while (startIndex < endIndex) {
            middleIndex = (startIndex + endIndex) / 2;
            if (array[middleIndex] == element) {
                positionIndex = middleIndex;
                return positionIndex;
            }
            if (element < array[middleIndex]) {
                endIndex = middleIndex;
            } else {
                startIndex = middleIndex + 1;
            }

        }

        return positionIndex;
    }

    public static int binarySearchRecursive(int[] array, int element, int startIndex, int endIndex) {
        int middleIndex = startIndex + (endIndex - startIndex) / 2;
        if (array[middleIndex] == element) {
            return middleIndex;
        }
        if (middleIndex == array.length - 1 || middleIndex == startIndex) {
            return -1;
        }
        if (element < array[middleIndex]) {
            return binarySearchRecursive(array, element, startIndex, middleIndex);
        }
        if (element > array[middleIndex]) {
            return binarySearchRecursive(array, element, middleIndex + 1, endIndex);
        }
        return -1;
    }


    public static int method() {
        int x = 1;

        //  throw new Exception();
        Scanner sc = null;
        try {
            sc = new Scanner(new FileInputStream("1.txt"));


        } catch (ArithmeticException | FileNotFoundException e) {
            System.out.println("Ex caught");

            //  throw new ArithmeticException();
        } finally {
            System.out.println("finally");
            System.out.println(x = 4);

            if (sc != null)
                sc.close();
        }


//    catch (Exception e) {
//
//      throw new ArithmeticException();
//    }
        System.out.println("!!!");
        return x = 3;
    }

    public static int method1() throws ReflectiveOperationException {
        int x = 1;
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new IllegalAccessException();
        }
//    finally {
//       return x=3;
//    }

    }


    public static void convert1(String input) {
        StringBuilder sb = new StringBuilder();
        // Pattern pattern = Pattern.compile("(([a-zA-Z_-]+)(?=\\;)).+([A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6})?");
        Pattern pattern = Pattern.compile("([a-zA-Zа-яА-ЯёЁІіЄєЇї_.-]+);([a-zA-Zа-яА-ЯёЁІіЄєЇї_.\\s-]+);([a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6})");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String n = matcher.group(1);
            String n1 = matcher.group(3);

            sb.append(n).append(": ").append(n1).append("\n");

        }
        System.out.println(sb);

    }

    public static void binar(int a) {
        int b;
        String temp = "";
        while (a != 0) {
            b = a % 2;
            temp = b + temp;
            a = a / 2;
        }
        System.out.print(temp);
    }

    public static void bitsInNumber(int n) {
        int res = 0;
        while (n > 0) {
            n >>= 1;
            res++;
        }
        System.out.println(res);
    }

    public static void selectionSort(int[] array) {
        //  int count = 0;
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;

            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                    //        count++;

                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
            //printArray(array);
        }
        //  System.out.println(count);
    }


    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1)
                break;
            System.out.print(",");
        }
        System.out.println("]");
    }

    private static void bubbleSortToMax(int[] arr) {
        boolean wasSorted = true;
        while (wasSorted) {
            wasSorted = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    wasSorted = true;
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    printArray(arr);
                }

            }
        }
        printArray(arr);

    }

    public static void optimizedBubbleSort(int[] arr) {

        int i, j;
        boolean swapped;
        // int count = 0;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                    swapped = true;
                    //   count++;
                    printArray(arr);
                }
            }

// Если в процессе прохода не было ни одной замены, то выход из функции

            if (swapped == false)

                break;

        }
        //   System.out.println(count);

    }

    public static String[] sortDuplicatesString(String arr[]) {

        String[] unique = new String[arr.length];    //initialize new array that will hold unique values
        for (int i = 0; i < arr.length; i++) {
            boolean b = true;    //boolean that checks if an element is a duplicate
            for (int j = i + 1; j < arr.length; j++) {    //check all elements above int i
                if (arr[i].equals(arr[j])) {
                    b = false;    // set b to false if there is an existing duplicate
                    break;
                }
            }
            if (b) {
                unique[i] = arr[i];    // if no duplicates exist, then it is unique.
            }
        }
        return unique;
    }


    public static void quickSortUsingHighIndexElementAsPivot(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }
        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);

        quickSortUsingHighIndexElementAsPivot(array, lowIndex, leftPointer - 1);
        quickSortUsingHighIndexElementAsPivot(array, leftPointer + 1, highIndex);

    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    public static void quickSortBasicApproach(int[] array, int low, int high) {
        int i = low, j = high;
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int middleElement = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        while (i <= j) {
            while (array[i] < middleElement) {
                i++;
            }

            while (array[j] > middleElement) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j) {
            quickSortBasicApproach(array, low, j);
            // printArray(array);
        }
        if (high > i) {
            quickSortBasicApproach(array, i, high);
            //  printArray(array);
        }
    }

    public static int[] sort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int aj = array[j];
                    int ai = array[i];
                    array[j] = ai;
                    array[i] = aj;
                    count++;
                    printArray(array);

                }
            }
        }
        System.out.println(count);
        return array;
    }

    public static int factorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * factorial(f - 1);
        }
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 2; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static int streamFactorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return IntStream.rangeClosed(2, f).reduce((x, y) -> x * y).getAsInt();
            // return IntStream.rangeClosed(2, f).reduce(1, (x, y) -> x * y); another var with reduce!

        }
    }

    public static void fibon(int a, int b) throws InterruptedException {

        while (true) {
            int i = a + b;
            a = b;
            b = i;
            Thread.sleep(1000);
            System.out.print(i + " ");
        }
    }

    public static long countFibonachiNumber(long fibon) {
        long a = 0;
        long b = 1;
        int count = 0;

        if (fibon <= 1)
            return fibon;

        while (count != fibon) {
            long result = a + b;
            a = b;
            b = result;
            System.out.print(result + " ");
            count += 1;
        }
        System.out.println();
        return a;
    }

    public static long countFibonachiNumberWithArray(int fibon) {
        if (fibon <= 1)
            return fibon;

        long[] array = new long[fibon + 1];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= fibon; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[fibon];
    }

    // not effective for big numbers!
    public static long countFibonachiNumberRecursive(long fibon) {
        if (fibon <= 1)
            return fibon;


        return countFibonachiNumberRecursive(fibon - 1) + countFibonachiNumberRecursive(fibon - 2);
    }

    public static int calcSqrt(int input) {
        int low = 0;
        int high = input;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int squareMid = mid * mid;
            if (squareMid == input) return mid;
            if (squareMid > input) high = mid - 1;
            if (squareMid < input) low = mid + 1;
        }
        return low - 1;
    }

    public static String cutCommandFromFullText(String text) {
        return text.contains("@") ?
                text.substring(1, text.indexOf("@")) :
                text.substring(1);

    }
}

class Lambda4 {
    static int outerStaticNum;
    int outerNum;
    String str;

    void testScopes() {
        String[] some = new String[1];
        AtomicInteger x = new AtomicInteger(1);
        var ref = new Object() {
            int y = 1;
        };
        int xyz = 5;
        int finalXyz = xyz;
        int xxx;
        Converter<Integer, String> stringConverter1 = (from) -> {
//            xxx = 3; //forbidden for local variables
            int z = 1;
            ref.y = 2;
            x.set(2);
            some[0] = "dfsd";
            outerNum++;
            z = 3 + finalXyz + xyz;


            return String.valueOf(from);
        };

        Converter<String, Integer> stringConverter3 = (from) -> {
            return stringConverter1.valueOf(from);
        };


        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
    }
}
