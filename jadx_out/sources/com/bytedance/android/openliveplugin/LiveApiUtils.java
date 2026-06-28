package com.bytedance.android.openliveplugin;

import com.bytedance.gromore.R;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class LiveApiUtils {
    public static Map<String, Integer> getCJPayAnimationResourceMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("TTCJPayKeyActivityAddInAnimationResource", Integer.valueOf(R.anim.f3192o));
        hashMap.put("TTCJPayKeyActivityRemoveOutAnimationResource", Integer.valueOf(R.anim.f3195r));
        hashMap.put("TTCJPayKeyActivityFadeInAnimationResource", Integer.valueOf(R.anim.f3193p));
        hashMap.put("TTCJPayKeyActivityFadeOutAnimationResource", Integer.valueOf(R.anim.f3194q));
        hashMap.put("TTCJPayKeySlideInFromBottomAnimationResource", Integer.valueOf(R.anim.f3200w));
        hashMap.put("TTCJPayKeySlideOutToBottomAnimationResource", Integer.valueOf(R.anim.f3201x));
        hashMap.put("TTCJPayKeySlideRightInAnimationResource", Integer.valueOf(R.anim.f3202y));
        hashMap.put("TTCJPayKeyFragmentUpInAnimationResource", Integer.valueOf(R.anim.f3198u));
        hashMap.put("TTCJPayKeyFragmentDownOutAnimationResource", Integer.valueOf(R.anim.f3197t));
        return hashMap;
    }
}
