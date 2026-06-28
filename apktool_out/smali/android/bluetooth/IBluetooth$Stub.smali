.class public abstract Landroid/bluetooth/IBluetooth$Stub;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Landroid/bluetooth/IBluetooth;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/bluetooth/IBluetooth;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/bluetooth/IBluetooth$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "android.bluetooth.IBluetooth"

.field static final TRANSACTION_cancelBondProcess:I = 0x15

.field static final TRANSACTION_cancelDiscovery:I = 0xf

.field static final TRANSACTION_configHciSnoopLog:I = 0x2f

.field static final TRANSACTION_connectSocket:I = 0x2d

.field static final TRANSACTION_createBond:I = 0x14

.field static final TRANSACTION_createSocketChannel:I = 0x2e

.field static final TRANSACTION_disable:I = 0x5

.field static final TRANSACTION_enable:I = 0x3

.field static final TRANSACTION_enableNoAutoConnect:I = 0x4

.field static final TRANSACTION_factoryReset:I = 0x30

.field static final TRANSACTION_fetchRemoteUuids:I = 0x1f

.field static final TRANSACTION_getActivityEnergyInfoFromController:I = 0x36

.field static final TRANSACTION_getAdapterConnectionState:I = 0x11

.field static final TRANSACTION_getAddress:I = 0x6

.field static final TRANSACTION_getBondState:I = 0x17

.field static final TRANSACTION_getBondedDevices:I = 0x13

.field static final TRANSACTION_getConnectionState:I = 0x18

.field static final TRANSACTION_getDiscoverableTimeout:I = 0xc

.field static final TRANSACTION_getMessageAccessPermission:I = 0x26

.field static final TRANSACTION_getName:I = 0x9

.field static final TRANSACTION_getPhonebookAccessPermission:I = 0x24

.field static final TRANSACTION_getProfileConnectionState:I = 0x12

.field static final TRANSACTION_getRemoteAlias:I = 0x1b

.field static final TRANSACTION_getRemoteClass:I = 0x1d

.field static final TRANSACTION_getRemoteName:I = 0x19

.field static final TRANSACTION_getRemoteType:I = 0x1a

.field static final TRANSACTION_getRemoteUuids:I = 0x1e

.field static final TRANSACTION_getScanMode:I = 0xa

.field static final TRANSACTION_getSimAccessPermission:I = 0x28

.field static final TRANSACTION_getState:I = 0x2

.field static final TRANSACTION_getUuids:I = 0x7

.field static final TRANSACTION_isActivityAndEnergyReportingSupported:I = 0x35

.field static final TRANSACTION_isDiscovering:I = 0x10

.field static final TRANSACTION_isEnabled:I = 0x1

.field static final TRANSACTION_isMultiAdvertisementSupported:I = 0x31

.field static final TRANSACTION_isOffloadedFilteringSupported:I = 0x33

.field static final TRANSACTION_isOffloadedScanBatchingSupported:I = 0x34

.field static final TRANSACTION_isPeripheralModeSupported:I = 0x32

.field static final TRANSACTION_onBrEdrDown:I = 0x39

.field static final TRANSACTION_onLeServiceUp:I = 0x38

.field static final TRANSACTION_registerCallback:I = 0x2b

.field static final TRANSACTION_removeBond:I = 0x16

.field static final TRANSACTION_requestActivityInfo:I = 0x37

.field static final TRANSACTION_sdpSearch:I = 0x20

.field static final TRANSACTION_sendConnectionStateChange:I = 0x2a

.field static final TRANSACTION_setDiscoverableTimeout:I = 0xd

.field static final TRANSACTION_setMessageAccessPermission:I = 0x27

.field static final TRANSACTION_setName:I = 0x8

.field static final TRANSACTION_setPairingConfirmation:I = 0x23

.field static final TRANSACTION_setPasskey:I = 0x22

.field static final TRANSACTION_setPhonebookAccessPermission:I = 0x25

.field static final TRANSACTION_setPin:I = 0x21

.field static final TRANSACTION_setRemoteAlias:I = 0x1c

.field static final TRANSACTION_setScanMode:I = 0xb

.field static final TRANSACTION_setSimAccessPermission:I = 0x29

.field static final TRANSACTION_startDiscovery:I = 0xe

