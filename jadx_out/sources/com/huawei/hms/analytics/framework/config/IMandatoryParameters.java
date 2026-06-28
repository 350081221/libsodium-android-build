package com.huawei.hms.analytics.framework.config;

import android.content.Context;

/* loaded from: classes3.dex */
public interface IMandatoryParameters {
    String getAppVer();

    CipherType getCipherType();

    Context getContext();

    String getLoadWorkKey();

    String getModel();

    String getPubKeyVersion(String str);

    byte[] getRsaPublicKey(String str);
}
