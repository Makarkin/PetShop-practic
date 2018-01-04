package PetShopPackage.AnimalsPackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include= JsonTypeInfo.As.PROPERTY, property="Animal")
public interface Animal {
    String getBreed();
    String getName();
    String getCharacter();
    int getCost();
    void setDegreeOfPollution(Integer degreeOfPollution);
}
