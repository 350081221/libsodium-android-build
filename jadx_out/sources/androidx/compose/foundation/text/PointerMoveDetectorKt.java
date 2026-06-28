package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0080@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pointerEventPass", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/r2;", "onMove", "detectMoves", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PointerMoveDetectorKt {
    @m
    public static final Object detectMoves(@l PointerInputScope pointerInputScope, @l PointerEventPass pointerEventPass, @l v3.l<? super Offset, r2> lVar, @l d<? super r2> dVar) {
        Object l5;
        Object g5 = t0.g(new PointerMoveDetectorKt$detectMoves$2(pointerInputScope, pointerEventPass, lVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return g5 == l5 ? g5 : r2.f19517a;
    }

    public static /* synthetic */ Object detectMoves$default(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, v3.l lVar, d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            pointerEventPass = PointerEventPass.Initial;
        }
        return detectMoves(pointerInputScope, pointerEventPass, lVar, dVar);
    }
}
