package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import java.util.List;

@kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0017\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0002¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0002R\u001d\u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/Vertices;", "", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "encodeColorList", "Landroidx/compose/ui/geometry/Offset;", "points", "", "encodePointList", "Landroidx/compose/ui/graphics/VertexMode;", "vertexMode", "I", "getVertexMode-c2xauaI", "()I", "positions", "[F", "getPositions", "()[F", "textureCoordinates", "getTextureCoordinates", "[I", "getColors", "()[I", "", "indices", "[S", "getIndices", "()[S", "", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nVertices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,76:1\n101#2,2:77\n33#2,6:79\n103#2:85\n*S KotlinDebug\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n*L\n42#1:77,2\n42#1:79,6\n42#1:85\n*E\n"})
/* loaded from: classes.dex */
public final class Vertices {

    @p4.l
    private final int[] colors;

    @p4.l
    private final short[] indices;

    @p4.l
    private final float[] positions;

    @p4.l
    private final float[] textureCoordinates;
    private final int vertexMode;

    private Vertices(int i5, List<Offset> list, List<Offset> list2, List<Color> list3, List<Integer> list4) {
        boolean z4;
        this.vertexMode = i5;
        Vertices$outOfBounds$1 vertices$outOfBounds$1 = new Vertices$outOfBounds$1(list);
        if (list2.size() == list.size()) {
            if (list3.size() == list.size()) {
                int size = list4.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size) {
                        if (vertices$outOfBounds$1.invoke((Vertices$outOfBounds$1) list4.get(i6)).booleanValue()) {
                            z4 = true;
                            break;
                        }
                        i6++;
                    } else {
                        z4 = false;
                        break;
                    }
                }
                if (!z4) {
                    this.positions = encodePointList(list);
                    this.textureCoordinates = encodePointList(list2);
                    this.colors = encodeColorList(list3);
                    int size2 = list4.size();
                    short[] sArr = new short[size2];
                    for (int i7 = 0; i7 < size2; i7++) {
                        sArr[i7] = (short) list4.get(i7).intValue();
                    }
                    this.indices = sArr;
                    return;
                }
                throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
            }
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
    }

    public /* synthetic */ Vertices(int i5, List list, List list2, List list3, List list4, kotlin.jvm.internal.w wVar) {
        this(i5, list, list2, list3, list4);
    }

    private final int[] encodeColorList(List<Color> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = ColorKt.m3788toArgb8_81llA(list.get(i5).m3744unboximpl());
        }
        return iArr;
    }

    private final float[] encodePointList(List<Offset> list) {
        float m3494getYimpl;
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i5 = 0; i5 < size; i5++) {
            long m3503unboximpl = list.get(i5 / 2).m3503unboximpl();
            if (i5 % 2 == 0) {
                m3494getYimpl = Offset.m3493getXimpl(m3503unboximpl);
            } else {
                m3494getYimpl = Offset.m3494getYimpl(m3503unboximpl);
            }
            fArr[i5] = m3494getYimpl;
        }
        return fArr;
    }

    @p4.l
    public final int[] getColors() {
        return this.colors;
    }

    @p4.l
    public final short[] getIndices() {
        return this.indices;
    }

    @p4.l
    public final float[] getPositions() {
        return this.positions;
    }

    @p4.l
    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    /* renamed from: getVertexMode-c2xauaI, reason: not valid java name */
    public final int m4134getVertexModec2xauaI() {
        return this.vertexMode;
    }
}
