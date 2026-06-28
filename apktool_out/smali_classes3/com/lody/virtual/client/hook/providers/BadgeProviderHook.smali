.class public Lcom/lody/virtual/client/hook/providers/BadgeProviderHook;
.super Lcom/lody/virtual/client/hook/providers/ExternalProviderHook;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/os/IInterface;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/providers/ExternalProviderHook;-><init>(Landroid/os/IInterface;)V

    return-void
.end method


# virtual methods
.method public call(Lcom/lody/virtual/client/hook/base/MethodBox;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/reflect/InvocationTargetException;
        }
    .end annotation

    .line 1
    const-string v0, "change_badge"

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const-string v2, "success"

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance p1, Lcom/lody/virtual/remote/BadgerInfo;

    .line 13
    .line 14
    invoke-direct {p1}, Lcom/lody/virtual/remote/BadgerInfo;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iput p2, p1, Lcom/lody/virtual/remote/BadgerInfo;->userId:I

    .line 22
    .line 23
    const-string p2, "package"

    .line 24
    .line 25
    invoke-virtual {p4, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iput-object p2, p1, Lcom/lody/virtual/remote/BadgerInfo;->packageName:Ljava/lang/String;

    .line 30
    .line 31
    const-string p2, "class"

    .line 32
    .line 33
    invoke-virtual {p4, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iput-object p2, p1, Lcom/lody/virtual/remote/BadgerInfo;->className:Ljava/lang/String;

    .line 38
    .line 39
    const-string p2, "badgenumber"

    .line 40
    .line 41
    invoke-virtual {p4, p2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    iput p2, p1, Lcom/lody/virtual/remote/BadgerInfo;->badgerCount:I

    .line 46
    .line 47
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p2, p1}, Lcom/lody/virtual/client/ipc/VActivityManager;->notifyBadgerChange(Lcom/lody/virtual/remote/BadgerInfo;)V

    .line 52
    .line 53
    .line 54
    new-instance p1, Landroid/os/Bundle;

    .line 55
    .line 56
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_0
    const-string v0, "setAppBadgeCount"

    .line 64
    .line 65
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    new-instance v0, Lcom/lody/virtual/remote/BadgerInfo;

    .line 72
    .line 73
    invoke-direct {v0}, Lcom/lody/virtual/remote/BadgerInfo;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    iput v3, v0, Lcom/lody/virtual/remote/BadgerInfo;->userId:I

    .line 81
    .line 82
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v3}, Lcom/lody/virtual/client/VClient;->getCurrentPackage()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    iput-object v3, v0, Lcom/lody/virtual/remote/BadgerInfo;->packageName:Ljava/lang/String;

    .line 91
    .line 92
    const-string v3, "app_badge_count"

    .line 93
    .line 94
    invoke-virtual {p4, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    iput v3, v0, Lcom/lody/virtual/remote/BadgerInfo;->badgerCount:I

    .line 99
    .line 100
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v3, v0}, Lcom/lody/virtual/client/ipc/VActivityManager;->notifyBadgerChange(Lcom/lody/virtual/remote/BadgerInfo;)V

    .line 105
    .line 106
    .line 107
    new-instance v0, Landroid/os/Bundle;

    .line 108
    .line 109
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 113
    .line 114
    .line 115
    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/lody/virtual/client/hook/providers/ProviderHook;->call(Lcom/lody/virtual/client/hook/base/MethodBox;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    return-object p1
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
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
