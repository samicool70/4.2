public class method {
    public static void main(String args[]){

        exponent();
        perfectsquareroot();
        absolute();
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(4.0));
        System.out.println(Math.abs(-9));
        System.out.println(Math.random());
        System.out.println(Math.max(7,9));
        System.out.println(Math.min(7,9));
        System.out.println(Math.round(4.1));
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.floor(5.9));
    }
    public static void exponent(){
        double hOfx;
        double x;
        x=2;
        hOfx=x*x*x*x*x*x*x*x*x*x;
        System.out.println(hOfx);
    }

    public static void perfectsquareroot(){
        int i=1,n=81,s;
        s=1;
        while(s<n){
            s=i*i;
            i++;
        }
        System.out.println(i-1);}

    public static void absolute(){
        int n=-8;
        if(n<0){
            System.out.println(n*-1);
        }
        else {System.out.println(n);}
    }

}