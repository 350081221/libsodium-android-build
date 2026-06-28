.class public abstract Lcom/bytedance/pangle/c$a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/pangle/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/pangle/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/pangle/c$a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "com.bytedance.pangle.IPackageManager"

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
.end method

.method public static a()Lcom/bytedance/pangle/c;
    .locals 1

    .line 5
    sget-object v0, Lcom/bytedance/pangle/c$a$a;->a:Lcom/bytedance/pangle/c;

    return-object v0
.end method

.method public static a(Landroid/os/IBinder;)Lcom/bytedance/pangle/c;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.bytedance.pangle.IPackageManager"

    .line 1
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    instance-of v1, v0, Lcom/bytedance/pangle/c;

    if-eqz v1, :cond_1

    .line 3
    check-cast v0, Lcom/bytedance/pangle/c;

    return-object v0

    .line 4
    :cond_1
    new-instance v0, Lcom/bytedance/pangle/c$a$a;

    invoke-direct {v0, p0}, Lcom/bytedance/pangle/c$a$a;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "com.bytedance.pangle.IPackageManager"

    .line 3
    .line 4
    if-eq p1, v0, :cond_7

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-eq p1, v2, :cond_6

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    if-eq p1, v2, :cond_5

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    if-eq p1, v2, :cond_2

    .line 14
    .line 15
    const/4 v2, 0x5

    .line 16
    if-eq p1, v2, :cond_1

    .line 17
    .line 18
    const v2, 0x5f4e5446

    .line 19
    .line 20
    .line 21
    if-eq p1, v2, :cond_0

    .line 22
    .line 23
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_0
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return v0

    .line 32
    :cond_1
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-interface {p0, p1}, Lcom/bytedance/pangle/c;->a(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 43
    .line 44
    .line 45
    return v0

    .line 46
    :cond_2
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    if-nez p2, :cond_3

    .line 58
    .line 59
    const/4 p2, 0x0

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    const-string p4, "com.bytedance.pangle.IPluginInstallListener"

    .line 62
    .line 63
    invoke-interface {p2, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    if-eqz p4, :cond_4

    .line 68
    .line 69
    instance-of v1, p4, Lcom/bytedance/pangle/d;

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    move-object p2, p4

    .line 74
    check-cast p2, Lcom/bytedance/pangle/d;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    new-instance p4, Lcom/bytedance/pangle/d$a$a;

    .line 78
    .line 79
    invoke-direct {p4, p2}, Lcom/bytedance/pangle/d$a$a;-><init>(Landroid/os/IBinder;)V

    .line 80
    .line 81
    .line 82
    move-object p2, p4

    .line 83
    :goto_0
    invoke-interface {p0, p1, p2}, Lcom/bytedance/pangle/c;->a(ILcom/bytedance/pangle/d;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 87
    .line 88
    .line 89
    return v0

    .line 90
    :cond_5
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-interface {p0, p1, p2}, Lcom/bytedance/pangle/c;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 109
    .line 110
    .line 111
    return v0

    .line 112
    :cond_6
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-interface {p0, p1}, Lcom/bytedance/pangle/c;->b(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 127
    .line 128
    .line 129
    return v0

    .line 130
    :cond_7
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-interface {p0, p1}, Lcom/bytedance/pangle/c;->a(Ljava/lang/String;)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 145
    .line 146
    .line 147
    return v0
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
.end method
