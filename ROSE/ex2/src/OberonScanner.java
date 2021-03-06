/* The following code was generated by JFlex 1.4.1 on 18-1-5 下午7:47 */

import exceptions.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 18-1-5 下午7:47 from the specification file
 * <tt>oberon.flex</tt>
 */
public class OberonScanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  4,  4,  0,  0,  4,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     4,  0,  0, 38,  0,  0,  0,  0,  5,  7,  6, 29, 32, 30, 35,  0, 
     3,  2,  2,  2,  2,  2,  2,  2,  2,  2, 36, 31, 39, 37, 40,  0, 
     0, 17, 24, 23, 16, 10,  9, 25, 14,  8,  1,  1, 11, 26, 15, 21, 
    28,  1, 18, 12, 13, 27, 20, 22,  1, 19,  1, 33,  0, 34,  0,  0, 
     0, 17, 24, 23, 16, 10,  9, 25, 14,  8,  1,  1, 11, 26, 15, 21, 
    28,  1, 18, 12, 13, 27, 20, 22,  1, 19,  1,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\2\4\1\1\1\5\1\6\1\7"+
    "\15\3\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\4\3\1\30\3\3\1\31\1\32\5\3\1\33"+
    "\1\34\1\35\2\0\1\3\1\36\1\3\1\37\2\3"+
    "\1\40\3\3\1\41\1\3\1\1\1\3\1\42\1\43"+
    "\7\3\1\44\1\45\1\3\1\46\1\47\1\50\2\3"+
    "\1\51\1\52\3\3\1\53";

  private static int [] zzUnpackAction() {
    int [] result = new int[95];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\366\0\51"+
    "\0\51\0\u011f\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215"+
    "\0\u023e\0\u0267\0\u0290\0\u02b9\0\u02e2\0\u030b\0\51\0\51"+
    "\0\51\0\51\0\51\0\51\0\51\0\u0334\0\51\0\51"+
    "\0\u035d\0\u0386\0\u03af\0\244\0\u03d8\0\122\0\u0401\0\u042a"+
    "\0\u0453\0\u047c\0\122\0\u04a5\0\u04ce\0\u04f7\0\122\0\122"+
    "\0\u0520\0\u0549\0\u0572\0\u059b\0\u05c4\0\51\0\51\0\51"+
    "\0\u03d8\0\u05ed\0\u0616\0\122\0\u063f\0\122\0\u0668\0\u0691"+
    "\0\122\0\u06ba\0\u06e3\0\u070c\0\u0735\0\u075e\0\51\0\u0787"+
    "\0\122\0\122\0\u07b0\0\u07d9\0\u0802\0\u082b\0\u0854\0\u087d"+
    "\0\u08a6\0\122\0\122\0\u08cf\0\122\0\122\0\122\0\u08f8"+
    "\0\u0921\0\122\0\122\0\u094a\0\u0973\0\u099c\0\122";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[95];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\3\1\13\2\3\1\14\2\3\1\15\1\16"+
    "\1\17\1\3\1\20\1\21\1\22\1\23\1\24\1\3"+
    "\1\25\1\3\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\52\0"+
    "\3\3\4\0\25\3\15\0\1\43\2\4\4\0\25\43"+
    "\15\0\1\43\2\44\4\0\25\43\20\0\1\6\52\0"+
    "\1\45\43\0\3\3\4\0\1\3\1\46\23\3\15\0"+
    "\3\3\4\0\3\3\1\47\3\3\1\50\15\3\15\0"+
    "\3\3\4\0\6\3\1\51\16\3\15\0\3\3\4\0"+
    "\1\52\14\3\1\53\7\3\15\0\3\3\4\0\12\3"+
    "\1\54\12\3\15\0\3\3\4\0\2\3\1\55\22\3"+
    "\15\0\3\3\4\0\11\3\1\56\13\3\15\0\3\3"+
    "\4\0\1\3\1\57\10\3\1\60\12\3\15\0\3\3"+
    "\4\0\6\3\1\61\16\3\15\0\3\3\4\0\15\3"+
    "\1\62\7\3\15\0\3\3\4\0\2\3\1\63\22\3"+
    "\15\0\3\3\4\0\15\3\1\64\7\3\15\0\3\3"+
    "\4\0\12\3\1\65\12\3\61\0\1\66\50\0\1\67"+
    "\50\0\1\70\4\0\3\43\4\0\25\43\14\0\6\71"+
    "\1\72\42\71\1\0\3\3\4\0\4\3\1\73\20\3"+
    "\15\0\3\3\4\0\10\3\1\74\14\3\15\0\3\3"+
    "\4\0\2\3\1\75\22\3\15\0\3\3\4\0\14\3"+
    "\1\76\10\3\15\0\3\3\4\0\12\3\1\77\12\3"+
    "\15\0\3\3\4\0\17\3\1\100\5\3\15\0\3\3"+
    "\4\0\12\3\1\101\12\3\15\0\3\3\4\0\1\102"+
    "\24\3\15\0\3\3\4\0\7\3\1\103\15\3\15\0"+
    "\3\3\4\0\21\3\1\104\3\3\15\0\3\3\4\0"+
    "\10\3\1\105\14\3\15\0\3\3\4\0\15\3\1\106"+
    "\7\3\14\0\6\71\1\72\1\107\41\71\1\0\3\3"+
    "\4\0\1\110\1\3\1\111\22\3\15\0\3\3\4\0"+
    "\7\3\1\112\15\3\15\0\3\3\4\0\11\3\1\113"+
    "\13\3\15\0\3\3\4\0\15\3\1\114\7\3\15\0"+
    "\3\3\4\0\3\3\1\115\21\3\15\0\3\3\4\0"+
    "\4\3\1\116\20\3\15\0\3\3\4\0\1\117\24\3"+
    "\15\0\3\3\4\0\23\3\1\120\1\3\15\0\3\3"+
    "\4\0\17\3\1\121\5\3\15\0\3\3\4\0\1\3"+
    "\1\122\23\3\15\0\3\3\4\0\13\3\1\123\11\3"+
    "\15\0\3\3\4\0\12\3\1\124\12\3\15\0\3\3"+
    "\4\0\2\3\1\125\22\3\15\0\3\3\4\0\5\3"+
    "\1\126\17\3\15\0\3\3\4\0\7\3\1\127\15\3"+
    "\15\0\3\3\4\0\3\3\1\130\21\3\15\0\3\3"+
    "\4\0\2\3\1\131\22\3\15\0\3\3\4\0\10\3"+
    "\1\132\14\3\15\0\3\3\4\0\2\3\1\133\22\3"+
    "\15\0\3\3\4\0\10\3\1\134\14\3\15\0\3\3"+
    "\4\0\23\3\1\135\1\3\15\0\3\3\4\0\12\3"+
    "\1\136\12\3\15\0\3\3\4\0\2\3\1\137\22\3"+
    "\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2501];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\5\1\2\11\15\1\7\11\1\1\2\11"+
    "\25\1\3\11\2\0\14\1\1\11\30\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[95];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline+1, yycolumn+1);
    }

    private Symbol symbol(int type, String value) throws OberonException {
        if (type == Type.IDENTIFIER && yytext().length() > 24) {
            throw new IllegalIdentifierLengthException(getErrorString());
        } else if (type == Type.INTEGER && yytext().length() > 12) {
            throw new IllegalIntegerException(getErrorString());
        }
        return new Symbol(type, yyline+1, yycolumn+1, value);
    }

    private String oct2dec(String num) {
        return String.valueOf(Integer.parseInt(num, 8));
    }

    private String getErrorString() {
        return yytext() + "  line: " + Integer.toString(yyline + 1)+ "       column: " + Integer.toString(yycolumn+1);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public OberonScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public OberonScanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) throws OberonException {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new OberonException(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  throws OberonException {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Symbol yylex() throws java.io.IOException, OberonException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 34: 
          { return symbol(Type.ELSE);
          }
        case 44: break;
        case 13: 
          { return symbol(Type.RIGHTB, yytext());
          }
        case 45: break;
        case 35: 
          { return symbol(Type.THEN);
          }
        case 46: break;
        case 8: 
          { return symbol(Type.PLUS, yytext());
          }
        case 47: break;
        case 4: 
          { return symbol(Type.INTEGER, yytext());
          }
        case 48: break;
        case 42: 
          { return symbol(Type.MODULE);
          }
        case 49: break;
        case 21: 
          { String dec;
        try {
            dec = oct2dec(yytext());
        } catch (Exception e) {
            throw new IllegalOctalException(getErrorString());
        }
        return symbol(Type.INTEGER, dec);
          }
        case 50: break;
        case 41: 
          { return symbol(Type.RECORD);
          }
        case 51: break;
        case 40: 
          { return symbol(Type.BEGIN);
          }
        case 52: break;
        case 5: 
          { return symbol(Type.LEFTP, yytext());
          }
        case 53: break;
        case 24: 
          { return symbol(Type.DO);
          }
        case 54: break;
        case 20: 
          { throw new IllegalIntegerException(getErrorString());
          }
        case 55: break;
        case 23: 
          { return symbol(Type.IF);
          }
        case 56: break;
        case 28: 
          { return symbol(Type.LE, "&le");
          }
        case 57: break;
        case 15: 
          { return symbol(Type.COLON, yytext());
          }
        case 58: break;
        case 3: 
          { return symbol(Type.IDENTIFIER, yytext());
          }
        case 59: break;
        case 16: 
          { return symbol(Type.EQ, yytext());
          }
        case 60: break;
        case 37: 
          { return symbol(Type.ARRAY);
          }
        case 61: break;
        case 11: 
          { return symbol(Type.COMMA, yytext());
          }
        case 62: break;
        case 26: 
          { return symbol(Type.OR);
          }
        case 63: break;
        case 12: 
          { return symbol(Type.LEFTB, yytext());
          }
        case 64: break;
        case 43: 
          { return symbol(Type.PROCEDURE);
          }
        case 65: break;
        case 27: 
          { return symbol(Type.ASSIGN, yytext());
          }
        case 66: break;
        case 36: 
          { return symbol(Type.ELSIF);
          }
        case 67: break;
        case 30: 
          { return symbol(Type.END);
          }
        case 68: break;
        case 29: 
          { return symbol(Type.GE, "&ge");
          }
        case 69: break;
        case 17: 
          { return symbol(Type.NE, yytext());
          }
        case 70: break;
        case 38: 
          { return symbol(Type.WHILE);
          }
        case 71: break;
        case 9: 
          { return symbol(Type.MINUS, yytext());
          }
        case 72: break;
        case 18: 
          { return symbol(Type.LT, "&lt");
          }
        case 73: break;
        case 22: 
          { throw new MismatchedCommentException(getErrorString());
          }
        case 74: break;
        case 31: 
          { return symbol(Type.DIV);
          }
        case 75: break;
        case 33: 
          { return symbol(Type.MOD);
          }
        case 76: break;
        case 25: 
          { return symbol(Type.OF);
          }
        case 77: break;
        case 19: 
          { return symbol(Type.GT, "&gt");
          }
        case 78: break;
        case 7: 
          { return symbol(Type.RIGHTP, yytext());
          }
        case 79: break;
        case 10: 
          { return symbol(Type.SEMI, yytext());
          }
        case 80: break;
        case 6: 
          { return symbol(Type.TIMES, yytext());
          }
        case 81: break;
        case 2: 
          { throw new IllegalSymbolException(getErrorString());
          }
        case 82: break;
        case 39: 
          { return symbol(Type.CONST);
          }
        case 83: break;
        case 32: 
          { return symbol(Type.VAR);
          }
        case 84: break;
        case 1: 
          { 
          }
        case 85: break;
        case 14: 
          { return symbol(Type.DOT, yytext());
          }
        case 86: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              {
                return symbol(Type.EOF);
              }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
