package problems.easy;

public class Fibnoci {


    public int Fibnoci(int n){
        if (n <= 1)
            return n;

        return Fibnoci(n-1)+Fibnoci(n-2);
    }

    public static void main(String[] args) {
        Fibnoci f = new Fibnoci();
        System.out.println(f.Fibnoci(6));
    }
}
