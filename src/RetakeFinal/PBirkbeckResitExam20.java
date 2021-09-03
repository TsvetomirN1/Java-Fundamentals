package RetakeFinal;

        public class PBirkbeckResitExam20 {


            public static void main(String[] args) {
                int[] v = { 1, 2, 3, 4 };
                print(v);
                for (int i = 1; i < v.length; i++) {
                    fiddle(v, i, v[i]);
                    print(v);
                }
            }
            public static void fiddle(int[] a, int idx, int v) {
                a[idx] = a[idx - 1] + v;
            }
            public static void print(int[] array) {
                System.out.print(array[0]);
                for (int i = 1; i < array.length; i++)
                    System.out.print(", " + array[i]);
                System.out.println();
            }
        }



