package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082\bJ!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0082\bJ\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0010\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015R$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0018j\b\u0012\u0004\u0012\u00020\u0011`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "", "dataCount", "Lkotlin/r2;", "resizeNodeData", "", "cmd", "", "args", "count", "addNodes", "clear", "", "pathData", "parsePathString", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "nodes", "addPathNodes", "toNodes", "Landroidx/compose/ui/graphics/Path;", TypedValues.AttributesType.S_TARGET, "toPath", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "nodeData", "[F", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 FastFloatParser.kt\nandroidx/compose/ui/graphics/vector/FastFloatParserKt\n+ 3 JvmFastFloatParser.jvm.kt\nandroidx/compose/ui/graphics/vector/JvmFastFloatParser_jvmKt\n*L\n1#1,555:1\n132#1,6:559\n150#1,2:565\n49#2:556\n50#2:557\n22#3:558\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n115#1:559,6\n123#1:565,2\n109#1:556\n110#1:557\n110#1:558\n*E\n"})
/* loaded from: classes.dex */
public final class PathParser {

    @l
    private final ArrayList<PathNode> nodes = new ArrayList<>();

    @l
    private float[] nodeData = new float[64];

    private final void addNodes(char c5, float[] fArr, int i5) {
        PathNodeKt.addPathNodes(c5, this.nodes, fArr, i5);
    }

    private final void resizeNodeData(int i5) {
        float[] fArr = this.nodeData;
        if (i5 >= fArr.length) {
            float[] fArr2 = new float[i5 * 2];
            this.nodeData = fArr2;
            o.y0(fArr, fArr2, 0, 0, fArr.length);
        }
    }

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    @l
    public final PathParser addPathNodes(@l List<? extends PathNode> list) {
        this.nodes.addAll(list);
        return this;
    }

    public final void clear() {
        this.nodes.clear();
    }

    @l
    public final PathParser parsePathString(@l String str) {
        int i5;
        char charAt;
        int i6;
        this.nodes.clear();
        int length = str.length();
        int i7 = 0;
        while (i7 < length && l0.t(str.charAt(i7), 32) <= 0) {
            i7++;
        }
        while (length > i7 && l0.t(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i8 = 0;
        while (i7 < length) {
            while (true) {
                i5 = i7 + 1;
                charAt = str.charAt(i7);
                int i9 = charAt | ' ';
                if ((i9 - 97) * (i9 - 122) <= 0 && i9 != 101) {
                    break;
                }
                if (i5 >= length) {
                    charAt = 0;
                    break;
                }
                i7 = i5;
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i8 = 0;
                    while (true) {
                        if (i5 < length && l0.t(str.charAt(i5), 32) <= 0) {
                            i5++;
                        } else {
                            long nextFloat = FastFloatParserKt.nextFloat(str, i5, length);
                            i6 = (int) (nextFloat >>> 32);
                            float intBitsToFloat = Float.intBitsToFloat((int) (nextFloat & 4294967295L));
                            if (!Float.isNaN(intBitsToFloat)) {
                                float[] fArr = this.nodeData;
                                int i10 = i8 + 1;
                                fArr[i8] = intBitsToFloat;
                                if (i10 >= fArr.length) {
                                    float[] fArr2 = new float[i10 * 2];
                                    this.nodeData = fArr2;
                                    o.y0(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i8 = i10;
                            }
                            while (i6 < length && str.charAt(i6) == ',') {
                                i6++;
                            }
                            if (i6 >= length || Float.isNaN(intBitsToFloat)) {
                                break;
                            }
                            i5 = i6;
                        }
                    }
                    i5 = i6;
                }
                PathNodeKt.addPathNodes(charAt, this.nodes, this.nodeData, i8);
            }
            i7 = i5;
        }
        return this;
    }

    @l
    public final List<PathNode> toNodes() {
        return this.nodes;
    }

    @l
    public final Path toPath(@l Path path) {
        return PathParserKt.toPath(this.nodes, path);
    }
}
