.class public abstract Lcom/lody/virtual/server/interfaces/IJobService$Stub;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/server/interfaces/IJobService;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/interfaces/IJobService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/server/interfaces/IJobService$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "com.lody.virtual.server.interfaces.IJobService"

.field static final TRANSACTION_cancel:I = 0x2

.field static final TRANSACTION_cancelAll:I = 0x3

.field static final TRANSACTION_enqueue:I = 0x6

.field static final TRANSACTION_getAllPendingJobs:I = 0x4

.field static final TRANSACTION_getPendingJob:I = 0x5

.field static final TRANSACTION_schedule:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "com.lody.virtual.server.interfaces.IJobService"

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

.method public static asInterface(Landroid/os/IBinder;)Lcom/lody/virtual/server/interfaces/IJobService;
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
    const-string v0, "com.lody.virtual.server.interfaces.IJobService"

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
    instance-of v1, v0, Lcom/lody/virtual/server/interfaces/IJobService;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast v0, Lcom/lody/virtual/server/interfaces/IJobService;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    new-instance v0, Lcom/lody/virtual/server/interfaces/IJobService$Stub$Proxy;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lcom/lody/virtual/server/interfaces/IJobService$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    .line 23
    .line 24
    .line 25
    return-object v0
    .line 26
    .line 27
.end method

.method public static getDefaultImpl()Lcom/lody/virtual/server/interfaces/IJobService;
    .locals 1

    sget-object v0, Lcom/lody/virtual/server/interfaces/IJobService$Stub$Proxy;->sDefaultImpl:Lcom/lody/virtual/server/interfaces/IJobService;

    return-object v0
.end method

.method public static setDefaultImpl(Lcom/lody/virtual/server/interfaces/IJobService;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/lody/virtual/server/interfaces/IJobService$Stub$Proxy;->sDefaultImpl:Lcom/lody/virtual/server/interfaces/IJobService;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sput-object p0, Lcom/lody/virtual/server/interfaces/IJobService$Stub$Proxy;->sDefaultImpl:Lcom/lody/virtual/server/interfaces/IJobService;

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
    const-string v2, "com.lody.virtual.server.interfaces.IJobService"

    .line 6
    .line 7
    if-eq p1, v0, :cond_4

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
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    if-eqz p4, :cond_0

    .line 30
    .line 31
    sget-object p4, Landroid/app/job/JobInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 32
    .line 33
    invoke-interface {p4, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p4

    .line 37
    check-cast p4, Landroid/app/job/JobInfo;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object p4, v0

    .line 41
    :goto_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    sget-object v0, Lcom/lody/virtual/remote/VJobWorkItem;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 48
    .line 49
    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    move-object v0, p2

    .line 54
    check-cast v0, Lcom/lody/virtual/remote/VJobWorkItem;

    .line 55
    .line 56
    :cond_1
    invoke-interface {p0, p1, p4, v0}, Lcom/lody/virtual/server/interfaces/IJobService;->enqueue(ILandroid/app/job/JobInfo;Lcom/lody/virtual/remote/VJobWorkItem;)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 64
    .line 65
    .line 66
    return v1

    .line 67
    :pswitch_1
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    invoke-interface {p0, p1, p2}, Lcom/lody/virtual/server/interfaces/IJobService;->getPendingJob(II)Landroid/app/job/JobInfo;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 83
    .line 84
    .line 85
    if-eqz p1, :cond_2

    .line 86
    .line 87
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p3, v1}, Landroid/app/job/JobInfo;->writeToParcel(Landroid/os/Parcel;I)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    const/4 p1, 0x0

    .line 95
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 96
    .line 97
    .line 98
    :goto_1
    return v1

    .line 99
    :pswitch_2
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-interface {p0, p1}, Lcom/lody/virtual/server/interfaces/IJobService;->getAllPendingJobs(I)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    return v1

    .line 117
    :pswitch_3
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-interface {p0, p1}, Lcom/lody/virtual/server/interfaces/IJobService;->cancelAll(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 128
    .line 129
    .line 130
    return v1

    .line 131
    :pswitch_4
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    invoke-interface {p0, p1, p2}, Lcom/lody/virtual/server/interfaces/IJobService;->cancel(II)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 146
    .line 147
    .line 148
    return v1

    .line 149
    :pswitch_5
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 157
    .line 158
    .line 159
    move-result p4

    .line 160
    if-eqz p4, :cond_3

    .line 161
    .line 162
    sget-object p4, Landroid/app/job/JobInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 163
    .line 164
    invoke-interface {p4, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    move-object v0, p2

    .line 169
    check-cast v0, Landroid/app/job/JobInfo;

    .line 170
    .line 171
    :cond_3
    invoke-interface {p0, p1, v0}, Lcom/lody/virtual/server/interfaces/IJobService;->schedule(ILandroid/app/job/JobInfo;)I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 179
    .line 180
    .line 181
    return v1

    .line 182
    :cond_4
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return v1

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
