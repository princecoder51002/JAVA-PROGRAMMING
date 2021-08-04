// import lib.loops.SumN; // single-type-import decleration
// import lib.loops.FactN; // sigle-type-import decleration

import lib.loops.*; // import all files
import lib.decisions.*; // import all files

import lib.loops.Fun; // type-import-on demand decleration (higher priority)

class UsePack {

    public static void main(String args[]) {
        SumN sn = new SumN();
        int m = sn.sum(5);

        Fun f = new Fun(); // it will give ambiguity error to solve this we will give type-import-on demand
                           // decleration
        f.dofun();

        System.out.println("sum = " + m);

        lib.loops.FactN fn = new lib.loops.FactN(); // fully-qualified path
        int facto = fn.Factorial(5);

        System.out.println("factorial = " + facto);

        Max2 p = new Max2();
        int max1 = p.getmax2(2, 4);

        Max3 n = new Max3();
        int max2 = n.getmax3(2, 4, 6);

        System.out.println("max1 = " + max1);
        System.out.println("max2 = " + max2);
    }
}
