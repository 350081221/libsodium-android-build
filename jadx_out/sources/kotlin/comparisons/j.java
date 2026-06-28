package kotlin.comparisons;

import com.umeng.analytics.pro.bi;
import java.util.Comparator;
import kotlin.i0;
import kotlin.jvm.internal.l0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\"\u0010\n\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004¨\u0006\u000b"}, d2 = {"Lkotlin/comparisons/NaturalOrderComparator;", "Ljava/util/Comparator;", "", "", "Lkotlin/Comparator;", "()V", "compare", "", bi.ay, "b", "reversed", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements Comparator<Comparable<? super Object>> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final j f19219a = new j();

    private j() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@p4.l Comparable<Object> a5, @p4.l Comparable<Object> b5) {
        l0.p(a5, "a");
        l0.p(b5, "b");
        return a5.compareTo(b5);
    }

    @Override // java.util.Comparator
    @p4.l
    public final Comparator<Comparable<? super Object>> reversed() {
        return k.f19220a;
    }
}
