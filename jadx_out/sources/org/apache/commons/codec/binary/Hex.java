package org.apache.commons.codec.binary;

import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class Hex implements BinaryEncoder, BinaryDecoder {
    private static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static byte[] decodeHex(char[] data) throws DecoderException {
        int len = data.length;
        if ((len & 1) != 0) {
            throw new DecoderException("Odd number of characters.");
        }
        byte[] out = new byte[len >> 1];
        int i5 = 0;
        int j5 = 0;
        while (j5 < len) {
            int f5 = toDigit(data[j5], j5) << 4;
            int j6 = j5 + 1;
            int f6 = f5 | toDigit(data[j6], j6);
            j5 = j6 + 1;
            out[i5] = (byte) (f6 & 255);
            i5++;
        }
        return out;
    }

    protected static int toDigit(char ch, int index) throws DecoderException {
        int digit = Character.digit(ch, 16);
        if (digit == -1) {
            throw new DecoderException("Illegal hexadecimal charcter " + ch + " at index " + index);
        }
        return digit;
    }

    public static char[] encodeHex(byte[] data) {
        int l5 = data.length;
        char[] out = new char[l5 << 1];
        int j5 = 0;
        for (int i5 = 0; i5 < l5; i5++) {
            int j6 = j5 + 1;
            out[j5] = DIGITS[(240 & data[i5]) >>> 4];
            j5 = j6 + 1;
            out[j6] = DIGITS[15 & data[i5]];
        }
        return out;
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] array) throws DecoderException {
        return decodeHex(new String(array).toCharArray());
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object object) throws DecoderException {
        try {
            char[] charArray = object instanceof String ? ((String) object).toCharArray() : (char[]) object;
            return decodeHex(charArray);
        } catch (ClassCastException e5) {
            throw new DecoderException(e5.getMessage());
        }
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] array) {
        return new String(encodeHex(array)).getBytes();
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object object) throws EncoderException {
        try {
            byte[] byteArray = object instanceof String ? ((String) object).getBytes() : (byte[]) object;
            return encodeHex(byteArray);
        } catch (ClassCastException e5) {
            throw new EncoderException(e5.getMessage());
        }
    }
}
