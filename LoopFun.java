import java.io.OutputStream;

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number)
      {
            if(number < 0)
            {
              return null;
              // No idea how to return NaN?  Maybe return 0/0;?  Lol.
            }
            else if(number == 0 || number == 1)
            {
                return 1;
            }
            else
            {
                return (number * factorial(number - 1));
            }
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
        public String acronym(String phrase)
        {
            String outpuString = "";
            String letter = Character.toString(phrase.charAt(0));
            letter = letter.toUpperCase();
            outpuString += letter;

            for(int i = 0; i < phrase.length(); i++)
            {
                if(phrase.charAt(i) == ' ')
                {
                    letter = Character.toString(phrase.charAt(i + 1));
                    letter = letter.toUpperCase();
                    outpuString += letter;
                }
            }

            return outpuString;
        }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
        public String encrypt(String word)
        {
            String output = "";
            char[] message = word.toCharArray();

            for(char letter : message)
            {
                int charValue = (int) letter;
                char c;

                if(charValue >= 120)
                {
                    charValue -= 23;
                }
                else
                {
                    charValue += 3;
                }
                c = (char) charValue;
                output += Character.toString(c);
            }

            return output;
        }
}