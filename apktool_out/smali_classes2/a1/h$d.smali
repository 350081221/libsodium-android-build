.class public La1/h$d;
.super Lcom/alipay/android/app/IRemoteServiceCallback$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:La1/h;


# direct methods
.method public constructor <init>(La1/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, La1/h$d;->a:La1/h;

    invoke-direct {p0}, Lcom/alipay/android/app/IRemoteServiceCallback$Stub;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La1/h;La1/h$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, La1/h$d;-><init>(La1/h;)V

    return-void
.end method


# virtual methods
.method public getVersion()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x4

    return v0
.end method

.method public isHideLoadingScreen()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public payEnd(ZLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method public r03(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object p3, p0, La1/h$d;->a:La1/h;

    .line 2
    .line 3
    invoke-static {p3}, La1/h;->h(La1/h;)Ly0/a;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    const-string/jumbo v0, "wlt"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0, p1, p2}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string p1, "ActivityStartSuccess"

    .line 14
    .line 15
    invoke-static {p2, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, La1/h$d;->a:La1/h;

    .line 22
    .line 23
    invoke-static {p1}, La1/h;->n(La1/h;)La1/h$f;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, La1/h$d;->a:La1/h;

    .line 30
    .line 31
    invoke-static {p1}, La1/h;->n(La1/h;)La1/h$f;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1}, La1/h$f;->a()V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object p1, p0, La1/h$d;->a:La1/h;

    .line 39
    .line 40
    invoke-static {p1}, La1/h;->h(La1/h;)Ly0/a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    iget-object p1, p0, La1/h$d;->a:La1/h;

    .line 47
    .line 48
    invoke-static {p1}, La1/h;->h(La1/h;)Ly0/a;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/4 p2, 0x1

    .line 53
    invoke-virtual {p1, p2}, Ly0/a;->o(Z)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public startActivity(Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    const-string/jumbo v0, "|"

    .line 2
    .line 3
    .line 4
    const-string v1, "biz"

    .line 5
    .line 6
    new-instance v2, Landroid/content/Intent;

    .line 7
    .line 8
    const-string v3, "android.intent.action.MAIN"

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 12
    .line 13
    .line 14
    if-nez p4, :cond_0

    .line 15
    .line 16
    new-instance p4, Landroid/os/Bundle;

    .line 17
    .line 18
    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    .line 19
    .line 20
    .line 21
    :cond_0
    :try_start_0
    const-string v3, "CallingPid"

    .line 22
    .line 23
    invoke-virtual {p4, v3, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, p4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p3

    .line 31
    iget-object p4, p0, La1/h$d;->a:La1/h;

    .line 32
    .line 33
    invoke-static {p4}, La1/h;->h(La1/h;)Ly0/a;

    .line 34
    .line 35
    .line 36
    move-result-object p4

    .line 37
    const-string v3, "ErrIntentEx"

    .line 38
    .line 39
    invoke-static {p4, v1, v3, p3}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {v2, p1, p2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    :try_start_1
    new-instance p1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 46
    .line 47
    invoke-direct {p1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, La1/h$d;->a:La1/h;

    .line 54
    .line 55
    invoke-static {p2}, La1/h;->h(La1/h;)Ly0/a;

    .line 56
    .line 57
    .line 58
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    const-string p3, "isFg"

    .line 60
    .line 61
    :try_start_2
    new-instance p4, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    iget-object v3, p1, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget p1, p1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 75
    .line 76
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {p2, v1, p3, p1}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    .line 88
    .line 89
    :catchall_0
    :try_start_3
    iget-object p1, p0, La1/h$d;->a:La1/h;

    .line 90
    .line 91
    invoke-static {p1}, La1/h;->l(La1/h;)Landroid/app/Activity;

    .line 92
    .line 93
    .line 94
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 95
    const-string p2, ""

    .line 96
    .line 97
    if-eqz p1, :cond_1

    .line 98
    .line 99
    :try_start_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 100
    .line 101
    .line 102
    move-result-wide p3

    .line 103
    iget-object p1, p0, La1/h$d;->a:La1/h;

    .line 104
    .line 105
    invoke-static {p1}, La1/h;->l(La1/h;)Landroid/app/Activity;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 110
    .line 111
    .line 112
    iget-object p1, p0, La1/h$d;->a:La1/h;

    .line 113
    .line 114
    invoke-static {p1}, La1/h;->h(La1/h;)Ly0/a;

    .line 115
    .line 116
    .line 117
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 118
    const-string v0, "stAct2"

    .line 119
    .line 120
    :try_start_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 129
    .line 130
    .line 131
    move-result-wide v3

    .line 132
    sub-long/2addr v3, p3

    .line 133
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-static {p1, v1, v0, p2}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_1
    iget-object p1, p0, La1/h$d;->a:La1/h;

    .line 145
    .line 146
    invoke-static {p1}, La1/h;->h(La1/h;)Ly0/a;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    const-string p3, "ErrActNull"

    .line 151
    .line 152
    invoke-static {p1, v1, p3, p2}, Li0/a;->i(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-object p1, p0, La1/h$d;->a:La1/h;

    .line 156
    .line 157
    invoke-static {p1}, La1/h;->h(La1/h;)Ly0/a;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p1}, Ly0/a;->a()Landroid/content/Context;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    if-eqz p1, :cond_2

    .line 166
    .line 167
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 168
    .line 169
    .line 170
    :cond_2
    :goto_1
    return-void

    .line 171
    :catchall_1
    move-exception p1

    .line 172
    iget-object p2, p0, La1/h$d;->a:La1/h;

    .line 173
    .line 174
    invoke-static {p2}, La1/h;->h(La1/h;)Ly0/a;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    const-string p3, "ErrActEx"

    .line 179
    .line 180
    invoke-static {p2, v1, p3, p1}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 181
    .line 182
    .line 183
    throw p1
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
