package com.lody.virtual.server.pm.installer;

import android.content.Intent;
import android.content.pm.IPackageInstallObserver2;
import android.os.Bundle;

/* loaded from: classes3.dex */
public class PackageInstallObserver {
    private final IPackageInstallObserver2.Stub mBinder = new IPackageInstallObserver2.Stub() { // from class: com.lody.virtual.server.pm.installer.PackageInstallObserver.1
        @Override // android.content.pm.IPackageInstallObserver2
        public void onPackageInstalled(String str, int i5, String str2, Bundle bundle) {
            PackageInstallObserver.this.onPackageInstalled(str, i5, str2, bundle);
        }

        @Override // android.content.pm.IPackageInstallObserver2
        public void onUserActionRequired(Intent intent) {
            PackageInstallObserver.this.onUserActionRequired(intent);
        }
    };

    public IPackageInstallObserver2 getBinder() {
        return this.mBinder;
    }

    public void onPackageInstalled(String str, int i5, String str2, Bundle bundle) {
    }

    public void onUserActionRequired(Intent intent) {
    }
}
