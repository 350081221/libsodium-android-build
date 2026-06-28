package k4;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private List<org.ahocorasick.trie.a> f19077a = new ArrayList();

    @Override // k4.b
    public void a(org.ahocorasick.trie.a aVar) {
        this.f19077a.add(aVar);
    }

    public List<org.ahocorasick.trie.a> b() {
        return this.f19077a;
    }
}
