package org.example;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class CharsOfString {
   public void traverseString(String str){

       char[] ch = str.toCharArray();

       // Traverse the character array
       for (int i = 0; i < ch.length; i++) {

           // Print current character
           System.out.print(ch[i] + " "+"\n");
       }

//       Time Complexity: O(N)
//       Auxiliary Space: O(N)

       //Thru CharacterIterator
       System.out.println("Using CharacterIterator:");
       CharacterIterator ci = new StringCharacterIterator(str);

       while(ci.current() != CharacterIterator.DONE){
           System.out.println(ci.current());
           ci.next();
       }
//       Time Complexity: O(N)
//       Auxiliary Space: O(1)

   }
}
