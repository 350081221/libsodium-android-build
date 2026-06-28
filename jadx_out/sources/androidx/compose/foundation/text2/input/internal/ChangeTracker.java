package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.TextFieldBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRangeKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001\"B\u0013\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b \u0010!J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u001e\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\bJ\u001d\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0012J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/ChangeTracker;", "Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;", "Landroidx/compose/foundation/text2/input/internal/ChangeTracker$Change;", "mergedOverlappingChange", "", "preMin", "preMax", "postDelta", "Lkotlin/r2;", "appendNewChange", "preStart", "preEnd", "postLength", "trackChange", "clearChanges", "changeIndex", "Landroidx/compose/ui/text/TextRange;", "getRange--jx7JFs", "(I)J", "getRange", "getOriginalRange--jx7JFs", "getOriginalRange", "", "toString", "Landroidx/compose/runtime/collection/MutableVector;", "_changes", "Landroidx/compose/runtime/collection/MutableVector;", "_changesTemp", "getChangeCount", "()I", "changeCount", "initialChanges", "<init>", "(Landroidx/compose/foundation/text2/input/internal/ChangeTracker;)V", "Change", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nChangeTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text2/input/internal/ChangeTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1208#2:197\n1187#2,2:198\n1208#2:200\n1187#2,2:201\n460#3,7:203\n728#3,2:210\n467#3,4:212\n523#3:216\n728#3,2:217\n523#3:219\n523#3:221\n476#3,11:222\n728#3,2:233\n1#4:220\n*S KotlinDebug\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text2/input/internal/ChangeTracker\n*L\n34#1:197\n34#1:198,2\n35#1:200\n35#1:201,2\n38#1:203,7\n39#1:210,2\n38#1:212,4\n81#1:216\n110#1:217,2\n132#1:219\n135#1:221\n139#1:222,11\n186#1:233,2\n*E\n"})
/* loaded from: classes.dex */
public final class ChangeTracker implements TextFieldBuffer.ChangeList {
    public static final int $stable = 8;

    @l
    private MutableVector<Change> _changes;

    @l
    private MutableVector<Change> _changesTemp;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/ChangeTracker$Change;", "", "preStart", "", "preEnd", "originalStart", "originalEnd", "(IIII)V", "getOriginalEnd", "()I", "setOriginalEnd", "(I)V", "getOriginalStart", "setOriginalStart", "getPreEnd", "setPreEnd", "getPreStart", "setPreStart", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Change {
        private int originalEnd;
        private int originalStart;
        private int preEnd;
        private int preStart;

        public Change(int i5, int i6, int i7, int i8) {
            this.preStart = i5;
            this.preEnd = i6;
            this.originalStart = i7;
            this.originalEnd = i8;
        }

