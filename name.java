class name {
    public static void main(String[]args) {
        String str = "raffin";
        int b=str.length();
        char[] c=str.toCharArray();
        for (int i=0;i<b;i++)
        {
            if (!(i%2==0)) {
                String b1= String.valueOf(c[i]);
                System.out.print(b1.toUpperCase());
            }
            else
            {
                System.out.print(c[i]);
            }

        }
    }
}

