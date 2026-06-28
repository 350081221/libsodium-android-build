package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010-\u001a\u00020\u0016¢\u0006\u0004\b.\u0010/J\u0015\u0010\u0005\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0015\u0010\u0013\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\u0006\u0010\u001a\u001a\u00020\u0019J\u0013\u0010\u001d\u001a\u00020\u001bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u0013\u0010 \u001a\u00020\u001eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0012J\u0006\u0010\"\u001a\u00020!J\u0013\u0010&\u001a\u00020#ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0013\u0010)\u001a\u00020'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010%R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/platform/DecodeHelper;", "", "Landroidx/compose/ui/text/style/BaselineShift;", "decodeBaselineShift-y9eOQZs", "()F", "decodeBaselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "decodeTextGeometricTransform", "Landroidx/compose/ui/text/style/TextDecoration;", "decodeTextDecoration", "Landroidx/compose/ui/graphics/Shadow;", "decodeShadow", "", "decodeByte", "", "decodeInt", "Lkotlin/g2;", "decodeULong-s-VKNKU", "()J", "decodeULong", "", "decodeFloat", "", "decodeString", "dataAvailable", "Landroidx/compose/ui/text/SpanStyle;", "decodeSpanStyle", "Landroidx/compose/ui/graphics/Color;", "decodeColor-0d7_KjU", "decodeColor", "Landroidx/compose/ui/unit/TextUnit;", "decodeTextUnit-XSAIIZE", "decodeTextUnit", "Landroidx/compose/ui/text/font/FontWeight;", "decodeFontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "decodeFontStyle-_-LCdwA", "()I", "decodeFontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "decodeFontSynthesis-GVVA2EU", "decodeFontSynthesis", "Landroid/os/Parcel;", "parcel", "Landroid/os/Parcel;", TypedValues.Custom.S_STRING, "<init>", "(Ljava/lang/String;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DecodeHelper {
    public static final int $stable = 8;

    @p4.l
    private final Parcel parcel;

    public DecodeHelper(@p4.l String str) {
        Parcel obtain = Parcel.obtain();
        this.parcel = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }

    /* renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m5303decodeBaselineShifty9eOQZs() {
        return BaselineShift.m5821constructorimpl(decodeFloat());
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    private final Shadow decodeShadow() {
        return new Shadow(m5305decodeColor0d7_KjU(), OffsetKt.Offset(decodeFloat(), decodeFloat()), decodeFloat(), null);
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final TextDecoration decodeTextDecoration() {
        boolean z4;
        boolean z5;
        List<TextDecoration> L;
        int decodeInt = decodeInt();
        TextDecoration.Companion companion = TextDecoration.Companion;
        if ((companion.getLineThrough().getMask() & decodeInt) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((decodeInt & companion.getUnderline().getMask()) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4 && z5) {
            L = kotlin.collections.w.L(companion.getLineThrough(), companion.getUnderline());
            return companion.combine(L);
        }
        if (z4) {
            return companion.getLineThrough();
        }
        if (z5) {
            return companion.getUnderline();
        }
        return companion.getNone();
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    /* renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m5304decodeULongsVKNKU() {
        return kotlin.g2.l(this.parcel.readLong());
    }

    /* renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m5305decodeColor0d7_KjU() {
        return Color.m3730constructorimpl(m5304decodeULongsVKNKU());
    }

    /* renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m5306decodeFontStyle_LCdwA() {
        byte decodeByte = decodeByte();
        if (decodeByte == 0) {
            return FontStyle.Companion.m5661getNormal_LCdwA();
        }
        if (decodeByte == 1) {
            return FontStyle.Companion.m5660getItalic_LCdwA();
        }
        return FontStyle.Companion.m5661getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m5307decodeFontSynthesisGVVA2EU() {
        byte decodeByte = decodeByte();
        if (decodeByte == 0) {
            return FontSynthesis.Companion.m5672getNoneGVVA2EU();
        }
        if (decodeByte == 1) {
            return FontSynthesis.Companion.m5671getAllGVVA2EU();
        }
        if (decodeByte == 3) {
            return FontSynthesis.Companion.m5673getStyleGVVA2EU();
        }
        if (decodeByte == 2) {
            return FontSynthesis.Companion.m5674getWeightGVVA2EU();
        }
        return FontSynthesis.Companion.m5672getNoneGVVA2EU();
    }

    @p4.l
    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    @p4.l
    public final SpanStyle decodeSpanStyle() {
        MutableSpanStyle mutableSpanStyle;
        MutableSpanStyle mutableSpanStyle2 = r15;
        MutableSpanStyle mutableSpanStyle3 = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte decodeByte = decodeByte();
            if (decodeByte == 1) {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle2.m5335setColor8_81llA(m5305decodeColor0d7_KjU());
            } else {
                mutableSpanStyle = mutableSpanStyle2;
                if (decodeByte == 2) {
                    if (dataAvailable() < 5) {
                        break;
                    }
                    mutableSpanStyle.m5336setFontSizeR2X_6o(m5308decodeTextUnitXSAIIZE());
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (decodeByte == 3) {
                    if (dataAvailable() < 4) {
                        break;
                    }
                    mutableSpanStyle.setFontWeight(decodeFontWeight());
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (decodeByte == 4) {
                    if (dataAvailable() < 1) {
                        break;
                    }
                    mutableSpanStyle.m5337setFontStylemLjRB2g(FontStyle.m5651boximpl(m5306decodeFontStyle_LCdwA()));
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (decodeByte == 5) {
                    if (dataAvailable() < 1) {
                        break;
                    }
                    mutableSpanStyle.m5338setFontSynthesistDdu0R4(FontSynthesis.m5662boximpl(m5307decodeFontSynthesisGVVA2EU()));
                    mutableSpanStyle2 = mutableSpanStyle;
                } else {
                    if (decodeByte == 6) {
                        mutableSpanStyle.setFontFeatureSettings(decodeString());
                    } else if (decodeByte == 7) {
                        if (dataAvailable() < 5) {
                            break;
                        }
                        mutableSpanStyle.m5339setLetterSpacingR2X_6o(m5308decodeTextUnitXSAIIZE());
                    } else if (decodeByte == 8) {
                        if (dataAvailable() < 4) {
                            break;
                        }
                        mutableSpanStyle.m5334setBaselineShift_isdbwI(BaselineShift.m5820boximpl(m5303decodeBaselineShifty9eOQZs()));
                    } else if (decodeByte == 9) {
                        if (dataAvailable() < 8) {
                            break;
                        }
                        mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
                    } else if (decodeByte == 10) {
                        if (dataAvailable() < 8) {
                            break;
                        }
                        mutableSpanStyle.m5333setBackground8_81llA(m5305decodeColor0d7_KjU());
                    } else if (decodeByte == 11) {
                        if (dataAvailable() < 4) {
                            break;
                        }
                        mutableSpanStyle.setTextDecoration(decodeTextDecoration());
                    } else if (decodeByte == 12) {
                        if (dataAvailable() < 20) {
                            break;
                        }
                        mutableSpanStyle.setShadow(decodeShadow());
                    }
                    mutableSpanStyle2 = mutableSpanStyle;
                }
            }
        }
        mutableSpanStyle = mutableSpanStyle2;
        return mutableSpanStyle.toSpanStyle();
    }

    /* renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m5308decodeTextUnitXSAIIZE() {
        long m6269getUnspecifiedUIouoOA;
        byte decodeByte = decodeByte();
        if (decodeByte == 1) {
            m6269getUnspecifiedUIouoOA = TextUnitType.Companion.m6268getSpUIouoOA();
        } else if (decodeByte == 2) {
            m6269getUnspecifiedUIouoOA = TextUnitType.Companion.m6267getEmUIouoOA();
        } else {
            m6269getUnspecifiedUIouoOA = TextUnitType.Companion.m6269getUnspecifiedUIouoOA();
        }
        if (TextUnitType.m6263equalsimpl0(m6269getUnspecifiedUIouoOA, TextUnitType.Companion.m6269getUnspecifiedUIouoOA())) {
            return TextUnit.Companion.m6246getUnspecifiedXSAIIZE();
        }
        return TextUnitKt.m6247TextUnitanM5pPY(decodeFloat(), m6269getUnspecifiedUIouoOA);
    }
}
