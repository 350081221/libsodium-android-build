package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import t0.b;
import u3.e;

@StabilityInferred(parameters = 2)
@SuppressLint({"BanParcelableUsage"})
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0010B\u001d\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Landroidx/compose/runtime/SnapshotMutableStateImpl;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/r2;", "writeToParcel", "describeContents", b.f22420d, "Landroidx/compose/runtime/SnapshotMutationPolicy;", bi.bt, "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableState<T> extends SnapshotMutableStateImpl<T> implements Parcelable {
    public static final int $stable = 0;
    private static final int PolicyNeverEquals = 0;
    private static final int PolicyReferentialEquality = 2;
    private static final int PolicyStructuralEquality = 1;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @e
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableState$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @l
        public ParcelableSnapshotMutableState<Object>[] newArray(int i5) {
            return new ParcelableSnapshotMutableState[i5];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        @l
        public ParcelableSnapshotMutableState<Object> createFromParcel(@l Parcel parcel, @m ClassLoader classLoader) {
            SnapshotMutationPolicy neverEqualPolicy;
            if (classLoader == null) {
                classLoader = ParcelableSnapshotMutableState$Companion$CREATOR$1.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                neverEqualPolicy = SnapshotStateKt.neverEqualPolicy();
            } else if (readInt == 1) {
                neverEqualPolicy = SnapshotStateKt.structuralEqualityPolicy();
            } else if (readInt == 2) {
                neverEqualPolicy = SnapshotStateKt.referentialEqualityPolicy();
            } else {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            return new ParcelableSnapshotMutableState<>(readValue, neverEqualPolicy);
        }

        @Override // android.os.Parcelable.Creator
        @l
        public ParcelableSnapshotMutableState<Object> createFromParcel(@l Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }
    };

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "getCREATOR$annotations", "PolicyNeverEquals", "", "PolicyReferentialEquality", "PolicyStructuralEquality", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    public ParcelableSnapshotMutableState(T t5, @l SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        super(t5, snapshotMutationPolicy);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int i5) {
        int i6;
        parcel.writeValue(getValue());
        SnapshotMutationPolicy<T> policy = getPolicy();
        if (l0.g(policy, SnapshotStateKt.neverEqualPolicy())) {
            i6 = 0;
        } else if (l0.g(policy, SnapshotStateKt.structuralEqualityPolicy())) {
            i6 = 1;
        } else if (l0.g(policy, SnapshotStateKt.referentialEqualityPolicy())) {
            i6 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i6);
    }
}
