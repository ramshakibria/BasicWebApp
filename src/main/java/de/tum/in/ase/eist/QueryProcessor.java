package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "ramsha";
        } else if (query.contains("which of the following numbers is the largest:")) {
            for (String number : query.split(" ")) {
                if (number.matches("\\d+")) {
                    if (Integer.parseInt(number) > Integer.parseInt(query.split(" ")[query.split(" ").length - 1])) {
                        return number;
                    }
                    return number;
                }
            }
        } else if (query.contains("what is") && query.contains("plus")) {
            String[] numbers = query.split("plus");
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]) + "";
        } else if (query.contains("what is ") && query.contains("multiplied")) {
            String[] numbers = query.split("multiplied");
            return Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]) + "";
        } else {
            return "";

        }
        return "";
    }
}
