package v1;

import android.os.Bundle;
import com.huawei.agconnect.apms.y1;
import java.util.Map;

/* loaded from: classes3.dex */
public interface a {
    Map<String, String> getUserProfiles(boolean z4);

    void onEvent(String str, Bundle bundle);

    void onReport();

    void setAnalyticsEnabled(boolean z4);

    void setEnableAndroidID(boolean z4);

    void syncOaid(y1 y1Var);
}
