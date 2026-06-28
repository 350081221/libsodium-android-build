package com.lody.virtual.client.stub;

import android.annotation.TargetApi;
import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.client.ipc.VPackageManager;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Locale;
import mirror.android.content.ContentProviderClientJB;

/* loaded from: classes3.dex */
public class ContentProviderProxy extends ContentProvider {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class TargetProviderInfo {
        ProviderInfo info;
        Uri uri;
        int userId;

        TargetProviderInfo(int i5, ProviderInfo providerInfo, Uri uri) {
            this.userId = i5;
            this.info = providerInfo;
            this.uri = uri;
        }

        public String toString() {
            return "TargetProviderInfo{userId=" + this.userId + ", info=" + this.info + ", uri=" + this.uri + '}';
        }
    }

    private ContentProviderClient acquireProviderClient(TargetProviderInfo targetProviderInfo) {
        try {
            IInterface acquireProviderClient = VActivityManager.get().acquireProviderClient(targetProviderInfo.userId, targetProviderInfo.info);
            if (acquireProviderClient != null) {
                return ContentProviderClientJB.ctor.newInstance(getContext().getContentResolver(), acquireProviderClient, Boolean.TRUE);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static Uri buildProxyUri(int i5, boolean z4, String str, Uri uri) {
        return Uri.withAppendedPath(Uri.parse(String.format(Locale.ENGLISH, "content://%1$s/%2$d/%3$s", StubManifest.getProxyAuthority(z4), Integer.valueOf(i5), str)), uri.toString());
    }

    private TargetProviderInfo getProviderProviderInfo(Uri uri) {
        List<String> pathSegments;
        int i5;
        String str;
        ProviderInfo resolveContentProvider;
        if (VirtualCore.get().isEngineLaunched() && (pathSegments = uri.getPathSegments()) != null && pathSegments.size() >= 3) {
            try {
                i5 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException e5) {
                e5.printStackTrace();
                i5 = -1;
            }
            if (i5 != -1 && (resolveContentProvider = VPackageManager.get().resolveContentProvider((str = pathSegments.get(1)), 0, i5)) != null && resolveContentProvider.enabled) {
                String uri2 = uri.toString();
                String substring = uri2.substring(str.length() + uri2.indexOf(str, 1) + 1);
                if (substring.startsWith("content:/") && !substring.startsWith("content://")) {
                    substring = substring.replace("content:/", "content://");
                }
                return new TargetProviderInfo(i5, resolveContentProvider, Uri.parse(substring));
            }
        }
        return null;
    }

    public ContentProviderClient acquireTargetProviderClient(Uri uri) {
        TargetProviderInfo providerProviderInfo = getProviderProviderInfo(uri);
        if (providerProviderInfo != null) {
            return acquireProviderClient(providerProviderInfo);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    @TargetApi(19)
    public Uri canonicalize(Uri uri) {
        ContentProviderClient acquireProviderClient;
        TargetProviderInfo providerProviderInfo = getProviderProviderInfo(uri);
        if (providerProviderInfo != null && (acquireProviderClient = acquireProviderClient(providerProviderInfo)) != null) {
            try {
                return acquireProviderClient.canonicalize(providerProviderInfo.uri);
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        ContentProviderClient acquireProviderClient;
        TargetProviderInfo providerProviderInfo = getProviderProviderInfo(uri);
        if (providerProviderInfo != null && (acquireProviderClient = acquireProviderClient(providerProviderInfo)) != null) {
            try {
                return acquireProviderClient.delete(providerProviderInfo.uri, str, strArr);
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public String[] getStreamTypes(Uri uri, String str) {
        ContentProviderClient acquireProviderClient;
        TargetProviderInfo providerProviderInfo = getProviderProviderInfo(uri);
        if (providerProviderInfo != null && (acquireProviderClient = acquireProviderClient(providerProviderInfo)) != null) {
            try {
                return acquireProviderClient.getStreamTypes(providerProviderInfo.uri, str);
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        ContentProviderClient acquireProviderClient;
        TargetProviderInfo providerProviderInfo = getProviderProviderInfo(uri);
        if (providerProviderInfo != null && (acquireProviderClient = acquireProviderClient(providerProviderInfo)) != null) {
            try {
                return acquireProviderClient.getType(providerProviderInfo.uri);
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        ContentProviderClient acquireProviderClient;
        TargetProviderInfo providerProviderInfo = getProviderProviderInfo(uri);
        if (providerProviderInfo != null && (acquireProviderClient = acquireProviderClient(providerProviderInfo)) != null) {
            try {
                return acquireProviderClient.insert(providerProviderInfo.uri, contentValues);
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        ContentProviderClient acquireProviderClient;
        TargetProviderInfo providerProviderInfo = getProviderProviderInfo(uri);
        if (providerProviderInfo != null && (acquireProviderClient = acquireProviderClient(providerProviderInfo)) != null) {
            try {
                return acquireProviderClient.openFile(providerProviderInfo.uri, str);
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        ContentProviderClient acquireProviderClient;
        TargetProviderInfo providerProviderInfo = getProviderProviderInfo(uri);
        if (providerProviderInfo != null && (acquireProviderClient = acquireProviderClient(providerProviderInfo)) != null) {
            try {
                return acquireProviderClient.query(providerProviderInfo.uri, strArr, str, strArr2, str2);
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    @TargetApi(26)
    public boolean refresh(Uri uri, Bundle bundle, CancellationSignal cancellationSignal) {
        ContentProviderClient acquireProviderClient;
        boolean refresh;
        TargetProviderInfo providerProviderInfo = getProviderProviderInfo(uri);
        if (providerProviderInfo != null && (acquireProviderClient = acquireProviderClient(providerProviderInfo)) != null) {
            try {
                refresh = acquireProviderClient.refresh(providerProviderInfo.uri, bundle, cancellationSignal);
                return refresh;
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override // android.content.ContentProvider
    @TargetApi(19)
    public Uri uncanonicalize(Uri uri) {
        ContentProviderClient acquireProviderClient;
        TargetProviderInfo providerProviderInfo = getProviderProviderInfo(uri);
        if (providerProviderInfo != null && (acquireProviderClient = acquireProviderClient(providerProviderInfo)) != null) {
            try {
                return acquireProviderClient.uncanonicalize(providerProviderInfo.uri);
            } catch (RemoteException e5) {
                e5.printStackTrace();
            }
        }
        return uri;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        ContentProviderClient acquireProviderClient;
        TargetProviderInfo providerProviderInfo = getProviderProviderInfo(uri);
        if (providerProviderInfo != null && (acquireProviderClient = acquireProviderClient(providerProviderInfo)) != null) {
            try {
                return acquireProviderClient.update(providerProviderInfo.uri, contentValues, str, strArr);
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }
}
