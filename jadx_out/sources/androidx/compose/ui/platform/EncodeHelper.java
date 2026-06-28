package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.swift.sandhook.annotation.MethodReflectParams;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\fJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)ø\u0001\u0000¢\u0006\u0004\b+\u0010\fJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0004R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "Lkotlin/r2;", "reset", "", "encodedString", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "encode", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "encode-8_81llA", "(J)V", "Landroidx/compose/ui/unit/TextUnit;", "textUnit", "encode--R2X_6o", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "encode-nzbMABs", "(I)V", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "encode-6p3vJLY", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "encode-4Dl_Bck", "(F)V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "", MethodReflectParams.BYTE, "", MethodReflectParams.INT, "", "float", "Lkotlin/g2;", "uLong", "encode-VKZWuLQ", TypedValues.Custom.S_STRING, "Landroid/os/Parcel;", "parcel", "Landroid/os/Parcel;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EncodeHelper {
    public static final int $stable = 8;

    @p4.l
    private Parcel parcel = Parcel.obtain();

    public final void encode(@p4.l SpanStyle spanStyle) {
        long m5504getColor0d7_KjU = spanStyle.m5504getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m3735equalsimpl0(m5504getColor0d7_KjU, companion.m3770getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m5319encode8_81llA(spanStyle.m5504getColor0d7_KjU());
        }
        long m5505getFontSizeXSAIIZE = spanStyle.m5505getFontSizeXSAIIZE();
        TextUnit.Companion companion2 = TextUnit.Companion;
        if (!TextUnit.m6232equalsimpl0(m5505getFontSizeXSAIIZE, companion2.m6246getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m5316encodeR2X_6o(spanStyle.m5505getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle m5506getFontStyle4Lr2A7w = spanStyle.m5506getFontStyle4Lr2A7w();
        if (m5506getFontStyle4Lr2A7w != null) {
            int m5657unboximpl = m5506getFontStyle4Lr2A7w.m5657unboximpl();
            encode((byte) 4);
            m5321encodenzbMABs(m5657unboximpl);
        }
        FontSynthesis m5507getFontSynthesisZQGJjVo = spanStyle.m5507getFontSynthesisZQGJjVo();
        if (m5507getFontSynthesisZQGJjVo != null) {
            int m5670unboximpl = m5507getFontSynthesisZQGJjVo.m5670unboximpl();
            encode((byte) 5);
            m5318encode6p3vJLY(m5670unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m6232equalsimpl0(spanStyle.m5508getLetterSpacingXSAIIZE(), companion2.m6246getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m5316encodeR2X_6o(spanStyle.m5508getLetterSpacingXSAIIZE());
        }
        BaselineShift m5503getBaselineShift5SSeXJ0 = spanStyle.m5503getBaselineShift5SSeXJ0();
        if (m5503getBaselineShift5SSeXJ0 != null) {
            float m5826unboximpl = m5503getBaselineShift5SSeXJ0.m5826unboximpl();
            encode((byte) 8);
            m5317encode4Dl_Bck(m5826unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m3735equalsimpl0(spanStyle.m5502getBackground0d7_KjU(), companion.m3770getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m5319encode8_81llA(spanStyle.m5502getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m5316encodeR2X_6o(long j5) {
        long m6234getTypeUIouoOA = TextUnit.m6234getTypeUIouoOA(j5);
        TextUnitType.Companion companion = TextUnitType.Companion;
        byte b5 = 0;
        if (!TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6269getUnspecifiedUIouoOA())) {
            if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6268getSpUIouoOA())) {
                b5 = 1;
            } else if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6267getEmUIouoOA())) {
                b5 = 2;
            }
        }
        encode(b5);
        if (!TextUnitType.m6263equalsimpl0(TextUnit.m6234getTypeUIouoOA(j5), companion.m6269getUnspecifiedUIouoOA())) {
            encode(TextUnit.m6235getValueimpl(j5));
        }
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m5317encode4Dl_Bck(float f5) {
        encode(f5);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m5318encode6p3vJLY(int i5) {
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        byte b5 = 0;
        if (!FontSynthesis.m5665equalsimpl0(i5, companion.m5672getNoneGVVA2EU())) {
            if (FontSynthesis.m5665equalsimpl0(i5, companion.m5671getAllGVVA2EU())) {
                b5 = 1;
            } else if (FontSynthesis.m5665equalsimpl0(i5, companion.m5674getWeightGVVA2EU())) {
                b5 = 2;
            } else if (FontSynthesis.m5665equalsimpl0(i5, companion.m5673getStyleGVVA2EU())) {
                b5 = 3;
            }
        }
        encode(b5);
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m5319encode8_81llA(long j5) {
        m5320encodeVKZWuLQ(j5);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m5320encodeVKZWuLQ(long j5) {
        this.parcel.writeLong(j5);
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m5321encodenzbMABs(int i5) {
        FontStyle.Companion companion = FontStyle.Companion;
        byte b5 = 0;
        if (!FontStyle.m5654equalsimpl0(i5, companion.m5661getNormal_LCdwA()) && FontStyle.m5654equalsimpl0(i5, companion.m5660getItalic_LCdwA())) {
            b5 = 1;
        }
        encode(b5);
    }

    @p4.l
    public final String encodedString() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final void encode(@p4.l FontWeight fontWeight) {
        encode(fontWeight.getWeight());
    }

    public final void encode(@p4.l TextGeometricTransform textGeometricTransform) {
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(@p4.l TextDecoration textDecoration) {
        encode(textDecoration.getMask());
    }

    public final void encode(@p4.l Shadow shadow) {
        m5319encode8_81llA(shadow.m4057getColor0d7_KjU());
        encode(Offset.m3493getXimpl(shadow.m4058getOffsetF1C5BW0()));
        encode(Offset.m3494getYimpl(shadow.m4058getOffsetF1C5BW0()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b5) {
        this.parcel.writeByte(b5);
    }

    public final void encode(int i5) {
        this.parcel.writeInt(i5);
    }

    public final void encode(float f5) {
        this.parcel.writeFloat(f5);
    }

    public final void encode(@p4.l String str) {
        this.parcel.writeString(str);
    }
}
