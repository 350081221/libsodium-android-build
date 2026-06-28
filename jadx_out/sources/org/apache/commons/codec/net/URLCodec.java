package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class URLCodec implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder {
    protected static byte ESCAPE_CHAR = 37;
    protected static final BitSet WWW_FORM_URL = new BitSet(256);
    protected String charset;

    static {
        for (int i5 = 97; i5 <= 122; i5++) {
            WWW_FORM_URL.set(i5);
        }
        for (int i6 = 65; i6 <= 90; i6++) {
            WWW_FORM_URL.set(i6);
        }
        for (int i7 = 48; i7 <= 57; i7++) {
            WWW_FORM_URL.set(i7);
        }
        WWW_FORM_URL.set(45);
        WWW_FORM_URL.set(95);
        WWW_FORM_URL.set(46);
        WWW_FORM_URL.set(42);
        WWW_FORM_URL.set(32);
    }

    public URLCodec() {
        this.charset = "UTF-8";
    }

    public URLCodec(String charset) {
        this.charset = "UTF-8";
        this.charset = charset;
    }

    public static final byte[] encodeUrl(BitSet bitSet, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = WWW_FORM_URL;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int i6 = bArr[i5];
            if (i6 < 0) {
                i6 += 256;
            }
            if (bitSet.get(i6)) {
                if (i6 == 32) {
                    i6 = 43;
                }
                byteArrayOutputStream.write(i6);
            } else {
                byteArrayOutputStream.write(37);
                char hex1 = Character.toUpperCase(Character.forDigit((i6 >> 4) & 15, 16));
                char hex2 = Character.toUpperCase(Character.forDigit(i6 & 15, 16));
                byteArrayOutputStream.write(hex1);
                byteArrayOutputStream.write(hex2);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final byte[] decodeUrl(byte[] bytes) throws DecoderException {
        if (bytes == null) {
            return null;
        }
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int i5 = 0;
        while (i5 < bytes.length) {
            int b5 = bytes[i5];
            if (b5 == 43) {
                buffer.write(32);
            } else if (b5 == 37) {
                int i6 = i5 + 1;
                try {
                    int u4 = Character.digit((char) bytes[i6], 16);
                    i5 = i6 + 1;
                    int l5 = Character.digit((char) bytes[i5], 16);
                    if (u4 == -1 || l5 == -1) {
                        throw new DecoderException("Invalid URL encoding");
                    }
                    buffer.write((char) ((u4 << 4) + l5));
                } catch (ArrayIndexOutOfBoundsException e5) {
                    throw new DecoderException("Invalid URL encoding");
                }
            } else {
                buffer.write(b5);
            }
            i5++;
        }
        return buffer.toByteArray();
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bytes) {
        return encodeUrl(WWW_FORM_URL, bytes);
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bytes) throws DecoderException {
        return decodeUrl(bytes);
    }

    public String encode(String pString, String charset) throws UnsupportedEncodingException {
        if (pString == null) {
            return null;
        }
        return new String(encode(pString.getBytes(charset)), "US-ASCII");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String pString) throws EncoderException {
        if (pString == null) {
            return null;
        }
        try {
            return encode(pString, getDefaultCharset());
        } catch (UnsupportedEncodingException e5) {
            throw new EncoderException(e5.getMessage());
        }
    }

    public String decode(String pString, String charset) throws DecoderException, UnsupportedEncodingException {
        if (pString == null) {
            return null;
        }
        return new String(decode(pString.getBytes("US-ASCII")), charset);
    }

    @Override // org.apache.commons.codec.StringDecoder
    public String decode(String pString) throws DecoderException {
        if (pString == null) {
            return null;
        }
        try {
            return decode(pString, getDefaultCharset());
        } catch (UnsupportedEncodingException e5) {
            throw new DecoderException(e5.getMessage());
        }
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object pObject) throws EncoderException {
        if (pObject == null) {
            return null;
        }
        if (pObject instanceof byte[]) {
            return encode((byte[]) pObject);
        }
        if (pObject instanceof String) {
            return encode((String) pObject);
        }
        throw new EncoderException("Objects of type " + pObject.getClass().getName() + " cannot be URL encoded");
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object pObject) throws DecoderException {
        if (pObject == null) {
            return null;
        }
        if (pObject instanceof byte[]) {
            return decode((byte[]) pObject);
        }
        if (pObject instanceof String) {
            return decode((String) pObject);
        }
        throw new DecoderException("Objects of type " + pObject.getClass().getName() + " cannot be URL decoded");
    }

    public String getEncoding() {
        return this.charset;
    }

    public String getDefaultCharset() {
        return this.charset;
    }
}
