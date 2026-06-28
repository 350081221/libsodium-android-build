package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a<\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007\u001a>\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/TransformableState;", "state", "", "lockRotationOnZoomPan", "enabled", "transformable", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "canPan", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "panZoomLock", "Lkotlinx/coroutines/channels/l;", "Landroidx/compose/foundation/gestures/TransformEvent;", "channel", "Lkotlin/r2;", "detectZoom", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlinx/coroutines/channels/l;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,277:1\n101#2,2:278\n33#2,6:280\n103#2:286\n33#2,6:287\n101#2,2:293\n33#2,6:295\n103#2:301\n101#2,2:302\n33#2,6:304\n103#2:310\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n219#1:278,2\n219#1:280,6\n219#1:286\n253#1:287,6\n264#1:293,2\n264#1:295,6\n264#1:301\n265#1:302,2\n265#1:304,6\n265#1:310\n*E\n"})
/* loaded from: classes.dex */
public final class TransformableKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ff, code lost:
    
        if (r13.invoke(androidx.compose.ui.geometry.Offset.m3482boximpl(r1)).booleanValue() != false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0282 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0283 -> B:12:0x0290). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope r29, boolean r30, kotlinx.coroutines.channels.l<androidx.compose.foundation.gestures.TransformEvent> r31, v3.l<? super androidx.compose.ui.geometry.Offset, java.lang.Boolean> r32, kotlin.coroutines.d<? super kotlin.r2> r33) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, kotlinx.coroutines.channels.l, v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    @l
    public static final Modifier transformable(@l Modifier modifier, @l TransformableState transformableState, boolean z4, boolean z5) {
        return transformable(modifier, transformableState, TransformableKt$transformable$1.INSTANCE, z4, z5);
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z4, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            z5 = true;
        }
        return transformable(modifier, transformableState, z4, z5);
    }

    @l
    @ExperimentalFoundationApi
    public static final Modifier transformable(@l Modifier modifier, @l TransformableState transformableState, @l v3.l<? super Offset, Boolean> lVar, boolean z4, boolean z5) {
        return modifier.then(new TransformableElement(transformableState, lVar, z4, z5));
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, v3.l lVar, boolean z4, boolean z5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        if ((i5 & 8) != 0) {
            z5 = true;
        }
        return transformable(modifier, transformableState, lVar, z4, z5);
    }
}
