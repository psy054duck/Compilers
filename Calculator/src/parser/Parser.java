package parser;

import parser.token.*;
import parser.production.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Parser {
    private Scanner scanner;
    private ArrayList<Token> stack = new ArrayList<Token>();

    public Parser(String expression) {
        scanner = new Scanner(expression);
    }

    public void parse() {

    }

    private void shift() {
        stack.add(scanner.getNextToken());
    }

    private void reduce(int index) {
    }
}

class Grammer {
    private ArrayList<Production> productions;
    
}

class Table {
    private HashMap map = new HashMap();
    private final char[][] table = {
        {'>', '>', '<', '<',},
        {'>', '>', '<', '<',},
        {'>', '>', '>', '>',},
        {'>', '>', '>', '>',},
        {'>', '>', '>', '<',},
    };

    public Table() {
        String[] symbols = "+ - * / ^".split(" ");
        for (int i = 0; i < symbols.length; ++i) {
            map.put(symbols[i], i);
        }
    }

    public char get(String left, String right) {
        return table[(int) map.get(left)][(int) map.get(right)];
    }
}
