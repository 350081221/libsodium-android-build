package com.android.dex;

import com.android.dex.Dex;
import com.android.dex.util.ByteArrayByteInput;
import com.android.dex.util.ByteInput;
import kotlin.y1;

/* loaded from: classes2.dex */
public final class EncodedValue implements Comparable<EncodedValue> {
    private final byte[] data;

    public EncodedValue(byte[] bArr) {
        this.data = bArr;
    }

    public ByteInput asByteInput() {
        return new ByteArrayByteInput(this.data);
    }

    public byte[] getBytes() {
        return this.data;
    }

    public String toString() {
        return Integer.toHexString(this.data[0] & y1.f19838d) + "...(" + this.data.length + ")";
    }

    public void writeTo(Dex.Section section) {
        section.write(this.data);
    }

    @Override // java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int min = Math.min(this.data.length, encodedValue.data.length);
        for (int i5 = 0; i5 < min; i5++) {
            byte b5 = this.data[i5];
            byte b6 = encodedValue.data[i5];
            if (b5 != b6) {
                return (b5 & y1.f19838d) - (b6 & y1.f19838d);
            }
        }
        return this.data.length - encodedValue.data.length;
    }
}
