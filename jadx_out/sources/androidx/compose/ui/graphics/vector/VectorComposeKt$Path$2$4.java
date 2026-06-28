package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/Brush;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/vector/PathComponent;Landroidx/compose/ui/graphics/Brush;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$4 extends n0 implements p<PathComponent, Brush, r2> {
    public static final VectorComposeKt$Path$2$4 INSTANCE = new VectorComposeKt$Path$2$4();

    VectorComposeKt$Path$2$4() {
        super(2);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(PathComponent pathComponent, Brush brush) {
        invoke2(pathComponent, brush);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@l PathComponent pathComponent, @m Brush brush) {
        pathComponent.setFill(brush);
    }
}
