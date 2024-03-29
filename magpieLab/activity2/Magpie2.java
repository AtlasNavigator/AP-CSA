/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @author Jose Prieto
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if ((statement.trim().length() > 0)) {
            if (statement.indexOf("no") >= 0)
            {
                response = "Why so negative?";
            }
            else if (statement.indexOf("mother") >= 0
            || statement.indexOf("father") >= 0
            || statement.indexOf("sister") >= 0
            || statement.indexOf("brother") >= 0)
            {
                response = "Tell me more about your family.";
            }
            else if (statement.indexOf("pet") >= 0
            || statement.indexOf("rat") >= 0
            || statement.indexOf("dog") >= 0
            || statement.indexOf("cat") >= 0
            || statement.indexOf("parrot") >= 0)
            {
                response = "Tell me about your pets.";
            } else if (statement.indexOf("teacher") >= 0
            || statement.indexOf("robotics") >= 0
            || statement.indexOf("algebra") >= 0
            || statement.indexOf("English") >= 0
            || statement.indexOf("AP Computer Science") >= 0)
            {
                response = "They sound like a good teacher, tell me more.";
            }
            else
            {
                response = getRandomResponse();
            }
            return response;
        } else {
            response = "I'd like to hear what you have to say";
        } return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        } 
        else if (whichResponse == 4)
        {
            response = "Go on.";
        }
        else if (whichResponse == 5)
        {
            response = "Interesting, I'd like to hear more.";
        }

        return response;
    }
}
