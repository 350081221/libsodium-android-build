package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class RefinedSoundex implements StringEncoder {
    public static final RefinedSoundex US_ENGLISH = new RefinedSoundex();
    public static final char[] US_ENGLISH_MAPPING = "01360240043788015936020505".toCharArray();
    private char[] soundexMapping;

    public RefinedSoundex() {
        this(US_ENGLISH_MAPPING);
    }

    public RefinedSoundex(char[] mapping) {
        this.soundexMapping = mapping;
    }

    public int difference(String s12, String s22) throws EncoderException {
        return SoundexUtils.difference(this, s12, s22);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object pObject) throws EncoderException {
        if (!(pObject instanceof String)) {
            throw new EncoderException("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        }
        return soundex((String) pObject);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String pString) {
        return soundex(pString);
    }

    char getMappingCode(char c5) {
        if (!Character.isLetter(c5)) {
            return (char) 0;
        }
        return this.soundexMapping[Character.toUpperCase(c5) - 'A'];
    }

    public String soundex(String str) {
        if (str == null) {
            return null;
        }
        String str2 = SoundexUtils.clean(str);
        if (str2.length() == 0) {
            return str2;
        }
        StringBuffer sBuf = new StringBuffer();
        sBuf.append(str2.charAt(0));
        char last = '*';
        for (int i5 = 0; i5 < str2.length(); i5++) {
            char current = getMappingCode(str2.charAt(i5));
            if (current != last) {
                if (current != 0) {
                    sBuf.append(current);
                }
                last = current;
            }
        }
        return sBuf.toString();
    }
}
