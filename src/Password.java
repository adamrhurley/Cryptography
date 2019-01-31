public class Password{
   public static String encrypt(String plaintext, int numColumns)
   {
       int numX;
       int numRows;
       String strNoSpace="";
        for(int i=0; i < plaintext.length(); i++)
        {
            if(plaintext.charAt(i) != ' ')
                strNoSpace  += plaintext.charAt(i);
        }


        if (strNoSpace.length() % numColumns == 0)
        numRows = strNoSpace.length()/numColumns;

        else
            numRows = (strNoSpace.length()/numColumns) + 1;


        numX = numColumns - (strNoSpace.length() % numColumns);

        for(int i=0; i < numX; i++)
        {
            strNoSpace += "X";
        }

       System.out.println(numRows);


        return strNoSpace;
   }
}
