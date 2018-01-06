package petshop.animals;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include= JsonTypeInfo.As.PROPERTY, property="Animal")
public interface Animal {

    /**
     * This method outputs the "breed"-value
     * from instance of class with
     * the implemented interface "Animal".
     * @return String field "breed" value.
     */
    String getBreed();

    /**
     * This method outputs the "Name"-value
     * from instance of class with
     * the implemented interface "Animal".
     * @return String field "name" value.
     */
    String getName();

    /**
     * This method outputs the "character"-value
     * from instance of class with
     * the implemented interface "Animal".
     * @return String field "character" value.
     */
    String getCharacter();

    /**
     * This method outputs the "cost"-value
     * from instance of class with
     * the implemented interface "Animal".
     * @return integer field "cost" value.
     */
    int getCost();

    /**
     * This method inputs the "degreeOfPollution"-value
     * in instance of class with
     * the implemented interface "Animal".
     * @param degreeOfPollution - is an integer parameter that is inserted into
     *                            the field "degreeOfPollution".
     */
    void setDegreeOfPollution(int degreeOfPollution);

    /**
     * This method outputs the "degreeOfPollution"-value
     * from instance of class with
     * the implemented interface "Animal".
     * @return integer field "getDegreeOfPollution" value.
     */
    int getDegreeOfPollution();
}
