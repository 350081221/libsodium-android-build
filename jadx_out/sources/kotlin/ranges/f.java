package kotlin.ranges;

import com.umeng.analytics.pro.bi;
import java.lang.Comparable;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/ranges/ClosedFloatingPointRange;", "T", "", "Lkotlin/ranges/ClosedRange;", "contains", "", t0.b.f22420d, "(Ljava/lang/Comparable;)Z", "isEmpty", "lessThanOrEquals", bi.ay, "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.1")
/* loaded from: classes4.dex */
public interface f<T extends Comparable<? super T>> extends g<T> {

    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@p4.l f<T> fVar, @p4.l T value) {
            l0.p(value, "value");
            if (fVar.a(fVar.getStart(), value) && fVar.a(value, fVar.getEndInclusive())) {
                return true;
            }
            return false;
        }

        public static <T extends Comparable<? super T>> boolean b(@p4.l f<T> fVar) {
            return !fVar.a(fVar.getStart(), fVar.getEndInclusive());
        }
    }

    boolean a(@p4.l T t5, @p4.l T t6);

    @Override // kotlin.ranges.g
    boolean contains(@p4.l T t5);

    @Override // kotlin.ranges.g
    boolean isEmpty();
}
