package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.d;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "onPostFling", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface NestedScrollConnection {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        @m
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m4750onPostFlingRZ2iAVY(@l NestedScrollConnection nestedScrollConnection, long j5, long j6, @l d<? super Velocity> dVar) {
            return NestedScrollConnection.super.mo390onPostFlingRZ2iAVY(j5, j6, dVar);
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m4751onPostScrollDzOQY0M(@l NestedScrollConnection nestedScrollConnection, long j5, long j6, int i5) {
            return NestedScrollConnection.super.mo391onPostScrollDzOQY0M(j5, j6, i5);
        }

        @Deprecated
        @m
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m4752onPreFlingQWom1Mo(@l NestedScrollConnection nestedScrollConnection, long j5, @l d<? super Velocity> dVar) {
            return NestedScrollConnection.super.mo632onPreFlingQWom1Mo(j5, dVar);
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m4753onPreScrollOzD1aCk(@l NestedScrollConnection nestedScrollConnection, long j5, int i5) {
            return NestedScrollConnection.super.mo392onPreScrollOzD1aCk(j5, i5);
        }
    }

    /* renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m4748onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j5, long j6, d<? super Velocity> dVar) {
        return Velocity.m6270boximpl(Velocity.Companion.m6290getZero9UxMQ8M());
    }

    /* renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m4749onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j5, d<? super Velocity> dVar) {
        return Velocity.m6270boximpl(Velocity.Companion.m6290getZero9UxMQ8M());
    }

    @m
    /* renamed from: onPostFling-RZ2iAVY */
    default Object mo390onPostFlingRZ2iAVY(long j5, long j6, @l d<? super Velocity> dVar) {
        return m4748onPostFlingRZ2iAVY$suspendImpl(this, j5, j6, dVar);
    }

    /* renamed from: onPostScroll-DzOQY0M */
    default long mo391onPostScrollDzOQY0M(long j5, long j6, int i5) {
        return Offset.Companion.m3509getZeroF1C5BW0();
    }

    @m
    /* renamed from: onPreFling-QWom1Mo */
    default Object mo632onPreFlingQWom1Mo(long j5, @l d<? super Velocity> dVar) {
        return m4749onPreFlingQWom1Mo$suspendImpl(this, j5, dVar);
    }

    /* renamed from: onPreScroll-OzD1aCk */
    default long mo392onPreScrollOzD1aCk(long j5, int i5) {
        return Offset.Companion.m3509getZeroF1C5BW0();
    }
}
