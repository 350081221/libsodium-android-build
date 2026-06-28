package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import com.android.dx.io.Opcodes;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000Z\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a$\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0005\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000\u001a<\u0010\u0017\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0018\u001a\u00020\n*\u00020\nH\u0000\u001a*\u0010\u0019\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000\u001a2\u0010\u001b\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u001a\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u001a2\u0010 \u001a\u00020\u001a*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u001a2\u0010!\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\"\u0014\u0010\"\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010$\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#\"\u0014\u0010%\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#\"\u0014\u0010&\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010#\"\u0014\u0010(\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010#\"\u0014\u0010)\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010#\"\u0014\u0010+\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010,\"\u0014\u0010.\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/StrokeCap;", "defValue", "getStrokeLineCap-CSYIeUk", "(II)I", "getStrokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getStrokeLineJoin-kLtJ_vA", "getStrokeLineJoin", "Lorg/xmlpull/v1/XmlPullParser;", "", "isAtEnd", "Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "Landroid/content/res/Resources;", "res", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "builder", "nestedGroups", "parseCurrentVectorNode", "seekToStartTag", "createVectorImageBuilder", "Lkotlin/r2;", "parsePath", "Landroidx/core/content/res/ComplexColorCompat;", "complexColor", "Landroidx/compose/ui/graphics/Brush;", "obtainBrushFromComplexColor", "parseClipPath", "parseGroup", "LINECAP_BUTT", "I", "LINECAP_ROUND", "LINECAP_SQUARE", "LINEJOIN_MITER", "LINEJOIN_ROUND", "LINEJOIN_BEVEL", "FILL_TYPE_WINDING", "", "SHAPE_CLIP_PATH", "Ljava/lang/String;", "SHAPE_GROUP", "SHAPE_PATH", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nXmlVectorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,727:1\n174#2:728\n174#2:729\n*S KotlinDebug\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n*L\n239#1:728\n240#1:729\n*E\n"})
/* loaded from: classes.dex */
public final class XmlVectorParser_androidKt {
    private static final int FILL_TYPE_WINDING = 0;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;

    @l
    private static final String SHAPE_CLIP_PATH = "clip-path";

    @l
    private static final String SHAPE_GROUP = "group";

    @l
    private static final String SHAPE_PATH = "path";

    @l
    public static final ImageVector.Builder createVectorImageBuilder(@l AndroidVectorParser androidVectorParser, @l Resources resources, @m Resources.Theme theme, @l AttributeSet attributeSet) {
        long m3770getUnspecified0d7_KjU;
        int m3674getSrcIn0nO6VwU;
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        boolean namedBoolean = androidVectorParser.getNamedBoolean(obtainAttributes, "autoMirrored", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED(), false);
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, "viewportWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "viewportHeight", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT(), 0.0f);
        if (namedFloat > 0.0f) {
            if (namedFloat2 > 0.0f) {
                float dimension = androidVectorParser.getDimension(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_WIDTH(), 0.0f);
                float dimension2 = androidVectorParser.getDimension(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT(), 0.0f);
                if (obtainAttributes.hasValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) {
                    TypedValue typedValue = new TypedValue();
                    obtainAttributes.getValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT(), typedValue);
                    if (typedValue.type == 2) {
                        m3770getUnspecified0d7_KjU = Color.Companion.m3770getUnspecified0d7_KjU();
                    } else {
                        ColorStateList namedColorStateList = androidVectorParser.getNamedColorStateList(obtainAttributes, theme, "tint", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT());
                        if (namedColorStateList != null) {
                            m3770getUnspecified0d7_KjU = ColorKt.Color(namedColorStateList.getDefaultColor());
                        } else {
                            m3770getUnspecified0d7_KjU = Color.Companion.m3770getUnspecified0d7_KjU();
                        }
                    }
                } else {
                    m3770getUnspecified0d7_KjU = Color.Companion.m3770getUnspecified0d7_KjU();
                }
                long j5 = m3770getUnspecified0d7_KjU;
                int i5 = androidVectorParser.getInt(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(), -1);
                if (i5 != -1) {
                    if (i5 != 3) {
                        if (i5 != 5) {
                            if (i5 != 9) {
                                switch (i5) {
                                    case 14:
                                        m3674getSrcIn0nO6VwU = BlendMode.Companion.m3665getModulate0nO6VwU();
                                        break;
                                    case 15:
                                        m3674getSrcIn0nO6VwU = BlendMode.Companion.m3670getScreen0nO6VwU();
                                        break;
                                    case 16:
                                        m3674getSrcIn0nO6VwU = BlendMode.Companion.m3668getPlus0nO6VwU();
                                        break;
                                    default:
                                        m3674getSrcIn0nO6VwU = BlendMode.Companion.m3674getSrcIn0nO6VwU();
                                        break;
                                }
                            } else {
                                m3674getSrcIn0nO6VwU = BlendMode.Companion.m3673getSrcAtop0nO6VwU();
                            }
                        } else {
                            m3674getSrcIn0nO6VwU = BlendMode.Companion.m3674getSrcIn0nO6VwU();
                        }
                    } else {
                        m3674getSrcIn0nO6VwU = BlendMode.Companion.m3676getSrcOver0nO6VwU();
                    }
                } else {
                    m3674getSrcIn0nO6VwU = BlendMode.Companion.m3674getSrcIn0nO6VwU();
                }
                int i6 = m3674getSrcIn0nO6VwU;
                float m6044constructorimpl = Dp.m6044constructorimpl(dimension / resources.getDisplayMetrics().density);
                float m6044constructorimpl2 = Dp.m6044constructorimpl(dimension2 / resources.getDisplayMetrics().density);
                obtainAttributes.recycle();
                return new ImageVector.Builder(null, m6044constructorimpl, m6044constructorimpl2, namedFloat, namedFloat2, j5, i6, namedBoolean, 1, null);
            }
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
    }

