import java.util.Arrays;

public class SelfCheckCap07 {
    public static void main(String[] args){
        //Exercicio02();
        //Exercicio03();
        //Exercicio06();
        //Exercicio07(); // retorna o maior valor da arrey
        //Exercicio08();
        //Exercicio10();
        //Exercicio11();
        //Exercicio12();
        //Exercicio13();
        //Exercicio15();
        //Exercicio16();
        //Exercicio17();
        //Exercicio18();
        //Exercicio20();
        //Exercicio21();
//        Exercicio25();
        //Exercicio26();
        //Exercicio27();
        //Exercicio28();
        //Exercicio29();
        //Exercicio30();
    }
//Write a piece of code that constructs a jagged two-dimensional array of integers with five rows and an increasing
//number of columns in each row, such that the first row has one column, the second row has two, the third has three,
//and so on. The array elements should have increasing values in top-to-bottom, left-to-right order (also called rowmajor
//order).
    private static void Exercicio30() {
        int count = 1;
        int[][] data = new int[5][];
        for (int i = 0; i < data.length; i++) {
            data[i] = new int[i +1];
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = count;
                count++;
            }
        }
        System.out.println(Arrays.deepToString(data));
    }

    //Assume that a two-dimensional rectangular array of integers called matrix has been declared with six rows and
//eight columns. Write a loop to copy the contents of the second column into the fifth column.
    private static void Exercicio29() {
        int[][] data = new int[6][8];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = i*j;
            }
        }
        System.out.println(Arrays.deepToString(data));
        for (int i = 0; i < data.length; i++) {
            data[i][4] = data[i][1];
        }
        System.out.println(Arrays.deepToString(data));
    }

    //Write a piece of code that constructs a two-dimensional array of integers with 5 rows and 10 columns. Fill the array with
//a multiplication table, so that array element [i][j] contains the value i * j. Use nested for loops to build the array.
    private static void Exercicio28() {
        int[][] data = new int[5][10];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = i*j;
            }
        }
        System.out.println(Arrays.deepToString(data));
    }

    //Assume that a two-dimensional rectangular array of integers called data has been declared with four rows and
//seven columns. Write a loop to initialize the third row of data to store the numbers 1 through 7.
    private static void Exercicio27() {
        int i=2;
        int[][] data = new int[4][7];
        for (int j = 0; j < data[i].length; j++) {
            data[i][j] = j+1;
        }
        System.out.println(Arrays.deepToString(data));
    }

    private static void Exercicio26() {
        System.out.println(polindrome());
    }

    private static boolean polindrome() {
        String[] a = {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"};
        for (int i = 0; i < a.length/2; i++) {
            if (!(a[i].equals(a[a.length-i-1]))){
                return false;
            }
        }
        return true;
    }

    private static void Exercicio25() {
        String[] a ={"belt", "hat", "jelly", "bubble gum"};
        int sum = 0;
        double media = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].length();
        }
        media = 1.0*sum/a.length;
        System.out.println("Média: " + media);
    }

    private static void Exercicio21() {
        int[] a1 = {2, 4, 6, 8, 10, 12, 14, 16};
        int[] a2 = {1, 1, 2, 3, 5, 8, 13, 21};
        mystery2(a1, a2);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }

    public static void mystery2(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[2 * i % a.length]-b[3 * i % b.length];
        }
    }


    // cai na pegadinha do +=
    private static void Exercicio20() {
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {1, 4, 9, 16, 25};
        mystery(a1, a2);
    }


    public static void mystery(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] += b[b.length- 1- i];
        }
        System.out.println(Arrays.toString(a));
    }
    private static void Exercicio18() {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 0; i < 9; i++) {
            numbers[i] = numbers[i + 1];
        }
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 1; i < 10; i++) {
            numbers2[i] = numbers2[i-1];
        }
        System.out.println(Arrays.toString(numbers2));
    }

    //Write a method called swapPairs that accepts an array of integers and swaps the elements at adjacent indexes. That
//is, elements 0 and 1 are swapped, elements 2 and 3 are swapped, and so on. If the array has an odd length, the final
//element should be left unmodified. For example, the list {10, 20, 30, 40, 50} should become {20, 10, 40,
//30, 50} after a call to your method.
    private static void Exercicio17() {
        int[] list = {10, 20, 30, 40, 50,60};
        
        swapPairs(list);
    }

    private static void swapPairs(int[] a) {
        for (int i= 0; i<a.length-1; i+=2){
            int aux = a[i];
            a[i] = a[i+1];
            a[i+1] = aux;
        }
        System.out.println(Arrays.toString(a));
    }

    private static void Exercicio16() {
        int x = 1;
        int[] a = new int[2];
        mystery2(x, a);
        System.out.println(x + " " + Arrays.toString(a));
        x--;
        a[1] = a.length;
        mystery2(x, a);
        System.out.println(x + " " + Arrays.toString(a));
    }
    public static void mystery2(int x, int[] list) {
        list[x]++;
        x++;
        System.out.println(x + " " + Arrays.toString(list));
    }

    //esse exemplo mostra como uma Array muda de valor independente do metodo que a modifica
    //e mostra como uma variavel local não altera se modificada dentro de outro metodo.
    private static void Exercicio15() {
        int x = 0;
        int[] a = new int[4];
        x = x + 1;
        mystery(x, a);
        System.out.println(x + " " + Arrays.toString(a));
        x = x + 1;
        mystery(x, a);
        System.out.println(x + " " + Arrays.toString(a));
    }

    public static void mystery(int x, int[] a) {
        x = x + 1;
        a[x] = a[x] + 1;
        System.out.println(x + " " + Arrays.toString(a));
    }

    //Write a method called allLess that accepts two arrays of integers and returns true if each element in the first array
