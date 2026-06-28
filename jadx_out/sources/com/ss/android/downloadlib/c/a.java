package com.ss.android.downloadlib.c;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.socialbase.downloader.depend.m;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.umeng.analytics.pro.bm;
import java.io.File;

/* loaded from: classes3.dex */
public class a implements m {
    private boolean c(DownloadInfo downloadInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append(downloadInfo.getSavePath());
        String str = File.separator;
        sb.append(str);
        sb.append(downloadInfo.getName());
        String sb2 = sb.toString();
        File file = new File(sb2);
        String a5 = com.ss.android.socialbase.appdownloader.f.a.e.a(k.a(), com.ss.android.socialbase.appdownloader.c.a(downloadInfo, file), sb2);
        boolean z4 = false;
        if (!TextUtils.isEmpty(a5)) {
            String str2 = a5 + ".apk";
            if (str2.equals(downloadInfo.getName())) {
                return true;
            }
            try {
                z4 = file.renameTo(new File(downloadInfo.getSavePath() + str + str2));
                if (z4) {
                    downloadInfo.setName(str2);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return z4;
    }

    @Override // com.ss.android.socialbase.downloader.depend.m
    public void a(DownloadInfo downloadInfo) throws BaseException {
        if (downloadInfo == null || !c(downloadInfo)) {
            return;
        }
        a(k.a(), downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.depend.m
    public boolean b(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            return com.ss.android.downloadlib.g.e.b(com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()));
        }
        return false;
    }

    private void a(Context context, final DownloadInfo downloadInfo) {
        String str = downloadInfo.getSavePath() + File.separator + downloadInfo.getName();
        Cursor query = context.getContentResolver().query(MediaStore.Files.getContentUri("external"), new String[]{bm.f12336d}, "_data=? ", new String[]{str}, null);
        if (query != null && query.moveToFirst()) {
            downloadInfo.safePutToDBJsonData("file_content_uri", ContentUris.withAppendedId(MediaStore.Files.getContentUri("external"), query.getInt(query.getColumnIndex(bm.f12336d))).toString());
        } else {
            MediaScannerConnection.scanFile(context, new String[]{str}, new String[]{"application/vnd.android.package-archive"}, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.ss.android.downloadlib.c.a.1
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public void onScanCompleted(String str2, Uri uri) {
                    if (uri != null) {
                        downloadInfo.safePutToDBJsonData("file_content_uri", uri.toString());
                        com.ss.android.socialbase.downloader.downloader.c.y().a(downloadInfo);
                    }
                }
            });
        }
        com.ss.android.socialbase.downloader.i.f.a(query);
    }
}
