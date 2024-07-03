package Hashing;

public class GCDOfStrings {

        private static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    
        public String gcdOfStrings(String str1, String str2) {
            // str1 and str2 length must be divisible by res length
            // use shortest string to start
            int len = gcd(str1.length(), str2.length());
            int mini = Math.min(str1.length(), str2.length());
            String res = "";
    
            for (int i = 0; (i + 1) * len <= mini; i++) {
                String prefix1 = str1.substring(len * i, len * (i + 1));
                String prefix2 = str2.substring(len * i, len * (i + 1));
                if (prefix1.equals(prefix2)) {
                    int a = str1.length() / len;
                    int b = str2.length() / len;
                    String stri = prefix1.repeat(a);
                    String strj = prefix2.repeat(b);
                    if (stri.equals(str1) && strj.equals(str2)) {
                        res = prefix1;
                    }
                }
            }
            return res;
        }
    }
    
