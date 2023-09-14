public class test1 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 6, 9};
        String[] allNames = {"John", "Jane", "Mary", "Mike"};
        String[] moreNames = new String[25];
        String name1 = allNames[0];

        for (int i = 0; i < allNames.length; i++) {
            System.out.println(allNames[i]);
        }
        for (String name : allNames) {
            System.out.println(name);
        }

        Boolean found = contain("ahmad", allNames);
        System.out.println(found);
    }

    static boolean contain(String name, String[] namesArray) {

        for (String str : namesArray) {
            if (str.equals(name)) {
                return true;
            }
        }
        return false;
    }

}
