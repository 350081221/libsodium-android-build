.class public abstract Landroid/net/IConnectivityManager$Stub;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Landroid/net/IConnectivityManager;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/net/IConnectivityManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/net/IConnectivityManager$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "android.net.IConnectivityManager"

.field static final TRANSACTION_getActiveLinkProperties:I = 0x7

.field static final TRANSACTION_getActiveNetworkInfo:I = 0x1

.field static final TRANSACTION_getActiveNetworkInfoForUid:I = 0x2

.field static final TRANSACTION_getAllNetworkInfo:I = 0x4

.field static final TRANSACTION_getLinkProperties:I = 0x8

.field static final TRANSACTION_getNetworkInfo:I = 0x3

.field static final TRANSACTION_isActiveNetworkMetered:I = 0x5

.field static final TRANSACTION_requestRouteToHostAddress:I = 0x6


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "android.net.IConnectivityManager"

    .line 5
    .line 6
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public static asInterface(Landroid/os/IBinder;)Landroid/net/IConnectivityManager;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string v0, "android.net.IConnectivityManager"

    .line 6
    .line 7
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    instance-of v1, v0, Landroid/net/IConnectivityManager;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast v0, Landroid/net/IConnectivityManager;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    new-instance v0, Landroid/net/IConnectivityManager$Stub$Proxy;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Landroid/net/IConnectivityManager$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    .line 23
    .line 24
    .line 25
    return-object v0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static getDefaultImpl()Landroid/net/IConnectivityManager;
    .locals 1

    sget-object v0, Landroid/net/IConnectivityManager$Stub$Proxy;->sDefaultImpl:Landroid/net/IConnectivityManager;

    return-object v0
.end method

.method public static setDefaultImpl(Landroid/net/IConnectivityManager;)Z
    .locals 1

    .line 1
    sget-object v0, Landroid/net/IConnectivityManager$Stub$Proxy;->sDefaultImpl:Landroid/net/IConnectivityManager;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sput-object p0, Landroid/net/IConnectivityManager$Stub$Proxy;->sDefaultImpl:Landroid/net/IConnectivityManager;

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "setDefaultImpl() called twice"

    .line 16
    .line 17
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    const v0, 0x5f4e5446

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    const-string v2, "android.net.IConnectivityManager"

    .line 6
    .line 7
    if-eq p1, v0, :cond_6

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :pswitch_0
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-interface {p0, p1}, Landroid/net/IConnectivityManager;->getLinkProperties(I)Landroid/net/LinkProperties;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 30
    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p3, v1}, Landroid/net/LinkProperties;->writeToParcel(Landroid/os/Parcel;I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 42
    .line 43
    .line 44
    :goto_0
    return v1

    .line 45
    :pswitch_1
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p0}, Landroid/net/IConnectivityManager;->getActiveLinkProperties()Landroid/net/LinkProperties;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 53
    .line 54
    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p3, v1}, Landroid/net/LinkProperties;->writeToParcel(Landroid/os/Parcel;I)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 65
    .line 66
    .line 67
    :goto_1
    return v1

    .line 68
    :pswitch_2
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    invoke-interface {p0, p1, p2}, Landroid/net/IConnectivityManager;->requestRouteToHostAddress(II)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    .line 88
    .line 89
    return v1

    .line 90
    :pswitch_3
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p0}, Landroid/net/IConnectivityManager;->isActiveNetworkMetered()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 101
    .line 102
    .line 103
    return v1

    .line 104
    :pswitch_4
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {p0}, Landroid/net/IConnectivityManager;->getAllNetworkInfo()[Landroid/net/NetworkInfo;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p3, p1, v1}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    .line 115
    .line 116
    .line 117
    return v1

    .line 118
    :pswitch_5
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    invoke-interface {p0, p1}, Landroid/net/IConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 130
    .line 131
    .line 132
    if-eqz p1, :cond_2

    .line 133
    .line 134
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, p3, v1}, Landroid/net/NetworkInfo;->writeToParcel(Landroid/os/Parcel;I)V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_2
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 142
    .line 143
    .line 144
    :goto_2
    return v1

    .line 145
    :pswitch_6
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    if-eqz p2, :cond_3

    .line 157
    .line 158
    move p2, v1

    .line 159
    goto :goto_3

    .line 160
    :cond_3
    move p2, v0

    .line 161
    :goto_3
    invoke-interface {p0, p1, p2}, Landroid/net/IConnectivityManager;->getActiveNetworkInfoForUid(IZ)Landroid/net/NetworkInfo;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 166
    .line 167
    .line 168
    if-eqz p1, :cond_4

    .line 169
    .line 170
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, p3, v1}, Landroid/net/NetworkInfo;->writeToParcel(Landroid/os/Parcel;I)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_4
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 178
    .line 179
    .line 180
    :goto_4
    return v1

    .line 181
    :pswitch_7
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-interface {p0}, Landroid/net/IConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 189
    .line 190
    .line 191
    if-eqz p1, :cond_5

    .line 192
    .line 193
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, p3, v1}, Landroid/net/NetworkInfo;->writeToParcel(Landroid/os/Parcel;I)V

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_5
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 201
    .line 202
    .line 203
    :goto_5
    return v1

    .line 204
    :cond_6
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    return v1

    .line 208
    nop

    .line 209
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
