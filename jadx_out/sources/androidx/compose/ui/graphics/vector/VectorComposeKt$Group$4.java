package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorComposeKt$Group$4 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ List<PathNode> $clipPathData;
    final /* synthetic */ p<Composer, Integer, r2> $content;
    final /* synthetic */ String $name;
    final /* synthetic */ float $pivotX;
    final /* synthetic */ float $pivotY;
    final /* synthetic */ float $rotation;
    final /* synthetic */ float $scaleX;
    final /* synthetic */ float $scaleY;
    final /* synthetic */ float $translationX;
    final /* synthetic */ float $translationY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorComposeKt$Group$4(String str, float f5, float f6, float f7, float f8, float f9, float f10, float f11, List<? extends PathNode> list, p<? super Composer, ? super Integer, r2> pVar, int i5, int i6) {
        super(2);
        this.$name = str;
        this.$rotation = f5;
        this.$pivotX = f6;
        this.$pivotY = f7;
        this.$scaleX = f8;
        this.$scaleY = f9;
        this.$translationX = f10;
        this.$translationY = f11;
        this.$clipPathData = list;
        this.$content = pVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        VectorComposeKt.Group(this.$name, this.$rotation, this.$pivotX, this.$pivotY, this.$scaleX, this.$scaleY, this.$translationX, this.$translationY, this.$clipPathData, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
