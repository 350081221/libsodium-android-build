package com.lody.virtual.server.pm;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import com.lody.virtual.server.app.IAppInstallerSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class VAppInstallerSession extends IAppInstallerSession.Stub {
    private VAppManagerService mApp;
    private Context mContext;
    private boolean mCommited = false;
    private boolean mCacneled = false;
    private final List<Uri> mUris = new ArrayList();
    private final List<Uri> mSplitUris = new ArrayList();
    private IntentSender mStatusReceiver = null;

    public VAppInstallerSession(Context context, VAppManagerService vAppManagerService) {
        this.mContext = context;
        this.mApp = vAppManagerService;
    }

    @Override // com.lody.virtual.server.app.IAppInstallerSession
    public void addPackage(Uri uri) {
        this.mUris.add(uri);
    }

    @Override // com.lody.virtual.server.app.IAppInstallerSession
    public void addSplit(Uri uri) {
        this.mSplitUris.add(uri);
    }

    @Override // com.lody.virtual.server.app.IAppInstallerSession
    public void cancel() {
        if (!this.mCommited) {
            this.mCacneled = true;
            return;
        }
        throw new IllegalStateException("Session that have already been committed cannot be cancelled.");
    }

    @Override // com.lody.virtual.server.app.IAppInstallerSession
    public void commit(IntentSender intentSender) {
        if (!this.mCacneled) {
            this.mCommited = true;
            this.mStatusReceiver = intentSender;
            try {
                intentSender.sendIntent(this.mContext, 0, new Intent(), null, null);
                return;
            } catch (IntentSender.SendIntentException e5) {
                e5.printStackTrace();
                return;
            }
        }
        throw new IllegalStateException("A canceled session cannot be committed.");
    }
}
