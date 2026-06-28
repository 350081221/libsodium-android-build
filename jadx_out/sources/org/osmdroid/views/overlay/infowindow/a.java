package org.osmdroid.views.overlay.infowindow;

import android.content.Context;
import android.text.Html;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.osmdroid.api.IMapView;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.OverlayWithIW;

/* loaded from: classes4.dex */
public class a extends b {

    /* renamed from: h, reason: collision with root package name */
    public static final int f21939h = 0;

    /* renamed from: i, reason: collision with root package name */
    static int f21940i;

    /* renamed from: j, reason: collision with root package name */
    static int f21941j;

    /* renamed from: k, reason: collision with root package name */
    static int f21942k;

    /* renamed from: l, reason: collision with root package name */
    static int f21943l;

    /* renamed from: org.osmdroid.views.overlay.infowindow.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class ViewOnTouchListenerC0653a implements View.OnTouchListener {
        ViewOnTouchListenerC0653a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                a.this.a();
            }
            return true;
        }
    }

    public a(int i5, MapView mapView) {
        super(i5, mapView);
        if (f21940i == 0) {
            n(mapView.getContext());
        }
        this.f21945a.setOnTouchListener(new ViewOnTouchListenerC0653a());
    }

    private static void n(Context context) {
        String packageName = context.getPackageName();
        f21940i = context.getResources().getIdentifier("id/bubble_title", null, packageName);
        f21941j = context.getResources().getIdentifier("id/bubble_description", null, packageName);
        f21942k = context.getResources().getIdentifier("id/bubble_subdescription", null, packageName);
        int identifier = context.getResources().getIdentifier("id/bubble_image", null, packageName);
        f21943l = identifier;
        if (f21940i == 0 || f21941j == 0 || f21942k == 0 || identifier == 0) {
            Log.e(IMapView.LOGTAG, "BasicInfoWindow: unable to get res ids in " + packageName);
        }
    }

    @Override // org.osmdroid.views.overlay.infowindow.b
    public void i() {
    }

    @Override // org.osmdroid.views.overlay.infowindow.b
    public void k(Object obj) {
        OverlayWithIW overlayWithIW = (OverlayWithIW) obj;
        String title = overlayWithIW.getTitle();
        if (title == null) {
            title = "";
        }
        View view = this.f21945a;
        if (view == null) {
            Log.w(IMapView.LOGTAG, "Error trapped, BasicInfoWindow.open, mView is null!");
            return;
        }
        TextView textView = (TextView) view.findViewById(f21940i);
        if (textView != null) {
            textView.setText(title);
        }
        String snippet = overlayWithIW.getSnippet();
        if (snippet == null) {
            snippet = "";
        }
        ((TextView) this.f21945a.findViewById(f21941j)).setText(Html.fromHtml(snippet));
        TextView textView2 = (TextView) this.f21945a.findViewById(f21942k);
        String subDescription = overlayWithIW.getSubDescription();
        if (subDescription != null && !"".equals(subDescription)) {
            textView2.setText(Html.fromHtml(subDescription));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }
}
