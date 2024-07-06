package Math;

public class PassTheWillow {
    public int passThePillow(int n, int time) {
        if((time/(n-1))%2 != 0){
            return n - ((time%(n-1)));
        }else{
            return 1 + ((time%(n-1)));
        }
    }
}
