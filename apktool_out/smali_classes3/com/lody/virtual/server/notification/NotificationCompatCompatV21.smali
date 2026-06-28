.class Lcom/lody/virtual/server/notification/NotificationCompatCompatV21;
.super Lcom/lody/virtual/server/notification/NotificationCompatCompatV14;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "NotificationCompatCompatV21"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/server/notification/NotificationCompatCompatV14;-><init>()V

    return-void
.end method

.method private fixApplicationInfo(Landroid/widget/RemoteViews;Landroid/content/pm/ApplicationInfo;)V
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, Lmirror/android/widget/RemoteViews;->mApplication:Lmirror/RefObject;

    invoke-virtual {v0, p1, p2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private getApplicationInfo(Landroid/app/Notification;)Landroid/content/pm/ApplicationInfo;
    .locals 1

    .line 1
    iget-object v0, p1, Landroid/app/Notification;->tickerView:Landroid/widget/RemoteViews;

    invoke-direct {p0, v0}, Lcom/lody/virtual/server/notification/NotificationCompatCompatV21;->getApplicationInfo(Landroid/widget/RemoteViews;)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    invoke-direct {p0, v0}, Lcom/lody/virtual/server/notification/NotificationCompatCompatV21;->getApplicationInfo(Landroid/widget/RemoteViews;)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    .line 3
    :cond_1
    iget-object v0, p1, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    invoke-direct {p0, v0}, Lcom/lody/virtual/server/notification/NotificationCompatCompatV21;->getApplicationInfo(Landroid/widget/RemoteViews;)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v0

    .line 4
    :cond_2
    iget-object p1, p1, Landroid/app/Notification;->headsUpContentView:Landroid/widget/RemoteViews;

    invoke-direct {p0, p1}, Lcom/lody/virtual/server/notification/NotificationCompatCompatV21;->getApplicationInfo(Landroid/widget/RemoteViews;)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    if-eqz p1, :cond_3

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method private getApplicationInfo(Landroid/widget/RemoteViews;)Landroid/content/pm/ApplicationInfo;
    .locals 1

    if-eqz p1, :cond_0

    .line 5
    sget-object v0, Lmirror/android/widget/RemoteViews;->mApplication:Lmirror/RefObject;

    invoke-virtual {v0, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ApplicationInfo;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private getOutSidePackageInfo(Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, p1, v1}, Lcom/lody/virtual/client/core/VirtualCore;->getOutSidePackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private resolveRemoteViews(Landroid/content/Context;ILjava/lang/String;Landroid/app/Notification;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p4, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/lody/virtual/server/notification/NotificationCompat;->getHostContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/notification/NotificationCompatCompatV21;->getOutSidePackageInfo(Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/16 v4, 0x400

    .line 22
    .line 23
    invoke-virtual {v3, p3, v4, v0}, Lcom/lody/virtual/client/ipc/VPackageManager;->getPackageInfo(Ljava/lang/String;II)Landroid/content/pm/PackageInfo;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    const/4 v3, 0x1

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget v4, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 31
    .line 32
    iget v5, p3, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 33
    .line 34
    if-ne v4, v5, :cond_1

    .line 35
    .line 36
    move v0, v3

    .line 37
    :cond_1
    invoke-virtual {p0}, Lcom/lody/virtual/server/notification/NotificationCompat;->getNotificationFixer()Lcom/lody/virtual/server/notification/NotificationFixer;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4, p1, p4}, Lcom/lody/virtual/server/notification/NotificationFixer;->fixNotificationRemoteViews(Landroid/content/Context;Landroid/app/Notification;)V

    .line 42
    .line 43
    .line 44
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/lody/virtual/server/notification/NotificationCompat;->getNotificationFixer()Lcom/lody/virtual/server/notification/NotificationFixer;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {p4}, Landroid/app/Notification;->getSmallIcon()Landroid/graphics/drawable/Icon;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-virtual {v5, v6, p1, v0}, Lcom/lody/virtual/server/notification/NotificationFixer;->fixIcon(Landroid/graphics/drawable/Icon;Landroid/content/Context;Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/lody/virtual/server/notification/NotificationCompat;->getNotificationFixer()Lcom/lody/virtual/server/notification/NotificationFixer;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {p4}, Landroid/app/Notification;->getLargeIcon()Landroid/graphics/drawable/Icon;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {v5, v6, p1, v0}, Lcom/lody/virtual/server/notification/NotificationFixer;->fixIcon(Landroid/graphics/drawable/Icon;Landroid/content/Context;Z)V

    .line 66
    .line 67
    .line 68
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 69
    .line 70
    iput v1, p4, Landroid/app/Notification;->icon:I

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    iget-object p3, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    iget-object p3, p3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 78
    .line 79
    :goto_0
    const/16 v1, 0x16

    .line 80
    .line 81
    iput v1, p3, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 82
    .line 83
    iget-object v1, p4, Landroid/app/Notification;->tickerView:Landroid/widget/RemoteViews;

    .line 84
    .line 85
    invoke-direct {p0, v1, p3}, Lcom/lody/virtual/server/notification/NotificationCompatCompatV21;->fixApplicationInfo(Landroid/widget/RemoteViews;Landroid/content/pm/ApplicationInfo;)V

    .line 86
    .line 87
    .line 88
    iget-object v1, p4, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 89
    .line 90
    invoke-direct {p0, v1, p3}, Lcom/lody/virtual/server/notification/NotificationCompatCompatV21;->fixApplicationInfo(Landroid/widget/RemoteViews;Landroid/content/pm/ApplicationInfo;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, p4, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    .line 94
    .line 95
    invoke-direct {p0, v1, p3}, Lcom/lody/virtual/server/notification/NotificationCompatCompatV21;->fixApplicationInfo(Landroid/widget/RemoteViews;Landroid/content/pm/ApplicationInfo;)V

    .line 96
    .line 97
    .line 98
    iget-object v1, p4, Landroid/app/Notification;->headsUpContentView:Landroid/widget/RemoteViews;

    .line 99
    .line 100
    invoke-direct {p0, v1, p3}, Lcom/lody/virtual/server/notification/NotificationCompatCompatV21;->fixApplicationInfo(Landroid/widget/RemoteViews;Landroid/content/pm/ApplicationInfo;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p4}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    const-string v2, "extras"

    .line 108
    .line 109
    invoke-virtual {v1, v2}, Lcom/lody/virtual/helper/utils/Reflect;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Landroid/os/Bundle;

    .line 114
    .line 115
    if-eqz v1, :cond_3

    .line 116
    .line 117
    const-string v2, "android.appInfo"

    .line 118
    .line 119
    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 120
    .line 121
    .line 122
    :cond_3
    const/16 p3, 0x1a

    .line 123
    .line 124
    if-lt v4, p3, :cond_4

    .line 125
    .line 126
    if-nez v0, :cond_4

    .line 127
    .line 128
    invoke-virtual {p0, p2, p4, p1}, Lcom/lody/virtual/server/notification/NotificationCompatCompatV14;->remakeRemoteViews(ILandroid/app/Notification;Landroid/content/Context;)V

    .line 129
    .line 130
    .line 131
    :cond_4
    return v3
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


# virtual methods
.method public dealNotification(ILandroid/app/Notification;Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-virtual {p0, p3}, Lcom/lody/virtual/server/notification/NotificationCompatCompatV14;->getAppContext(Ljava/lang/String;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v2, 0x1a

    .line 8
    .line 9
    if-lt v1, v2, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lcom/lody/virtual/client/core/VirtualCore;->getTargetSdkVersion()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-lt v1, v2, :cond_0

    .line 20
    .line 21
    invoke-static {p2}, Landroidx/core/app/a1;->a(Landroid/app/Notification;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    sget-object v1, Lmirror/android/app/NotificationO;->mChannelId:Lmirror/RefObject;

    .line 32
    .line 33
    sget-object v2, Lcom/lody/virtual/helper/compat/NotificationChannelCompat;->DEFAULT_ID:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v1, p2, v2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_0
    const/4 v1, 0x0

    .line 39
    :try_start_0
    invoke-direct {p0, v0, p1, p3, p2}, Lcom/lody/virtual/server/notification/NotificationCompatCompatV21;->resolveRemoteViews(Landroid/content/Context;ILjava/lang/String;Landroid/app/Notification;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    iget-object p2, p2, Landroid/app/Notification;->publicVersion:Landroid/app/Notification;

    .line 46
    .line 47
    invoke-direct {p0, v0, p1, p3, p2}, Lcom/lody/virtual/server/notification/NotificationCompatCompatV21;->resolveRemoteViews(Landroid/content/Context;ILjava/lang/String;Landroid/app/Notification;)Z

    .line 48
    .line 49
    .line 50
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    :cond_1
    const/4 v1, 0x1

    .line 54
    :cond_2
    return v1

    .line 55
    :catchall_0
    sget-object p1, Lcom/lody/virtual/server/notification/NotificationCompatCompatV21;->TAG:Ljava/lang/String;

    .line 56
    .line 57
    const-string p2, "error deal Notification!"

    .line 58
    .line 59
    invoke-static {p1, p2}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return v1
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method
