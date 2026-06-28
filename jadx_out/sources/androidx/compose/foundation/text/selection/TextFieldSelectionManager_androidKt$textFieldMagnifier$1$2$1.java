package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "center", "Landroidx/compose/ui/Modifier;", "invoke", "(Lv3/a;)Landroidx/compose/ui/Modifier;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1 extends n0 implements l<v3.a<? extends Offset>, Modifier> {
    final /* synthetic */ Density $density;
    final /* synthetic */ MutableState<IntSize> $magnifierSize$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/unit/Density;", "invoke-tuRUvjQ", "(Landroidx/compose/ui/unit/Density;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Density, Offset> {
        final /* synthetic */ v3.a<Offset> $center;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(v3.a<Offset> aVar) {
            super(1);
            this.$center = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Offset invoke(Density density) {
            return Offset.m3482boximpl(m1056invoketuRUvjQ(density));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m1056invoketuRUvjQ(@p4.l Density density) {
            return this.$center.invoke().m3503unboximpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/DpSize;", "size", "Lkotlin/r2;", "invoke-EaSLcWc", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements l<DpSize, r2> {
        final /* synthetic */ Density $density;
        final /* synthetic */ MutableState<IntSize> $magnifierSize$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Density density, MutableState<IntSize> mutableState) {
            super(1);
            this.$density = density;
            this.$magnifierSize$delegate = mutableState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(DpSize dpSize) {
            m1057invokeEaSLcWc(dpSize.m6150unboximpl());
            return r2.f19517a;
        }

        /* renamed from: invoke-EaSLcWc, reason: not valid java name */
        public final void m1057invokeEaSLcWc(long j5) {
            MutableState<IntSize> mutableState = this.$magnifierSize$delegate;
            Density density = this.$density;
            TextFieldSelectionManager_androidKt$textFieldMagnifier$1.invoke$lambda$2(mutableState, IntSizeKt.IntSize(density.mo298roundToPx0680j_4(DpSize.m6142getWidthD9Ej5fM(j5)), density.mo298roundToPx0680j_4(DpSize.m6140getHeightD9Ej5fM(j5))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1(Density density, MutableState<IntSize> mutableState) {
        super(1);
        this.$density = density;
        this.$magnifierSize$delegate = mutableState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Modifier invoke(v3.a<? extends Offset> aVar) {
        return invoke2((v3.a<Offset>) aVar);
    }

    @p4.l
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Modifier invoke2(@p4.l v3.a<Offset> aVar) {
        return Magnifier_androidKt.m271magnifierjPUL71Q$default(Modifier.Companion, new AnonymousClass1(aVar), null, new AnonymousClass2(this.$density, this.$magnifierSize$delegate), 0.0f, true, 0L, 0.0f, 0.0f, false, PlatformMagnifierFactory.Companion.getForCurrentPlatform(), 490, null);
    }
}
