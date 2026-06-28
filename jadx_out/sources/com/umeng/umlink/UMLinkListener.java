package com.umeng.umlink;

import android.net.Uri;
import java.util.HashMap;

/* loaded from: classes3.dex */
public interface UMLinkListener {
    void onError(String str);

    void onInstall(HashMap<String, String> hashMap, Uri uri);

    void onLink(String str, HashMap<String, String> hashMap);
}
