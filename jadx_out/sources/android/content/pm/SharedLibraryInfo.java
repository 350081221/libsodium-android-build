package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class SharedLibraryInfo implements Parcelable {
    public static final Parcelable.Creator<SharedLibraryInfo> CREATOR = new Parcelable.Creator<SharedLibraryInfo>() { // from class: android.content.pm.SharedLibraryInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SharedLibraryInfo createFromParcel(Parcel parcel) {
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SharedLibraryInfo[] newArray(int i5) {
            return null;
        }
    };
    public static final String PLATFORM_PACKAGE_NAME = "android";
    public static final int TYPE_BUILTIN = 0;
    public static final int TYPE_DYNAMIC = 1;
    public static final int TYPE_STATIC = 2;
    public static final int VERSION_UNDEFINED = -1;

    public SharedLibraryInfo(String str, String str2, List<String> list, String str3, long j5, int i5, VersionedPackage versionedPackage, List<VersionedPackage> list2, List<SharedLibraryInfo> list3, boolean z4) {
        throw new RuntimeException("Just amphiable stub!");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        throw new RuntimeException("Stub!");
    }
}
