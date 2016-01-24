package com.first.Jan92016;

/**
 * Created by Geetha Yedida on 1/22/2016.
 */
public class EnumCakeUserInput extends ExceptionHandling{


    public enum cakeModelAndPrice{
        BlueCream(25), PinkCream(25),BarbieCake(60),DisneyCake(90),AngelCake(120),FrozenCake(200);
        private int value;

        private cakeModelAndPrice(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        EnumCakeUserInput enumcake = new EnumCakeUserInput();
        enumcake.welcomeMessage();
    }
}
