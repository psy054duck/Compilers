package parser.production;

abstract class Production {
    private String head;
    private String[] body;

    public abstract Token action(ArrayList<Token> tokens);

    public Production(String h, String[] b) {
        head = h;
        body = b;
    }

    public int bodyLength() {
        return body.length;
    }
}
