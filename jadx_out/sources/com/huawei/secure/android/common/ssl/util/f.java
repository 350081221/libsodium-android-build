package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.os.AsyncTask;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class f extends AsyncTask<Context, Integer, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9027a = "f";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Context... contextArr) {
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            inputStream = a.n(contextArr[0]);
        } catch (Exception e5) {
            i.d(f9027a, "doInBackground: exception : " + e5.getMessage());
            inputStream = null;
        }
        i.b(f9027a, "doInBackground: get bks from hms tss cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        if (inputStream != null) {
            h.g(inputStream);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            i.e(f9027a, "onPostExecute: upate done");
        } else {
            i.d(f9027a, "onPostExecute: upate failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... numArr) {
        i.e(f9027a, "onProgressUpdate");
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        i.b(f9027a, "onPreExecute");
    }
}
