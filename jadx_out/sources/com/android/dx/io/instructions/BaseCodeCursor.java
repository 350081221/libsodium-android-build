package com.android.dx.io.instructions;

/* loaded from: classes2.dex */
public abstract class BaseCodeCursor implements CodeCursor {
    private final AddressMap baseAddressMap = new AddressMap();
    private int cursor = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void advance(int i5) {
        this.cursor += i5;
    }

    @Override // com.android.dx.io.instructions.CodeCursor
    public final int baseAddressForCursor() {
        int i5 = this.baseAddressMap.get(this.cursor);
        if (i5 < 0) {
            return this.cursor;
        }
        return i5;
    }

    @Override // com.android.dx.io.instructions.CodeCursor
    public final int cursor() {
        return this.cursor;
    }

    @Override // com.android.dx.io.instructions.CodeCursor
    public final void setBaseAddress(int i5, int i6) {
        this.baseAddressMap.put(i5, i6);
    }
}
