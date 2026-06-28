package com.lody.virtual.server.pm;

import android.app.IStopUserCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Binder;
import android.util.SparseArray;
import android.util.Xml;
import com.huawei.agconnect.apms.instrument.BitmapFactoryInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.lody.virtual.R;
import com.lody.virtual.client.env.Constants;
import com.lody.virtual.client.env.SpecialComponentList;
import com.lody.virtual.helper.utils.ArrayUtils;
import com.lody.virtual.helper.utils.AtomicFile;
import com.lody.virtual.helper.utils.FastXmlSerializer;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.os.VUserInfo;
import com.lody.virtual.os.VUserManager;
import com.lody.virtual.server.am.VActivityManagerService;
import com.lody.virtual.server.interfaces.IUserManager;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@Instrumented
/* loaded from: classes3.dex */
public class VUserManagerService extends IUserManager.Stub {
    private static final String ATTR_CREATION_TIME = "created";
    private static final String ATTR_FLAGS = "flags";
    private static final String ATTR_ICON_PATH = "icon";
    private static final String ATTR_ID = "id";
    private static final String ATTR_LAST_LOGGED_IN_TIME = "lastLoggedIn";
    private static final String ATTR_NEXT_SERIAL_NO = "nextSerialNumber";
    private static final String ATTR_PARTIAL = "partial";
    private static final String ATTR_SERIAL_NO = "serialNumber";
    private static final String ATTR_USER_VERSION = "version";
    private static final boolean DBG = false;
    private static final long EPOCH_PLUS_30_YEARS = 946080000000L;
    private static final String LOG_TAG = "VUserManagerService";
    private static final int MIN_USER_ID = 1;
    private static final String TAG_NAME = "name";
    private static final String TAG_USER = "user";
    private static final String TAG_USERS = "users";
    private static final String USER_INFO_DIR = "system" + File.separator + TAG_USERS;
    private static final String USER_LIST_FILENAME = "userlist.xml";
    private static final String USER_PHOTO_FILENAME = "photo.png";
    private static final int USER_VERSION = 1;
    private static VUserManagerService sInstance;
    private final File mBaseUserPath;
    private final Context mContext;
    private boolean mGuestEnabled;
    private final Object mInstallLock;
    private int mNextSerialNumber;
    private int mNextUserId;
    private final Object mPackagesLock;
    private final VPackageManagerService mPm;
    private HashSet<Integer> mRemovingUserIds;
    private int[] mUserIds;
    private final File mUserListFile;
    private int mUserVersion;
    private SparseArray<VUserInfo> mUsers;
    private final File mUsersDir;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VUserManagerService(Context context, VPackageManagerService vPackageManagerService, Object obj, Object obj2) {
        this(context, vPackageManagerService, obj, obj2, VEnvironment.getDataDirectory(), new File(VEnvironment.getDataDirectory(), "user"));
    }

    private void fallbackToSingleUserLocked() {
        VUserInfo vUserInfo = new VUserInfo(0, this.mContext.getResources().getString(R.string.owner_name), null, 19);
        this.mUsers.put(0, vUserInfo);
        this.mNextSerialNumber = 1;
        updateUserIdsLocked();
        writeUserListLocked();
        writeUserLocked(vUserInfo);
    }

    public static VUserManagerService get() {
        VUserManagerService vUserManagerService;
        synchronized (VUserManagerService.class) {
            vUserManagerService = sInstance;
        }
        return vUserManagerService;
    }

    private int getNextAvailableIdLocked() {
        int i5;
        synchronized (this.mPackagesLock) {
            i5 = this.mNextUserId;
            while (i5 < Integer.MAX_VALUE && (this.mUsers.indexOfKey(i5) >= 0 || this.mRemovingUserIds.contains(Integer.valueOf(i5)))) {
                i5++;
            }
            this.mNextUserId = i5 + 1;
        }
        return i5;
    }

    private VUserInfo getUserInfoLocked(int i5) {
        VUserInfo vUserInfo = this.mUsers.get(i5);
        if (vUserInfo != null && vUserInfo.partial && !this.mRemovingUserIds.contains(Integer.valueOf(i5))) {
            VLog.w(LOG_TAG, "getUserInfo: unknown user #" + i5, new Object[0]);
            return null;
        }
        return vUserInfo;
    }

