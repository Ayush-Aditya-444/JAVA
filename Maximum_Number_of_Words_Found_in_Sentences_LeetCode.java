class Solution {
    public int mostWordsFound(String[] sentences) {
        int greatest = -1;
        for(int i=0;i< sentences.length;i++){
            String a[] = sentences[i].split(" ");
            if(greatest < a.length)
                greatest = a.length;
        }
        return greatest;
    }
}