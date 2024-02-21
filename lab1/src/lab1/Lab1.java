/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author tahshin
 */
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //took all possible java keywords from oracle 
        final String[] keywords = {"int", "byte", "short", "long", "float", "double", "boolean", "char",
            "abstract", "assert", "break", "case", "catch", "class", "const", "continue",
            "default", "do", "else", "enum", "extends", "final", "finally", "for", "goto",
            "if", "implements", "import", "instanceof", "interface", "native", "new",
            "package", "private", "protected", "public", "return", "static", "strictfp",
            "super", "switch", "synchronized", "this", "throw", "throws", "transient",
            "try", "void", "volatile", "while"};

        final String[] math_operators = {"+", "-", "*", "/", "="};

        final String[] logical_operators = {"==", "!=", ">", "<", ">=", "<=", "&&", "||", "!"};

        File inputFile = new File("C:\\Users\\tahsh\\Desktop\\input.txt");

        ArrayList<String> inputCode = new ArrayList<>();
        ArrayList<String> keywordsList = new ArrayList<>();
        ArrayList<String> identifiersList = new ArrayList<>();
        ArrayList<String> mathOperatorsList = new ArrayList<>();
        ArrayList<String> logicalOperatorsList = new ArrayList<>();
        ArrayList<String> numericalValuesList = new ArrayList<>();
        ArrayList<String> othersList = new ArrayList<>();
        int i, j, k;

        Scanner sc = new Scanner(inputFile);
        while (sc.hasNextLine()) {
            String readData = sc.nextLine();
            inputCode.add(readData);
        }

        String[] codeString = new String[inputCode.size()];
        for (i = 0; i < inputCode.size(); i++) {
            codeString[i] = inputCode.get(i);
        }

        for (i = 0; i < codeString.length; i++) {
            for (j = 0; j < keywords.length; j++) {
                if (codeString[i].contains(keywords[j]) && !keywordsList.contains(keywords[j])) {
                    keywordsList.add(keywords[j]);
                    for (k = 0; k < codeString.length; k++) {
                        while (codeString[k].contains(keywords[j])) {
                            codeString[k] = codeString[k].replace(keywords[j], "");
                        }
                    }
                }
            }
        }

        for (i = 0; i < codeString.length; i++) {
            for (j = 0; j < math_operators.length; j++) {
                if (codeString[i].contains(math_operators[j]) && !mathOperatorsList.contains(math_operators[j])) {
                    mathOperatorsList.add(math_operators[j]);
                    for (k = 0; k < codeString.length; k++) {
                        while (codeString[k].contains(math_operators[j])) {
                            codeString[k] = codeString[k].replace(math_operators[j], "");
                        }
                    }
                }
            }
        }

        for (i = 0; i < codeString.length; i++) {
            for (j = 0; j < logical_operators.length; j++) {
                if (codeString[i].contains(logical_operators[j]) && !logicalOperatorsList.contains(logical_operators[j])) {
                    logicalOperatorsList.add(logical_operators[j]);
                    for (k = 0; k < codeString.length; k++) {
                        while (codeString[k].contains(logical_operators[j])) {
                            codeString[k] = codeString[k].replace(logical_operators[j], "");
                        }
                    }
                }
            }
        }

        Pattern indentifier = Pattern.compile("[a-z]");
        for (i = 0; i < codeString.length; i++) {
            for (char ch : codeString[i].toCharArray()) {
                String chString = String.valueOf(ch);
                Matcher m = indentifier.matcher(chString);
                if (m.find() && !identifiersList.contains(chString)) {
                    identifiersList.add(chString);
                    for (k = 0; k < codeString.length; k++) {
                        while (codeString[k].contains(chString)) {
                            codeString[k] = codeString[k].replace(chString, "");
                        }

                    }
                }
            }
        }
        Pattern numericalValues = Pattern.compile("[1-9]");
        for (i = 0; i < codeString.length; i++) {
            for (char ch : codeString[i].toCharArray()) {
                String chString = String.valueOf(ch);
                Matcher m = numericalValues.matcher(chString);
                if (m.find() && !numericalValuesList.contains(chString)) {
                    numericalValuesList.add(chString);
                    for (k = 0; k < codeString.length; k++) {
                        while (codeString[k].contains(chString)) {
                            codeString[k] = codeString[k].replace(chString, "");
                        }

                    }
                }
            }
        }
        Pattern others = Pattern.compile("[^a-z0-9.]");
        for (i = 0; i < codeString.length; i++) {
            for (char ch : codeString[i].toCharArray()) {
                String chString = String.valueOf(ch);
                Matcher m = others.matcher(chString);
                if (m.find() && !othersList.contains(chString)) {
                    othersList.add(chString);
                    for (k = 0; k < codeString.length; k++) {
                        while (codeString[k].contains(chString)) {
                            codeString[k] = codeString[k].replace(chString, "");
                        }

                    }
                }
            }
        }
        System.out.print("Keywords : ");
        for (int p = 0; p < keywordsList.size(); p++) {
            String q1 = keywordsList.get(p);
            System.out.print(q1 + " ");
        }
        System.out.println("");
        System.out.print("Identifiers : ");
        for (int p = 0; p < identifiersList.size(); p++) {
            String q1 = identifiersList.get(p);
            System.out.print(q1 + " ");
        }
        System.out.println("");
        System.out.print("Math Operators : ");
        for (int p = 0; p < mathOperatorsList.size(); p++) {
            String q1 = mathOperatorsList.get(p);
            System.out.print(q1 + " ");
        }
        System.out.println("");
        System.out.print("Logical Operators : ");
        for (int p = 0; p < logicalOperatorsList.size(); p++) {
            String q1 = logicalOperatorsList.get(p);
            System.out.print(q1 + " ");
        }
        System.out.println("");
        System.out.print("Numerical Values : ");
        for (int p = 0; p < numericalValuesList.size(); p++) {
            String q1 = numericalValuesList.get(p);
            System.out.print(q1 + " ");
        }
        System.out.println("");
        System.out.print("Others : ");
        for (int p = 0; p < othersList.size(); p++) {
            String q1 = othersList.get(p);
            System.out.print(q1 + " ");
        }
    }
}
