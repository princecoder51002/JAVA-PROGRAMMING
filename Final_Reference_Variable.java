class Final_Reference_Variable {

    public static void main(String args[]) {
        final MEDIA M = new MEDIA("Geeks");

        M.show();

        M.append("Geeks");

        M.show();
    }

}

class MEDIA {
    String name;

    MEDIA(String s) {
        name = s;
    }

    void show() {
        System.out.println(name);
    }

    void append(String S) {
        name = S + "for Geeks";
    }
}