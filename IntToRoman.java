// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro.          "+intToRoman(3276));
    }
    public static String intToRoman(int n) {
        int[] v={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] s={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder res= new StringBuilder();
        int i=0;
        while(n>0){
           if(n>=v[i]){
               int times=n/v[i];
               while(times-->0){
                  res.append(s[i]);
               }
               n %= v[i];
            }
            i++;
        }
        return res.toString();
    }
    
}
