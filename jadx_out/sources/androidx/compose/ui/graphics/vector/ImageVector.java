package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 /2\u00020\u0001:\u00020/B[\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\b\b\u0002\u0010+\u001a\u00020\u0005¢\u0006\u0004\b-\u0010.J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\u00020\u001d8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010#\u001a\u00020\"8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Landroidx/compose/ui/unit/Dp;", "defaultWidth", "F", "getDefaultWidth-D9Ej5fM", "()F", "defaultHeight", "getDefaultHeight-D9Ej5fM", "", "viewportWidth", "getViewportWidth", "viewportHeight", "getViewportHeight", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "root", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "getRoot", "()Landroidx/compose/ui/graphics/vector/VectorGroup;", "Landroidx/compose/ui/graphics/Color;", "tintColor", "J", "getTintColor-0d7_KjU", "()J", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "I", "getTintBlendMode-0nO6VwU", "()I", "autoMirror", "Z", "getAutoMirror", "()Z", "genId", "getGenId$ui_release", "<init>", "(Ljava/lang/String;FFFFLandroidx/compose/ui/graphics/vector/VectorGroup;JIZILkotlin/jvm/internal/w;)V", "Companion", "Builder", "ui_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class ImageVector {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);
    private static int imageVectorCount;
    private final boolean autoMirror;
    private final float defaultHeight;
    private final float defaultWidth;
    private final int genId;

    @l
    private final String name;

    @l
    private final VectorGroup root;
    private final int tintBlendMode;
    private final long tintColor;
    private final float viewportHeight;
    private final float viewportWidth;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "", "()V", "imageVectorCount", "", "generateImageVectorId", "generateImageVectorId$ui_release", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public final int generateImageVectorId$ui_release() {
            int i5;
            synchronized (this) {
                Companion companion = ImageVector.Companion;
                i5 = ImageVector.imageVectorCount;
                ImageVector.imageVectorCount = i5 + 1;
            }
            return i5;
        }
    }

    private ImageVector(String str, float f5, float f6, float f7, float f8, VectorGroup vectorGroup, long j5, int i5, boolean z4, int i6) {
        this.name = str;
        this.defaultWidth = f5;
        this.defaultHeight = f6;
        this.viewportWidth = f7;
        this.viewportHeight = f8;
        this.root = vectorGroup;
        this.tintColor = j5;
        this.tintBlendMode = i5;
        this.autoMirror = z4;
        this.genId = i6;
    }

    public /* synthetic */ ImageVector(String str, float f5, float f6, float f7, float f8, VectorGroup vectorGroup, long j5, int i5, boolean z4, int i6, w wVar) {
        this(str, f5, f6, f7, f8, vectorGroup, j5, i5, z4, i6);
    }

    public boolean equals(@m Object obj) {
        boolean z4;
        boolean z5;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        if (!l0.g(this.name, imageVector.name) || !Dp.m6049equalsimpl0(this.defaultWidth, imageVector.defaultWidth) || !Dp.m6049equalsimpl0(this.defaultHeight, imageVector.defaultHeight)) {
            return false;
        }
        if (this.viewportWidth == imageVector.viewportWidth) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.viewportHeight == imageVector.viewportHeight) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 && l0.g(this.root, imageVector.root) && Color.m3735equalsimpl0(this.tintColor, imageVector.tintColor) && BlendMode.m3645equalsimpl0(this.tintBlendMode, imageVector.tintBlendMode) && this.autoMirror == imageVector.autoMirror) {
            return true;
        }
        return false;
    }

    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    /* renamed from: getDefaultHeight-D9Ej5fM, reason: not valid java name */
    public final float m4357getDefaultHeightD9Ej5fM() {
        return this.defaultHeight;
    }

    /* renamed from: getDefaultWidth-D9Ej5fM, reason: not valid java name */
    public final float m4358getDefaultWidthD9Ej5fM() {
        return this.defaultWidth;
    }

    public final int getGenId$ui_release() {
        return this.genId;
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final VectorGroup getRoot() {
        return this.root;
    }

    /* renamed from: getTintBlendMode-0nO6VwU, reason: not valid java name */
    public final int m4359getTintBlendMode0nO6VwU() {
        return this.tintBlendMode;
    }

    /* renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m4360getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + Dp.m6050hashCodeimpl(this.defaultWidth)) * 31) + Dp.m6050hashCodeimpl(this.defaultHeight)) * 31) + Float.hashCode(this.viewportWidth)) * 31) + Float.hashCode(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + Color.m3741hashCodeimpl(this.tintColor)) * 31) + BlendMode.m3646hashCodeimpl(this.tintBlendMode)) * 31) + Boolean.hashCode(this.autoMirror);
    }

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001IBO\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00101\u001a\u00020\t\u0012\u0006\u00102\u001a\u00020\t\u0012\b\b\u0002\u00104\u001a\u000203\u0012\b\b\u0002\u00107\u001a\u000206\u0012\b\b\u0002\u0010:\u001a\u000209¢\u0006\u0004\bF\u0010GBG\b\u0017\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00101\u001a\u00020\t\u0012\u0006\u00102\u001a\u00020\t\u0012\b\b\u0002\u00104\u001a\u000203\u0012\b\b\u0002\u00107\u001a\u000206¢\u0006\u0004\bF\u0010HJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002Jf\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0006\u0010\u0015\u001a\u00020\u0000J¤\u0001\u0010)\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0006\u0010+\u001a\u00020*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u001a\u0010.\u001a\u00020-8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00100\u001a\u00020-8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00101\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00102\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010/R\u001a\u00104\u001a\u0002038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00107\u001a\u0002068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u00040<j\b\u0012\u0004\u0012\u00020\u0004`=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010;R\u0014\u0010E\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "Lkotlin/r2;", "ensureNotConsumed", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "asVectorGroup", "", "name", "", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "addGroup", "clearGroup", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/Brush;", "fill", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "addPath-oIyEayM", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFF)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "addPath", "Landroidx/compose/ui/graphics/vector/ImageVector;", "build", "Ljava/lang/String;", "Landroidx/compose/ui/unit/Dp;", "defaultWidth", "F", "defaultHeight", "viewportWidth", "viewportHeight", "Landroidx/compose/ui/graphics/Color;", "tintColor", "J", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "I", "", "autoMirror", "Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "nodes", "Ljava/util/ArrayList;", "root", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "isConsumed", "getCurrentGroup", "()Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "currentGroup", "<init>", "(Ljava/lang/String;FFFFJIZLkotlin/jvm/internal/w;)V", "(Ljava/lang/String;FFFFJILkotlin/jvm/internal/w;)V", "GroupParams", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Builder {
        public static final int $stable = 8;
        private final boolean autoMirror;
        private final float defaultHeight;
        private final float defaultWidth;
        private boolean isConsumed;

        @l
        private final String name;

        @l
        private final ArrayList<GroupParams> nodes;

        @l
        private GroupParams root;
        private final int tintBlendMode;
        private final long tintColor;
        private final float viewportHeight;
        private final float viewportWidth;

        @k(level = kotlin.m.HIDDEN, message = "Replace with ImageVector.Builder that consumes an optional auto mirror parameter", replaceWith = @b1(expression = "Builder(name, defaultWidth, defaultHeight, viewportWidth, viewportHeight, tintColor, tintBlendMode, false)", imports = {"androidx.compose.ui.graphics.vector"}))
        public /* synthetic */ Builder(String str, float f5, float f6, float f7, float f8, long j5, int i5, w wVar) {
            this(str, f5, f6, f7, f8, j5, i5);
        }

        private Builder(String str, float f5, float f6, float f7, float f8, long j5, int i5, boolean z4) {
            this.name = str;
            this.defaultWidth = f5;
            this.defaultHeight = f6;
            this.viewportWidth = f7;
            this.viewportHeight = f8;
            this.tintColor = j5;
            this.tintBlendMode = i5;
            this.autoMirror = z4;
            ArrayList<GroupParams> arrayList = new ArrayList<>();
            this.nodes = arrayList;
            GroupParams groupParams = new GroupParams(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.root = groupParams;
            ImageVectorKt.access$push(arrayList, groupParams);
        }

        public /* synthetic */ Builder(String str, float f5, float f6, float f7, float f8, long j5, int i5, boolean z4, w wVar) {
            this(str, f5, f6, f7, f8, j5, i5, z4);
        }

        public static /* synthetic */ Builder addGroup$default(Builder builder, String str, float f5, float f6, float f7, float f8, float f9, float f10, float f11, List list, int i5, Object obj) {
            String str2;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            List list2;
            if ((i5 & 1) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            float f17 = 0.0f;
            if ((i5 & 2) != 0) {
                f12 = 0.0f;
            } else {
                f12 = f5;
            }
            if ((i5 & 4) != 0) {
                f13 = 0.0f;
            } else {
                f13 = f6;
            }
            if ((i5 & 8) != 0) {
                f14 = 0.0f;
            } else {
                f14 = f7;
            }
            float f18 = 1.0f;
            if ((i5 & 16) != 0) {
                f15 = 1.0f;
            } else {
                f15 = f8;
            }
            if ((i5 & 32) == 0) {
                f18 = f9;
            }
            if ((i5 & 64) != 0) {
                f16 = 0.0f;
            } else {
                f16 = f10;
            }
            if ((i5 & 128) == 0) {
                f17 = f11;
            }
            if ((i5 & 256) != 0) {
                list2 = VectorKt.getEmptyPath();
            } else {
                list2 = list;
            }
            return builder.addGroup(str2, f12, f13, f14, f15, f18, f16, f17, list2);
        }

        /* renamed from: addPath-oIyEayM$default, reason: not valid java name */
        public static /* synthetic */ Builder m4361addPathoIyEayM$default(Builder builder, List list, int i5, String str, Brush brush, float f5, Brush brush2, float f6, float f7, int i6, int i7, float f8, float f9, float f10, float f11, int i8, Object obj) {
            int i9;
            String str2;
            Brush brush3;
            float f12;
            float f13;
            float f14;
            int i10;
            int i11;
            float f15;
            float f16;
            if ((i8 & 2) != 0) {
                i9 = VectorKt.getDefaultFillType();
            } else {
                i9 = i5;
            }
            if ((i8 & 4) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            Brush brush4 = null;
            if ((i8 & 8) != 0) {
                brush3 = null;
            } else {
                brush3 = brush;
            }
            float f17 = 1.0f;
            if ((i8 & 16) != 0) {
                f12 = 1.0f;
            } else {
                f12 = f5;
            }
            if ((i8 & 32) == 0) {
                brush4 = brush2;
            }
            if ((i8 & 64) != 0) {
                f13 = 1.0f;
            } else {
                f13 = f6;
            }
            float f18 = 0.0f;
            if ((i8 & 128) != 0) {
                f14 = 0.0f;
            } else {
                f14 = f7;
            }
            if ((i8 & 256) != 0) {
                i10 = VectorKt.getDefaultStrokeLineCap();
            } else {
                i10 = i6;
            }
            if ((i8 & 512) != 0) {
                i11 = VectorKt.getDefaultStrokeLineJoin();
            } else {
                i11 = i7;
            }
            if ((i8 & 1024) != 0) {
                f15 = 4.0f;
            } else {
                f15 = f8;
            }
            if ((i8 & 2048) != 0) {
                f16 = 0.0f;
            } else {
                f16 = f9;
            }
            if ((i8 & 4096) == 0) {
                f17 = f10;
            }
            if ((i8 & 8192) == 0) {
                f18 = f11;
            }
            return builder.m4362addPathoIyEayM(list, i9, str2, brush3, f12, brush4, f13, f14, i10, i11, f15, f16, f17, f18);
        }

        private final VectorGroup asVectorGroup(GroupParams groupParams) {
            return new VectorGroup(groupParams.getName(), groupParams.getRotate(), groupParams.getPivotX(), groupParams.getPivotY(), groupParams.getScaleX(), groupParams.getScaleY(), groupParams.getTranslationX(), groupParams.getTranslationY(), groupParams.getClipPathData(), groupParams.getChildren());
        }

        private final void ensureNotConsumed() {
            if (!(!this.isConsumed)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }

        private final GroupParams getCurrentGroup() {
            return (GroupParams) ImageVectorKt.access$peek(this.nodes);
        }

        @l
        public final Builder addGroup(@l String str, float f5, float f6, float f7, float f8, float f9, float f10, float f11, @l List<? extends PathNode> list) {
            ensureNotConsumed();
            ImageVectorKt.access$push(this.nodes, new GroupParams(str, f5, f6, f7, f8, f9, f10, f11, list, null, 512, null));
            return this;
        }

        @l
        /* renamed from: addPath-oIyEayM, reason: not valid java name */
        public final Builder m4362addPathoIyEayM(@l List<? extends PathNode> list, int i5, @l String str, @m Brush brush, float f5, @m Brush brush2, float f6, float f7, int i6, int i7, float f8, float f9, float f10, float f11) {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(new VectorPath(str, list, i5, brush, f5, brush2, f6, f7, i6, i7, f8, f9, f10, f11, null));
            return this;
        }

        @l
        public final ImageVector build() {
            ensureNotConsumed();
            while (this.nodes.size() > 1) {
                clearGroup();
            }
            ImageVector imageVector = new ImageVector(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, asVectorGroup(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, 0, 512, null);
            this.isConsumed = true;
            return imageVector;
        }

        @l
        public final Builder clearGroup() {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(asVectorGroup((GroupParams) ImageVectorKt.access$pop(this.nodes)));
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0002\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 ¨\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "", "name", "", "rotate", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "children", "", "Landroidx/compose/ui/graphics/vector/VectorNode;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "getClipPathData", "setClipPathData", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPivotX", "()F", "setPivotX", "(F)V", "getPivotY", "setPivotY", "getRotate", "setRotate", "getScaleX", "setScaleX", "getScaleY", "setScaleY", "getTranslationX", "setTranslationX", "getTranslationY", "setTranslationY", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class GroupParams {

            @l
            private List<VectorNode> children;

            @l
            private List<? extends PathNode> clipPathData;

            @l
            private String name;
            private float pivotX;
            private float pivotY;
            private float rotate;
            private float scaleX;
            private float scaleY;
            private float translationX;
            private float translationY;

            public GroupParams() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            public GroupParams(@l String str, float f5, float f6, float f7, float f8, float f9, float f10, float f11, @l List<? extends PathNode> list, @l List<VectorNode> list2) {
                this.name = str;
                this.rotate = f5;
                this.pivotX = f6;
                this.pivotY = f7;
                this.scaleX = f8;
                this.scaleY = f9;
                this.translationX = f10;
                this.translationY = f11;
                this.clipPathData = list;
                this.children = list2;
            }

            @l
            public final List<VectorNode> getChildren() {
                return this.children;
            }

            @l
            public final List<PathNode> getClipPathData() {
                return this.clipPathData;
            }

            @l
            public final String getName() {
                return this.name;
            }

            public final float getPivotX() {
                return this.pivotX;
            }

            public final float getPivotY() {
                return this.pivotY;
            }

            public final float getRotate() {
                return this.rotate;
            }

            public final float getScaleX() {
                return this.scaleX;
            }

            public final float getScaleY() {
                return this.scaleY;
            }

            public final float getTranslationX() {
                return this.translationX;
            }

            public final float getTranslationY() {
                return this.translationY;
            }

            public final void setChildren(@l List<VectorNode> list) {
                this.children = list;
            }

            public final void setClipPathData(@l List<? extends PathNode> list) {
                this.clipPathData = list;
            }

            public final void setName(@l String str) {
                this.name = str;
            }

            public final void setPivotX(float f5) {
                this.pivotX = f5;
            }

            public final void setPivotY(float f5) {
                this.pivotY = f5;
            }

            public final void setRotate(float f5) {
                this.rotate = f5;
            }

            public final void setScaleX(float f5) {
                this.scaleX = f5;
            }

            public final void setScaleY(float f5) {
                this.scaleY = f5;
            }

            public final void setTranslationX(float f5) {
                this.translationX = f5;
            }

            public final void setTranslationY(float f5) {
                this.translationY = f5;
            }

            public /* synthetic */ GroupParams(String str, float f5, float f6, float f7, float f8, float f9, float f10, float f11, List list, List list2, int i5, w wVar) {
                this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 0.0f : f5, (i5 & 4) != 0 ? 0.0f : f6, (i5 & 8) != 0 ? 0.0f : f7, (i5 & 16) != 0 ? 1.0f : f8, (i5 & 32) == 0 ? f9 : 1.0f, (i5 & 64) != 0 ? 0.0f : f10, (i5 & 128) == 0 ? f11 : 0.0f, (i5 & 256) != 0 ? VectorKt.getEmptyPath() : list, (i5 & 512) != 0 ? new ArrayList() : list2);
            }
        }

        public /* synthetic */ Builder(String str, float f5, float f6, float f7, float f8, long j5, int i5, boolean z4, int i6, w wVar) {
            this((i6 & 1) != 0 ? "" : str, f5, f6, f7, f8, (i6 & 32) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j5, (i6 & 64) != 0 ? BlendMode.Companion.m3674getSrcIn0nO6VwU() : i5, (i6 & 128) != 0 ? false : z4, (w) null);
        }

        public /* synthetic */ Builder(String str, float f5, float f6, float f7, float f8, long j5, int i5, int i6, w wVar) {
            this((i6 & 1) != 0 ? "" : str, f5, f6, f7, f8, (i6 & 32) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j5, (i6 & 64) != 0 ? BlendMode.Companion.m3674getSrcIn0nO6VwU() : i5, (w) null);
        }

        private Builder(String str, float f5, float f6, float f7, float f8, long j5, int i5) {
            this(str, f5, f6, f7, f8, j5, i5, false, (w) null);
        }
    }

    public /* synthetic */ ImageVector(String str, float f5, float f6, float f7, float f8, VectorGroup vectorGroup, long j5, int i5, boolean z4, int i6, int i7, w wVar) {
        this(str, f5, f6, f7, f8, vectorGroup, j5, i5, z4, (i7 & 512) != 0 ? Companion.generateImageVectorId$ui_release() : i6, null);
    }
}
