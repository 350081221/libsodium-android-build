package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class Metaphone implements StringEncoder {
    private String vowels = "AEIOU";
    private String frontv = "EIY";
    private String varson = "CSPTG";
    private int maxCodeLen = 4;

    public String metaphone(String txt) {
        char c5;
        boolean hard;
        if (txt == null || txt.length() == 0) {
            return "";
        }
        if (txt.length() == 1) {
            return txt.toUpperCase();
        }
        char[] inwd = txt.toUpperCase().toCharArray();
        StringBuffer local = new StringBuffer(40);
        StringBuffer code = new StringBuffer(10);
        int n5 = 0;
        char c6 = inwd[0];
        char c7 = 'G';
        if (c6 != 'A') {
            if (c6 == 'G' || c6 == 'K' || c6 == 'P') {
                if (inwd[1] == 'N') {
                    local.append(inwd, 1, inwd.length - 1);
                } else {
                    local.append(inwd);
                }
            } else {
                switch (c6) {
                    case 'W':
                        if (inwd[1] == 'R') {
                            local.append(inwd, 1, inwd.length - 1);
                            break;
                        } else if (inwd[1] == 'H') {
                            local.append(inwd, 1, inwd.length - 1);
                            local.setCharAt(0, 'W');
                            break;
                        } else {
                            local.append(inwd);
                            break;
                        }
                    case 'X':
                        inwd[0] = 'S';
                        local.append(inwd);
                        break;
                    default:
                        local.append(inwd);
                        break;
                }
            }
        } else if (inwd[1] == 'E') {
            local.append(inwd, 1, inwd.length - 1);
        } else {
            local.append(inwd);
        }
        int wdsz = local.length();
        while (code.length() < getMaxCodeLen() && n5 < wdsz) {
            char symb = local.charAt(n5);
            if (symb != 'C' && isPreviousChar(local, n5, symb)) {
                n5++;
                c5 = c7;
            } else {
                switch (symb) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        c5 = 'G';
                        if (n5 == 0) {
                            code.append(symb);
                            break;
                        }
                        break;
                    case 'B':
                        c5 = 'G';
                        if (!isPreviousChar(local, n5, 'M') || !isLastChar(wdsz, n5)) {
                            code.append(symb);
                            break;
                        }
                        break;
                    case 'C':
                        c5 = 'G';
                        if (!isPreviousChar(local, n5, 'S') || isLastChar(wdsz, n5) || this.frontv.indexOf(local.charAt(n5 + 1)) < 0) {
                            if (regionMatch(local, n5, "CIA")) {
                                code.append('X');
                                break;
                            } else if (!isLastChar(wdsz, n5) && this.frontv.indexOf(local.charAt(n5 + 1)) >= 0) {
                                code.append('S');
                                break;
                            } else if (isPreviousChar(local, n5, 'S') && isNextChar(local, n5, 'H')) {
                                code.append('K');
                                break;
                            } else if (isNextChar(local, n5, 'H')) {
                                if (n5 == 0 && wdsz >= 3 && isVowel(local, 2)) {
                                    code.append('K');
                                    break;
                                } else {
                                    code.append('X');
                                    break;
                                }
                            } else {
                                code.append('K');
                                break;
                            }
                        }
                        break;
                    case 'D':
                        if (!isLastChar(wdsz, n5 + 1)) {
                            c5 = 'G';
                            if (isNextChar(local, n5, 'G') && this.frontv.indexOf(local.charAt(n5 + 2)) >= 0) {
                                code.append('J');
                                n5 += 2;
                                break;
                            }
                        } else {
                            c5 = 'G';
                        }
                        code.append('T');
                        break;
                    case 'F':
                    case 'J':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'R':
                        code.append(symb);
                        break;
                    case 'G':
                        if ((!isLastChar(wdsz, n5 + 1) || !isNextChar(local, n5, 'H')) && ((isLastChar(wdsz, n5 + 1) || !isNextChar(local, n5, 'H') || isVowel(local, n5 + 2)) && (n5 <= 0 || (!regionMatch(local, n5, "GN") && !regionMatch(local, n5, "GNED"))))) {
                            if (isPreviousChar(local, n5, 'G')) {
                                hard = true;
                            } else {
                                hard = false;
                            }
                            if (!isLastChar(wdsz, n5) && this.frontv.indexOf(local.charAt(n5 + 1)) >= 0 && !hard) {
                                code.append('J');
                                break;
                            } else {
                                code.append('K');
                                break;
                            }
                        }
                        break;
                    case 'H':
                        if (!isLastChar(wdsz, n5) && ((n5 <= 0 || this.varson.indexOf(local.charAt(n5 - 1)) < 0) && isVowel(local, n5 + 1))) {
                            code.append('H');
                            break;
                        }
                        break;
                    case 'K':
                        if (n5 > 0) {
                            if (!isPreviousChar(local, n5, 'C')) {
                                code.append(symb);
                                break;
                            }
                        } else {
                            code.append(symb);
                            break;
                        }
                        break;
                    case 'P':
                        if (isNextChar(local, n5, 'H')) {
                            code.append('F');
                            break;
                        } else {
                            code.append(symb);
                            break;
                        }
                    case 'Q':
                        code.append('K');
                        break;
                    case 'S':
                        if (regionMatch(local, n5, "SH") || regionMatch(local, n5, "SIO") || regionMatch(local, n5, "SIA")) {
                            code.append('X');
                            break;
                        } else {
                            code.append('S');
                            break;
                        }
                        break;
                    case 'T':
                        if (regionMatch(local, n5, "TIA") || regionMatch(local, n5, "TIO")) {
                            code.append('X');
                            break;
                        } else if (!regionMatch(local, n5, "TCH")) {
                            if (regionMatch(local, n5, "TH")) {
                                code.append('0');
                                break;
                            } else {
                                code.append('T');
                                break;
                            }
                        }
                        break;
                    case 'V':
                        code.append('F');
                        break;
                    case 'W':
                    case 'Y':
                        if (!isLastChar(wdsz, n5) && isVowel(local, n5 + 1)) {
                            code.append(symb);
                            break;
                        }
                        break;
                    case 'X':
                        code.append('K');
                        code.append('S');
                        break;
                    case 'Z':
                        code.append('S');
                        break;
                }
                c5 = 'G';
                n5++;
            }
            if (code.length() > getMaxCodeLen()) {
                code.setLength(getMaxCodeLen());
            }
            c7 = c5;
        }
        return code.toString();
    }

    private boolean isVowel(StringBuffer string, int index) {
        return this.vowels.indexOf(string.charAt(index)) >= 0;
    }

    private boolean isPreviousChar(StringBuffer string, int index, char c5) {
        if (index <= 0 || index >= string.length()) {
            return false;
        }
        boolean matches = string.charAt(index + (-1)) == c5;
        return matches;
    }

    private boolean isNextChar(StringBuffer string, int index, char c5) {
        if (index < 0) {
            return false;
        }
        if (index >= string.length() - 1) {
            return false;
        }
        boolean matches = string.charAt(index + 1) == c5;
        return matches;
    }

    private boolean regionMatch(StringBuffer string, int index, String test) {
        if (index < 0 || (test.length() + index) - 1 >= string.length()) {
            return false;
        }
        String substring = string.substring(index, test.length() + index);
        boolean matches = substring.equals(test);
        return matches;
    }

    private boolean isLastChar(int wdsz, int n5) {
        return n5 + 1 == wdsz;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object pObject) throws EncoderException {
        if (!(pObject instanceof String)) {
            throw new EncoderException("Parameter supplied to Metaphone encode is not of type java.lang.String");
        }
        return metaphone((String) pObject);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String pString) {
        return metaphone(pString);
    }

    public boolean isMetaphoneEqual(String str1, String str2) {
        return metaphone(str1).equals(metaphone(str2));
    }

    public int getMaxCodeLen() {
        return this.maxCodeLen;
    }

    public void setMaxCodeLen(int maxCodeLen) {
        this.maxCodeLen = maxCodeLen;
    }
}
