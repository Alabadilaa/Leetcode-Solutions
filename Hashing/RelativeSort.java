package Hashing;

public class RelativeSort {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int len = 0;
            for (int k = 0; k < arr1.length; k++) {
                len = Math.max(len, arr1[k]);
            }
            int[] counts = new int[len+1];
            int[] ans = new int[arr1.length];
    
            for (int j = 0; j < arr1.length; j++) {
                counts[arr1[j]]++;
            }
    
            int idx = 0;
    
            for (int i = 0; i < arr2.length; i++) {
                while(counts[arr2[i]] > 0 ) {
                    ans[idx] = arr2[i];
                    idx++;
                    counts[arr2[i]]--;
                }
            }
    
            for (int i = 0; i < counts.length; i++) {
                while (counts[i] > 0) {
                    ans[idx] = i;
                    idx++;
                    counts[i]--;
                }
            }
    
            return ans;
        }
    }

