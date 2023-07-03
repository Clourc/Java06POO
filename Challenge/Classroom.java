class Classroom {
    public static void main(String[] args){
        Wilder damien = new Wilder("Damien", false);
        Wilder brivael = new Wilder("Brivael", false);
        Wilder marcos = new Wilder("Marcos", true);

        System.out.println(damien.whoAmI());
        System.out.println(brivael.whoAmI());
        System.out.println(marcos.whoAmI());
    }
}