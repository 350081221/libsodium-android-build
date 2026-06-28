package android.security.keystore.recovery;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class KeyChainSnapshot implements Parcelable {
    public static final Parcelable.Creator<KeyChainSnapshot> CREATOR = new Parcelable.Creator<KeyChainSnapshot>() { // from class: android.security.keystore.recovery.KeyChainSnapshot.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public KeyChainSnapshot createFromParcel(Parcel parcel) {
            return new KeyChainSnapshot(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public KeyChainSnapshot[] newArray(int i5) {
            return new KeyChainSnapshot[i5];
        }
    };

    public KeyChainSnapshot(Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
    }
}
