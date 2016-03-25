
/**
 *   File Name: FarewellMessage.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 24, 2016
 *
 */

package com.sqa.ms.farewell;

import java.util.*;

/**
 * FarewellMessage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Siebenthal, Madina
 * @version 1.0.0
 * @since 1.0
 *
 */
public class FarewellMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ask user for their name and say farrewell

		System.out.println("welcome to my farewell ap");
		System.out.print("can I have your name");

		// create scenner object
		Scanner scanner = new Scanner(System.in);
		// collect name in local var name of type string
		String name = scanner.nextLine();
		System.out.println("thanks for using app " + name);
		System.out.println("bye!");
	}

}
