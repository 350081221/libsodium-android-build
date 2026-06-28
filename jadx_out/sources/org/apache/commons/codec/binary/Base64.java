package org.apache.commons.codec.binary;

import com.android.dx.io.Opcodes;
import com.umeng.analytics.pro.cx;
import kotlin.jvm.internal.o;
import okio.q1;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class Base64 implements BinaryEncoder, BinaryDecoder {
    static final int BASELENGTH = 255;
    static final int CHUNK_SIZE = 76;
    static final int EIGHTBIT = 8;
    static final int FOURBYTE = 4;
    static final int LOOKUPLENGTH = 64;
    static final byte PAD = 61;
    static final int SIGN = -128;
    static final int SIXTEENBIT = 16;
    static final int TWENTYFOURBITGROUP = 24;
    static final byte[] CHUNK_SEPARATOR = "\r\n".getBytes();
    private static byte[] base64Alphabet = new byte[255];
    private static byte[] lookUpBase64Alphabet = new byte[64];

    static {
        int j5 = 0;
        for (int i5 = 0; i5 < 255; i5++) {
            base64Alphabet[i5] = -1;
        }
        for (int i6 = 90; i6 >= 65; i6--) {
            base64Alphabet[i6] = (byte) (i6 - 65);
        }
        for (int i7 = 122; i7 >= 97; i7--) {
            base64Alphabet[i7] = (byte) ((i7 - 97) + 26);
        }
        for (int i8 = 57; i8 >= 48; i8--) {
            base64Alphabet[i8] = (byte) ((i8 - 48) + 52);
        }
        base64Alphabet[43] = 62;
        base64Alphabet[47] = q1.f21021a;
        for (int i9 = 0; i9 <= 25; i9++) {
            lookUpBase64Alphabet[i9] = (byte) (65 + i9);
        }
        int i10 = 26;
        int i11 = 0;
        while (i10 <= 51) {
            lookUpBase64Alphabet[i10] = (byte) (97 + i11);
            i10++;
            i11++;
        }
        int i12 = 52;
        while (i12 <= 61) {
            lookUpBase64Alphabet[i12] = (byte) (48 + j5);
            i12++;
            j5++;
        }
        lookUpBase64Alphabet[62] = 43;
        lookUpBase64Alphabet[63] = 47;
    }

    private static boolean isBase64(byte octect) {
        if (octect == 61 || base64Alphabet[octect] != -1) {
            return true;
        }
        return false;
    }

    public static boolean isArrayByteBase64(byte[] arrayOctect) {
        byte[] arrayOctect2 = discardWhitespace(arrayOctect);
        int length = arrayOctect2.length;
        if (length == 0) {
            return true;
        }
        for (byte b5 : arrayOctect2) {
            if (!isBase64(b5)) {
                return false;
            }
        }
        return true;
    }

    public static byte[] encodeBase64(byte[] binaryData) {
        return encodeBase64(binaryData, false);
    }

    public static byte[] encodeBase64Chunked(byte[] binaryData) {
        return encodeBase64(binaryData, true);
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object pObject) throws DecoderException {
        if (!(pObject instanceof byte[])) {
            throw new DecoderException("Parameter supplied to Base64 decode is not a byte[]");
        }
        return decode((byte[]) pObject);
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] pArray) {
        return decodeBase64(pArray);
    }

    public static byte[] encodeBase64(byte[] binaryData, boolean isChunked) {
        int encodedDataLength;
        int lengthDataBits;
        int lengthDataBits2;
        int numberTriplets;
        int numberTriplets2;
        int lengthDataBits3 = binaryData.length * 8;
        int fewerThan24bits = lengthDataBits3 % 24;
        int numberTriplets3 = lengthDataBits3 / 24;
        int nbrChunks = 0;
        if (fewerThan24bits != 0) {
            encodedDataLength = (numberTriplets3 + 1) * 4;
        } else {
            encodedDataLength = numberTriplets3 * 4;
        }
        if (isChunked) {
            nbrChunks = CHUNK_SEPARATOR.length == 0 ? 0 : (int) Math.ceil(encodedDataLength / 76.0f);
            encodedDataLength += CHUNK_SEPARATOR.length * nbrChunks;
        }
        byte[] encodedData = new byte[encodedDataLength];
        int chunksSoFar = 76;
        int chunksSoFar2 = 0;
        int i5 = 0;
        int encodedIndex = 0;
        while (i5 < numberTriplets3) {
            int dataIndex = i5 * 3;
            byte b12 = binaryData[dataIndex];
            byte b22 = binaryData[dataIndex + 1];
            byte b32 = binaryData[dataIndex + 2];
            byte l5 = (byte) (b22 & cx.f12477m);
            byte k5 = (byte) (b12 & 3);
            byte val1 = (byte) ((b12 & o.f19427b) == 0 ? b12 >> 2 : (b12 >> 2) ^ 192);
            if ((b22 & o.f19427b) == 0) {
                lengthDataBits = lengthDataBits3;
                lengthDataBits2 = b22 >> 4;
            } else {
                lengthDataBits = lengthDataBits3;
                lengthDataBits2 = (b22 >> 4) ^ 240;
            }
            byte val2 = (byte) lengthDataBits2;
            if ((b32 & o.f19427b) == 0) {
                numberTriplets = numberTriplets3;
                numberTriplets2 = b32 >> 6;
            } else {
                numberTriplets = numberTriplets3;
                numberTriplets2 = (b32 >> 6) ^ Opcodes.INVOKE_CUSTOM;
            }
            byte val3 = (byte) numberTriplets2;
            encodedData[encodedIndex] = lookUpBase64Alphabet[val1];
            encodedData[encodedIndex + 1] = lookUpBase64Alphabet[val2 | (k5 << 4)];
            encodedData[encodedIndex + 2] = lookUpBase64Alphabet[(l5 << 2) | val3];
            encodedData[encodedIndex + 3] = lookUpBase64Alphabet[b32 & q1.f21021a];
            int encodedIndex2 = encodedIndex + 4;
            if (isChunked && encodedIndex2 == chunksSoFar) {
                System.arraycopy(CHUNK_SEPARATOR, 0, encodedData, encodedIndex2, CHUNK_SEPARATOR.length);
                chunksSoFar2++;
                chunksSoFar = (76 * (chunksSoFar2 + 1)) + (CHUNK_SEPARATOR.length * chunksSoFar2);
                encodedIndex = encodedIndex2 + CHUNK_SEPARATOR.length;
            } else {
                int nextSeparatorIndex = chunksSoFar;
                int nextSeparatorIndex2 = chunksSoFar2;
                encodedIndex = encodedIndex2;
                chunksSoFar2 = nextSeparatorIndex2;
                chunksSoFar = nextSeparatorIndex;
            }
            i5++;
            lengthDataBits3 = lengthDataBits;
            numberTriplets3 = numberTriplets;
        }
        int nextSeparatorIndex3 = chunksSoFar2;
        int lengthDataBits4 = i5 * 3;
        if (fewerThan24bits == 8) {
            byte b13 = binaryData[lengthDataBits4];
            byte k6 = (byte) (b13 & 3);
            byte val12 = (byte) ((b13 & o.f19427b) == 0 ? b13 >> 2 : (b13 >> 2) ^ 192);
            encodedData[encodedIndex] = lookUpBase64Alphabet[val12];
            encodedData[encodedIndex + 1] = lookUpBase64Alphabet[k6 << 4];
            encodedData[encodedIndex + 2] = 61;
            encodedData[encodedIndex + 3] = 61;
        } else if (fewerThan24bits == 16) {
            byte b14 = binaryData[lengthDataBits4];
            byte b23 = binaryData[lengthDataBits4 + 1];
            byte l6 = (byte) (b23 & cx.f12477m);
            byte k7 = (byte) (b14 & 3);
            byte val13 = (byte) ((b14 & o.f19427b) == 0 ? b14 >> 2 : (b14 >> 2) ^ 192);
            byte val22 = (byte) ((b23 & o.f19427b) == 0 ? b23 >> 4 : (b23 >> 4) ^ 240);
            encodedData[encodedIndex] = lookUpBase64Alphabet[val13];
            encodedData[encodedIndex + 1] = lookUpBase64Alphabet[val22 | (k7 << 4)];
            encodedData[encodedIndex + 2] = lookUpBase64Alphabet[l6 << 2];
            encodedData[encodedIndex + 3] = 61;
        }
        if (isChunked && nextSeparatorIndex3 < nbrChunks) {
            System.arraycopy(CHUNK_SEPARATOR, 0, encodedData, encodedDataLength - CHUNK_SEPARATOR.length, CHUNK_SEPARATOR.length);
        }
        return encodedData;
    }

    public static byte[] decodeBase64(byte[] base64Data) {
        byte[] base64Data2 = discardNonBase64(base64Data);
        if (base64Data2.length == 0) {
            return new byte[0];
        }
        int numberQuadruple = base64Data2.length / 4;
        int encodedIndex = 0;
        int lastData = base64Data2.length;
        while (base64Data2[lastData - 1] == 61) {
            lastData--;
            if (lastData == 0) {
                return new byte[0];
            }
        }
        byte[] decodedData = new byte[lastData - numberQuadruple];
        for (int i5 = 0; i5 < numberQuadruple; i5++) {
            int dataIndex = i5 * 4;
            byte marker0 = base64Data2[dataIndex + 2];
            byte marker1 = base64Data2[dataIndex + 3];
            byte b12 = base64Alphabet[base64Data2[dataIndex]];
            byte b22 = base64Alphabet[base64Data2[dataIndex + 1]];
            if (marker0 != 61 && marker1 != 61) {
                byte b32 = base64Alphabet[marker0];
                byte b42 = base64Alphabet[marker1];
                decodedData[encodedIndex] = (byte) ((b12 << 2) | (b22 >> 4));
                decodedData[encodedIndex + 1] = (byte) (((b22 & cx.f12477m) << 4) | ((b32 >> 2) & 15));
                decodedData[encodedIndex + 2] = (byte) ((b32 << 6) | b42);
            } else if (marker0 == 61) {
                decodedData[encodedIndex] = (byte) ((b12 << 2) | (b22 >> 4));
            } else if (marker1 == 61) {
                byte b33 = base64Alphabet[marker0];
                decodedData[encodedIndex] = (byte) ((b12 << 2) | (b22 >> 4));
                decodedData[encodedIndex + 1] = (byte) (((b22 & cx.f12477m) << 4) | ((b33 >> 2) & 15));
            }
            encodedIndex += 3;
        }
        return decodedData;
    }

    static byte[] discardWhitespace(byte[] data) {
        byte[] groomedData = new byte[data.length];
        int bytesCopied = 0;
        for (int bytesCopied2 = 0; bytesCopied2 < data.length; bytesCopied2++) {
            byte b5 = data[bytesCopied2];
            if (b5 != 13 && b5 != 32) {
                switch (b5) {
                    case 9:
                    case 10:
                        break;
                    default:
                        groomedData[bytesCopied] = data[bytesCopied2];
                        bytesCopied++;
                        break;
                }
            }
        }
        byte[] packedData = new byte[bytesCopied];
        System.arraycopy(groomedData, 0, packedData, 0, bytesCopied);
        return packedData;
    }

    static byte[] discardNonBase64(byte[] data) {
        byte[] groomedData = new byte[data.length];
        int bytesCopied = 0;
        for (int bytesCopied2 = 0; bytesCopied2 < data.length; bytesCopied2++) {
            if (isBase64(data[bytesCopied2])) {
                groomedData[bytesCopied] = data[bytesCopied2];
                bytesCopied++;
            }
        }
        byte[] packedData = new byte[bytesCopied];
        System.arraycopy(groomedData, 0, packedData, 0, bytesCopied);
        return packedData;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object pObject) throws EncoderException {
        if (!(pObject instanceof byte[])) {
            throw new EncoderException("Parameter supplied to Base64 encode is not a byte[]");
        }
        return encode((byte[]) pObject);
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] pArray) {
        return encodeBase64(pArray, false);
    }
}
