package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import v3.l;
import v3.q;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,116:1\n74#2:117\n74#2:118\n74#2:119\n50#3:120\n49#3:121\n50#3:128\n49#3:129\n25#3:136\n1116#4,6:122\n1116#4,6:130\n1116#4,6:137\n81#5:143\n*S KotlinDebug\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n*L\n39#1:117\n40#1:118\n41#1:119\n43#1:120\n43#1:121\n46#1:128\n46#1:129\n55#1:136\n43#1:122,6\n46#1:130,6\n55#1:137,6\n46#1:143\n*E\n"})
/* loaded from: classes.dex */
final class TextFieldSizeKt$textFieldMinSize$1 extends n0 implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ TextStyle $style;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements q<MeasureScope, Measurable, Constraints, MeasureResult> {
        final /* synthetic */ TextFieldSize $minSizeState;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00291 extends n0 implements l<Placeable.PlacementScope, r2> {
            final /* synthetic */ Placeable $measured;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00291(Placeable placeable) {
                super(1);
                this.$measured = placeable;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, this.$measured, 0, 0, 0.0f, 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldSize textFieldSize) {
            super(3);
            this.$minSizeState = textFieldSize;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
            return m921invoke3p2s80s(measureScope, measurable, constraints.m6006unboximpl());
        }

        @p4.l
        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final MeasureResult m921invoke3p2s80s(@p4.l MeasureScope measureScope, @p4.l Measurable measurable, long j5) {
            int I;
            int I2;
            SizeKt.m587defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, 0.0f, 3, null);
            long m920getMinSizeYbymL2g = this.$minSizeState.m920getMinSizeYbymL2g();
            I = u.I(IntSize.m6214getWidthimpl(m920getMinSizeYbymL2g), Constraints.m6002getMinWidthimpl(j5), Constraints.m6000getMaxWidthimpl(j5));
            I2 = u.I(IntSize.m6213getHeightimpl(m920getMinSizeYbymL2g), Constraints.m6001getMinHeightimpl(j5), Constraints.m5999getMaxHeightimpl(j5));
            Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, I, 0, I2, 0, 10, null));
            return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new C00291(mo4998measureBRTryo0), 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSizeKt$textFieldMinSize$1(TextStyle textStyle) {
        super(3);
        this.$style = textStyle;
    }

    public static final /* synthetic */ Object access$invoke$lambda$2(State state) {
        return state.getValue();
    }

    private static final Object invoke$lambda$2(State<? extends Object> state) {
        return state.getValue();
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 ??, still in use, count: 1, list:
          (r9v2 ?? I:java.lang.Object) from 0x00d7: INVOKE (r12v0 ?? I:androidx.compose.runtime.Composer), (r9v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:35)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @p4.l
    @androidx.compose.runtime.Composable
    public final androidx.compose.ui.Modifier invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 ??, still in use, count: 1, list:
          (r9v2 ?? I:java.lang.Object) from 0x00d7: INVOKE (r12v0 ?? I:androidx.compose.runtime.Composer), (r9v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:35)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
}
