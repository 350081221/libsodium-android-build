package d1;

import com.alipay.sdk.m.x.e;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public Stack<e> f15876a = new Stack<>();

    public void a() {
        if (c()) {
            return;
        }
        Iterator<e> it = this.f15876a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.f15876a.clear();
    }

    public void b(e eVar) {
        this.f15876a.push(eVar);
    }

    public boolean c() {
        return this.f15876a.isEmpty();
    }

    public e d() {
        return this.f15876a.pop();
    }
}
