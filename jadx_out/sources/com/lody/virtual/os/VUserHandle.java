package com.lody.virtual.os;

import a1.i;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.core.VirtualCore;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public final class VUserHandle implements Parcelable {
    public static final int FIRST_ISOLATED_UID = 99000;
    public static final int FIRST_SHARED_APPLICATION_GID = 50000;
    public static final int LAST_ISOLATED_UID = 99999;
    public static final int LAST_SHARED_APPLICATION_GID = 59999;
    public static final boolean MU_ENABLED = true;
    public static final int PER_USER_RANGE = 100000;
    public static final int USER_ALL = -1;
    public static final int USER_CURRENT = -2;
    public static final int USER_CURRENT_OR_SELF = -3;
    public static final int USER_NULL = -10000;
    public static final int USER_OWNER = 0;
    final int mHandle;
    public static final VUserHandle ALL = new VUserHandle(-1);
    public static final VUserHandle CURRENT = new VUserHandle(-2);
    public static final VUserHandle CURRENT_OR_SELF = new VUserHandle(-3);
    public static final VUserHandle OWNER = new VUserHandle(0);
    public static final Parcelable.Creator<VUserHandle> CREATOR = new Parcelable.Creator<VUserHandle>() { // from class: com.lody.virtual.os.VUserHandle.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VUserHandle createFromParcel(Parcel parcel) {
            return new VUserHandle(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VUserHandle[] newArray(int i5) {
            return new VUserHandle[i5];
        }
    };
    private static final SparseArray<VUserHandle> userHandles = new SparseArray<>();

    public VUserHandle(int i5) {
        this.mHandle = i5;
    }

    public static boolean accept(int i5) {
        return i5 == -1 || i5 == myUserId();
    }

    public static void formatUid(StringBuilder sb, int i5) {
        if (i5 < 10000) {
            sb.append(i5);
            return;
        }
        sb.append('u');
        sb.append(getUserId(i5));
        int appId = getAppId(i5);
        if (appId >= 99000 && appId <= 99999) {
            sb.append('i');
            sb.append(appId - FIRST_ISOLATED_UID);
        } else if (appId >= 10000) {
            sb.append('a');
            sb.append(appId - 10000);
        } else {
            sb.append('s');
            sb.append(appId);
        }
    }

    public static int getAppId(int i5) {
        return i5 % 100000;
    }

    public static int getAppIdFromSharedAppGid(int i5) {
        int appId = getAppId(i5);
        if (appId >= 50000 && appId <= 59999) {
            return (appId + 10000) - FIRST_SHARED_APPLICATION_GID;
        }
        throw new IllegalArgumentException(Integer.toString(i5) + " is not a shared app gid");
    }

    public static VUserHandle getCallingUserHandle() {
        int userId = getUserId(VBinder.getCallingUid());
        SparseArray<VUserHandle> sparseArray = userHandles;
        VUserHandle vUserHandle = sparseArray.get(userId);
        if (vUserHandle == null) {
            VUserHandle vUserHandle2 = new VUserHandle(userId);
            sparseArray.put(userId, vUserHandle2);
            return vUserHandle2;
        }
        return vUserHandle;
    }

    public static int getCallingUserId() {
        return getUserId(VBinder.getCallingUid());
    }

    public static int getUid(int i5, int i6) {
        return (i5 * 100000) + (i6 % 100000);
    }

    public static int getUserId(int i5) {
        if (i5 < 0) {
            return 0;
        }
        return i5 / 100000;
    }

    public static boolean isApp(int i5) {
        int appId;
        return i5 > 0 && (appId = getAppId(i5)) >= 10000 && appId <= 19999;
    }

    public static final boolean isIsolated(int i5) {
        int appId;
        return i5 > 0 && (appId = getAppId(i5)) >= 99000 && appId <= 99999;
    }

    public static final boolean isSameApp(int i5, int i6) {
        return getAppId(i5) == getAppId(i6);
    }

    public static boolean isSameUser(int i5, int i6) {
        return getUserId(i5) == getUserId(i6);
    }

    public static int myAppId() {
        return getAppId(VClient.get().getVUid());
    }

    public static VUserHandle myUserHandle() {
        return new VUserHandle(myUserId());
    }

    public static int myUserId() {
        return getUserId(VClient.get().getVUid());
    }

    public static VUserHandle readFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != -10000) {
            return new VUserHandle(readInt);
        }
        return null;
    }

    public static int realUserId() {
        return getUserId(VirtualCore.get().myUid());
    }

    public static void writeToParcel(VUserHandle vUserHandle, Parcel parcel) {
        if (vUserHandle != null) {
            vUserHandle.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(-10000);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            if (this.mHandle != ((VUserHandle) obj).mHandle) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int getIdentifier() {
        return this.mHandle;
    }

    public int hashCode() {
        return this.mHandle;
    }

    public final boolean isOwner() {
        return equals(OWNER);
    }

    public String toString() {
        return "VUserHandle{" + this.mHandle + i.f138d;
    }

    public VUserHandle(Parcel parcel) {
        this.mHandle = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.mHandle);
    }

    public static String formatUid(int i5) {
        StringBuilder sb = new StringBuilder();
        formatUid(sb, i5);
        return sb.toString();
    }

    public static void formatUid(PrintWriter printWriter, int i5) {
        if (i5 < 10000) {
            printWriter.print(i5);
            return;
        }
        printWriter.print('u');
        printWriter.print(getUserId(i5));
        int appId = getAppId(i5);
        if (appId >= 99000 && appId <= 99999) {
            printWriter.print('i');
            printWriter.print(appId - FIRST_ISOLATED_UID);
        } else if (appId >= 10000) {
            printWriter.print('a');
            printWriter.print(appId - 10000);
        } else {
            printWriter.print('s');
            printWriter.print(appId);
        }
    }
}
