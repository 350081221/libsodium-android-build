package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class QCodec extends RFC1522Codec implements StringEncoder, StringDecoder {
    private static byte BLANK;
    private static final BitSet PRINTABLE_CHARS = new BitSet(256);
    private static byte UNDERSCORE;
    private String charset;
    private boolean encodeBlanks;

    static {
        PRINTABLE_CHARS.set(32);
        PRINTABLE_CHARS.set(33);
        PRINTABLE_CHARS.set(34);
        PRINTABLE_CHARS.set(35);
        PRINTABLE_CHARS.set(36);
        PRINTABLE_CHARS.set(37);
        PRINTABLE_CHARS.set(38);
        PRINTABLE_CHARS.set(39);
        PRINTABLE_CHARS.set(40);
        PRINTABLE_CHARS.set(41);
        PRINTABLE_CHARS.set(42);
        PRINTABLE_CHARS.set(43);
        PRINTABLE_CHARS.set(44);
        PRINTABLE_CHARS.set(45);
        PRINTABLE_CHARS.set(46);
        PRINTABLE_CHARS.set(47);
        for (int i5 = 48; i5 <= 57; i5++) {
            PRINTABLE_CHARS.set(i5);
        }
        PRINTABLE_CHARS.set(58);
        PRINTABLE_CHARS.set(59);
        PRINTABLE_CHARS.set(60);
        PRINTABLE_CHARS.set(62);
        PRINTABLE_CHARS.set(64);
        for (int i6 = 65; i6 <= 90; i6++) {
            PRINTABLE_CHARS.set(i6);
        }
        PRINTABLE_CHARS.set(91);
        PRINTABLE_CHARS.set(92);
        PRINTABLE_CHARS.set(93);
        PRINTABLE_CHARS.set(94);
        PRINTABLE_CHARS.set(96);
        for (int i7 = 97; i7 <= 122; i7++) {
            PRINTABLE_CHARS.set(i7);
        }
        PRINTABLE_CHARS.set(123);
        PRINTABLE_CHARS.set(124);
        PRINTABLE_CHARS.set(125);
        PRINTABLE_CHARS.set(126);
        BLANK = (byte) 32;
        UNDERSCORE = (byte) 95;
    }

    public QCodec() {
        this.charset = "UTF-8";
        this.encodeBlanks = false;
    }

    public QCodec(String charset) {
        this.charset = "UTF-8";
        this.encodeBlanks = false;
        this.charset = charset;
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    protected String getEncoding() {
        return "Q";
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    protected byte[] doEncoding(byte[] bytes) throws EncoderException {
        if (bytes == null) {
            return null;
        }
        byte[] data = QuotedPrintableCodec.encodeQuotedPrintable(PRINTABLE_CHARS, bytes);
        if (this.encodeBlanks) {
            for (int i5 = 0; i5 < data.length; i5++) {
                if (data[i5] == BLANK) {
                    data[i5] = UNDERSCORE;
                }
            }
        }
        return data;
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    protected byte[] doDecoding(byte[] bytes) throws DecoderException {
        if (bytes == null) {
            return null;
        }
        boolean hasUnderscores = false;
        int i5 = 0;
        while (true) {
            if (i5 >= bytes.length) {
                break;
            }
            if (bytes[i5] != UNDERSCORE) {
                i5++;
            } else {
                hasUnderscores = true;
                break;
            }
        }
        if (hasUnderscores) {
            byte[] tmp = new byte[bytes.length];
            for (int i6 = 0; i6 < bytes.length; i6++) {
                byte b5 = bytes[i6];
                if (b5 != UNDERSCORE) {
                    tmp[i6] = b5;
                } else {
                    tmp[i6] = BLANK;
                }
            }
            return QuotedPrintableCodec.decodeQuotedPrintable(tmp);
        }
        return QuotedPrintableCodec.decodeQuotedPrintable(bytes);
    }

    public String encode(String pString, String charset) throws EncoderException {
        if (pString == null) {
            return null;
        }
        try {
            return encodeText(pString, charset);
        } catch (UnsupportedEncodingException e5) {
            throw new EncoderException(e5.getMessage());
        }
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String pString) throws EncoderException {
        if (pString == null) {
            return null;
        }
        return encode(pString, getDefaultCharset());
    }

    @Override // org.apache.commons.codec.StringDecoder
    public String decode(String pString) throws DecoderException {
        if (pString == null) {
            return null;
        }
        try {
            return decodeText(pString);
        } catch (UnsupportedEncodingException e5) {
            throw new DecoderException(e5.getMessage());
        }
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object pObject) throws EncoderException {
        if (pObject == null) {
            return null;
        }
        if (pObject instanceof String) {
            return encode((String) pObject);
        }
        throw new EncoderException("Objects of type " + pObject.getClass().getName() + " cannot be encoded using Q codec");
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object pObject) throws DecoderException {
        if (pObject == null) {
            return null;
        }
        if (pObject instanceof String) {
            return decode((String) pObject);
        }
        throw new DecoderException("Objects of type " + pObject.getClass().getName() + " cannot be decoded using Q codec");
    }

    public String getDefaultCharset() {
        return this.charset;
    }

    public boolean isEncodeBlanks() {
        return this.encodeBlanks;
    }

    public void setEncodeBlanks(boolean b5) {
        this.encodeBlanks = b5;
    }
}
