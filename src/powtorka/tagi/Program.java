package powtorka.tagi;

public class Program {

    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args.length);

        Post post = new Post("Programowanie jest super", "michalos");
        post.addTag(new Tag("programowanie"));
        post.addTag(new Tag("java"));
        post.addTag(new Tag("programowanie"));

        System.out.println(post);




    }
}
