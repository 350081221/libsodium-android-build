package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import kotlin.io.encoding.a;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class QuotedPrintableCodec implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder {
    private String charset;
    private static final BitSet PRINTABLE_CHARS = new BitSet(256);
    private static byte ESCAPE_CHAR = a.f19277h;
    private static byte TAB = 9;
    private static byte SPACE = 32;

    static {
        for (int i5 = 33; i5 <= 60; i5++) {
            PRINTABLE_CHARS.set(i5);
        }
        for (int i6 = 62; i6 <= 126; i6++) {
            PRINTABLE_CHARS.set(i6);
        }
        PRINTABLE_CHARS.set(TAB);
        PRINTABLE_CHARS.set(SPACE);
    }

    public QuotedPrintableCodec() {
        this.charset = "UTF-8";
    }

    public QuotedPrintableCodec(String charset) {
        this.charset = "UTF-8";
        this.charset = charset;
    }

    private static final void encodeQuotedPrintable(int b5, ByteArrayOutputStream buffer) {
        buffer.write(ESCAPE_CHAR);
        char hex1 = Character.toUpperCase(Character.forDigit((b5 >> 4) & 15, 16));
        char hex2 = Character.toUpperCase(Character.forDigit(b5 & 15, 16));
        buffer.write(hex1);
        buffer.write(hex2);
    }

    public static final byte[] encodeQuotedPrintable(BitSet bitSet, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = PRINTABLE_CHARS;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int i6 = bArr[i5];
            if (i6 < 0) {
                i6 += 256;
            }
            if (bitSet.get(i6)) {
                byteArrayOutputStream.write(i6);
            } else {
                encodeQuotedPrintable(i6, byteArrayOutputStream);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final byte[] decodeQuotedPrintable(byte[] bytes) throws DecoderException {
        if (bytes == null) {
            return null;
        }
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int i5 = 0;
        while (i5 < bytes.length) {
            int b5 = bytes[i5];
            if (b5 == ESCAPE_CHAR) {
                int i6 = i5 + 1;
                try {
                    int u4 = Character.digit((char) bytes[i6], 16);
                    i5 = i6 + 1;
                    int l5 = Character.digit((char) bytes[i5], 16);
                    if (u4 == -1 || l5 == -1) {
                        throw new DecoderException("Invalid quoted-printable encoding");
                    }
                    buffer.write((char) ((u4 << 4) + l5));
                } catch (ArrayIndexOutOfBoundsException e5) {
                    throw new DecoderException("Invalid quoted-printable encoding");
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
        return encodeQuotedPrintable(PRINTABLE_CHARS, bytes);
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bytes) throws DecoderException {
        return decodeQuotedPrintable(bytes);
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
        throw new EncoderException("Objects of type " + pObject.getClass().getName() + " cannot be quoted-printable encoded");
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
        throw new DecoderException("Objects of type " + pObject.getClass().getName() + " cannot be quoted-printable decoded");
    }

    public String getDefaultCharset() {
        return this.charset;
    }

    public String encode(String pString, String charset) throws UnsupportedEncodingException {
        if (pString == null) {
            return null;
        }
        return new String(encode(pString.getBytes(charset)), "US-ASCII");
    }
}
