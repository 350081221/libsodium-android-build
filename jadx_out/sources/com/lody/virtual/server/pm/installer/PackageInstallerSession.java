package com.lody.virtual.server.pm.installer;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.IntentSender;
import android.content.pm.DataLoaderParamsParcel;
import android.content.pm.IPackageInstallObserver2;
import android.content.pm.IPackageInstallerSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import com.lody.virtual.helper.utils.FileUtils;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.remote.VAppInstallerParams;
import com.lody.virtual.server.pm.VAppManagerService;
import com.lody.virtual.server.pm.installer.VPackageInstallerService;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@TargetApi(21)
/* loaded from: classes3.dex */
public class PackageInstallerSession extends IPackageInstallerSession.Stub {
    public static final int INSTALL_FAILED_ABORTED = -115;
    public static final int INSTALL_FAILED_INTERNAL_ERROR = -110;
    public static final int INSTALL_FAILED_INVALID_APK = -2;
    public static final int INSTALL_SUCCEEDED = 1;
    private static final int MSG_COMMIT = 0;
    private static final String REMOVE_SPLIT_MARKER_EXTENSION = ".removed";
    private static final String TAG = "PackageInstaller";
    final String installerPackageName;
    final int installerUid;
    private final VPackageInstallerService.InternalCallback mCallback;
    private final Context mContext;
    private String mFinalMessage;
    private int mFinalStatus;
    private final Handler mHandler;
    private final Handler.Callback mHandlerCallback;
    private String mPackageName;
    private boolean mPermissionsAccepted;
    private IPackageInstallObserver2 mRemoteObserver;
    private File mResolvedBaseFile;
    private File mResolvedStageDir;
    final SessionParams params;
    final int sessionId;
    final File stageDir;
    final int userId;
    private final AtomicInteger mActiveCount = new AtomicInteger();
    private final Object mLock = new Object();
    private float mClientProgress = 0.0f;
    private float mInternalProgress = 0.0f;
    private float mProgress = 0.0f;
    private float mReportedProgress = -1.0f;
    private boolean mPrepared = false;
    private boolean mSealed = false;
    private boolean mDestroyed = false;
    private ArrayList<FileBridge> mBridges = new ArrayList<>();
    private final List<File> mResolvedStagedFiles = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class PackageManagerException extends Exception {
        public final int error;

        PackageManagerException(int i5, String str) {
            super(str);
            this.error = i5;
        }
    }

