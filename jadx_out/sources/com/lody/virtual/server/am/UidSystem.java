package com.lody.virtual.server.am;

import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.utils.FileUtils;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.server.pm.parser.VPackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class UidSystem {
    private static final String TAG = "UidSystem";
    private final HashMap<String, Integer> mSharedUserIdMap = new HashMap<>();
    private int mFreeUid = 10000;

    private boolean loadUidList(File file) {
        if (!file.exists()) {
            return false;
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            this.mFreeUid = objectInputStream.readInt();
            this.mSharedUserIdMap.putAll((HashMap) objectInputStream.readObject());
            objectInputStream.close();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void save() {
        File uidListFile = VEnvironment.getUidListFile();
        File bakUidListFile = VEnvironment.getBakUidListFile();
        if (uidListFile.exists()) {
            if (bakUidListFile.exists() && !bakUidListFile.delete()) {
                VLog.w(TAG, "Warning: Unable to delete the expired file --\n " + bakUidListFile.getPath(), new Object[0]);
            }
            try {
                FileUtils.copyFile(uidListFile, bakUidListFile);
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(uidListFile));
            objectOutputStream.writeInt(this.mFreeUid);
            objectOutputStream.writeObject(this.mSharedUserIdMap);
            objectOutputStream.close();
        } catch (IOException e6) {
            e6.printStackTrace();
        }
    }

    public int getOrCreateUid(VPackage vPackage) {
        synchronized (this.mSharedUserIdMap) {
            String str = vPackage.mSharedUserId;
            if (str == null) {
                str = vPackage.packageName;
            }
            Integer num = this.mSharedUserIdMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            int i5 = this.mFreeUid + 1;
            this.mFreeUid = i5;
            if (i5 == VirtualCore.get().myUid()) {
                i5 = this.mFreeUid + 1;
                this.mFreeUid = i5;
            }
            this.mSharedUserIdMap.put(str, Integer.valueOf(i5));
            save();
            return i5;
        }
    }

    public int getUid(String str) {
        synchronized (this.mSharedUserIdMap) {
            Integer num = this.mSharedUserIdMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
    }

    public void initUidList() {
        this.mSharedUserIdMap.clear();
        if (!loadUidList(VEnvironment.getUidListFile())) {
            loadUidList(VEnvironment.getBakUidListFile());
        }
    }
}
