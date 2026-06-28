.class public abstract Lcom/lody/virtual/IExtHelperInterface$Stub;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/IExtHelperInterface;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/IExtHelperInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/IExtHelperInterface$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "com.lody.virtual.IExtHelperInterface"

.field static final TRANSACTION_cleanPackageData:I = 0x2

.field static final TRANSACTION_forceStop:I = 0x3

.field static final TRANSACTION_getRecentTasks:I = 0x5

.field static final TRANSACTION_getRunningAppProcesses:I = 0x6

.field static final TRANSACTION_getRunningTasks:I = 0x4

.field static final TRANSACTION_isExternalStorageManager:I = 0x7

.field static final TRANSACTION_startActivity:I = 0x8

.field static final TRANSACTION_syncPackages:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "com.lody.virtual.IExtHelperInterface"

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
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/lody/virtual/IExtHelperInterface;
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
    const-string v0, "com.lody.virtual.IExtHelperInterface"

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
    instance-of v1, v0, Lcom/lody/virtual/IExtHelperInterface;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast v0, Lcom/lody/virtual/IExtHelperInterface;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    new-instance v0, Lcom/lody/virtual/IExtHelperInterface$Stub$Proxy;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lcom/lody/virtual/IExtHelperInterface$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    .line 23
    .line 24
    .line 25
    return-object v0
    .line 26
    .line 27
.end method

.method public static getDefaultImpl()Lcom/lody/virtual/IExtHelperInterface;
    .locals 1

    sget-object v0, Lcom/lody/virtual/IExtHelperInterface$Stub$Proxy;->sDefaultImpl:Lcom/lody/virtual/IExtHelperInterface;

    return-object v0
.end method

.method public static setDefaultImpl(Lcom/lody/virtual/IExtHelperInterface;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/lody/virtual/IExtHelperInterface$Stub$Proxy;->sDefaultImpl:Lcom/lody/virtual/IExtHelperInterface;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sput-object p0, Lcom/lody/virtual/IExtHelperInterface$Stub$Proxy;->sDefaultImpl:Lcom/lody/virtual/IExtHelperInterface;

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
    const-string v2, "com.lody.virtual.IExtHelperInterface"

    .line 6
    .line 7
    if-eq p1, v0, :cond_2

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :pswitch_0
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 p4, 0x0

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    sget-object p1, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 28
    .line 29
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Landroid/content/Intent;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object p1, p4

    .line 37
    :goto_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 44
    .line 45
    invoke-interface {p4, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    move-object p4, p2

    .line 50
    check-cast p4, Landroid/os/Bundle;

    .line 51
    .line 52
    :cond_1
    invoke-interface {p0, p1, p4}, Lcom/lody/virtual/IExtHelperInterface;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 56
    .line 57
    .line 58
    return v1

    .line 59
    :pswitch_1
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p0}, Lcom/lody/virtual/IExtHelperInterface;->isExternalStorageManager()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 70
    .line 71
    .line 72
    return v1

    .line 73
    :pswitch_2
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p0}, Lcom/lody/virtual/IExtHelperInterface;->getRunningAppProcesses()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    return v1

    .line 87
    :pswitch_3
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    invoke-interface {p0, p1, p2}, Lcom/lody/virtual/IExtHelperInterface;->getRecentTasks(II)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 106
    .line 107
    .line 108
    return v1

    .line 109
    :pswitch_4
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    invoke-interface {p0, p1}, Lcom/lody/virtual/IExtHelperInterface;->getRunningTasks(I)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 124
    .line 125
    .line 126
    return v1

    .line 127
    :pswitch_5
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2}, Landroid/os/Parcel;->createIntArray()[I

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-interface {p0, p1}, Lcom/lody/virtual/IExtHelperInterface;->forceStop([I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 138
    .line 139
    .line 140
    return v1

    .line 141
    :pswitch_6
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2}, Landroid/os/Parcel;->createIntArray()[I

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-interface {p0, p1, p2}, Lcom/lody/virtual/IExtHelperInterface;->cleanPackageData([ILjava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 156
    .line 157
    .line 158
    return v1

    .line 159
    :pswitch_7
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-interface {p0}, Lcom/lody/virtual/IExtHelperInterface;->syncPackages()I

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 170
    .line 171
    .line 172
    return v1

    .line 173
    :cond_2
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return v1

    .line 177
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method
