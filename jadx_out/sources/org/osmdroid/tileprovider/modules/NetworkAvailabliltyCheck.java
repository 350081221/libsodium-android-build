package org.osmdroid.tileprovider.modules;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;

/* loaded from: classes4.dex */
public class NetworkAvailabliltyCheck implements INetworkAvailablityCheck {
    private final ConnectivityManager mConnectionManager;
    private final boolean mHasNetworkStatePermission;
    private final boolean mIsX86 = "Android-x86".equalsIgnoreCase(Build.BRAND);

    public NetworkAvailabliltyCheck(Context context) {
        boolean z4;
        this.mConnectionManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mHasNetworkStatePermission = z4;
    }

    @Override // org.osmdroid.tileprovider.modules.INetworkAvailablityCheck
    public boolean getCellularDataNetworkAvailable() {
        if (!this.mHasNetworkStatePermission) {
            return true;
        }
        NetworkInfo networkInfo = this.mConnectionManager.getNetworkInfo(0);
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @Override // org.osmdroid.tileprovider.modules.INetworkAvailablityCheck
    public boolean getNetworkAvailable() {
        if (!this.mHasNetworkStatePermission) {
            return true;
        }
        NetworkInfo activeNetworkInfo = this.mConnectionManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        if (activeNetworkInfo.isConnected()) {
            return true;
        }
        if (this.mIsX86 && activeNetworkInfo.getType() == 9) {
            return true;
        }
        return false;
    }

    @Override // org.osmdroid.tileprovider.modules.INetworkAvailablityCheck
    @Deprecated
    public boolean getRouteToPathExists(int i5) {
        return true;
    }

    @Override // org.osmdroid.tileprovider.modules.INetworkAvailablityCheck
    public boolean getWiFiNetworkAvailable() {
        if (!this.mHasNetworkStatePermission) {
            return true;
        }
        NetworkInfo networkInfo = this.mConnectionManager.getNetworkInfo(1);
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
