package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;

@i0(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007\u001a(\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\f"}, d2 = {"composableLambdaN", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "composer", "Landroidx/compose/runtime/Composer;", DatabaseFileArchive.COLUMN_KEY, "", "tracked", "", "arity", "block", "", "composableLambdaNInstance", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaN_jvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
/* loaded from: classes.dex */
public final class ComposableLambdaN_jvmKt {
    @l
    @ComposeCompilerApi
    public static final ComposableLambdaN composableLambdaN(@l Composer composer, int i5, boolean z4, int i6, @l Object obj) {
        ComposableLambdaNImpl composableLambdaNImpl;
        composer.startReplaceableGroup(i5);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            composableLambdaNImpl = new ComposableLambdaNImpl(i5, z4, i6);
            composer.updateRememberedValue(composableLambdaNImpl);
        } else {
            l0.n(rememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaNImpl");
            composableLambdaNImpl = (ComposableLambdaNImpl) rememberedValue;
        }
        composableLambdaNImpl.update(obj);
        composer.endReplaceableGroup();
        return composableLambdaNImpl;
    }

    @l
    @ComposeCompilerApi
    public static final ComposableLambdaN composableLambdaNInstance(int i5, boolean z4, int i6, @l Object obj) {
        ComposableLambdaNImpl composableLambdaNImpl = new ComposableLambdaNImpl(i5, z4, i6);
        composableLambdaNImpl.update(obj);
        return composableLambdaNImpl;
    }
}
