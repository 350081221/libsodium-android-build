package org.osmdroid.tileprovider.modules;

/* loaded from: classes4.dex */
public interface INetworkAvailablityCheck {
    boolean getCellularDataNetworkAvailable();

    boolean getNetworkAvailable();

    @Deprecated
    boolean getRouteToPathExists(int i5);

    boolean getWiFiNetworkAvailable();
}