.field static final TRANSACTION_unregisterCallback:I = 0x2c


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "android.bluetooth.IBluetooth"

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

.method public static asInterface(Landroid/os/IBinder;)Landroid/bluetooth/IBluetooth;
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
    const-string v0, "android.bluetooth.IBluetooth"

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
    instance-of v1, v0, Landroid/bluetooth/IBluetooth;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast v0, Landroid/bluetooth/IBluetooth;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    new-instance v0, Landroid/bluetooth/IBluetooth$Stub$Proxy;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Landroid/bluetooth/IBluetooth$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

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

.method public static getDefaultImpl()Landroid/bluetooth/IBluetooth;
    .locals 1

    sget-object v0, Landroid/bluetooth/IBluetooth$Stub$Proxy;->sDefaultImpl:Landroid/bluetooth/IBluetooth;

    return-object v0
.end method

.method public static setDefaultImpl(Landroid/bluetooth/IBluetooth;)Z
    .locals 1

    .line 1
    sget-object v0, Landroid/bluetooth/IBluetooth$Stub$Proxy;->sDefaultImpl:Landroid/bluetooth/IBluetooth;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sput-object p0, Landroid/bluetooth/IBluetooth$Stub$Proxy;->sDefaultImpl:Landroid/bluetooth/IBluetooth;

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
    .locals 10
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
    const-string v2, "android.bluetooth.IBluetooth"

    .line 6
    .line 7
    if-eq p1, v0, :cond_22

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :pswitch_0
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->onBrEdrDown()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 26
    .line 27
    .line 28
    return v1

    .line 29
    :pswitch_1
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->onLeServiceUp()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 36
    .line 37
    .line 38
    return v1

    .line 39
    :pswitch_2
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    sget-object p1, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 49
    .line 50
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    move-object v3, p1

    .line 55
    check-cast v3, Landroid/os/ResultReceiver;

    .line 56
    .line 57
    :cond_0
    invoke-interface {p0, v3}, Landroid/bluetooth/IBluetooth;->requestActivityInfo(Landroid/os/ResultReceiver;)V

    .line 58
    .line 59
    .line 60
    return v1

    .line 61
    :pswitch_3
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->getActivityEnergyInfoFromController()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 68
    .line 69
    .line 70
    return v1

    .line 71
    :pswitch_4
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->isActivityAndEnergyReportingSupported()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 82
    .line 83
    .line 84
    return v1

    .line 85
    :pswitch_5
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->isOffloadedScanBatchingSupported()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 96
    .line 97
    .line 98
    return v1

    .line 99
    :pswitch_6
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->isOffloadedFilteringSupported()Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 110
    .line 111
    .line 112
    return v1

    .line 113
    :pswitch_7
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->isPeripheralModeSupported()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 124
    .line 125
    .line 126
    return v1

    .line 127
    :pswitch_8
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->isMultiAdvertisementSupported()Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 138
    .line 139
    .line 140
    return v1

    .line 141
    :pswitch_9
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->factoryReset()Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 152
    .line 153
    .line 154
    return v1

    .line 155
    :pswitch_a
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_1

    .line 163
    .line 164
    move v0, v1

    .line 165
    :cond_1
    invoke-interface {p0, v0}, Landroid/bluetooth/IBluetooth;->configHciSnoopLog(Z)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 173
    .line 174
    .line 175
    return v1

    .line 176
    :pswitch_b
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 188
    .line 189
    .line 190
    move-result p4

    .line 191
    if-eqz p4, :cond_2

    .line 192
    .line 193
    sget-object p4, Landroid/os/ParcelUuid;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 194
    .line 195
    invoke-interface {p4, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p4

    .line 199
    move-object v3, p4

    .line 200
    check-cast v3, Landroid/os/ParcelUuid;

    .line 201
    .line 202
    :cond_2
    move-object v5, v3

    .line 203
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    move-object v2, p0

    .line 212
    move v3, p1

    .line 213
    invoke-interface/range {v2 .. v7}, Landroid/bluetooth/IBluetooth;->createSocketChannel(ILjava/lang/String;Landroid/os/ParcelUuid;II)Landroid/os/ParcelFileDescriptor;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 218
    .line 219
    .line 220
    if-eqz p1, :cond_3

    .line 221
    .line 222
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, p3, v1}, Landroid/os/ParcelFileDescriptor;->writeToParcel(Landroid/os/Parcel;I)V

    .line 226
    .line 227
    .line 228
    goto :goto_0

    .line 229
    :cond_3
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 230
    .line 231
    .line 232
    :goto_0
    return v1

    .line 233
    :pswitch_c
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    if-eqz p1, :cond_4

    .line 241
    .line 242
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 243
    .line 244
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    .line 249
    .line 250
    move-object v5, p1

    .line 251
    goto :goto_1

    .line 252
    :cond_4
    move-object v5, v3

    .line 253
    :goto_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    if-eqz p1, :cond_5

    .line 262
    .line 263
    sget-object p1, Landroid/os/ParcelUuid;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 264
    .line 265
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    move-object v3, p1

    .line 270
    check-cast v3, Landroid/os/ParcelUuid;

    .line 271
    .line 272
    :cond_5
    move-object v7, v3

    .line 273
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 274
    .line 275
    .line 276
    move-result v8

    .line 277
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 278
    .line 279
    .line 280
    move-result v9

    .line 281
    move-object v4, p0

    .line 282
    invoke-interface/range {v4 .. v9}, Landroid/bluetooth/IBluetooth;->connectSocket(Landroid/bluetooth/BluetoothDevice;ILandroid/os/ParcelUuid;II)Landroid/os/ParcelFileDescriptor;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 287
    .line 288
    .line 289
    if-eqz p1, :cond_6

    .line 290
    .line 291
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p1, p3, v1}, Landroid/os/ParcelFileDescriptor;->writeToParcel(Landroid/os/Parcel;I)V

    .line 295
    .line 296
    .line 297
    goto :goto_2

    .line 298
    :cond_6
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 299
    .line 300
    .line 301
    :goto_2
    return v1

    .line 302
    :pswitch_d
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    invoke-static {p1}, Landroid/bluetooth/IBluetoothCallback$Stub;->asInterface(Landroid/os/IBinder;)Landroid/bluetooth/IBluetoothCallback;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    invoke-interface {p0, p1}, Landroid/bluetooth/IBluetooth;->unregisterCallback(Landroid/bluetooth/IBluetoothCallback;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 317
    .line 318
    .line 319
    return v1

    .line 320
    :pswitch_e
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-static {p1}, Landroid/bluetooth/IBluetoothCallback$Stub;->asInterface(Landroid/os/IBinder;)Landroid/bluetooth/IBluetoothCallback;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    invoke-interface {p0, p1}, Landroid/bluetooth/IBluetooth;->registerCallback(Landroid/bluetooth/IBluetoothCallback;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 335
    .line 336
    .line 337
    return v1

    .line 338
    :pswitch_f
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 342
    .line 343
    .line 344
    move-result p1

    .line 345
    if-eqz p1, :cond_7

    .line 346
    .line 347
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 348
    .line 349
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    move-object v3, p1

    .line 354
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 355
    .line 356
    :cond_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 357
    .line 358
    .line 359
    move-result p1

    .line 360
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 361
    .line 362
    .line 363
    move-result p4

    .line 364
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 365
    .line 366
    .line 367
    move-result p2

    .line 368
    invoke-interface {p0, v3, p1, p4, p2}, Landroid/bluetooth/IBluetooth;->sendConnectionStateChange(Landroid/bluetooth/BluetoothDevice;III)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 372
    .line 373
    .line 374
    return v1

    .line 375
    :pswitch_10
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 379
    .line 380
    .line 381
    move-result p1

    .line 382
    if-eqz p1, :cond_8

    .line 383
    .line 384
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 385
    .line 386
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    move-object v3, p1

    .line 391
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 392
    .line 393
    :cond_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 394
    .line 395
    .line 396
    move-result p1

    .line 397
    invoke-interface {p0, v3, p1}, Landroid/bluetooth/IBluetooth;->setSimAccessPermission(Landroid/bluetooth/BluetoothDevice;I)Z

    .line 398
    .line 399
    .line 400
    move-result p1

    .line 401
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 402
    .line 403
    .line 404
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 405
    .line 406
    .line 407
    return v1

    .line 408
    :pswitch_11
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 412
    .line 413
    .line 414
    move-result p1

    .line 415
    if-eqz p1, :cond_9

    .line 416
    .line 417
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 418
    .line 419
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object p1

    .line 423
    move-object v3, p1

    .line 424
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 425
    .line 426
    :cond_9
    invoke-interface {p0, v3}, Landroid/bluetooth/IBluetooth;->getSimAccessPermission(Landroid/bluetooth/BluetoothDevice;)I

    .line 427
    .line 428
    .line 429
    move-result p1

    .line 430
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 431
    .line 432
    .line 433
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 434
    .line 435
    .line 436
    return v1

    .line 437
    :pswitch_12
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 441
    .line 442
    .line 443
    move-result p1

    .line 444
    if-eqz p1, :cond_a

    .line 445
    .line 446
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 447
    .line 448
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    move-object v3, p1

    .line 453
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 454
    .line 455
    :cond_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 456
    .line 457
    .line 458
    move-result p1

    .line 459
    invoke-interface {p0, v3, p1}, Landroid/bluetooth/IBluetooth;->setMessageAccessPermission(Landroid/bluetooth/BluetoothDevice;I)Z

    .line 460
    .line 461
    .line 462
    move-result p1

    .line 463
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 464
    .line 465
    .line 466
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 467
    .line 468
    .line 469
    return v1

    .line 470
    :pswitch_13
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 474
    .line 475
    .line 476
    move-result p1

    .line 477
    if-eqz p1, :cond_b

    .line 478
    .line 479
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 480
    .line 481
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    move-object v3, p1

    .line 486
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 487
    .line 488
    :cond_b
    invoke-interface {p0, v3}, Landroid/bluetooth/IBluetooth;->getMessageAccessPermission(Landroid/bluetooth/BluetoothDevice;)I

    .line 489
    .line 490
    .line 491
    move-result p1

    .line 492
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 493
    .line 494
    .line 495
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 496
    .line 497
    .line 498
    return v1

    .line 499
    :pswitch_14
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 503
    .line 504
    .line 505
    move-result p1

    .line 506
    if-eqz p1, :cond_c

    .line 507
    .line 508
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 509
    .line 510
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object p1

    .line 514
    move-object v3, p1

    .line 515
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 516
    .line 517
    :cond_c
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 518
    .line 519
    .line 520
    move-result p1

    .line 521
    invoke-interface {p0, v3, p1}, Landroid/bluetooth/IBluetooth;->setPhonebookAccessPermission(Landroid/bluetooth/BluetoothDevice;I)Z

    .line 522
    .line 523
    .line 524
    move-result p1

    .line 525
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 526
    .line 527
    .line 528
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 529
    .line 530
    .line 531
    return v1

    .line 532
    :pswitch_15
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 536
    .line 537
    .line 538
    move-result p1

    .line 539
    if-eqz p1, :cond_d

    .line 540
    .line 541
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 542
    .line 543
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object p1

    .line 547
    move-object v3, p1

    .line 548
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 549
    .line 550
    :cond_d
    invoke-interface {p0, v3}, Landroid/bluetooth/IBluetooth;->getPhonebookAccessPermission(Landroid/bluetooth/BluetoothDevice;)I

    .line 551
    .line 552
    .line 553
    move-result p1

    .line 554
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 555
    .line 556
    .line 557
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 558
    .line 559
    .line 560
    return v1

    .line 561
    :pswitch_16
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 565
    .line 566
    .line 567
    move-result p1

    .line 568
    if-eqz p1, :cond_e

    .line 569
    .line 570
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 571
    .line 572
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object p1

    .line 576
    move-object v3, p1

    .line 577
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 578
    .line 579
    :cond_e
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 580
    .line 581
    .line 582
    move-result p1

    .line 583
    if-eqz p1, :cond_f

    .line 584
    .line 585
    move v0, v1

    .line 586
    :cond_f
    invoke-interface {p0, v3, v0}, Landroid/bluetooth/IBluetooth;->setPairingConfirmation(Landroid/bluetooth/BluetoothDevice;Z)Z

    .line 587
    .line 588
    .line 589
    move-result p1

    .line 590
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 591
    .line 592
    .line 593
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 594
    .line 595
    .line 596
    return v1

    .line 597
    :pswitch_17
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 601
    .line 602
    .line 603
    move-result p1

    .line 604
    if-eqz p1, :cond_10

    .line 605
    .line 606
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 607
    .line 608
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object p1

    .line 612
    move-object v3, p1

    .line 613
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 614
    .line 615
    :cond_10
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 616
    .line 617
    .line 618
    move-result p1

    .line 619
    if-eqz p1, :cond_11

    .line 620
    .line 621
    move v0, v1

    .line 622
    :cond_11
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 623
    .line 624
    .line 625
    move-result p1

    .line 626
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    .line 627
    .line 628
    .line 629
    move-result-object p2

    .line 630
    invoke-interface {p0, v3, v0, p1, p2}, Landroid/bluetooth/IBluetooth;->setPasskey(Landroid/bluetooth/BluetoothDevice;ZI[B)Z

    .line 631
    .line 632
    .line 633
    move-result p1

    .line 634
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 635
    .line 636
    .line 637
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 638
    .line 639
    .line 640
    return v1

    .line 641
    :pswitch_18
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 645
    .line 646
    .line 647
    move-result p1

    .line 648
    if-eqz p1, :cond_12

    .line 649
    .line 650
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 651
    .line 652
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object p1

    .line 656
    move-object v3, p1

    .line 657
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 658
    .line 659
    :cond_12
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 660
    .line 661
    .line 662
    move-result p1

    .line 663
    if-eqz p1, :cond_13

    .line 664
    .line 665
    move v0, v1

    .line 666
    :cond_13
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 667
    .line 668
    .line 669
    move-result p1

    .line 670
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    .line 671
    .line 672
    .line 673
    move-result-object p2

    .line 674
    invoke-interface {p0, v3, v0, p1, p2}, Landroid/bluetooth/IBluetooth;->setPin(Landroid/bluetooth/BluetoothDevice;ZI[B)Z

    .line 675
    .line 676
    .line 677
    move-result p1

    .line 678
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 679
    .line 680
    .line 681
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 682
    .line 683
    .line 684
    return v1

    .line 685
    :pswitch_19
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 689
    .line 690
    .line 691
    move-result p1

    .line 692
    if-eqz p1, :cond_14

    .line 693
    .line 694
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 695
    .line 696
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object p1

    .line 700
    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    .line 701
    .line 702
    goto :goto_3

    .line 703
    :cond_14
    move-object p1, v3

    .line 704
    :goto_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 705
    .line 706
    .line 707
    move-result p4

    .line 708
    if-eqz p4, :cond_15

    .line 709
    .line 710
    sget-object p4, Landroid/os/ParcelUuid;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 711
    .line 712
    invoke-interface {p4, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object p2

    .line 716
    move-object v3, p2

    .line 717
    check-cast v3, Landroid/os/ParcelUuid;

    .line 718
    .line 719
    :cond_15
    invoke-interface {p0, p1, v3}, Landroid/bluetooth/IBluetooth;->sdpSearch(Landroid/bluetooth/BluetoothDevice;Landroid/os/ParcelUuid;)Z

    .line 720
    .line 721
    .line 722
    move-result p1

    .line 723
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 724
    .line 725
    .line 726
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 727
    .line 728
    .line 729
    return v1

    .line 730
    :pswitch_1a
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 734
    .line 735
    .line 736
    move-result p1

    .line 737
    if-eqz p1, :cond_16

    .line 738
    .line 739
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 740
    .line 741
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object p1

    .line 745
    move-object v3, p1

    .line 746
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 747
    .line 748
    :cond_16
    invoke-interface {p0, v3}, Landroid/bluetooth/IBluetooth;->fetchRemoteUuids(Landroid/bluetooth/BluetoothDevice;)Z

    .line 749
    .line 750
    .line 751
    move-result p1

    .line 752
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 753
    .line 754
    .line 755
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 756
    .line 757
    .line 758
    return v1

    .line 759
    :pswitch_1b
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 763
    .line 764
    .line 765
    move-result p1

    .line 766
    if-eqz p1, :cond_17

    .line 767
    .line 768
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 769
    .line 770
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object p1

    .line 774
    move-object v3, p1

    .line 775
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 776
    .line 777
    :cond_17
    invoke-interface {p0, v3}, Landroid/bluetooth/IBluetooth;->getRemoteUuids(Landroid/bluetooth/BluetoothDevice;)[Landroid/os/ParcelUuid;

    .line 778
    .line 779
    .line 780
    move-result-object p1

    .line 781
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 782
    .line 783
    .line 784
    invoke-virtual {p3, p1, v1}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    .line 785
    .line 786
    .line 787
    return v1

    .line 788
    :pswitch_1c
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 792
    .line 793
    .line 794
    move-result p1

    .line 795
    if-eqz p1, :cond_18

    .line 796
    .line 797
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 798
    .line 799
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object p1

    .line 803
    move-object v3, p1

    .line 804
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 805
    .line 806
    :cond_18
    invoke-interface {p0, v3}, Landroid/bluetooth/IBluetooth;->getRemoteClass(Landroid/bluetooth/BluetoothDevice;)I

    .line 807
    .line 808
    .line 809
    move-result p1

    .line 810
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 811
    .line 812
    .line 813
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 814
    .line 815
    .line 816
    return v1

    .line 817
    :pswitch_1d
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 821
    .line 822
    .line 823
    move-result p1

    .line 824
    if-eqz p1, :cond_19

    .line 825
    .line 826
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 827
    .line 828
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object p1

    .line 832
    move-object v3, p1

    .line 833
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 834
    .line 835
    :cond_19
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object p1

    .line 839
    invoke-interface {p0, v3, p1}, Landroid/bluetooth/IBluetooth;->setRemoteAlias(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)Z

    .line 840
    .line 841
    .line 842
    move-result p1

    .line 843
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 844
    .line 845
    .line 846
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 847
    .line 848
    .line 849
    return v1

    .line 850
    :pswitch_1e
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 851
    .line 852
    .line 853
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 854
    .line 855
    .line 856
    move-result p1

    .line 857
    if-eqz p1, :cond_1a

    .line 858
    .line 859
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 860
    .line 861
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object p1

    .line 865
    move-object v3, p1

    .line 866
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 867
    .line 868
    :cond_1a
    invoke-interface {p0, v3}, Landroid/bluetooth/IBluetooth;->getRemoteAlias(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object p1

    .line 872
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 873
    .line 874
    .line 875
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 876
    .line 877
    .line 878
    return v1

    .line 879
    :pswitch_1f
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 883
    .line 884
    .line 885
    move-result p1

    .line 886
    if-eqz p1, :cond_1b

    .line 887
    .line 888
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 889
    .line 890
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object p1

    .line 894
    move-object v3, p1

    .line 895
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 896
    .line 897
    :cond_1b
    invoke-interface {p0, v3}, Landroid/bluetooth/IBluetooth;->getRemoteType(Landroid/bluetooth/BluetoothDevice;)I

    .line 898
    .line 899
    .line 900
    move-result p1

    .line 901
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 902
    .line 903
    .line 904
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 905
    .line 906
    .line 907
    return v1

    .line 908
    :pswitch_20
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 909
    .line 910
    .line 911
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 912
    .line 913
    .line 914
    move-result p1

    .line 915
    if-eqz p1, :cond_1c

    .line 916
    .line 917
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 918
    .line 919
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object p1

    .line 923
    move-object v3, p1

    .line 924
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 925
    .line 926
    :cond_1c
    invoke-interface {p0, v3}, Landroid/bluetooth/IBluetooth;->getRemoteName(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object p1

    .line 930
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 931
    .line 932
    .line 933
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 934
    .line 935
    .line 936
    return v1

    .line 937
    :pswitch_21
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 938
    .line 939
    .line 940
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 941
    .line 942
    .line 943
    move-result p1

    .line 944
    if-eqz p1, :cond_1d

    .line 945
    .line 946
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 947
    .line 948
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object p1

    .line 952
    move-object v3, p1

    .line 953
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 954
    .line 955
    :cond_1d
    invoke-interface {p0, v3}, Landroid/bluetooth/IBluetooth;->getConnectionState(Landroid/bluetooth/BluetoothDevice;)I

    .line 956
    .line 957
    .line 958
    move-result p1

    .line 959
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 960
    .line 961
    .line 962
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 963
    .line 964
    .line 965
    return v1

    .line 966
    :pswitch_22
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 967
    .line 968
    .line 969
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 970
    .line 971
    .line 972
    move-result p1

    .line 973
    if-eqz p1, :cond_1e

    .line 974
    .line 975
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 976
    .line 977
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object p1

    .line 981
    move-object v3, p1

    .line 982
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 983
    .line 984
    :cond_1e
    invoke-interface {p0, v3}, Landroid/bluetooth/IBluetooth;->getBondState(Landroid/bluetooth/BluetoothDevice;)I

    .line 985
    .line 986
    .line 987
    move-result p1

    .line 988
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 989
    .line 990
    .line 991
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 992
    .line 993
    .line 994
    return v1

    .line 995
    :pswitch_23
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 996
    .line 997
    .line 998
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 999
    .line 1000
    .line 1001
    move-result p1

    .line 1002
    if-eqz p1, :cond_1f

    .line 1003
    .line 1004
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1005
    .line 1006
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object p1

    .line 1010
    move-object v3, p1

    .line 1011
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 1012
    .line 1013
    :cond_1f
    invoke-interface {p0, v3}, Landroid/bluetooth/IBluetooth;->removeBond(Landroid/bluetooth/BluetoothDevice;)Z

    .line 1014
    .line 1015
    .line 1016
    move-result p1

    .line 1017
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1021
    .line 1022
    .line 1023
    return v1

    .line 1024
    :pswitch_24
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1028
    .line 1029
    .line 1030
    move-result p1

    .line 1031
    if-eqz p1, :cond_20

    .line 1032
    .line 1033
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1034
    .line 1035
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object p1

    .line 1039
    move-object v3, p1

    .line 1040
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 1041
    .line 1042
    :cond_20
    invoke-interface {p0, v3}, Landroid/bluetooth/IBluetooth;->cancelBondProcess(Landroid/bluetooth/BluetoothDevice;)Z

    .line 1043
    .line 1044
    .line 1045
    move-result p1

    .line 1046
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1050
    .line 1051
    .line 1052
    return v1

    .line 1053
    :pswitch_25
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1057
    .line 1058
    .line 1059
    move-result p1

    .line 1060
    if-eqz p1, :cond_21

    .line 1061
    .line 1062
    sget-object p1, Landroid/bluetooth/BluetoothDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1063
    .line 1064
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object p1

    .line 1068
    move-object v3, p1

    .line 1069
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 1070
    .line 1071
    :cond_21
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1072
    .line 1073
    .line 1074
    move-result p1

    .line 1075
    invoke-interface {p0, v3, p1}, Landroid/bluetooth/IBluetooth;->createBond(Landroid/bluetooth/BluetoothDevice;I)Z

    .line 1076
    .line 1077
    .line 1078
    move-result p1

    .line 1079
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1083
    .line 1084
    .line 1085
    return v1

    .line 1086
    :pswitch_26
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1087
    .line 1088
    .line 1089
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->getBondedDevices()[Landroid/bluetooth/BluetoothDevice;

    .line 1090
    .line 1091
    .line 1092
    move-result-object p1

    .line 1093
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {p3, p1, v1}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    .line 1097
    .line 1098
    .line 1099
    return v1

    .line 1100
    :pswitch_27
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1104
    .line 1105
    .line 1106
    move-result p1

    .line 1107
    invoke-interface {p0, p1}, Landroid/bluetooth/IBluetooth;->getProfileConnectionState(I)I

    .line 1108
    .line 1109
    .line 1110
    move-result p1

    .line 1111
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1115
    .line 1116
    .line 1117
    return v1

    .line 1118
    :pswitch_28
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1119
    .line 1120
    .line 1121
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->getAdapterConnectionState()I

    .line 1122
    .line 1123
    .line 1124
    move-result p1

    .line 1125
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1129
    .line 1130
    .line 1131
    return v1

    .line 1132
    :pswitch_29
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1133
    .line 1134
    .line 1135
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->isDiscovering()Z

    .line 1136
    .line 1137
    .line 1138
    move-result p1

    .line 1139
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1143
    .line 1144
    .line 1145
    return v1

    .line 1146
    :pswitch_2a
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1147
    .line 1148
    .line 1149
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->cancelDiscovery()Z

    .line 1150
    .line 1151
    .line 1152
    move-result p1

    .line 1153
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1157
    .line 1158
    .line 1159
    return v1

    .line 1160
    :pswitch_2b
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1161
    .line 1162
    .line 1163
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->startDiscovery()Z

    .line 1164
    .line 1165
    .line 1166
    move-result p1

    .line 1167
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1171
    .line 1172
    .line 1173
    return v1

    .line 1174
    :pswitch_2c
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1178
    .line 1179
    .line 1180
    move-result p1

    .line 1181
    invoke-interface {p0, p1}, Landroid/bluetooth/IBluetooth;->setDiscoverableTimeout(I)Z

    .line 1182
    .line 1183
    .line 1184
    move-result p1

    .line 1185
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1186
    .line 1187
    .line 1188
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1189
    .line 1190
    .line 1191
    return v1

    .line 1192
    :pswitch_2d
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1193
    .line 1194
    .line 1195
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->getDiscoverableTimeout()I

    .line 1196
    .line 1197
    .line 1198
    move-result p1

    .line 1199
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1203
    .line 1204
    .line 1205
    return v1

    .line 1206
    :pswitch_2e
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1210
    .line 1211
    .line 1212
    move-result p1

    .line 1213
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 1214
    .line 1215
    .line 1216
    move-result p2

    .line 1217
    invoke-interface {p0, p1, p2}, Landroid/bluetooth/IBluetooth;->setScanMode(II)Z

    .line 1218
    .line 1219
    .line 1220
    move-result p1

    .line 1221
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1225
    .line 1226
    .line 1227
    return v1

    .line 1228
    :pswitch_2f
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1229
    .line 1230
    .line 1231
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->getScanMode()I

    .line 1232
    .line 1233
    .line 1234
    move-result p1

    .line 1235
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1239
    .line 1240
    .line 1241
    return v1

    .line 1242
    :pswitch_30
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1243
    .line 1244
    .line 1245
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->getName()Ljava/lang/String;

    .line 1246
    .line 1247
    .line 1248
    move-result-object p1

    .line 1249
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1253
    .line 1254
    .line 1255
    return v1

    .line 1256
    :pswitch_31
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object p1

    .line 1263
    invoke-interface {p0, p1}, Landroid/bluetooth/IBluetooth;->setName(Ljava/lang/String;)Z

    .line 1264
    .line 1265
    .line 1266
    move-result p1

    .line 1267
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1271
    .line 1272
    .line 1273
    return v1

    .line 1274
    :pswitch_32
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1275
    .line 1276
    .line 1277
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->getUuids()[Landroid/os/ParcelUuid;

    .line 1278
    .line 1279
    .line 1280
    move-result-object p1

    .line 1281
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {p3, p1, v1}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    .line 1285
    .line 1286
    .line 1287
    return v1

    .line 1288
    :pswitch_33
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1289
    .line 1290
    .line 1291
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->getAddress()Ljava/lang/String;

    .line 1292
    .line 1293
    .line 1294
    move-result-object p1

    .line 1295
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1299
    .line 1300
    .line 1301
    return v1

    .line 1302
    :pswitch_34
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1303
    .line 1304
    .line 1305
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->disable()Z

    .line 1306
    .line 1307
    .line 1308
    move-result p1

    .line 1309
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1310
    .line 1311
    .line 1312
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1313
    .line 1314
    .line 1315
    return v1

    .line 1316
    :pswitch_35
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1317
    .line 1318
    .line 1319
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->enableNoAutoConnect()Z

    .line 1320
    .line 1321
    .line 1322
    move-result p1

    .line 1323
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1324
    .line 1325
    .line 1326
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1327
    .line 1328
    .line 1329
    return v1

    .line 1330
    :pswitch_36
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1331
    .line 1332
    .line 1333
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->enable()Z

    .line 1334
    .line 1335
    .line 1336
    move-result p1

    .line 1337
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1338
    .line 1339
    .line 1340
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1341
    .line 1342
    .line 1343
    return v1

    .line 1344
    :pswitch_37
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1345
    .line 1346
    .line 1347
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->getState()I

    .line 1348
    .line 1349
    .line 1350
    move-result p1

    .line 1351
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1355
    .line 1356
    .line 1357
    return v1

    .line 1358
    :pswitch_38
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 1359
    .line 1360
    .line 1361
    invoke-interface {p0}, Landroid/bluetooth/IBluetooth;->isEnabled()Z

    .line 1362
    .line 1363
    .line 1364
    move-result p1

    .line 1365
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1366
    .line 1367
    .line 1368
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1369
    .line 1370
    .line 1371
    return v1

    .line 1372
    :cond_22
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1373
    .line 1374
    .line 1375
    return v1

    .line 1376
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