    private boolean isUserLimitReachedLocked() {
        if (this.mUsers.size() >= VUserManager.getMaxSupportedUsers()) {
            return true;
        }
        return false;
    }

    private int readIntAttribute(XmlPullParser xmlPullParser, String str, int i5) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return i5;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException unused) {
            return i5;
        }
    }

    private long readLongAttribute(XmlPullParser xmlPullParser, String str, long j5) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j5;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException unused) {
            return j5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0100, code lost:
    
        if (r3 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0103, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fb, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f9, code lost:
    
        if (r3 == null) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.lody.virtual.os.VUserInfo readUser(int r17) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.pm.VUserManagerService.readUser(int):com.lody.virtual.os.VUserInfo");
    }

    private void readUserList() {
        synchronized (this.mPackagesLock) {
            readUserListLocked();
        }
    }

    private void readUserListLocked() {
        Throwable th;
        FileInputStream fileInputStream;
        XmlPullParser newPullParser;
        int next;
        VUserInfo readUser;
        this.mGuestEnabled = false;
        if (!this.mUserListFile.exists()) {
            fallbackToSingleUserLocked();
            return;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    fileInputStream = new AtomicFile(this.mUserListFile).openRead();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            } catch (IOException unused) {
            } catch (XmlPullParserException unused2) {
            }
        } catch (Throwable th2) {
            FileInputStream fileInputStream3 = fileInputStream2;
            th = th2;
            fileInputStream = fileInputStream3;
        }
        try {
            newPullParser = Xml.newPullParser();
            newPullParser.setInput(fileInputStream, null);
            do {
                next = newPullParser.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
        } catch (IOException unused3) {
            fileInputStream2 = fileInputStream;
            fallbackToSingleUserLocked();
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
        } catch (XmlPullParserException unused4) {
            fileInputStream2 = fileInputStream;
            fallbackToSingleUserLocked();
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
        if (next != 2) {
            VLog.e(LOG_TAG, "Unable to read user list");
            fallbackToSingleUserLocked();
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                    return;
                } catch (IOException e7) {
                    e7.printStackTrace();
                    return;
                }
            }
            return;
        }
        this.mNextSerialNumber = -1;
        if (newPullParser.getName().equals(TAG_USERS)) {
            String attributeValue = newPullParser.getAttributeValue(null, ATTR_NEXT_SERIAL_NO);
            if (attributeValue != null) {
                this.mNextSerialNumber = Integer.parseInt(attributeValue);
            }
            String attributeValue2 = newPullParser.getAttributeValue(null, "version");
            if (attributeValue2 != null) {
                this.mUserVersion = Integer.parseInt(attributeValue2);
            }
        }
        while (true) {
            int next2 = newPullParser.next();
            if (next2 == 1) {
                break;
            }
            if (next2 == 2 && newPullParser.getName().equals("user") && (readUser = readUser(Integer.parseInt(newPullParser.getAttributeValue(null, "id")))) != null) {
                this.mUsers.put(readUser.id, readUser);
                if (readUser.isGuest()) {
                    this.mGuestEnabled = true;
                }
                int i5 = this.mNextSerialNumber;
                if (i5 < 0 || i5 <= readUser.id) {
                    this.mNextSerialNumber = readUser.id + 1;
                }
            }
        }
        updateUserIdsLocked();
        upgradeIfNecessary();
        if (fileInputStream != null) {
            fileInputStream.close();
        }
    }

    private void removeDirectoryRecursive(File file) {
        if (file.isDirectory()) {
            for (String str : file.list()) {
                removeDirectoryRecursive(new File(file, str));
            }
        }
        file.delete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUserStateLocked(int i5) {
        this.mPm.cleanUpUser(i5);
        this.mUsers.remove(i5);
        this.mRemovingUserIds.remove(Integer.valueOf(i5));
        new AtomicFile(new File(this.mUsersDir, i5 + ".xml")).delete();
        writeUserListLocked();
        updateUserIdsLocked();
        removeDirectoryRecursive(VEnvironment.getDataUserDirectory(i5));
    }

    private void sendUserInfoChangedBroadcast(int i5) {
        Intent intent = new Intent(Constants.ACTION_USER_INFO_CHANGED);
        intent.putExtra(Constants.EXTRA_USER_HANDLE, i5);
        intent.addFlags(1073741824);
        VActivityManagerService.get().sendBroadcastAsUser(intent, new VUserHandle(i5));
    }

    private void updateUserIdsLocked() {
        int i5 = 0;
        for (int i6 = 0; i6 < this.mUsers.size(); i6++) {
            if (!this.mUsers.valueAt(i6).partial) {
                i5++;
            }
        }
        int[] iArr = new int[i5];
        int i7 = 0;
        for (int i8 = 0; i8 < this.mUsers.size(); i8++) {
            if (!this.mUsers.valueAt(i8).partial) {
                iArr[i7] = this.mUsers.keyAt(i8);
                i7++;
            }
        }
        this.mUserIds = iArr;
    }

    private void upgradeIfNecessary() {
        int i5 = this.mUserVersion;
        if (i5 < 1) {
            VUserInfo vUserInfo = this.mUsers.get(0);
            if ("Primary".equals(vUserInfo.name)) {
                vUserInfo.name = "Admin";
                writeUserLocked(vUserInfo);
            }
            i5 = 1;
        }
        if (i5 < 1) {
            VLog.w(LOG_TAG, "User version " + this.mUserVersion + " didn't upgrade as expected to 1", new Object[0]);
            return;
        }
        this.mUserVersion = i5;
        writeUserListLocked();
    }

    private void writeBitmapLocked(VUserInfo vUserInfo, Bitmap bitmap) {
        try {
            File file = new File(this.mUsersDir, Integer.toString(vUserInfo.id));
            File file2 = new File(file, USER_PHOTO_FILENAME);
            if (!file.exists()) {
                file.mkdir();
            }
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            if (bitmap.compress(compressFormat, 100, fileOutputStream)) {
                vUserInfo.iconPath = file2.getAbsolutePath();
            }
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
        } catch (FileNotFoundException e5) {
            VLog.w(LOG_TAG, "Error setting photo for user ", e5);
        }
    }

    private void writeUserListLocked() {
        FileOutputStream startWrite;
        AtomicFile atomicFile = new AtomicFile(this.mUserListFile);
        FileOutputStream fileOutputStream = null;
        try {
            startWrite = atomicFile.startWrite();
        } catch (Exception unused) {
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(startWrite);
            FastXmlSerializer fastXmlSerializer = new FastXmlSerializer();
            fastXmlSerializer.setOutput(bufferedOutputStream, "utf-8");
            fastXmlSerializer.startDocument(null, Boolean.TRUE);
            fastXmlSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
            fastXmlSerializer.startTag(null, TAG_USERS);
            fastXmlSerializer.attribute(null, ATTR_NEXT_SERIAL_NO, Integer.toString(this.mNextSerialNumber));
            fastXmlSerializer.attribute(null, "version", Integer.toString(this.mUserVersion));
            for (int i5 = 0; i5 < this.mUsers.size(); i5++) {
                VUserInfo valueAt = this.mUsers.valueAt(i5);
                fastXmlSerializer.startTag(null, "user");
                fastXmlSerializer.attribute(null, "id", Integer.toString(valueAt.id));
                fastXmlSerializer.endTag(null, "user");
            }
            fastXmlSerializer.endTag(null, TAG_USERS);
            fastXmlSerializer.endDocument();
            atomicFile.finishWrite(startWrite);
        } catch (Exception unused2) {
            fileOutputStream = startWrite;
            atomicFile.failWrite(fileOutputStream);
            VLog.e(LOG_TAG, "Error writing user list");
        }
    }

    private void writeUserLocked(VUserInfo vUserInfo) {
        FileOutputStream startWrite;
        AtomicFile atomicFile = new AtomicFile(new File(this.mUsersDir, vUserInfo.id + ".xml"));
        FileOutputStream fileOutputStream = null;
        try {
            startWrite = atomicFile.startWrite();
        } catch (Exception e5) {
            e = e5;
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(startWrite);
            FastXmlSerializer fastXmlSerializer = new FastXmlSerializer();
            fastXmlSerializer.setOutput(bufferedOutputStream, "utf-8");
            fastXmlSerializer.startDocument(null, Boolean.TRUE);
            fastXmlSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
            fastXmlSerializer.startTag(null, "user");
            fastXmlSerializer.attribute(null, "id", Integer.toString(vUserInfo.id));
            fastXmlSerializer.attribute(null, ATTR_SERIAL_NO, Integer.toString(vUserInfo.serialNumber));
            fastXmlSerializer.attribute(null, ATTR_FLAGS, Integer.toString(vUserInfo.flags));
            fastXmlSerializer.attribute(null, ATTR_CREATION_TIME, Long.toString(vUserInfo.creationTime));
            fastXmlSerializer.attribute(null, ATTR_LAST_LOGGED_IN_TIME, Long.toString(vUserInfo.lastLoggedInTime));
            String str = vUserInfo.iconPath;
            if (str != null) {
                fastXmlSerializer.attribute(null, ATTR_ICON_PATH, str);
            }
            if (vUserInfo.partial) {
                fastXmlSerializer.attribute(null, ATTR_PARTIAL, "true");
            }
            fastXmlSerializer.startTag(null, "name");
            fastXmlSerializer.text(vUserInfo.name);
            fastXmlSerializer.endTag(null, "name");
            fastXmlSerializer.endTag(null, "user");
            fastXmlSerializer.endDocument();
            atomicFile.finishWrite(startWrite);
        } catch (Exception e6) {
            e = e6;
            fileOutputStream = startWrite;
            VLog.e(LOG_TAG, "Error writing user info " + vUserInfo.id + "\n" + e);
            atomicFile.failWrite(fileOutputStream);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IUserManager
    public VUserInfo createUser(String str, int i5) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            synchronized (this.mInstallLock) {
                synchronized (this.mPackagesLock) {
                    if (isUserLimitReachedLocked()) {
                        return null;
                    }
                    int nextAvailableIdLocked = getNextAvailableIdLocked();
                    final VUserInfo vUserInfo = new VUserInfo(nextAvailableIdLocked, str, null, i5);
                    File file = new File(this.mBaseUserPath, Integer.toString(nextAvailableIdLocked));
                    int i6 = this.mNextSerialNumber;
                    this.mNextSerialNumber = i6 + 1;
                    vUserInfo.serialNumber = i6;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis <= EPOCH_PLUS_30_YEARS) {
                        currentTimeMillis = 0;
                    }
                    vUserInfo.creationTime = currentTimeMillis;
                    vUserInfo.partial = true;
                    VAppManagerService.get().onUserCreated(vUserInfo);
                    this.mUsers.put(nextAvailableIdLocked, vUserInfo);
                    writeUserListLocked();
                    writeUserLocked(vUserInfo);
                    this.mPm.createNewUser(nextAvailableIdLocked, file);
                    vUserInfo.partial = false;
                    writeUserLocked(vUserInfo);
                    updateUserIdsLocked();
                    Intent intent = new Intent(Constants.ACTION_USER_ADDED);
                    intent.putExtra(Constants.EXTRA_USER_HANDLE, vUserInfo.id);
                    VActivityManagerService.get().sendBroadcastAsUser(intent, VUserHandle.ALL, null);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    new Thread(new Runnable() { // from class: com.lody.virtual.server.pm.VUserManagerService.1
                        @Override // java.lang.Runnable
                        public void run() {
                            for (String str2 : SpecialComponentList.getPreInstallPackages()) {
                                if (vUserInfo.id != 0 && !VAppManagerService.get().isAppInstalledAsUser(vUserInfo.id, str2)) {
                                    VAppManagerService.get().installPackageAsUser(vUserInfo.id, str2);
                                }
                            }
                        }
                    }).start();
                    return vUserInfo;
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public boolean exists(int i5) {
        boolean contains;
        synchronized (this.mPackagesLock) {
            contains = ArrayUtils.contains(this.mUserIds, i5);
        }
        return contains;
    }

    void finishRemoveUser(final int i5) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Intent intent = new Intent(Constants.ACTION_USER_REMOVED);
            intent.putExtra(Constants.EXTRA_USER_HANDLE, i5);
            VActivityManagerService.get().sendOrderedBroadcastAsUser(intent, VUserHandle.ALL, null, new BroadcastReceiver() { // from class: com.lody.virtual.server.pm.VUserManagerService.3
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent2) {
                    new Thread() { // from class: com.lody.virtual.server.pm.VUserManagerService.3.1
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() {
                            synchronized (VUserManagerService.this.mInstallLock) {
                                synchronized (VUserManagerService.this.mPackagesLock) {
                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                    VUserManagerService.this.removeUserStateLocked(i5);
                                }
                            }
                        }
                    }.start();
                }
            }, null, -1, null, null);
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IUserManager
    public int getUserHandle(int i5) {
        synchronized (this.mPackagesLock) {
            for (int i6 : this.mUserIds) {
                if (getUserInfoLocked(i6).serialNumber == i5) {
                    return i6;
                }
            }
            return -1;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IUserManager
    public Bitmap getUserIcon(int i5) {
        synchronized (this.mPackagesLock) {
            VUserInfo vUserInfo = this.mUsers.get(i5);
            if (vUserInfo != null && !vUserInfo.partial) {
                String str = vUserInfo.iconPath;
                if (str == null) {
                    return null;
                }
                return BitmapFactoryInstrumentation.decodeFile(str);
            }
            VLog.w(LOG_TAG, "getUserIcon: unknown user #" + i5, new Object[0]);
            return null;
        }
    }

    public int[] getUserIds() {
        int[] iArr;
        synchronized (this.mPackagesLock) {
            iArr = this.mUserIds;
        }
        return iArr;
    }

    int[] getUserIdsLPr() {
        return this.mUserIds;
    }

    @Override // com.lody.virtual.server.interfaces.IUserManager
    public VUserInfo getUserInfo(int i5) {
        VUserInfo userInfoLocked;
        synchronized (this.mPackagesLock) {
            userInfoLocked = getUserInfoLocked(i5);
        }
        return userInfoLocked;
    }

    @Override // com.lody.virtual.server.interfaces.IUserManager
    public int getUserSerialNumber(int i5) {
        synchronized (this.mPackagesLock) {
            if (!exists(i5)) {
                return -1;
            }
            return getUserInfoLocked(i5).serialNumber;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IUserManager
    public List<VUserInfo> getUsers(boolean z4) {
        ArrayList arrayList;
        synchronized (this.mPackagesLock) {
            arrayList = new ArrayList(this.mUsers.size());
            for (int i5 = 0; i5 < this.mUsers.size(); i5++) {
                VUserInfo valueAt = this.mUsers.valueAt(i5);
                if (!valueAt.partial && (!z4 || !this.mRemovingUserIds.contains(Integer.valueOf(valueAt.id)))) {
                    arrayList.add(valueAt);
                }
            }
        }
        return arrayList;
    }

    @Override // com.lody.virtual.server.interfaces.IUserManager
    public boolean isGuestEnabled() {
        boolean z4;
        synchronized (this.mPackagesLock) {
            z4 = this.mGuestEnabled;
        }
        return z4;
    }

    public void makeInitialized(int i5) {
        synchronized (this.mPackagesLock) {
            VUserInfo vUserInfo = this.mUsers.get(i5);
            if (vUserInfo == null || vUserInfo.partial) {
                VLog.w(LOG_TAG, "makeInitialized: unknown user #" + i5, new Object[0]);
            }
            int i6 = vUserInfo.flags;
            if ((i6 & 16) == 0) {
                vUserInfo.flags = i6 | 16;
                writeUserLocked(vUserInfo);
            }
        }
    }

    @Override // com.lody.virtual.server.interfaces.IUserManager
    public boolean removeUser(int i5) {
        synchronized (this.mPackagesLock) {
            VUserInfo vUserInfo = this.mUsers.get(i5);
            if (i5 != 0 && vUserInfo != null) {
                this.mRemovingUserIds.add(Integer.valueOf(i5));
                vUserInfo.partial = true;
                writeUserLocked(vUserInfo);
                if (VActivityManagerService.get().stopUser(i5, new IStopUserCallback.Stub() { // from class: com.lody.virtual.server.pm.VUserManagerService.2
                    @Override // android.app.IStopUserCallback
                    public void userStopAborted(int i6) {
                    }

                    @Override // android.app.IStopUserCallback
                    public void userStopped(int i6) {
                        VUserManagerService.this.finishRemoveUser(i6);
                    }
                }) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IUserManager
    public void setGuestEnabled(boolean z4) {
        synchronized (this.mPackagesLock) {
            if (this.mGuestEnabled != z4) {
                this.mGuestEnabled = z4;
                for (int i5 = 0; i5 < this.mUsers.size(); i5++) {
                    VUserInfo valueAt = this.mUsers.valueAt(i5);
                    if (!valueAt.partial && valueAt.isGuest()) {
                        if (!z4) {
                            removeUser(valueAt.id);
                        }
                        return;
                    }
                }
                if (z4) {
                    createUser("Guest", 4);
                }
            }
        }
    }

    @Override // com.lody.virtual.server.interfaces.IUserManager
    public void setUserIcon(int i5, Bitmap bitmap) {
        synchronized (this.mPackagesLock) {
            VUserInfo vUserInfo = this.mUsers.get(i5);
            if (vUserInfo != null && !vUserInfo.partial) {
                writeBitmapLocked(vUserInfo, bitmap);
                writeUserLocked(vUserInfo);
                sendUserInfoChangedBroadcast(i5);
                return;
            }
            VLog.w(LOG_TAG, "setUserIcon: unknown user #" + i5, new Object[0]);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IUserManager
    public void setUserName(int i5, String str) {
        synchronized (this.mPackagesLock) {
            VUserInfo vUserInfo = this.mUsers.get(i5);
            boolean z4 = false;
            if (vUserInfo != null && !vUserInfo.partial) {
                if (str != null && !str.equals(vUserInfo.name)) {
                    vUserInfo.name = str;
                    writeUserLocked(vUserInfo);
                    z4 = true;
                }
                if (z4) {
                    sendUserInfoChangedBroadcast(i5);
                    return;
                }
                return;
            }
            VLog.w(LOG_TAG, "setUserName: unknown user #" + i5, new Object[0]);
        }
    }

    public void userForeground(int i5) {
        synchronized (this.mPackagesLock) {
            VUserInfo vUserInfo = this.mUsers.get(i5);
            long currentTimeMillis = System.currentTimeMillis();
            if (vUserInfo != null && !vUserInfo.partial) {
                if (currentTimeMillis > EPOCH_PLUS_30_YEARS) {
                    vUserInfo.lastLoggedInTime = currentTimeMillis;
                    writeUserLocked(vUserInfo);
                }
                return;
            }
            VLog.w(LOG_TAG, "userForeground: unknown user #" + i5, new Object[0]);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IUserManager
    public void wipeUser(int i5) {
    }

    private VUserManagerService(Context context, VPackageManagerService vPackageManagerService, Object obj, Object obj2, File file, File file2) {
        this.mUsers = new SparseArray<>();
        this.mRemovingUserIds = new HashSet<>();
        this.mNextUserId = 1;
        this.mUserVersion = 0;
        this.mContext = context;
        this.mPm = vPackageManagerService;
        this.mInstallLock = obj;
        this.mPackagesLock = obj2;
        synchronized (obj) {
            synchronized (obj2) {
                File file3 = new File(file, USER_INFO_DIR);
                this.mUsersDir = file3;
                file3.mkdirs();
                new File(file3, "0").mkdirs();
                this.mBaseUserPath = file2;
                this.mUserListFile = new File(file3, USER_LIST_FILENAME);
                readUserListLocked();
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < this.mUsers.size(); i5++) {
                    VUserInfo valueAt = this.mUsers.valueAt(i5);
                    if (valueAt.partial && i5 != 0) {
                        arrayList.add(valueAt);
                    }
                }
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    VUserInfo vUserInfo = (VUserInfo) arrayList.get(i6);
                    VLog.w(LOG_TAG, "Removing partially created user #" + i6 + " (name=" + vUserInfo.name + ")", new Object[0]);
                    removeUserStateLocked(vUserInfo.id);
                }
                sInstance = this;
            }
        }
    }
}
