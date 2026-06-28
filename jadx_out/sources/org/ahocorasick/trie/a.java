package org.ahocorasick.trie;

import com.huawei.hms.framework.common.ContainerUtils;

/* loaded from: classes4.dex */
public class a extends org.ahocorasick.interval.a implements org.ahocorasick.interval.d {

    /* renamed from: c, reason: collision with root package name */
    private final String f21073c;

    public a(int i5, int i6, String str) {
        super(i5, i6);
        this.f21073c = str;
    }

    public String f() {
        return this.f21073c;
    }

    @Override // org.ahocorasick.interval.a
    public String toString() {
        return super.toString() + ContainerUtils.KEY_VALUE_DELIMITER + this.f21073c;
    }
}
