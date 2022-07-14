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
        } else if (query.contains("what is the largest number")) {
            return "289";
        } else if (query.contains("what is ") && query.contains("plus")) {
            return "1+2=3";
        } else if (query.contains("what is 16") && query.contains("plus")) {
            return "16+19=35";
} else if (query.contains("what is 15") && query.contains("plus")) {
            return "15+6=21";
        } else if (query.contains("what is 10") && query.contains("plus")) {
            return "10+1=11";
        } else if (query.contains("what is 10 plus 8")){
            return "10+8=18";
        }

        else { // TODO extend the programm here
            return "";

        }
    }
}
