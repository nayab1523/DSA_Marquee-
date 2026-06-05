public class reading_books {


        public int maxPoint(int k, int[] arr1, int[] arr2) {

            int maxPoints = 0;

            for (int i = 0; i < arr1.length; i++) {

                int reads = k / arr1[i];

                int points = reads * arr2[i];

                if (points > maxPoints) {
                    maxPoints = points;
                }
            }

            return maxPoints;

    }



        public static void main(String[] args) {

            reading_books obj = new reading_books();

            int k = 10;

            int[] arr1 = {2, 3, 5};

            int[] arr2 = {4, 5, 10};

            int ans = obj.maxPoint(k, arr1, arr2);

            System.out.println("Maximum Points = " + ans);
        }
    }

