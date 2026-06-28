package kotlin.time;

import kotlin.g1;
import kotlin.i0;
import kotlin.v2;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0015\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u001b\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\f\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lkotlin/time/TimeMark;", "", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "hasNotPassedNow", "", "hasPassedNow", "minus", "duration", "minus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "plus", "plus-LRDsOJo", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.9")
@v2(markerClass = {l.class})
/* loaded from: classes4.dex */
public interface r {

    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static boolean a(@p4.l r rVar) {
            return e.e0(rVar.c());
        }

        public static boolean b(@p4.l r rVar) {
            return !e.e0(rVar.c());
        }

        @p4.l
        public static r c(@p4.l r rVar, long j5) {
            return rVar.a(e.y0(j5));
        }

        @p4.l
        public static r d(@p4.l r rVar, long j5) {
            return new c(rVar, j5, null);
        }
    }

    @p4.l
    r a(long j5);

    @p4.l
    r b(long j5);

    long c();

    boolean e();

    boolean f();
}
