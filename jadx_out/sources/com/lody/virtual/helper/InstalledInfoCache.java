package com.lody.virtual.helper;

import android.graphics.drawable.Drawable;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.utils.ACache;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class InstalledInfoCache {
    private static ACache diskCache = ACache.get(VirtualCore.get().getContext(), "AppInfoCache");

    @Keep
    /* loaded from: classes3.dex */
    public static class CacheItem implements Serializable {
        public static final transient String ICON_CACHE_PREFIX = "va_installed_icon_cache@";
        public static final transient String INFO_CACHE_PREFIX = "va_installed_info_cache@";
        private static final long serialVersionUID = 1;
        public transient Drawable icon;
        public String label;
        public String packageName;

        public CacheItem(String str, String str2, Drawable drawable) {
            this.packageName = str;
            this.label = str2;
            this.icon = drawable;
        }

        public synchronized Drawable getIcon() {
            if (this.icon == null) {
                this.icon = InstalledInfoCache.diskCache.getAsDrawable(ICON_CACHE_PREFIX + this.packageName);
            }
            return this.icon;
        }

        public String getLabel() {
            return this.label;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public synchronized void saveIcon() {
            if (this.icon != null) {
                InstalledInfoCache.diskCache.put(ICON_CACHE_PREFIX + this.packageName, this.icon);
            }
        }
    }

    public static CacheItem get(String str) {
        return (CacheItem) diskCache.getAsObject(CacheItem.INFO_CACHE_PREFIX + str);
    }

    public static void save(CacheItem cacheItem) {
        diskCache.put(CacheItem.INFO_CACHE_PREFIX + cacheItem.packageName, cacheItem);
        cacheItem.saveIcon();
    }
}
