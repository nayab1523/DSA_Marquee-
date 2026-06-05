public class Missing_Numbers {


        public int missingNumber(int[] nums) {
            int range = nums.length;

            int actSum = (range * (range + 1)) / 2;

            int currSum = 0;

            for (int i = 0; i < nums.length; i++) {
                currSum = currSum + nums[i];
            }

            int ans = actSum - currSum;

            return ans;
        }

        public static void main(String[] args) {

            Missing_Numbers obj = new Missing_Numbers();

            int[] nums = {3, 0, 1};

            int result = obj.missingNumber(nums);

            System.out.println(result);
        }
    }

