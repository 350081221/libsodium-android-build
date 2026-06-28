package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\n*\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/FontScaling;", "", "fontScale", "", "getFontScale$annotations", "()V", "getFontScale", "()F", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "toSp", "toSp-0xMU5do", "(F)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@r1({"SMAP\nFontScaling.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaling.android.kt\nandroidx/compose/ui/unit/FontScaling\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
/* loaded from: classes.dex */
public interface FontScaling {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Stable
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m6155toDpGaN1DYA(@l FontScaling fontScaling, long j5) {
            return FontScaling.super.mo299toDpGaN1DYA(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m6156toSp0xMU5do(@l FontScaling fontScaling, float f5) {
            return FontScaling.super.mo306toSp0xMU5do(f5);
        }
    }

    float getFontScale();

    @Stable
    /* renamed from: toDp-GaN1DYA */
    default float mo299toDpGaN1DYA(long j5) {
        float convertSpToDp;
        if (TextUnitType.m6263equalsimpl0(TextUnit.m6234getTypeUIouoOA(j5), TextUnitType.Companion.m6268getSpUIouoOA())) {
            FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
            if (fontScaleConverterFactory.isNonLinearFontScalingActive(getFontScale()) && !FontScalingKt.getDisableNonLinearFontScalingInCompose()) {
                FontScaleConverter forScale = fontScaleConverterFactory.forScale(getFontScale());
                float m6235getValueimpl = TextUnit.m6235getValueimpl(j5);
                if (forScale == null) {
                    convertSpToDp = m6235getValueimpl * getFontScale();
                } else {
                    convertSpToDp = forScale.convertSpToDp(m6235getValueimpl);
                }
                return Dp.m6044constructorimpl(convertSpToDp);
            }
            return Dp.m6044constructorimpl(TextUnit.m6235getValueimpl(j5) * getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Stable
    /* renamed from: toSp-0xMU5do */
    default long mo306toSp0xMU5do(float f5) {
        float fontScale;
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (fontScaleConverterFactory.isNonLinearFontScalingActive(getFontScale()) && !FontScalingKt.getDisableNonLinearFontScalingInCompose()) {
            FontScaleConverter forScale = fontScaleConverterFactory.forScale(getFontScale());
            if (forScale != null) {
                fontScale = forScale.convertDpToSp(f5);
            } else {
                fontScale = f5 / getFontScale();
            }
            return TextUnitKt.getSp(fontScale);
        }
        return TextUnitKt.getSp(f5 / getFontScale());
    }
}
