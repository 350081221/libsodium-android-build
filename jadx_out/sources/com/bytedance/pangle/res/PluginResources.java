package com.bytedance.pangle.res;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.util.g;
import com.bytedance.pangle.util.j;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class PluginResources extends Resources {
    public String pluginPkg;

    public PluginResources(Resources resources, String str) {
        super(appendHostRes(resources), resources.getDisplayMetrics(), Zeus.getAppApplication().getResources().getConfiguration());
        this.pluginPkg = str;
    }

    public static AssetManager appendHostRes(Resources resources) {
        String a5 = g.a(Zeus.getAppApplication());
        String b5 = g.b(Zeus.getAppApplication());
        List<String> b6 = j.b();
        a aVar = new a();
        AssetManager assets = resources.getAssets();
        AssetManager assets2 = Zeus.getAppApplication().getAssets();
        HashSet hashSet = new HashSet(j.a(assets));
        List<String> a6 = j.a(assets2);
        for (String str : b6) {
            if (!hashSet.contains(str)) {
                assets = aVar.a(assets, str, true);
            }
        }
        for (String str2 : a6) {
            if (!isOtherPlugin(str2, a5, b5) && !hashSet.contains(str2) && !b6.contains(str2)) {
                assets = aVar.a(assets, str2, false);
            }
        }
        ZeusLogger.i(ZeusLogger.TAG_RESOURCES, "pluginAssets = " + j.b(assets));
        return assets;
    }

    private Resources.NotFoundException handleException(Resources.NotFoundException notFoundException) {
        return new Resources.NotFoundException(("Resources#Assets: " + j.b(getAssets())) + "," + notFoundException.getMessage());
    }

    private static boolean isOtherPlugin(String str, String str2, String str3) {
        String packageResourcePath = Zeus.getAppApplication().getPackageResourcePath();
        if (!TextUtils.isEmpty(str3)) {
            packageResourcePath = packageResourcePath.replaceFirst(str2, str3);
            str = str.replaceFirst(str2, str3);
        }
        ZeusLogger.d(ZeusLogger.TAG_RESOURCES, str + " " + packageResourcePath + " " + str2 + " " + str3);
        if (TextUtils.equals(str, packageResourcePath) || str.contains("/tinker/patch-")) {
            return false;
        }
        if (TextUtils.isEmpty(str2) || !str.contains(str2)) {
            if (TextUtils.isEmpty(str3) || !str.contains(str3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.content.res.Resources
    @NonNull
    public XmlResourceParser getAnimation(int i5) {
        try {
            return super.getAnimation(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i5) {
        try {
            return super.getBoolean(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public int getColor(int i5) {
        try {
            return super.getColor(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public ColorStateList getColorStateList(int i5) {
        try {
            return super.getColorStateList(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public float getDimension(int i5) {
        try {
            return super.getDimension(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i5) {
        try {
            return super.getDimensionPixelOffset(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i5) {
        try {
            return super.getDimensionPixelSize(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i5) {
        try {
            return super.getDrawable(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawableForDensity(int i5, int i6) {
        try {
            return super.getDrawableForDensity(i5, i6);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public float getFloat(int i5) {
        try {
            return super.getFloat(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public Typeface getFont(int i5) {
        try {
            return super.getFont(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public float getFraction(int i5, int i6, int i7) {
        try {
            return super.getFraction(i5, i6, i7);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public int[] getIntArray(int i5) {
        try {
            return super.getIntArray(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public int getInteger(int i5) {
        try {
            return super.getInteger(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public XmlResourceParser getLayout(int i5) {
        try {
            return super.getLayout(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i5) {
        try {
            return super.getMovie(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public String getQuantityString(int i5, int i6, Object... objArr) {
        try {
            return super.getQuantityString(i5, i6, objArr);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public CharSequence getQuantityText(int i5, int i6) {
        try {
            return super.getQuantityText(i5, i6);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i5) {
        try {
            return super.getResourceEntryName(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i5) {
        try {
            return super.getResourceName(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i5) {
        try {
            return super.getResourcePackageName(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i5) {
        try {
            return super.getResourceTypeName(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public String getString(int i5) {
        try {
            return super.getString(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public String[] getStringArray(int i5) {
        try {
            return super.getStringArray(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public CharSequence getText(int i5) {
        try {
            return super.getText(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public CharSequence[] getTextArray(int i5) {
        try {
            return super.getTextArray(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public void getValue(int i5, TypedValue typedValue, boolean z4) {
        try {
            super.getValue(i5, typedValue, z4);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i5, int i6, TypedValue typedValue, boolean z4) {
        try {
            super.getValueForDensity(i5, i6, typedValue, z4);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public XmlResourceParser getXml(int i5) {
        try {
            return super.getXml(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public TypedArray obtainTypedArray(int i5) {
        try {
            return super.obtainTypedArray(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public InputStream openRawResource(int i5) {
        try {
            return super.openRawResource(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i5) {
        try {
            return super.openRawResourceFd(i5);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public int getColor(int i5, @Nullable Resources.Theme theme) {
        try {
            return super.getColor(i5, theme);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public ColorStateList getColorStateList(int i5, @Nullable Resources.Theme theme) {
        try {
            return super.getColorStateList(i5, theme);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i5, @Nullable Resources.Theme theme) {
        try {
            return super.getDrawable(i5, theme);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawableForDensity(int i5, int i6, @Nullable Resources.Theme theme) {
        try {
            return super.getDrawableForDensity(i5, i6, theme);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public String getQuantityString(int i5, int i6) {
        try {
            return super.getQuantityString(i5, i6);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public String getString(int i5, Object... objArr) {
        try {
            return super.getString(i5, objArr);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i5, CharSequence charSequence) {
        try {
            return super.getText(i5, charSequence);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z4) {
        try {
            super.getValue(str, typedValue, z4);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public InputStream openRawResource(int i5, TypedValue typedValue) {
        try {
            return super.openRawResource(i5, typedValue);
        } catch (Resources.NotFoundException e5) {
            throw handleException(e5);
        }
    }
}
