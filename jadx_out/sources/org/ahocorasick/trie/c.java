package org.ahocorasick.trie;

/* loaded from: classes4.dex */
public class c extends e {

    /* renamed from: b, reason: collision with root package name */
    private a f21074b;

    public c(String str, a aVar) {
        super(str);
        this.f21074b = aVar;
    }

    @Override // org.ahocorasick.trie.e
    public a a() {
        return this.f21074b;
    }

    @Override // org.ahocorasick.trie.e
    public boolean c() {
        return true;
    }
}
