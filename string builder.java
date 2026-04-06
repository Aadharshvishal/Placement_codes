public class StringBuilderExample {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);
        sb.replace(6, 10, "Programming");
        System.out.println("After replace: " + sb);
        sb.delete(6, 17);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
        char ch = sb.charAt(2);
        System.out.println("Character at index 2: " + ch);
        sb.setCharAt(1, 'X');
        System.out.println("After setCharAt: " + sb);
        sb.deleteCharAt(1);
        System.out.println("After deleteCharAt: " + sb);
        int len = sb.length();
        System.out.println("Length of StringBuilder: " + len);
    }
}