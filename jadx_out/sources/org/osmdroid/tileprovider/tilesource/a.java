package org.osmdroid.tileprovider.tilesource;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.android.multidex.ClassPathElement;
import com.huawei.agconnect.apms.instrument.BitmapFactoryInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import org.osmdroid.api.IMapView;
import org.osmdroid.tileprovider.BitmapPool;
import org.osmdroid.tileprovider.ReusableBitmapDrawable;
import org.osmdroid.tileprovider.util.Counters;
import org.osmdroid.util.MapTileIndex;

@Instrumented
/* loaded from: classes4.dex */
public abstract class a implements e {
    private static int globalOrdinal;
    protected String mCopyright;
    protected final String mImageFilenameEnding;
    private final int mMaximumZoomLevel;
    private final int mMinimumZoomLevel;
    protected String mName;
    private final int mOrdinal;
    private final int mTileSizePixels;
    protected final Random random;

    /* renamed from: org.osmdroid.tileprovider.tilesource.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0650a extends Exception {
        private static final long serialVersionUID = 146526524087765134L;

        public C0650a(String str) {
            super(str);
        }

        public C0650a(Throwable th) {
            super(th);
        }
    }

    public a(String str, int i5, int i6, int i7, String str2) {
        this(str, i5, i6, i7, str2, null);
    }

    @Override // org.osmdroid.tileprovider.tilesource.e
    public String getCopyrightNotice() {
        return this.mCopyright;
    }

    @Override // org.osmdroid.tileprovider.tilesource.e
    public Drawable getDrawable(String str) throws C0650a {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactoryInstrumentation.decodeFile(str, options);
            int i5 = options.outHeight;
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            BitmapPool.getInstance().applyReusableOptions(options2, i5, i5);
            Bitmap decodeFile = BitmapFactoryInstrumentation.decodeFile(str, options2);
            if (decodeFile != null) {
                return new ReusableBitmapDrawable(decodeFile);
            }
            if (new File(str).exists()) {
                Log.d(IMapView.LOGTAG, str + " is an invalid image file, deleting...");
                try {
                    new File(str).delete();
                    return null;
                } catch (Throwable th) {
                    Log.e(IMapView.LOGTAG, "Error deleting invalid file: " + str, th);
                    return null;
                }
            }
            Log.d(IMapView.LOGTAG, "Request tile: " + str + " does not exist");
            return null;
        } catch (Exception e5) {
            Log.e(IMapView.LOGTAG, "Unexpected error loading bitmap: " + str, e5);
            Counters.tileDownloadErrors = Counters.tileDownloadErrors + 1;
            System.gc();
            return null;
        } catch (OutOfMemoryError e6) {
            Log.e(IMapView.LOGTAG, "OutOfMemoryError loading bitmap: " + str);
            System.gc();
            throw new C0650a(e6);
        }
    }

    @Override // org.osmdroid.tileprovider.tilesource.e
    public int getMaximumZoomLevel() {
        return this.mMaximumZoomLevel;
    }

    @Override // org.osmdroid.tileprovider.tilesource.e
    public int getMinimumZoomLevel() {
        return this.mMinimumZoomLevel;
    }

    @Override // org.osmdroid.tileprovider.tilesource.e
    public String getTileRelativeFilenameString(long j5) {
        return pathBase() + ClassPathElement.SEPARATOR_CHAR + MapTileIndex.getZoom(j5) + ClassPathElement.SEPARATOR_CHAR + MapTileIndex.getX(j5) + ClassPathElement.SEPARATOR_CHAR + MapTileIndex.getY(j5) + imageFilenameEnding();
    }

    @Override // org.osmdroid.tileprovider.tilesource.e
    public int getTileSizePixels() {
        return this.mTileSizePixels;
    }

    public String imageFilenameEnding() {
        return this.mImageFilenameEnding;
    }

    @Override // org.osmdroid.tileprovider.tilesource.e
    public String name() {
        return this.mName;
    }

    @Override // org.osmdroid.tileprovider.tilesource.e
    public int ordinal() {
        return this.mOrdinal;
    }

    public String pathBase() {
        return this.mName;
    }

    public String toString() {
        return name();
    }

    public a(String str, int i5, int i6, int i7, String str2, String str3) {
        this.random = new Random();
        int i8 = globalOrdinal;
        globalOrdinal = i8 + 1;
        this.mOrdinal = i8;
        this.mName = str;
        this.mMinimumZoomLevel = i5;
        this.mMaximumZoomLevel = i6;
        this.mTileSizePixels = i7;
        this.mImageFilenameEnding = str2;
        this.mCopyright = str3;
    }

    @Override // org.osmdroid.tileprovider.tilesource.e
    public Drawable getDrawable(InputStream inputStream) throws C0650a {
        try {
            int i5 = this.mTileSizePixels;
            if (inputStream.markSupported()) {
                inputStream.mark(1048576);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactoryInstrumentation.decodeStream(inputStream, null, options);
                i5 = options.outHeight;
                inputStream.reset();
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            BitmapPool.getInstance().applyReusableOptions(options2, i5, i5);
            Bitmap decodeStream = BitmapFactoryInstrumentation.decodeStream(inputStream, null, options2);
            if (decodeStream != null) {
                return new ReusableBitmapDrawable(decodeStream);
            }
        } catch (Exception e5) {
            Log.w(IMapView.LOGTAG, "#547 Error loading bitmap" + pathBase(), e5);
        } catch (OutOfMemoryError e6) {
            Log.e(IMapView.LOGTAG, "OutOfMemoryError loading bitmap");
            System.gc();
            throw new C0650a(e6);
        }
        return null;
    }
}
