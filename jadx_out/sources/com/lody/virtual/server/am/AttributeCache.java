package com.lody.virtual.server.am;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.SparseArray;
import com.lody.virtual.client.core.VirtualCore;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class AttributeCache {
    private static final AttributeCache sInstance = new AttributeCache();
    private final WeakHashMap<String, Package> mPackages = new WeakHashMap<>();
    private final Configuration mConfiguration = new Configuration();

    /* loaded from: classes3.dex */
    public static final class Entry {
        public final TypedArray array;
        public final Resources resource;

        public Entry(Resources resources, TypedArray typedArray) {
            this.resource = resources;
            this.array = typedArray;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Package {
        private final SparseArray<HashMap<int[], Entry>> mMap = new SparseArray<>();
        public final Resources resources;

        public Package(Resources resources) {
            this.resources = resources;
        }
    }

    private AttributeCache() {
    }

    public static AttributeCache instance() {
        return sInstance;
    }

    public Entry get(String str, int i5, int[] iArr) {
        HashMap hashMap;
        Entry entry;
        synchronized (this) {
            Package r02 = this.mPackages.get(str);
            if (r02 != null) {
                hashMap = (HashMap) r02.mMap.get(i5);
                if (hashMap != null && (entry = (Entry) hashMap.get(iArr)) != null) {
                    return entry;
                }
            } else {
                try {
                    Package r22 = new Package(VirtualCore.get().getResources(str));
                    this.mPackages.put(str, r22);
                    hashMap = null;
                    r02 = r22;
                } catch (Throwable unused) {
                    return null;
                }
            }
            if (hashMap == null) {
                hashMap = new HashMap();
                r02.mMap.put(i5, hashMap);
            }
            try {
                Resources resources = r02.resources;
                Entry entry2 = new Entry(resources, resources.newTheme().obtainStyledAttributes(i5, iArr));
                hashMap.put(iArr, entry2);
                return entry2;
            } catch (Resources.NotFoundException unused2) {
                return null;
            }
        }
    }

    public void removePackage(String str) {
        synchronized (this) {
            this.mPackages.remove(str);
        }
    }

    public void updateConfiguration(Configuration configuration) {
        synchronized (this) {
            if ((this.mConfiguration.updateFrom(configuration) & (-1073741985)) != 0) {
                this.mPackages.clear();
            }
        }
    }
}
