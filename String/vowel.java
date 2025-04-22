class vowel{
    public static void main(String[] args){
        String str = "deiisdfjurungdjnfurur";
        int count =0;
        char[] arr = str.toCharArray();
        for(int i =0;i<arr.length;i++){
            switch(arr[i]){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    count++;
                    break;
            
            }
        }
        System.out.println("vowel count is " + count);

    }
}