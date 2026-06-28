package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.geometry.Rect;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H'J \u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H§@¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "", "Landroidx/compose/ui/geometry/Rect;", "localRect", "calculateRectForParent", "Lkotlin/Function0;", "Lkotlin/r2;", "bringChildIntoView", "(Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface BringIntoViewResponder {
    @ExperimentalFoundationApi
    @m
    Object bringChildIntoView(@l a<Rect> aVar, @l d<? super r2> dVar);

    @l
    @ExperimentalFoundationApi
    Rect calculateRectForParent(@l Rect rect);
}
