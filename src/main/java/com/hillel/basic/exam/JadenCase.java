package com.hillel.basic.exam;

/**
 * Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
 * Jaden is also known for some of his philosophy that he delivers via Twitter.
 * When writing on Twitter, he is known for almost always capitalizing every word.
 * <p>
 * Your task is to convert strings to how they would be written by Jaden Smith.
 * The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
 * <p>
 * Example:
 * <p>
 * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
 * Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 * <p>
 * Note that the Java version expects a return value of null for an empty string or null.
 */
public class JadenCase {

    public String toJadenCase(String phrase) {

        String result = "";

        StringBuilder builder = new StringBuilder(phrase);

        if(phrase==null){

            //result ="Must return null when the arg is null";
            result=null;
            return result ;
        }
        if (phrase==""){

            return null;
                    //"Must return null when the arg is null";
        }
        if (Character.isAlphabetic(phrase.codePointAt(0))) {
            builder.setCharAt(0, Character.toUpperCase(phrase.charAt(0)));
        }

        for (int i = 1; i < phrase.length(); i++) {
            if (Character.isAlphabetic(phrase.charAt(i)) && Character.isSpaceChar(phrase.charAt(i - 1))) {

                builder.setCharAt(i, Character.toUpperCase(phrase.charAt(i)));
            }
        }
            result = builder.toString();


            return result;
        }
    }

