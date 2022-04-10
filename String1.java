public class String1 {
    public static void main(String[] args) {
        String message  = "My Name Is " + "Ayush Aditya  ";
        System.out.println(message);
        System.out.println(message.endsWith("Aditya"));
        System.out.println(message.endsWith("My"));
        System.out.println(message.startsWith("My"));
        System.out.println(message.startsWith("Aditya"));
        System.out.println(message.length());
        System.out.println(message.indexOf("A"));
        System.out.println(message.replace("A", "M"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

    }
    
}
