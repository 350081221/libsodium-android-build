package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;
import u3.e;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "Landroidx/compose/runtime/SnapshotMutableIntStateImpl;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/r2;", "writeToParcel", "describeContents", b.f22420d, "<init>", "(I)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableIntState extends SnapshotMutableIntStateImpl implements Parcelable {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @e
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new Parcelable.Creator<ParcelableSnapshotMutableIntState>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableIntState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public ParcelableSnapshotMutableIntState createFromParcel(@l Parcel parcel) {
            return new ParcelableSnapshotMutableIntState(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public ParcelableSnapshotMutableIntState[] newArray(int i5) {
            return new ParcelableSnapshotMutableIntState[i5];
        }
    };

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "getCREATOR$annotations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }

    public ParcelableSnapshotMutableIntState(int i5) {
        super(i5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int i5) {
        parcel.writeInt(getIntValue());
    }
}
