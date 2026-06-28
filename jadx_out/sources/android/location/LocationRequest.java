package android.location;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class LocationRequest implements Parcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new Parcelable.Creator<LocationRequest>() { // from class: android.location.LocationRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LocationRequest createFromParcel(Parcel parcel) {
            throw new RuntimeException("Stub!");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LocationRequest[] newArray(int i5) {
            throw new RuntimeException("Stub!");
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }

    public String getProvider() {
        throw new RuntimeException("Stub!");
    }

    public LocationRequest setProvider(String str) {
        throw new RuntimeException("Stub!");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        throw new RuntimeException("Stub!");
    }
}
