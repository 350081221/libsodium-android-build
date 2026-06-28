package androidx.collection;

import androidx.annotation.IntRange;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.NoSuchElementException;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import p4.m;
import u3.e;
import u3.i;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010N\u001a\u00020\u000f¢\u0006\u0004\bO\u0010PJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J:\u0010\u0004\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010\u000b\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0000J\u0006\u0010\u0010\u001a\u00020\u000fJ:\u0010\u0010\u001a\u00020\u000f2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\u0011\u001a\u00020\u0006J:\u0010\u0011\u001a\u00020\u00062!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001Jd\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00028\u000026\u0010\u0016\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0017\u0010\u0018Jy\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00028\u00002K\u0010\u0016\u001aG\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJd\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00028\u000026\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001d\u0010\u0018Jy\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00028\u00002K\u0010\u0016\u001aG\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ:\u0010!\u001a\u00020\u001f2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u001f0\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010\"\u001a\u00020\u001f26\u0010 \u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u001f0\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010#\u001a\u00020\u001f2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u001f0\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010$\u001a\u00020\u001f26\u0010 \u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u001f0\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010%\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u000fH\u0086\u0002J\u0010\u0010&\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u000fJ9\u0010(\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u000f2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000J\u000e\u0010)\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0006J:\u0010*\u001a\u00020\u000f2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010+\u001a\u00020\u000f2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010,\u001a\u00020\u0002J\u0006\u0010-\u001a\u00020\u0002J\u0006\u0010.\u001a\u00020\u0006J:\u0010.\u001a\u00020\u00062!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u000e\u0010/\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0006J:\u00107\u001a\u0002062\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u000200H\u0007JT\u00107\u001a\u0002062\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u0002002\u0014\b\u0004\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002000\u0005H\u0087\bø\u0001\u0000J\b\u00109\u001a\u00020\u000fH\u0016J\u0013\u0010;\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010<\u001a\u000206H\u0016R\u001c\u0010>\u001a\u00020=8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b>\u0010?\u0012\u0004\b@\u0010AR\u001c\u0010B\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bB\u0010C\u0012\u0004\bD\u0010AR\u0011\u0010G\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0012\u0010I\u001a\u00020\u000f8Ç\u0002¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0012\u0010M\u001a\u00020J8Æ\u0002¢\u0006\u0006\u001a\u0004\bK\u0010L\u0082\u0001\u0001Q\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006R"}, d2 = {"Landroidx/collection/FloatList;", "", "", "none", "any", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "element", "predicate", "reversedAny", "contains", "elements", "containsAll", "", "count", "first", "R", "initial", "Lkotlin/Function2;", "acc", "operation", "fold", "(Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;", "Lkotlin/Function3;", "index", "foldIndexed", "(Ljava/lang/Object;Lv3/q;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "Lkotlin/r2;", "block", "forEach", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "elementAt", "defaultValue", "elementAtOrElse", "indexOf", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "transform", TTDownloadField.TT_HASHCODE, "other", "equals", "toString", "", "content", "[F", "getContent$annotations", "()V", "_size", "I", "get_size$annotations", "getSize", "()I", "size", "getLastIndex", "lastIndex", "Lkotlin/ranges/l;", "getIndices", "()Lkotlin/ranges/l;", "indices", "initialCapacity", "<init>", "(I)V", "Landroidx/collection/MutableFloatList;", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n1#1,969:1\n253#1,6:970\n279#1,6:976\n253#1,6:982\n75#1:988\n253#1,6:989\n253#1,6:995\n253#1,6:1001\n266#1,6:1007\n279#1,6:1013\n293#1,6:1019\n70#1:1025\n70#1:1026\n266#1,6:1027\n266#1,6:1033\n293#1,6:1039\n70#1:1045\n279#1,6:1046\n293#1,6:1052\n266#1,6:1058\n266#1,6:1064\n253#1,6:1070\n75#1:1076\n467#1,10:1077\n266#1,4:1087\n477#1,9:1091\n271#1:1100\n486#1,2:1101\n467#1,10:1103\n266#1,4:1113\n477#1,9:1117\n271#1:1126\n486#1,2:1127\n467#1,10:1129\n266#1,4:1139\n477#1,9:1143\n271#1:1152\n486#1,2:1153\n467#1,10:1155\n266#1,4:1165\n477#1,9:1169\n271#1:1178\n486#1,2:1179\n467#1,10:1181\n266#1,4:1191\n477#1,9:1195\n271#1:1204\n486#1,2:1205\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n96#1:970,6\n110#1:976,6\n122#1:982,6\n135#1:988\n153#1:989,6\n175#1:995,6\n192#1:1001,6\n208#1:1007,6\n225#1:1013,6\n241#1:1019,6\n306#1:1025\n317#1:1026\n343#1:1027,6\n357#1:1033,6\n371#1:1039,6\n397#1:1045\n407#1:1046,6\n420#1:1052,6\n445#1:1058,6\n476#1:1064,6\n494#1:1070,6\n510#1:1076\n-1#1:1077,10\n-1#1:1087,4\n-1#1:1091,9\n-1#1:1100\n-1#1:1101,2\n-1#1:1103,10\n-1#1:1113,4\n-1#1:1117,9\n-1#1:1126\n-1#1:1127,2\n-1#1:1129,10\n-1#1:1139,4\n-1#1:1143,9\n-1#1:1152\n-1#1:1153,2\n-1#1:1155,10\n-1#1:1165,4\n-1#1:1169,9\n-1#1:1178\n-1#1:1179,2\n-1#1:1181,10\n-1#1:1191,4\n-1#1:1195,9\n-1#1:1204\n-1#1:1205,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class FloatList {

    @e
    public int _size;

    @l
    @e
    public float[] content;

    private FloatList(int i5) {
        float[] fArr;
        if (i5 == 0) {
            fArr = FloatSetKt.getEmptyFloatArray();
        } else {
            fArr = new float[i5];
        }
        this.content = fArr;
    }

    public /* synthetic */ FloatList(int i5, w wVar) {
        this(i5);
    }

    @a1
    public static /* synthetic */ void getContent$annotations() {
    }

    @a1
    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i6 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i6 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i6 & 4) == 0 ? charSequence3 : "";
        if ((i6 & 8) != 0) {
            i5 = -1;
        }
        int i7 = i5;
        if ((i6 & 16) != 0) {
            charSequence4 = "...";
        }
        return floatList.joinToString(charSequence, charSequence5, charSequence6, i7, charSequence4);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean contains(float f5) {
        boolean z4;
        float[] fArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (fArr[i6] == f5) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@l FloatList elements) {
        kotlin.ranges.l W1;
        l0.p(elements, "elements");
        W1 = u.W1(0, elements._size);
        int e5 = W1.e();
        int g5 = W1.g();
        if (e5 <= g5) {
            while (contains(elements.get(e5))) {
                if (e5 != g5) {
                    e5++;
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final float elementAt(@IntRange(from = 0) int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < this._size) {
            z4 = true;
        }
        if (z4) {
            return this.content[i5];
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + (this._size - 1));
    }

    public final float elementAtOrElse(@IntRange(from = 0) int i5, @l v3.l<? super Integer, Float> defaultValue) {
        l0.p(defaultValue, "defaultValue");
        boolean z4 = false;
        if (i5 >= 0 && i5 < this._size) {
            z4 = true;
        }
        if (!z4) {
            return defaultValue.invoke(Integer.valueOf(i5)).floatValue();
        }
        return this.content[i5];
    }

    public boolean equals(@m Object obj) {
        kotlin.ranges.l W1;
        boolean z4;
        if (obj instanceof FloatList) {
            FloatList floatList = (FloatList) obj;
            int i5 = floatList._size;
            int i6 = this._size;
            if (i5 == i6) {
                float[] fArr = this.content;
                float[] fArr2 = floatList.content;
                W1 = u.W1(0, i6);
                int e5 = W1.e();
                int g5 = W1.g();
                if (e5 <= g5) {
                    while (true) {
                        if (fArr[e5] == fArr2[e5]) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            return false;
                        }
                        if (e5 == g5) {
                            break;
                        }
                        e5++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final float first() {
        if (!isEmpty()) {
            return this.content[0];
        }
        throw new NoSuchElementException("FloatList is empty.");
    }

    public final <R> R fold(R r5, @l p<? super R, ? super Float, ? extends R> operation) {
        l0.p(operation, "operation");
        float[] fArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            r5 = operation.invoke(r5, Float.valueOf(fArr[i6]));
        }
        return r5;
    }

    public final <R> R foldIndexed(R r5, @l q<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        l0.p(operation, "operation");
        float[] fArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            R r6 = r5;
            r5 = operation.invoke(Integer.valueOf(i6), r6, Float.valueOf(fArr[i6]));
        }
        return r5;
    }

    public final <R> R foldRight(R r5, @l p<? super Float, ? super R, ? extends R> operation) {
        l0.p(operation, "operation");
        float[] fArr = this.content;
        int i5 = this._size;
        while (true) {
            i5--;
            if (-1 >= i5) {
                return r5;
            }
            r5 = operation.invoke(Float.valueOf(fArr[i5]), r5);
        }
    }

    public final <R> R foldRightIndexed(R r5, @l q<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        l0.p(operation, "operation");
        float[] fArr = this.content;
        int i5 = this._size;
        while (true) {
            i5--;
            if (-1 >= i5) {
                return r5;
            }
            r5 = operation.invoke(Integer.valueOf(i5), Float.valueOf(fArr[i5]), r5);
        }
    }

    public final void forEach(@l v3.l<? super Float, r2> block) {
        l0.p(block, "block");
        float[] fArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            block.invoke(Float.valueOf(fArr[i6]));
        }
    }

    public final void forEachIndexed(@l p<? super Integer, ? super Float, r2> block) {
        l0.p(block, "block");
        float[] fArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            block.invoke(Integer.valueOf(i6), Float.valueOf(fArr[i6]));
        }
    }

    public final void forEachReversed(@l v3.l<? super Float, r2> block) {
        l0.p(block, "block");
        float[] fArr = this.content;
        int i5 = this._size;
        while (true) {
            i5--;
            if (-1 < i5) {
                block.invoke(Float.valueOf(fArr[i5]));
            } else {
                return;
            }
        }
    }

    public final void forEachReversedIndexed(@l p<? super Integer, ? super Float, r2> block) {
        l0.p(block, "block");
        float[] fArr = this.content;
        int i5 = this._size;
        while (true) {
            i5--;
            if (-1 < i5) {
                block.invoke(Integer.valueOf(i5), Float.valueOf(fArr[i5]));
            } else {
                return;
            }
        }
    }

    public final float get(@IntRange(from = 0) int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < this._size) {
            z4 = true;
        }
        if (z4) {
            return this.content[i5];
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + (this._size - 1));
    }

    @l
    public final kotlin.ranges.l getIndices() {
        kotlin.ranges.l W1;
        W1 = u.W1(0, this._size);
        return W1;
    }

    @IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        float[] fArr = this.content;
        int i5 = this._size;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += Float.hashCode(fArr[i7]) * 31;
        }
        return i6;
    }

    public final int indexOf(float f5) {
        boolean z4;
        float[] fArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (f5 == fArr[i6]) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return i6;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@l v3.l<? super Float, Boolean> predicate) {
        l0.p(predicate, "predicate");
        float[] fArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (predicate.invoke(Float.valueOf(fArr[i6])).booleanValue()) {
                return i6;
            }
        }
        return -1;
    }

    public final int indexOfLast(@l v3.l<? super Float, Boolean> predicate) {
        l0.p(predicate, "predicate");
        float[] fArr = this.content;
        int i5 = this._size;
        do {
            i5--;
            if (-1 >= i5) {
                return -1;
            }
        } while (!predicate.invoke(Float.valueOf(fArr[i5])).booleanValue());
        return i5;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @l
    @i
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator) {
        l0.p(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, int i5) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i5, null, 16, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, int i5, @l CharSequence truncated) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.content;
        int i6 = this._size;
        int i7 = 0;
        while (true) {
            if (i7 < i6) {
                float f5 = fArr[i7];
                if (i7 == i5) {
                    sb.append(truncated);
                    break;
                }
                if (i7 != 0) {
                    sb.append(separator);
                }
                sb.append(f5);
                i7++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final float last() {
        if (!isEmpty()) {
            return this.content[this._size - 1];
        }
        throw new NoSuchElementException("FloatList is empty.");
    }

    public final int lastIndexOf(float f5) {
        boolean z4;
        float[] fArr = this.content;
        for (int i5 = this._size - 1; -1 < i5; i5--) {
            if (fArr[i5] == f5) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return i5;
            }
        }
        return -1;
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(@l v3.l<? super Float, Boolean> predicate) {
        l0.p(predicate, "predicate");
        float[] fArr = this.content;
        for (int i5 = this._size - 1; -1 < i5; i5--) {
            if (predicate.invoke(Float.valueOf(fArr[i5])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, v3.l transform, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 1) != 0) {
                separator = ", ";
            }
            if ((i6 & 2) != 0) {
                prefix = "";
            }
            if ((i6 & 4) != 0) {
                postfix = "";
            }
            if ((i6 & 8) != 0) {
                i5 = -1;
            }
            if ((i6 & 16) != 0) {
                truncated = "...";
            }
            l0.p(separator, "separator");
            l0.p(prefix, "prefix");
            l0.p(postfix, "postfix");
            l0.p(truncated, "truncated");
            l0.p(transform, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(prefix);
            float[] fArr = floatList.content;
            int i7 = floatList._size;
            int i8 = 0;
            while (true) {
                if (i8 < i7) {
                    float f5 = fArr[i8];
                    if (i8 == i5) {
                        sb.append(truncated);
                        break;
                    }
                    if (i8 != 0) {
                        sb.append(separator);
                    }
                    sb.append((CharSequence) transform.invoke(Float.valueOf(f5)));
                    i8++;
                } else {
                    sb.append(postfix);
                    break;
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean any(@l v3.l<? super Float, Boolean> predicate) {
        l0.p(predicate, "predicate");
        float[] fArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (predicate.invoke(Float.valueOf(fArr[i6])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(@l v3.l<? super Float, Boolean> predicate) {
        l0.p(predicate, "predicate");
        float[] fArr = this.content;
        int i5 = this._size;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            if (predicate.invoke(Float.valueOf(fArr[i7])).booleanValue()) {
                i6++;
            }
        }
        return i6;
    }

    public final float first(@l v3.l<? super Float, Boolean> predicate) {
        l0.p(predicate, "predicate");
        float[] fArr = this.content;
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            float f5 = fArr[i6];
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                return f5;
            }
        }
        throw new NoSuchElementException("FloatList contains no element matching the predicate.");
    }

    public final float last(@l v3.l<? super Float, Boolean> predicate) {
        float f5;
        l0.p(predicate, "predicate");
        float[] fArr = this.content;
        int i5 = this._size;
        do {
            i5--;
            if (-1 < i5) {
                f5 = fArr[i5];
            } else {
                throw new NoSuchElementException("FloatList contains no element matching the predicate.");
            }
        } while (!predicate.invoke(Float.valueOf(f5)).booleanValue());
        return f5;
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, int i5, @l CharSequence truncated, @l v3.l<? super Float, ? extends CharSequence> transform) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(truncated, "truncated");
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.content;
        int i6 = this._size;
        int i7 = 0;
        while (true) {
            if (i7 < i6) {
                float f5 = fArr[i7];
                if (i7 == i5) {
                    sb.append(truncated);
                    break;
                }
                if (i7 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Float.valueOf(f5)));
                i7++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, int i5, @l v3.l<? super Float, ? extends CharSequence> transform) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.content;
        int i6 = this._size;
        int i7 = 0;
        while (true) {
            if (i7 < i6) {
                float f5 = fArr[i7];
                if (i7 == i5) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i7 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Float.valueOf(f5)));
                i7++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, @l v3.l<? super Float, ? extends CharSequence> transform) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.content;
        int i5 = this._size;
        int i6 = 0;
        while (true) {
            if (i6 < i5) {
                float f5 = fArr[i6];
                if (i6 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i6 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Float.valueOf(f5)));
                i6++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l v3.l<? super Float, ? extends CharSequence> transform) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.content;
        int i5 = this._size;
        int i6 = 0;
        while (true) {
            if (i6 < i5) {
                float f5 = fArr[i6];
                if (i6 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i6 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Float.valueOf(f5)));
                i6++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l v3.l<? super Float, ? extends CharSequence> transform) {
        l0.p(separator, "separator");
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.content;
        int i5 = this._size;
        int i6 = 0;
        while (true) {
            if (i6 < i5) {
                float f5 = fArr[i6];
                if (i6 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i6 != 0) {
                    sb.append(separator);
                }
                sb.append(transform.invoke(Float.valueOf(f5)));
                i6++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    @i
    public final String joinToString(@l v3.l<? super Float, ? extends CharSequence> transform) {
        l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.content;
        int i5 = this._size;
        int i6 = 0;
        while (true) {
            if (i6 < i5) {
                float f5 = fArr[i6];
                if (i6 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i6 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(transform.invoke(Float.valueOf(f5)));
                i6++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
