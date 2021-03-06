package parser.production;

import parser.token.*;
import exceptions.*;

import java.util.ArrayList;

public class Production6 extends Production {
    public Production6() {
        super("ArithExpr", new String[] {"-", "ArithExpr"});
    }

    public Token action(ArrayList<Token> tokens) throws TypeMismatchedException {
        if (tokens.get(0).getType().equals("BoolExpr")) {
            throw new TypeMismatchedException();
        }
        double res = -Double.valueOf(tokens.get(0).getValue());
        return new Token(String.valueOf(res), "ArithExpr");
    }
}