        public static /* synthetic */ Change copy$default(Change change, int i5, int i6, int i7, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i5 = change.preStart;
            }
            if ((i9 & 2) != 0) {
                i6 = change.preEnd;
            }
            if ((i9 & 4) != 0) {
                i7 = change.originalStart;
            }
            if ((i9 & 8) != 0) {
                i8 = change.originalEnd;
            }
            return change.copy(i5, i6, i7, i8);
        }

        public final int component1() {
            return this.preStart;
        }

        public final int component2() {
            return this.preEnd;
        }

        public final int component3() {
            return this.originalStart;
        }

        public final int component4() {
            return this.originalEnd;
        }

        @l
        public final Change copy(int i5, int i6, int i7, int i8) {
            return new Change(i5, i6, i7, i8);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Change)) {
                return false;
            }
            Change change = (Change) obj;
            return this.preStart == change.preStart && this.preEnd == change.preEnd && this.originalStart == change.originalStart && this.originalEnd == change.originalEnd;
        }

        public final int getOriginalEnd() {
            return this.originalEnd;
        }

        public final int getOriginalStart() {
            return this.originalStart;
        }

        public final int getPreEnd() {
            return this.preEnd;
        }

        public final int getPreStart() {
            return this.preStart;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.preStart) * 31) + Integer.hashCode(this.preEnd)) * 31) + Integer.hashCode(this.originalStart)) * 31) + Integer.hashCode(this.originalEnd);
        }

        public final void setOriginalEnd(int i5) {
            this.originalEnd = i5;
        }

        public final void setOriginalStart(int i5) {
            this.originalStart = i5;
        }

        public final void setPreEnd(int i5) {
            this.preEnd = i5;
        }

        public final void setPreStart(int i5) {
            this.preStart = i5;
        }

        @l
        public String toString() {
            return "Change(preStart=" + this.preStart + ", preEnd=" + this.preEnd + ", originalStart=" + this.originalStart + ", originalEnd=" + this.originalEnd + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeTracker() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ChangeTracker(@m ChangeTracker changeTracker) {
        MutableVector<Change> mutableVector;
        int size;
        int i5 = 0;
        this._changes = new MutableVector<>(new Change[16], 0);
        this._changesTemp = new MutableVector<>(new Change[16], 0);
        if (changeTracker == null || (mutableVector = changeTracker._changes) == null || (size = mutableVector.getSize()) <= 0) {
            return;
        }
        Change[] content = mutableVector.getContent();
        do {
            Change change = content[i5];
            this._changes.add(new Change(change.getPreStart(), change.getPreEnd(), change.getOriginalStart(), change.getOriginalEnd()));
            i5++;
        } while (i5 < size);
    }

    private final void appendNewChange(Change change, int i5, int i6, int i7) {
        int preEnd;
        if (this._changesTemp.isEmpty()) {
            preEnd = 0;
        } else {
            Change last = this._changesTemp.last();
            preEnd = last.getPreEnd() - last.getOriginalEnd();
        }
        if (change == null) {
            int i8 = i5 - preEnd;
            change = new Change(i5, i6 + i7, i8, (i6 - i5) + i8);
        } else {
            if (change.getPreStart() > i5) {
                change.setPreStart(i5);
                change.setOriginalStart(i5);
            }
            if (i6 > change.getPreEnd()) {
                int preEnd2 = change.getPreEnd() - change.getOriginalEnd();
                change.setPreEnd(i6);
                change.setOriginalEnd(i6 - preEnd2);
            }
            change.setPreEnd(change.getPreEnd() + i7);
        }
        this._changesTemp.add(change);
    }

    public final void clearChanges() {
        this._changes.clear();
    }

    @Override // androidx.compose.foundation.text2.input.TextFieldBuffer.ChangeList
    public int getChangeCount() {
        return this._changes.getSize();
    }

    @Override // androidx.compose.foundation.text2.input.TextFieldBuffer.ChangeList
    /* renamed from: getOriginalRange--jx7JFs */
    public long mo1064getOriginalRangejx7JFs(int i5) {
        Change change = this._changes.getContent()[i5];
        return TextRangeKt.TextRange(change.getOriginalStart(), change.getOriginalEnd());
    }

    @Override // androidx.compose.foundation.text2.input.TextFieldBuffer.ChangeList
    /* renamed from: getRange--jx7JFs */
    public long mo1065getRangejx7JFs(int i5) {
        Change change = this._changes.getContent()[i5];
        return TextRangeKt.TextRange(change.getPreStart(), change.getPreEnd());
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeList(changes=[");
        MutableVector<Change> mutableVector = this._changes;
        int size = mutableVector.getSize();
        if (size > 0) {
            Change[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                Change change = content[i5];
                sb.append('(' + change.getOriginalStart() + ',' + change.getOriginalEnd() + ")->(" + change.getPreStart() + ',' + change.getPreEnd() + ')');
                if (i5 < getChangeCount() - 1) {
                    sb.append(", ");
                }
                i5++;
            } while (i5 < size);
        }
        sb.append("])");
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void trackChange(int i5, int i6, int i7) {
        boolean z4;
        boolean z5;
        if (i5 == i6 && i7 == 0) {
            return;
        }
        int min = Math.min(i5, i6);
        int max = Math.max(i5, i6);
        int i8 = i7 - (max - min);
        Change change = null;
        boolean z6 = false;
        for (int i9 = 0; i9 < this._changes.getSize(); i9++) {
            Change change2 = this._changes.getContent()[i9];
            int preStart = change2.getPreStart();
            if (min <= preStart && preStart <= max) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                int preEnd = change2.getPreEnd();
                if (min <= preEnd && preEnd <= max) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    if (change2.getPreStart() > max && !z6) {
                        appendNewChange(change, min, max, i8);
                        z6 = true;
                    }
                    if (z6) {
                        change2.setPreStart(change2.getPreStart() + i8);
                        change2.setPreEnd(change2.getPreEnd() + i8);
                    }
                    this._changesTemp.add(change2);
                }
            }
            if (change == null) {
                change = change2;
            } else {
                change.setPreEnd(change2.getPreEnd());
                change.setOriginalEnd(change2.getOriginalEnd());
            }
        }
        if (!z6) {
            appendNewChange(change, min, max, i8);
        }
        MutableVector<Change> mutableVector = this._changes;
        this._changes = this._changesTemp;
        this._changesTemp = mutableVector;
        mutableVector.clear();
    }

    public /* synthetic */ ChangeTracker(ChangeTracker changeTracker, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : changeTracker);
    }
}
