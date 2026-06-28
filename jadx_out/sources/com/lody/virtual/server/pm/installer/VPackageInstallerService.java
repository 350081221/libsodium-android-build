package com.lody.virtual.server.pm.installer;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.IPackageInstallerCallback;
import android.content.pm.IPackageInstallerSession;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.compat.ObjectsCompat;
import com.lody.virtual.helper.utils.Singleton;
import com.lody.virtual.os.VBinder;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.remote.VParceledListSlice;
import com.lody.virtual.server.IPackageInstaller;
import com.lody.virtual.server.pm.VAppManagerService;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

@TargetApi(21)
/* loaded from: classes3.dex */
public class VPackageInstallerService extends IPackageInstaller.Stub {
    private static final long MAX_ACTIVE_SESSIONS = 1024;
    private static final String TAG = "PackageInstaller";
    private static final Singleton<VPackageInstallerService> gDefault = new Singleton<VPackageInstallerService>() { // from class: com.lody.virtual.server.pm.installer.VPackageInstallerService.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.lody.virtual.helper.utils.Singleton
        public VPackageInstallerService create() {
            return new VPackageInstallerService();
        }
    };
    private final Callbacks mCallbacks;
    private Context mContext;
    private final Handler mInstallHandler;
    private final HandlerThread mInstallThread;
    private final InternalCallback mInternalCallback;
    private final Random mRandom;
    private final SparseArray<PackageInstallerSession> mSessions;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Callbacks extends Handler {
        private static final int MSG_SESSION_ACTIVE_CHANGED = 3;
        private static final int MSG_SESSION_BADGING_CHANGED = 2;
        private static final int MSG_SESSION_CREATED = 1;
        private static final int MSG_SESSION_FINISHED = 5;
        private static final int MSG_SESSION_PROGRESS_CHANGED = 4;
        private final RemoteCallbackList<IPackageInstallerCallback> mCallbacks;

        public Callbacks(Looper looper) {
            super(looper);
            this.mCallbacks = new RemoteCallbackList<>();
        }

        private void invokeCallback(IPackageInstallerCallback iPackageInstallerCallback, Message message) throws RemoteException {
            int i5 = message.arg1;
            int i6 = message.what;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 == 5) {
                                iPackageInstallerCallback.onSessionFinished(i5, ((Boolean) message.obj).booleanValue());
                                return;
                            }
                            return;
                        }
                        iPackageInstallerCallback.onSessionProgressChanged(i5, ((Float) message.obj).floatValue());
                        return;
                    }
                    iPackageInstallerCallback.onSessionActiveChanged(i5, ((Boolean) message.obj).booleanValue());
                    return;
                }
                iPackageInstallerCallback.onSessionBadgingChanged(i5);
                return;
            }
            iPackageInstallerCallback.onSessionCreated(i5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void notifySessionActiveChanged(int i5, int i6, boolean z4) {
            obtainMessage(3, i5, i6, Boolean.valueOf(z4)).sendToTarget();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void notifySessionBadgingChanged(int i5, int i6) {
            obtainMessage(2, i5, i6).sendToTarget();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void notifySessionCreated(int i5, int i6) {
            obtainMessage(1, i5, i6).sendToTarget();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void notifySessionProgressChanged(int i5, int i6, float f5) {
            obtainMessage(4, i5, i6, Float.valueOf(f5)).sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i5 = message.arg2;
            int beginBroadcast = this.mCallbacks.beginBroadcast();
            for (int i6 = 0; i6 < beginBroadcast; i6++) {
                IPackageInstallerCallback broadcastItem = this.mCallbacks.getBroadcastItem(i6);
                if (i5 == ((VUserHandle) this.mCallbacks.getBroadcastCookie(i6)).getIdentifier()) {
                    try {
                        invokeCallback(broadcastItem, message);
                    } catch (RemoteException unused) {
                    }
                }
            }
            this.mCallbacks.finishBroadcast();
        }

        public void notifySessionFinished(int i5, int i6, boolean z4) {
            obtainMessage(5, i5, i6, Boolean.valueOf(z4)).sendToTarget();
        }

        public void register(IPackageInstallerCallback iPackageInstallerCallback, int i5) {
            this.mCallbacks.register(iPackageInstallerCallback, new VUserHandle(i5));
        }

        public void unregister(IPackageInstallerCallback iPackageInstallerCallback) {
            this.mCallbacks.unregister(iPackageInstallerCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class InternalCallback {
        InternalCallback() {
        }

        public void onSessionActiveChanged(PackageInstallerSession packageInstallerSession, boolean z4) {
            VPackageInstallerService.this.mCallbacks.notifySessionActiveChanged(packageInstallerSession.sessionId, packageInstallerSession.userId, z4);
        }

        public void onSessionBadgingChanged(PackageInstallerSession packageInstallerSession) {
            VPackageInstallerService.this.mCallbacks.notifySessionBadgingChanged(packageInstallerSession.sessionId, packageInstallerSession.userId);
        }

        public void onSessionFinished(final PackageInstallerSession packageInstallerSession, boolean z4) {
            VPackageInstallerService.this.mCallbacks.notifySessionFinished(packageInstallerSession.sessionId, packageInstallerSession.userId, z4);
            VPackageInstallerService.this.mInstallHandler.post(new Runnable() { // from class: com.lody.virtual.server.pm.installer.VPackageInstallerService.InternalCallback.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (VPackageInstallerService.this.mSessions) {
                        VPackageInstallerService.this.mSessions.remove(packageInstallerSession.sessionId);
                    }
                }
            });
        }

        public void onSessionPrepared(PackageInstallerSession packageInstallerSession) {
        }

        public void onSessionProgressChanged(PackageInstallerSession packageInstallerSession, float f5) {
            VPackageInstallerService.this.mCallbacks.notifySessionProgressChanged(packageInstallerSession.sessionId, packageInstallerSession.userId, f5);
        }

        public void onSessionSealedBlocking(PackageInstallerSession packageInstallerSession) {
        }
    }

    /* loaded from: classes3.dex */
    static class PackageInstallObserverAdapter extends PackageInstallObserver {
        private final Context mContext;
        private final int mSessionId;
        private final IntentSender mTarget;
        private final int mUserId;

        /* JADX INFO: Access modifiers changed from: package-private */
        public PackageInstallObserverAdapter(Context context, IntentSender intentSender, int i5, int i6) {
            this.mContext = context;
            this.mTarget = intentSender;
            this.mSessionId = i5;
            this.mUserId = i6;
        }

        @Override // com.lody.virtual.server.pm.installer.PackageInstallObserver
        public void onPackageInstalled(String str, int i5, String str2, Bundle bundle) {
            Intent intent = new Intent();
            intent.putExtra("android.content.pm.extra.PACKAGE_NAME", str);
            intent.putExtra("android.content.pm.extra.SESSION_ID", this.mSessionId);
            intent.putExtra("android.content.pm.extra.STATUS", PackageHelper.installStatusToPublicStatus(i5));
            intent.putExtra("android.content.pm.extra.STATUS_MESSAGE", PackageHelper.installStatusToString(i5, str2));
            intent.putExtra("android.content.pm.extra.LEGACY_STATUS", i5);
            if (bundle != null) {
                String string = bundle.getString("android.content.pm.extra.FAILURE_EXISTING_PACKAGE");
                if (!TextUtils.isEmpty(string)) {
                    intent.putExtra("android.content.pm.extra.OTHER_PACKAGE_NAME", string);
                }
            }
            try {
                this.mTarget.sendIntent(this.mContext, 0, intent, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }

        @Override // com.lody.virtual.server.pm.installer.PackageInstallObserver
        public void onUserActionRequired(Intent intent) {
            Intent intent2 = new Intent();
            intent2.putExtra("android.content.pm.extra.SESSION_ID", this.mSessionId);
            intent2.putExtra("android.content.pm.extra.STATUS", -1);
            intent2.putExtra("android.intent.extra.INTENT", intent);
            try {
                this.mTarget.sendIntent(this.mContext, 0, intent2, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    private int allocateSessionIdLocked() {
        int i5 = 0;
        while (true) {
            int nextInt = this.mRandom.nextInt(2147483646) + 1;
            if (this.mSessions.get(nextInt) == null) {
                return nextInt;
            }
            int i6 = i5 + 1;
            if (i5 < 32) {
                i5 = i6;
            } else {
                throw new IllegalStateException("Failed to allocate session ID");
            }
        }
    }

    private int createSessionInternal(SessionParams sessionParams, String str, int i5, int i6) throws IOException {
        int allocateSessionIdLocked;
        PackageInstallerSession packageInstallerSession;
        synchronized (this.mSessions) {
            if (getSessionCount(this.mSessions, i6) < 1024) {
                allocateSessionIdLocked = allocateSessionIdLocked();
                packageInstallerSession = new PackageInstallerSession(this.mInternalCallback, this.mContext, this.mInstallHandler.getLooper(), str, allocateSessionIdLocked, i5, i6, sessionParams, VEnvironment.getPackageInstallerStageDir());
            } else {
                throw new IllegalStateException("Too many active sessions for UID " + i6);
            }
        }
        synchronized (this.mSessions) {
            this.mSessions.put(allocateSessionIdLocked, packageInstallerSession);
        }
        this.mCallbacks.notifySessionCreated(packageInstallerSession.sessionId, packageInstallerSession.userId);
        return allocateSessionIdLocked;
    }

    public static VPackageInstallerService get() {
        return gDefault.get();
    }

    private static int getSessionCount(SparseArray<PackageInstallerSession> sparseArray, int i5) {
        int size = sparseArray.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            if (sparseArray.valueAt(i7).installerUid == i5) {
                i6++;
            }
        }
        return i6;
    }

    private boolean isCallingUidOwner(PackageInstallerSession packageInstallerSession) {
        return true;
    }

    private IPackageInstallerSession openSessionInternal(int i5) throws IOException {
        PackageInstallerSession packageInstallerSession;
        synchronized (this.mSessions) {
            packageInstallerSession = this.mSessions.get(i5);
            if (packageInstallerSession != null && isCallingUidOwner(packageInstallerSession)) {
                packageInstallerSession.open();
            } else {
                throw new SecurityException("Caller has no access to session " + i5);
            }
        }
        return packageInstallerSession;
    }

    @Override // com.lody.virtual.server.IPackageInstaller
    public void abandonSession(int i5) {
        synchronized (this.mSessions) {
            PackageInstallerSession packageInstallerSession = this.mSessions.get(i5);
            if (packageInstallerSession != null && isCallingUidOwner(packageInstallerSession)) {
                try {
                    packageInstallerSession.abandon();
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            } else {
                throw new SecurityException("Caller has no access to session " + i5);
            }
        }
    }

    @Override // com.lody.virtual.server.IPackageInstaller
    public int createSession(SessionParams sessionParams, String str, int i5) {
        try {
            return createSessionInternal(sessionParams, str, i5, VBinder.getCallingUid());
        } catch (IOException e5) {
            throw new IllegalStateException(e5);
        }
    }

    @Override // com.lody.virtual.server.IPackageInstaller
    public VParceledListSlice getAllSessions(int i5) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mSessions) {
            for (int i6 = 0; i6 < this.mSessions.size(); i6++) {
                PackageInstallerSession valueAt = this.mSessions.valueAt(i6);
                if (valueAt.userId == i5) {
                    arrayList.add(valueAt.generateInfo());
                }
            }
        }
        return new VParceledListSlice(arrayList);
    }

    @Override // com.lody.virtual.server.IPackageInstaller
    public VParceledListSlice getMySessions(String str, int i5) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mSessions) {
            for (int i6 = 0; i6 < this.mSessions.size(); i6++) {
                PackageInstallerSession valueAt = this.mSessions.valueAt(i6);
                if (ObjectsCompat.equals(valueAt.installerPackageName, str) && valueAt.userId == i5) {
                    arrayList.add(valueAt.generateInfo());
                }
            }
        }
        return new VParceledListSlice(arrayList);
    }

    @Override // com.lody.virtual.server.IPackageInstaller
    public SessionInfo getSessionInfo(int i5) {
        SessionInfo sessionInfo;
        synchronized (this.mSessions) {
            PackageInstallerSession packageInstallerSession = this.mSessions.get(i5);
            if (packageInstallerSession != null) {
                sessionInfo = packageInstallerSession.generateInfo();
            } else {
                sessionInfo = null;
            }
        }
        return sessionInfo;
    }

    @Override // com.lody.virtual.server.IPackageInstaller
    public IPackageInstallerSession openSession(int i5) {
        try {
            return openSessionInternal(i5);
        } catch (IOException e5) {
            throw new IllegalStateException(e5);
        }
    }

    @Override // com.lody.virtual.server.IPackageInstaller
    public void registerCallback(IPackageInstallerCallback iPackageInstallerCallback, int i5) {
        this.mCallbacks.register(iPackageInstallerCallback, i5);
    }

    @Override // com.lody.virtual.server.IPackageInstaller
    public void setPermissionsResult(int i5, boolean z4) {
        synchronized (this.mSessions) {
            PackageInstallerSession packageInstallerSession = this.mSessions.get(i5);
            if (packageInstallerSession != null) {
                packageInstallerSession.setPermissionsResult(z4);
            }
        }
    }

    @Override // com.lody.virtual.server.IPackageInstaller
    public void uninstall(String str, String str2, int i5, IntentSender intentSender, int i6) {
        int i7;
        boolean uninstallPackage = VAppManagerService.get().uninstallPackage(str);
        if (intentSender != null) {
            Intent intent = new Intent();
            intent.putExtra("android.content.pm.extra.PACKAGE_NAME", str);
            intent.putExtra("android.content.pm.extra.STATUS", !uninstallPackage ? 1 : 0);
            intent.putExtra("android.content.pm.extra.STATUS_MESSAGE", PackageHelper.deleteStatusToString(uninstallPackage));
            if (uninstallPackage) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            intent.putExtra("android.content.pm.extra.LEGACY_STATUS", i7);
            try {
                intentSender.sendIntent(this.mContext, 0, intent, null, null);
            } catch (IntentSender.SendIntentException e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // com.lody.virtual.server.IPackageInstaller
    public void unregisterCallback(IPackageInstallerCallback iPackageInstallerCallback) {
        this.mCallbacks.unregister(iPackageInstallerCallback);
    }

    @Override // com.lody.virtual.server.IPackageInstaller
    public void updateSessionAppIcon(int i5, Bitmap bitmap) {
        synchronized (this.mSessions) {
            PackageInstallerSession packageInstallerSession = this.mSessions.get(i5);
            if (packageInstallerSession != null && isCallingUidOwner(packageInstallerSession)) {
                SessionParams sessionParams = packageInstallerSession.params;
                sessionParams.appIcon = bitmap;
                sessionParams.appIconLastModified = -1L;
                this.mInternalCallback.onSessionBadgingChanged(packageInstallerSession);
            } else {
                throw new SecurityException("Caller has no access to session " + i5);
            }
        }
    }

    @Override // com.lody.virtual.server.IPackageInstaller
    public void updateSessionAppLabel(int i5, String str) {
        synchronized (this.mSessions) {
            PackageInstallerSession packageInstallerSession = this.mSessions.get(i5);
            if (packageInstallerSession != null && isCallingUidOwner(packageInstallerSession)) {
                packageInstallerSession.params.appLabel = str;
                this.mInternalCallback.onSessionBadgingChanged(packageInstallerSession);
            } else {
                throw new SecurityException("Caller has no access to session " + i5);
            }
        }
    }

    private VPackageInstallerService() {
        this.mRandom = new SecureRandom();
        this.mSessions = new SparseArray<>();
        this.mInternalCallback = new InternalCallback();
        this.mContext = VirtualCore.get().getContext();
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.mInstallThread = handlerThread;
        handlerThread.start();
        this.mInstallHandler = new Handler(handlerThread.getLooper());
        this.mCallbacks = new Callbacks(handlerThread.getLooper());
    }
}
