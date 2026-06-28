.class public abstract Lcom/tendcloud/tenddata/by$a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/by;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/by;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "com.hihonor.cloudservice.oaid.IOAIDCallBack"

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


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 11

    .line 1
    const-string v0, "com.hihonor.cloudservice.oaid.IOAIDCallBack"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne p1, v1, :cond_1

    .line 5
    .line 6
    const-string p1, "transact first"

    .line 7
    .line 8
    filled-new-array {p1}, [Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    move v6, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    move v6, p1

    .line 36
    :goto_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readFloat()F

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    invoke-virtual {p2}, Landroid/os/Parcel;->readDouble()D

    .line 41
    .line 42
    .line 43
    move-result-wide v8

    .line 44
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    move-object v2, p0

    .line 49
    invoke-interface/range {v2 .. v10}, Lcom/tendcloud/tenddata/by;->callback(IJZFDLjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    const/4 v2, 0x2

    .line 54
    if-eq p1, v2, :cond_3

    .line 55
    .line 56
    const-string v2, "transact !2"

    .line 57
    .line 58
    filled-new-array {v2}, [Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v2}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const v2, 0x5f4e5446

    .line 66
    .line 67
    .line 68
    if-eq p1, v2, :cond_2

    .line 69
    .line 70
    const-string v0, "transact !transaction"

    .line 71
    .line 72
    filled-new-array {v0}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    return p1

    .line 84
    :cond_2
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return v1

    .line 88
    :cond_3
    const-string p1, "transact else"

    .line 89
    .line 90
    filled-new-array {p1}, [Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 105
    .line 106
    .line 107
    move-result p4

    .line 108
    if-eqz p4, :cond_4

    .line 109
    .line 110
    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 111
    .line 112
    invoke-interface {p4, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    check-cast p2, Landroid/os/Bundle;

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    const/4 p2, 0x0

    .line 120
    :goto_1
    invoke-interface {p0, p1, p2}, Lcom/tendcloud/tenddata/by;->callback(ILandroid/os/Bundle;)V

    .line 121
    .line 122
    .line 123
    :goto_2
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 124
    .line 125
    .line 126
    return v1
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
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
