package org.osmdroid.views.overlay;

import android.content.Context;
import org.osmdroid.views.overlay.infowindow.b;

/* loaded from: classes4.dex */
public abstract class OverlayWithIW extends Overlay {
    protected String mId;
    protected b mInfoWindow;
    protected Object mRelatedObject;
    protected String mSnippet;
    protected String mSubDescription;
    protected String mTitle;

    @Deprecated
    public OverlayWithIW(Context context) {
        this();
    }

    public void closeInfoWindow() {
        b bVar = this.mInfoWindow;
        if (bVar != null) {
            bVar.a();
        }
    }

    public String getId() {
        return this.mId;
    }

    public b getInfoWindow() {
        return this.mInfoWindow;
    }

    public Object getRelatedObject() {
        return this.mRelatedObject;
    }

    public String getSnippet() {
        return this.mSnippet;
    }

    public String getSubDescription() {
        return this.mSubDescription;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public boolean isInfoWindowOpen() {
        b bVar = this.mInfoWindow;
        return bVar != null && bVar.h();
    }

    public void onDestroy() {
        b bVar = this.mInfoWindow;
        if (bVar != null) {
            bVar.a();
            this.mInfoWindow.j();
            this.mInfoWindow = null;
            this.mRelatedObject = null;
        }
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setInfoWindow(b bVar) {
        this.mInfoWindow = bVar;
    }

    public void setRelatedObject(Object obj) {
        this.mRelatedObject = obj;
    }

    public void setSnippet(String str) {
        this.mSnippet = str;
    }

    public void setSubDescription(String str) {
        this.mSubDescription = str;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public OverlayWithIW() {
    }
}
