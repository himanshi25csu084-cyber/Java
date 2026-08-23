public class BitMaskUtility{
    static boolean isBitSet(int number, int position){
        if(
            (number&(1<<position))!=0
        ){
            return true;
        }
        else{
            return false;
        }
    }
    static int setBit(int number, int position){
        return number | (1<<position);
    }
    static int clearBit(int number, int position){
        return number & ~(1<<position);
    }
    static int toggleBit(int number, int position){
        return number ^ (1<<position);
    }
    static String toBinary32(int number){
        return Integer.toBinaryString(number);
    }
}