package kotlin.time;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.time.r;
import kotlin.v2;

@g1(version = "1.9")
@v2(markerClass = {l.class})
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\bH¦\u0002J\b\u0010\t\u001a\u00020\u0004H&J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0000H¦\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\n\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH¦\u0002ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0010\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/TimeMark;", "", "compareTo", "", "other", "equals", "", "", TTDownloadField.TT_HASHCODE, "minus", "Lkotlin/time/Duration;", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "duration", "minus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "plus", "plus-LRDsOJo", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface d extends r, Comparable<d> {

    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static int a(@p4.l d dVar, @p4.l d other) {
            l0.p(other, "other");
            return e.l(dVar.d(other), e.f19812b.W());
        }

        public static boolean b(@p4.l d dVar) {
            return r.a.a(dVar);
        }

        public static boolean c(@p4.l d dVar) {
            return r.a.b(dVar);
        }

        @p4.l
        public static d d(@p4.l d dVar, long j5) {
            return dVar.a(e.y0(j5));
        }
    }

    @Override // kotlin.time.r
    @p4.l
    d a(long j5);

    @Override // kotlin.time.r
    @p4.l
    d b(long j5);

    long d(@p4.l d dVar);

    boolean equals(@p4.m Object obj);

    /* renamed from: g */
    int compareTo(@p4.l d dVar);

    int hashCode();
}