    public PackageInstallerSession(VPackageInstallerService.InternalCallback internalCallback, Context context, Looper looper, String str, int i5, int i6, int i7, SessionParams sessionParams, File file) {
        Handler.Callback callback = new Handler.Callback() { // from class: com.lody.virtual.server.pm.installer.PackageInstallerSession.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                synchronized (PackageInstallerSession.this.mLock) {
                    Object obj = message.obj;
                    if (obj != null) {
                        PackageInstallerSession.this.mRemoteObserver = (IPackageInstallObserver2) obj;
                    }
                    try {
                        PackageInstallerSession.this.commitLocked();
                    } catch (PackageManagerException e5) {
                        String completeMessage = PackageInstallerSession.getCompleteMessage(e5);
                        VLog.e(PackageInstallerSession.TAG, "Commit of session " + PackageInstallerSession.this.sessionId + " failed: " + completeMessage);
                        PackageInstallerSession.this.destroyInternal();
                        PackageInstallerSession.this.dispatchSessionFinished(e5.error, completeMessage, null);
                    }
                }
                return true;
            }
        };
        this.mHandlerCallback = callback;
        this.mCallback = internalCallback;
        this.mContext = context;
        this.mHandler = new Handler(looper, callback);
        this.installerPackageName = str;
        this.sessionId = i5;
        this.userId = i6;
        this.installerUid = i7;
        this.mPackageName = sessionParams.appPackageName;
        this.params = sessionParams;
        this.stageDir = file;
    }

    private void assertPreparedAndNotSealed(String str) {
        synchronized (this.mLock) {
            if (this.mPrepared) {
                if (this.mSealed) {
                    throw new SecurityException(str + " not allowed after commit");
                }
            } else {
                throw new IllegalStateException(str + " before prepared");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void commitLocked() throws PackageManagerException {
        if (!this.mDestroyed) {
            if (this.mSealed) {
                try {
                    resolveStageDir();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                validateInstallLocked();
                this.mInternalProgress = 0.5f;
                int i5 = 1;
                computeProgressLocked(true);
                boolean z4 = false;
                for (File file : this.stageDir.listFiles()) {
                    VLog.e(TAG, "found apk in stage dir: " + file.getPath());
                    if (VAppManagerService.get().installPackage(Uri.fromFile(file), new VAppInstallerParams()).status == 0) {
                        z4 = true;
                    }
                }
                destroyInternal();
                if (!z4) {
                    i5 = -115;
                }
                dispatchSessionFinished(i5, null, null);
                return;
            }
            throw new PackageManagerException(-110, "Session not sealed");
        }
        throw new PackageManagerException(-110, "Session destroyed");
    }

    private void computeProgressLocked(boolean z4) {
        this.mProgress = constrain(this.mClientProgress * 0.8f, 0.0f, 0.8f) + constrain(this.mInternalProgress * 0.2f, 0.0f, 0.2f);
        if (z4 || Math.abs(r0 - this.mReportedProgress) >= 0.01d) {
            float f5 = this.mProgress;
            this.mReportedProgress = f5;
            this.mCallback.onSessionProgressChanged(this, f5);
        }
    }

    private static float constrain(float f5, float f6, float f7) {
        return f5 < f6 ? f6 : f5 > f7 ? f7 : f5;
    }

    private void createRemoveSplitMarker(String str) throws IOException {
        try {
            String str2 = str + REMOVE_SPLIT_MARKER_EXTENSION;
            if (FileUtils.isValidExtFilename(str2)) {
                File file = new File(resolveStageDir(), str2);
                file.createNewFile();
                Os.chmod(file.getAbsolutePath(), 0);
            } else {
                throw new IllegalArgumentException("Invalid marker: " + str2);
            }
        } catch (ErrnoException e5) {
            throw new IOException(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyInternal() {
        synchronized (this.mLock) {
            this.mSealed = true;
            this.mDestroyed = true;
            Iterator<FileBridge> it = this.mBridges.iterator();
            while (it.hasNext()) {
                it.next().forceClose();
            }
        }
        File file = this.stageDir;
        if (file != null) {
            FileUtils.deleteDir(file.getAbsolutePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchSessionFinished(int i5, String str, Bundle bundle) {
        this.mFinalStatus = i5;
        this.mFinalMessage = str;
        IPackageInstallObserver2 iPackageInstallObserver2 = this.mRemoteObserver;
        if (iPackageInstallObserver2 != null) {
            try {
                iPackageInstallObserver2.onPackageInstalled(this.mPackageName, i5, str, bundle);
            } catch (RemoteException unused) {
            }
        }
        boolean z4 = true;
        if (i5 != 1) {
            z4 = false;
        }
        this.mCallback.onSessionFinished(this, z4);
    }

    public static String getCompleteMessage(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.getMessage());
        while (true) {
            th = th.getCause();
            if (th != null) {
                sb.append(": ");
                sb.append(th.getMessage());
            } else {
                return sb.toString();
            }
        }
    }

    private ParcelFileDescriptor openReadInternal(String str) throws IOException {
        assertPreparedAndNotSealed("openRead");
        try {
            if (FileUtils.isValidExtFilename(str)) {
                return ParcelFileDescriptor.dup(Os.open(new File(resolveStageDir(), str).getAbsolutePath(), OsConstants.O_RDONLY, 0));
            }
            throw new IllegalArgumentException("Invalid name: " + str);
        } catch (ErrnoException e5) {
            throw new IOException(e5);
        }
    }

    private ParcelFileDescriptor openWriteInternal(String str, long j5, long j6) throws IOException {
        FileBridge fileBridge;
        synchronized (this.mLock) {
            assertPreparedAndNotSealed("openWrite");
            fileBridge = new FileBridge();
            this.mBridges.add(fileBridge);
        }
        try {
            FileDescriptor open = Os.open(new File(resolveStageDir(), str).getAbsolutePath(), OsConstants.O_CREAT | OsConstants.O_WRONLY, 420);
            if (j6 > 0) {
                Os.posix_fallocate(open, 0L, j6);
            }
            if (j5 > 0) {
                Os.lseek(open, j5, OsConstants.SEEK_SET);
            }
            fileBridge.setTargetFile(open);
            fileBridge.start();
            return ParcelFileDescriptor.dup(fileBridge.getClientSocket());
        } catch (ErrnoException e5) {
            throw new IOException(e5);
        }
    }

    private File resolveStageDir() throws IOException {
        File file;
        File file2;
        synchronized (this.mLock) {
            if (this.mResolvedStageDir == null && (file2 = this.stageDir) != null) {
                this.mResolvedStageDir = file2;
                if (!file2.exists()) {
                    this.stageDir.mkdirs();
                }
            }
            file = this.mResolvedStageDir;
        }
        return file;
    }

    private void validateInstallLocked() throws PackageManagerException {
        this.mResolvedBaseFile = null;
        this.mResolvedStagedFiles.clear();
        File[] listFiles = this.mResolvedStageDir.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File file : listFiles) {
                if (!file.isDirectory()) {
                    File file2 = new File(this.mResolvedStageDir, "base.apk");
                    if (!file.equals(file2)) {
                        file.renameTo(file2);
                    }
                    this.mResolvedBaseFile = file2;
                    this.mResolvedStagedFiles.add(file2);
                }
            }
            if (this.mResolvedBaseFile != null) {
                return;
            } else {
                throw new PackageManagerException(-2, "Full install must include a base package");
            }
        }
        throw new PackageManagerException(-2, "No packages staged");
    }

    @Override // android.content.pm.IPackageInstallerSession
    public void abandon() throws RemoteException {
        destroyInternal();
        dispatchSessionFinished(-115, "Session was abandoned", null);
    }

    @Override // android.content.pm.IPackageInstallerSession
    public void addClientProgress(float f5) throws RemoteException {
        synchronized (this.mLock) {
            setClientProgress(this.mClientProgress + f5);
        }
    }

    @Override // android.content.pm.IPackageInstallerSession
    public void close() throws RemoteException {
        if (this.mActiveCount.decrementAndGet() == 0) {
            this.mCallback.onSessionActiveChanged(this, false);
        }
    }

    @TargetApi(26)
    public void commit(IntentSender intentSender, boolean z4) throws RemoteException {
        commit(intentSender);
    }

    public SessionInfo generateInfo() {
        String str;
        boolean z4;
        SessionInfo sessionInfo = new SessionInfo();
        synchronized (this.mLock) {
            sessionInfo.sessionId = this.sessionId;
            sessionInfo.installerPackageName = this.installerPackageName;
            File file = this.mResolvedBaseFile;
            if (file != null) {
                str = file.getAbsolutePath();
            } else {
                str = null;
            }
            sessionInfo.resolvedBaseCodePath = str;
            sessionInfo.progress = this.mProgress;
            sessionInfo.sealed = this.mSealed;
            if (this.mActiveCount.get() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            sessionInfo.active = z4;
            SessionParams sessionParams = this.params;
            sessionInfo.mode = sessionParams.mode;
            sessionInfo.sizeBytes = sessionParams.sizeBytes;
            sessionInfo.appPackageName = sessionParams.appPackageName;
            sessionInfo.appIcon = sessionParams.appIcon;
            sessionInfo.appLabel = sessionParams.appLabel;
        }
        return sessionInfo;
    }

    @Override // android.content.pm.IPackageInstallerSession
    public DataLoaderParamsParcel getDataLoaderParams() throws RemoteException {
        return this.params.mData;
    }

    @Override // android.content.pm.IPackageInstallerSession
    public String[] getNames() throws RemoteException {
        assertPreparedAndNotSealed("getNames");
        try {
            return resolveStageDir().list();
        } catch (IOException e5) {
            throw new IllegalStateException(e5);
        }
    }

    @Override // android.content.pm.IPackageInstallerSession
    public boolean isMultiPackage() throws RemoteException {
        return false;
    }

    public void open() throws IOException {
        if (this.mActiveCount.getAndIncrement() == 0) {
            this.mCallback.onSessionActiveChanged(this, true);
        }
        synchronized (this.mLock) {
            if (!this.mPrepared) {
                if (this.stageDir != null) {
                    this.mPrepared = true;
                    this.mCallback.onSessionPrepared(this);
                } else {
                    throw new IllegalArgumentException("Exactly one of stageDir or stageCid stage must be set");
                }
            }
        }
    }

    @Override // android.content.pm.IPackageInstallerSession
    public ParcelFileDescriptor openRead(String str) throws RemoteException {
        try {
            return openReadInternal(str);
        } catch (IOException e5) {
            throw new IllegalStateException(e5);
        }
    }

    @Override // android.content.pm.IPackageInstallerSession
    public ParcelFileDescriptor openWrite(String str, long j5, long j6) throws RemoteException {
        try {
            return openWriteInternal(str, j5, j6);
        } catch (IOException e5) {
            throw new IllegalStateException(e5);
        }
    }

    @Override // android.content.pm.IPackageInstallerSession
    public void removeSplit(String str) throws RemoteException {
        if (!TextUtils.isEmpty(this.params.appPackageName)) {
            try {
                createRemoveSplitMarker(str);
                return;
            } catch (IOException e5) {
                throw new IllegalStateException(e5);
            }
        }
        throw new IllegalStateException("Must specify package name to remove a split");
    }

    @Override // android.content.pm.IPackageInstallerSession
    public void setClientProgress(float f5) throws RemoteException {
        boolean z4;
        synchronized (this.mLock) {
            if (this.mClientProgress == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.mClientProgress = f5;
            computeProgressLocked(z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPermissionsResult(boolean z4) {
        if (this.mSealed) {
            if (z4) {
                synchronized (this.mLock) {
                    this.mPermissionsAccepted = true;
                }
                this.mHandler.obtainMessage(0).sendToTarget();
                return;
            }
            destroyInternal();
            dispatchSessionFinished(-115, "User rejected permissions", null);
            return;
        }
        throw new SecurityException("Must be sealed to accept permissions");
    }

    @Override // android.content.pm.IPackageInstallerSession
    public void commit(IntentSender intentSender) throws RemoteException {
        boolean z4;
        synchronized (this.mLock) {
            z4 = this.mSealed;
            if (!z4) {
                Iterator<FileBridge> it = this.mBridges.iterator();
                while (it.hasNext()) {
                    if (!it.next().isClosed()) {
                        throw new SecurityException("Files still open");
                    }
                }
                this.mSealed = true;
            }
            this.mClientProgress = 1.0f;
            computeProgressLocked(true);
        }
        if (!z4) {
            this.mCallback.onSessionSealedBlocking(this);
        }
        this.mActiveCount.incrementAndGet();
        this.mHandler.obtainMessage(0, new VPackageInstallerService.PackageInstallObserverAdapter(this.mContext, intentSender, this.sessionId, this.userId).getBinder()).sendToTarget();
    }
}
