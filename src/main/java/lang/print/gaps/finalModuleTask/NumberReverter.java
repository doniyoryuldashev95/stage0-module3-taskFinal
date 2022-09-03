package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {//567
        int hundred = 100;
        int result = 0;

        while (number>0){
            result += (number%10)*hundred;
            hundred/=10;
            number/=10;
        }
        System.out.println(result);
    }
}
