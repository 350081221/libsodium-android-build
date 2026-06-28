package androidx.compose.material3;

@kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", t0.b.f22420d, "", "invoke", "(Z)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwitchKt$Switch$valueToOffset$1$1 extends kotlin.jvm.internal.n0 implements v3.l<Boolean, Float> {
    final /* synthetic */ float $maxBound;
    final /* synthetic */ float $minBound;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$valueToOffset$1$1(float f5, float f6) {
        super(1);
        this.$maxBound = f5;
        this.$minBound = f6;
    }

    @p4.l
    public final Float invoke(boolean z4) {
        return Float.valueOf(z4 ? this.$maxBound : this.$minBound);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Float invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }
}
