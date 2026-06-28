package z2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22733a = "NoSaveStateFrameLayout";

    public static Rect a(View view, View view2) {
        View view3;
        if (view2 != null && view != null) {
            if (view2.getParent() != null && view2.isAttachedToWindow()) {
                if (view2.getVisibility() == 0) {
                    Context context = view2.getContext();
                    if (context instanceof Activity) {
                        view3 = ((Activity) context).getWindow().getDecorView();
                    } else {
                        view3 = null;
                    }
                    Rect rect = new Rect();
                    Rect rect2 = new Rect();
                    if (view2 == view) {
                        view2.getHitRect(rect);
                        return rect;
                    }
                    View view4 = view2;
                    while (view4 != view3 && view4 != view) {
                        a.f("tmp class:" + view4.getClass().getSimpleName());
                        view4.getHitRect(rect2);
                        a.f("tmp hit Rect:" + rect2);
                        if (!view4.getClass().equals(f22733a)) {
                            rect.left += rect2.left;
                            rect.top += rect2.top;
                        }
                        view4 = (View) view4.getParent();
                        if (view4 != null) {
                            if (view4.getParent() instanceof ScrollView) {
                                int scrollY = ((ScrollView) view4.getParent()).getScrollY();
                                a.f("scrollY:" + scrollY);
                                rect.top = rect.top - scrollY;
                            }
                            if (view4.getParent() instanceof HorizontalScrollView) {
                                int scrollX = ((HorizontalScrollView) view4.getParent()).getScrollX();
                                a.f("scrollX:" + scrollX);
                                rect.left = rect.left - scrollX;
                            }
                            if (view4.getParent() != null && (view4.getParent() instanceof ViewPager)) {
                                view4 = (View) view4.getParent();
                            }
                        } else {
                            throw new IllegalArgumentException("the view is not showing in the window!");
                        }
                    }
                    rect.right = rect.left + view2.getMeasuredWidth();
                    rect.bottom = rect.top + view2.getMeasuredHeight();
                    return rect;
                }
                throw new IllegalArgumentException("the view is not visible.");
            }
            throw new IllegalArgumentException("the view is not showing in the window!");
        }
        throw new IllegalArgumentException("parent and child can not be null .");
    }
}
