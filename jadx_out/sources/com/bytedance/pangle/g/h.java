package com.bytedance.pangle.g;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f4431a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(ByteBuffer byteBuffer) {
        this.f4431a = byteBuffer.slice();
    }

    @Override // com.bytedance.pangle.g.k
    public final long a() {
        return this.f4431a.capacity();
    }

    @Override // com.bytedance.pangle.g.k
    public final void a(j jVar, long j5, int i5) {
        ByteBuffer slice;
        synchronized (this.f4431a) {
            this.f4431a.position(0);
            int i6 = (int) j5;
            this.f4431a.limit(i5 + i6);
            this.f4431a.position(i6);
            slice = this.f4431a.slice();
        }
        jVar.a(slice);
    }
}
