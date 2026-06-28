package kotlin.ranges;

import java.lang.Comparable;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.v2;

@g1(version = "1.9")
@v2(markerClass = {kotlin.r.class})
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0016R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/OpenEndRange;", "T", "", "", "endExclusive", "getEndExclusive", "()Ljava/lang/Comparable;", "start", "getStart", "contains", "", t0.b.f22420d, "(Ljava/lang/Comparable;)Z", "isEmpty", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface r<T extends Comparable<? super T>> {

    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@p4.l r<T> rVar, @p4.l T value) {
            l0.p(value, "value");
            if (value.compareTo(rVar.getStart()) >= 0 && value.compareTo(rVar.c()) < 0) {
                return true;
            }
            return false;
        }

        public static <T extends Comparable<? super T>> boolean b(@p4.l r<T> rVar) {
            return rVar.getStart().compareTo(rVar.c()) >= 0;
        }
    }

    @p4.l
    T c();

    boolean contains(@p4.l T t5);

    @p4.l
    T getStart();

    boolean isEmpty();
}
