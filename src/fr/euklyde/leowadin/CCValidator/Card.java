/**
 * @author Léo Wadin <leo.wadin@euklyde.fr>
 * @version 1.0
 * @since 2022-3-10
 *
 * CCValidator
 * Card.java
 */

package fr.euklyde.leowadin.CCValidator;

public class Card {

    /**
     * Card number (Usually 16 digits but can be up to 19 digits)
     */
    private Long cardNumber;

    /**
     * Constructor : Generates a new Card object based on input.
     *
     * @param cardNumber The credit card number
     */
    public Card(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * @return The credit card number
     */
    public Long getCardNumber() {
        return cardNumber;
    }

    /**
     * @param cardNumber The credit card number to set
     */
    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Validates a card using the Luhn-10 algorithm.
     *
     * @return Boolean corresponding to the validity of the credit card
     */
    public boolean validate() {
        char[] cardChars = Long.toString(cardNumber).toCharArray();

        if(cardChars.length <= 19) {

            int sum = 0;

            for (int i = 0; i < cardChars.length-1; i++) {

                int digit = Integer.parseInt(String.valueOf(cardChars[i]));

                if(i % 2 == 0) {

                    digit = digit * 2;

                    if(digit > 9) {
                        sum += (1 + (digit % 10));
                    } else {
                        sum += digit;
                    }

                } else {
                    sum += digit;
                }
            }

            return (sum + Integer.parseInt(String.valueOf(cardChars[cardChars.length-1]))) % 10 == 0;

        } else return false;
    }
}
