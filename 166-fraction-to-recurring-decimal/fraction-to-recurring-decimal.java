class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0)
         return "0";
        StringBuilder fraction = new StringBuilder();
        if(numerator < 0 ^ denominator < 0)
         fraction.append("-");
         
        long num = Math.abs(numerator*1L);
        long denom = Math.abs(denominator*1L);
        fraction.append(num/denom);
        long remain = num % denom;
        if(remain == 0)
         return fraction.toString();
        fraction.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while(remain != 0){
            if(map.containsKey(remain)){
                fraction.insert(map.get(remain), "(");
                fraction.append(")");
                break;
            }
            map.put(remain, fraction.length());
            remain *= 10;
            fraction.append(remain / denom);
            remain = remain % denom;
        } 

        return fraction.toString();
    }
}