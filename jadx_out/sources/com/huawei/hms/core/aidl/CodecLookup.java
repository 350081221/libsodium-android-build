package com.huawei.hms.core.aidl;

/* loaded from: classes3.dex */
public final class CodecLookup {
    private CodecLookup() {
    }

    public static MessageCodec find(int i5) {
        if (i5 == 2) {
            return new a();
        }
        return new MessageCodec();
    }
}
