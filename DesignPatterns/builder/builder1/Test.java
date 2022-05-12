package DesignPatterns.builder.builder1;

public class Test {
    public static void main(String[] args) {
        // Directory directory = new Directory(new VillaBuilder());
        // System.out.println(directory.doBuild().toString());

        try {

            House house = (House) Class.forName("DesignPatterns.builder.builder1.House").newInstance();

            System.out.println(house.toString());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
