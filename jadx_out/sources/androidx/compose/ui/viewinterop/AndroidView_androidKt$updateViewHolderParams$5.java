package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/unit/LayoutDirection;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/unit/LayoutDirection;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidView_androidKt$updateViewHolderParams$5 extends n0 implements p<LayoutNode, LayoutDirection, r2> {
    public static final AndroidView_androidKt$updateViewHolderParams$5 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$5();

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    AndroidView_androidKt$updateViewHolderParams$5() {
        super(2);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(LayoutNode layoutNode, LayoutDirection layoutDirection) {
        invoke2(layoutNode, layoutDirection);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@l LayoutNode layoutNode, @l LayoutDirection layoutDirection) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        int i5 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i6 = 1;
        if (i5 == 1) {
            i6 = 0;
        } else if (i5 != 2) {
            throw new j0();
        }
        requireViewFactoryHolder.setLayoutDirection(i6);
    }
}
