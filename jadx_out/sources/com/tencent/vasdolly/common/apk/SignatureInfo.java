package com.tencent.vasdolly.common.apk;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class SignatureInfo {
    public final long apkSigningBlockOffset;
    public final long centralDirOffset;
    public final ByteBuffer eocd;
    public final long eocdOffset;
    public final ByteBuffer signatureBlock;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignatureInfo(ByteBuffer byteBuffer, long j5, long j6, long j7, ByteBuffer byteBuffer2) {
        this.signatureBlock = byteBuffer;
        this.apkSigningBlockOffset = j5;
        this.centralDirOffset = j6;
        this.eocdOffset = j7;
        this.eocd = byteBuffer2;
    }
}
