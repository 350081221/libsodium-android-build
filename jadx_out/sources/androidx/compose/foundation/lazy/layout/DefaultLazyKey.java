package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import u3.e;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0083\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "", "component1", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/r2;", "writeToParcel", "describeContents", "index", "copy", "", "toString", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "I", "<init>", "(I)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class DefaultLazyKey implements Parcelable {
    private final int index;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @e
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new Parcelable.Creator<DefaultLazyKey>() { // from class: androidx.compose.foundation.lazy.layout.DefaultLazyKey$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public DefaultLazyKey createFromParcel(@l Parcel parcel) {
            return new DefaultLazyKey(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public DefaultLazyKey[] newArray(int i5) {
            return new DefaultLazyKey[i5];
        }
    };

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "getCREATOR$annotations", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    public DefaultLazyKey(int i5) {
        this.index = i5;
    }

    private final int component1() {
        return this.index;
    }

    public static /* synthetic */ DefaultLazyKey copy$default(DefaultLazyKey defaultLazyKey, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = defaultLazyKey.index;
        }
        return defaultLazyKey.copy(i5);
    }

    @l
    public final DefaultLazyKey copy(int i5) {
        return new DefaultLazyKey(i5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.index == ((DefaultLazyKey) obj).index;
    }

    public int hashCode() {
        return Integer.hashCode(this.index);
    }

    @l
    public String toString() {
        return "DefaultLazyKey(index=" + this.index + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int i5) {
        parcel.writeInt(this.index);
    }
}
