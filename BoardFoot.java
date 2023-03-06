
import java.util.Scanner;

/**
* Calculates the length to make a plank equal to one board foot.
*
* @author  Keiden B
* @version 1.0
* @since   2023-03-02
*/

public final class BoardFoot {
    /**
    * Necessary to prevent HideUtilityClass Error.
    *
    * @exception IllegalStateException Utility class
    * @see IllegalStateException
    */
    private BoardFoot() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Calculating the necessary length.
    *
    * @param funcWidth The width inputted by the user
    * @param funcHeight The height inputted by the user
    * @return Returning the final length
    */
    public static double calcBoardFt(final double FUNC_WIDTH,
        final double FUNC_HEIGHT) {

        final double FUNC_LENGTH = 144 / (FUNC_WIDTH * FUNC_HEIGHT);

        return FUNC_LENGTH;
    }

    /**
    * Main lines of code.
    *
    * @param args a placeholder value when making the main function
    */
    public static void main(String[] args) {
        final Scanner GET_IN = new Scanner(System.in);

        System.out.println("Please enter a width then height. This will find "
            + "the necessary length to make 1 board foot from these inputs.");
        final String WIDTH = GET_IN.nextLine();
        final String HEIGHT = GET_IN.nextLine();

        try {
            final double WIDTH_DOU = Double.parseDouble(WIDTH);
            final double HEIGHT_DOU = Double.parseDouble(HEIGHT);

            final double LENGTH = calcBoardFt(WIDTH_DOU, HEIGHT_DOU);

            System.out.printf("The length to make the plank equal to a "
                + "board foot is %.02f\n", LENGTH);
        } catch (NumberFormatException error) {
            System.out.println("There was an invalid input! "
                + error.getMessage());
        }
        GET_IN.close();
    }
}