//is less than the element at the same index in the second array. Your method should return false if the arrays are not
//the same length.
    private static void Exercicio13() {
        int[] data1 = {3, -5, 13, 4, 6};
        int[] data2 = {5, -4, 33, 14, 14};
        System.out.println(allLess(data1, data2));
    }

    private static boolean allLess(int[] data1, int[] data2) {
        if (data1.length == data2.length) {
            for (int i = 0; i < data1.length;i++) {
                if (data1[i] > data2[i]) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    //Describe the modifications that would be necessary to change the count and equals methods you developed in
//Section 7.2 to process arrays of Strings instead of arrays of integers.
    private static void Exercicio12() {
        String[] data = {"rafa", "ra", "rafa", "fara", "rafa"};
        String[] data2 = {"rafa", "ra", "rafa", "fara", "rafa"};
        System.out.println(count(data, "rafa"));
        boolean resultado = equals(data, data2);
        if (resultado){
            System.out.println("Iguais");
        } else {
            System.out.println("Não iguais");
        }
    }

    public static int count(String[] list, String target) {
        int count = 0;
        for (String n : list) {
            if (n.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static boolean equals(String[] list1, String[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (!(list1[i].equals(list2[i]))) {
                return false;
            }
        }
        return true;
    }
    private static void Exercicio11() {
        int[] data = {7, -1, 13, 24, 6};
        printBackwards(data);
    }

    private static void printBackwards(int[] data) {
        String texto = "";
        for (int i=0; i<data.length;i++){
            texto = data[i] + " " + texto;
        }
        System.out.print(texto);
    }

    private static void Exercicio10() {
        int[] data = {7, -1, 13, 24, 6};
        for (int i= 0;i<data.length;i++) {
            System.out.printf("element [%s] is %s\n",i ,data[i]);
        }
    }

    //Write code that computes the average (arithmetic mean) of all elements in an array of integers and returns the
// answer as //a double. For example, if the array passed contains the values {1, –2, 4, –4, 9, –6, 16, –8, 25, –10},
// the calculated average should be 2.5.
    public static void Exercicio08(){
        int[] numeros = {1,-2, 4,-4, 9,-6, 16,-8, 25,-10};
        System.out.print("Média: " +average(numeros));
    }

    private static double average(int[] list) {
        double media = 0;
        int soma = 0;
        for (int n : list) {
            soma += n;
        }
        media = 1.0*soma/list.length;
        return media;
    }

    //Write a piece of code that examines an array of integers and reports the maximum value in the array. Consider
//putting your code into a method called max that accepts the array as a parameter and returns the maximum value.
    private static void Exercicio07() {
        int[] data = {7, -1, 13, 24, 6, 32};
        System.out.print(max(data));
    }
    public static int max(int[] list) {
        int maior = list[0];
        for (int n : list) {
            if (n > maior){
                maior = n;
            }
        }
        return maior;
    }

    private static void Exercicio06() {
        //int[] data = new int [7, -1, 13, 24, 6];
        int[] data = {7, -1, 13, 24, 6};
        for (int i= 0;i<data.length;i++){
            System.out.printf("[%s] ", data[i]);
        }
    }

    //Write code that stores all odd numbers between 6 and 38 into an array using a loop.
    // Make the array’s size exactly large enough to store the numbers.
    private static void Exercicio03() {
        int minimo = -6;
        int maxino = 38;
        if (maxino%2!=0){
            maxino -= 1;
        }
        int tamanho = 1+(maxino - minimo)/2;
        int[] numbers = new int[tamanho];

        for (int i= 0;i<numbers.length;i++){
            if (minimo%2!=0){
                minimo += 1;
            }

            numbers[i] = minimo + 2*i;
        }
        for (int i= 0;i<numbers.length;i++){
            System.out.printf("[%s] ", numbers[i]);
        }

    }


    private static void Exercicio02() {
        int[] numbers = new int[5];
        numbers[0] = 27;
        numbers[1] = 51;
        numbers[2] = 33;
        numbers[3] = -1;
        numbers[4] = 101;
        for (int i= 0;i<numbers.length;i++){
            System.out.printf("[%s] ",numbers[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }

}