    /* renamed from: getStrokeLineCap-CSYIeUk, reason: not valid java name */
    private static final int m4395getStrokeLineCapCSYIeUk(int i5, int i6) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    return StrokeCap.Companion.m4087getSquareKaPHkGw();
                }
                return i6;
            }
            return StrokeCap.Companion.m4086getRoundKaPHkGw();
        }
        return StrokeCap.Companion.m4085getButtKaPHkGw();
    }

    /* renamed from: getStrokeLineCap-CSYIeUk$default, reason: not valid java name */
    static /* synthetic */ int m4396getStrokeLineCapCSYIeUk$default(int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = StrokeCap.Companion.m4085getButtKaPHkGw();
        }
        return m4395getStrokeLineCapCSYIeUk(i5, i6);
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA, reason: not valid java name */
    private static final int m4397getStrokeLineJoinkLtJ_vA(int i5, int i6) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    return StrokeJoin.Companion.m4095getBevelLxFBmk8();
                }
                return i6;
            }
            return StrokeJoin.Companion.m4097getRoundLxFBmk8();
        }
        return StrokeJoin.Companion.m4096getMiterLxFBmk8();
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA$default, reason: not valid java name */
    static /* synthetic */ int m4398getStrokeLineJoinkLtJ_vA$default(int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = StrokeJoin.Companion.m4096getMiterLxFBmk8();
        }
        return m4397getStrokeLineJoinkLtJ_vA(i5, i6);
    }

    public static final boolean isAtEnd(@l XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 1) {
            return true;
        }
        if (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3) {
            return true;
        }
        return false;
    }

    private static final Brush obtainBrushFromComplexColor(ComplexColorCompat complexColorCompat) {
        if (!complexColorCompat.willDraw()) {
            return null;
        }
        Shader shader = complexColorCompat.getShader();
        if (shader != null) {
            return BrushKt.ShaderBrush(shader);
        }
        return new SolidColor(ColorKt.Color(complexColorCompat.getColor()), null);
    }

    public static final void parseClipPath(@l AndroidVectorParser androidVectorParser, @l Resources resources, @m Resources.Theme theme, @l AttributeSet attributeSet, @l ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME());
        if (string == null) {
            string = "";
        }
        List<PathNode> addPathNodes = VectorKt.addPathNodes(androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA()));
        obtainAttributes.recycle();
        ImageVector.Builder.addGroup$default(builder, string, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, addPathNodes, Opcodes.CONST_METHOD_HANDLE, null);
    }

    public static final int parseCurrentVectorNode(@l AndroidVectorParser androidVectorParser, @l Resources resources, @l AttributeSet attributeSet, @m Resources.Theme theme, @l ImageVector.Builder builder, int i5) {
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType == 3 && l0.g(SHAPE_GROUP, androidVectorParser.getXmlParser().getName())) {
                int i6 = i5 + 1;
                for (int i7 = 0; i7 < i6; i7++) {
                    builder.clearGroup();
                }
                return 0;
            }
            return i5;
        }
        String name = androidVectorParser.getXmlParser().getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1649314686) {
                if (hashCode != 3433509) {
                    if (hashCode == 98629247 && name.equals(SHAPE_GROUP)) {
                        parseGroup(androidVectorParser, resources, theme, attributeSet, builder);
                        return i5;
                    }
                    return i5;
                }
                if (name.equals("path")) {
                    parsePath(androidVectorParser, resources, theme, attributeSet, builder);
                    return i5;
                }
                return i5;
            }
            if (name.equals(SHAPE_CLIP_PATH)) {
                parseClipPath(androidVectorParser, resources, theme, attributeSet, builder);
                return i5 + 1;
            }
            return i5;
        }
        return i5;
    }

    public static /* synthetic */ int parseCurrentVectorNode$default(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            theme = null;
        }
        return parseCurrentVectorNode(androidVectorParser, resources, attributeSet, theme, builder, i5);
    }

    public static final void parseGroup(@l AndroidVectorParser androidVectorParser, @l Resources resources, @m Resources.Theme theme, @l AttributeSet attributeSet, @l ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, Key.ROTATION, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float f5 = androidVectorParser.getFloat(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float f6 = androidVectorParser.getFloat(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "scaleX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float namedFloat3 = androidVectorParser.getNamedFloat(obtainAttributes, "scaleY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(obtainAttributes, "translateX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(obtainAttributes, "translateY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        if (string == null) {
            string = "";
        }
        obtainAttributes.recycle();
        builder.addGroup(string, namedFloat, f5, f6, namedFloat2, namedFloat3, namedFloat4, namedFloat5, VectorKt.getEmptyPath());
    }

    public static final void parsePath(@l AndroidVectorParser androidVectorParser, @l Resources resources, @m Resources.Theme theme, @l AttributeSet attributeSet, @l ImageVector.Builder builder) throws IllegalArgumentException {
        int m4015getEvenOddRgk1Os;
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        if (TypedArrayUtils.hasAttribute(androidVectorParser.getXmlParser(), "pathData")) {
            String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME());
            if (string == null) {
                string = "";
            }
            String str = string;
            List<PathNode> addPathNodes = VectorKt.addPathNodes(androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA()));
            ComplexColorCompat namedComplexColor = androidVectorParser.getNamedComplexColor(obtainAttributes, theme, "fillColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(), 0);
            float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, "fillAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(), 1.0f);
            int m4395getStrokeLineCapCSYIeUk = m4395getStrokeLineCapCSYIeUk(androidVectorParser.getNamedInt(obtainAttributes, "strokeLineCap", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1), StrokeCap.Companion.m4085getButtKaPHkGw());
            int m4397getStrokeLineJoinkLtJ_vA = m4397getStrokeLineJoinkLtJ_vA(androidVectorParser.getNamedInt(obtainAttributes, "strokeLineJoin", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1), StrokeJoin.Companion.m4095getBevelLxFBmk8());
            float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeMiterLimit", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
            ComplexColorCompat namedComplexColor2 = androidVectorParser.getNamedComplexColor(obtainAttributes, theme, "strokeColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
            float namedFloat3 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
            float namedFloat4 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
            float namedFloat5 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathEnd", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
            float namedFloat6 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathOffset", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
            float namedFloat7 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathStart", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
            int namedInt = androidVectorParser.getNamedInt(obtainAttributes, "fillType", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), FILL_TYPE_WINDING);
            obtainAttributes.recycle();
            Brush obtainBrushFromComplexColor = obtainBrushFromComplexColor(namedComplexColor);
            Brush obtainBrushFromComplexColor2 = obtainBrushFromComplexColor(namedComplexColor2);
            PathFillType.Companion companion = PathFillType.Companion;
            if (namedInt == 0) {
                m4015getEvenOddRgk1Os = companion.m4016getNonZeroRgk1Os();
            } else {
                m4015getEvenOddRgk1Os = companion.m4015getEvenOddRgk1Os();
            }
            builder.m4362addPathoIyEayM(addPathNodes, m4015getEvenOddRgk1Os, str, obtainBrushFromComplexColor, namedFloat, obtainBrushFromComplexColor2, namedFloat3, namedFloat4, m4395getStrokeLineCapCSYIeUk, m4397getStrokeLineJoinkLtJ_vA, namedFloat2, namedFloat7, namedFloat5, namedFloat6);
            return;
        }
        throw new IllegalArgumentException("No path data available");
    }

    @l
    public static final XmlPullParser seekToStartTag(@l XmlPullParser xmlPullParser) throws XmlPullParserException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
