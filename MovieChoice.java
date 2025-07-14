public class MovieChoice {
    public static void main(String[] args) {
        int Age = 27;

        if(Age >= 17){
            System.out.println("You can see any movie you want");
        } else if(Age >=13){
            System.out.println("You can see PG-13 movies and lower");
        } else{
            System.out.println("You can only see PG movies");
        }
    }
}
