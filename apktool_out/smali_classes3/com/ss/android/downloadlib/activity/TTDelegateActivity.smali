.class public Lcom/ss/android/downloadlib/activity/TTDelegateActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroidx/core/app/ActivityCompat$OnRequestPermissionsResultCallback;


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation


# static fields
.field private static d:Lcom/ss/android/downloadlib/guide/install/a;


# instance fields
.field protected a:Landroid/content/Intent;

.field private b:Z

.field private c:Lcom/ss/android/downloadad/api/a/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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

.method public static a(J)V
    .locals 3

    .line 26
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 27
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v1, "type"

    const/16 v2, 0xa

    .line 28
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "app_info_id"

    .line 29
    invoke-virtual {v0, v1, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 30
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 31
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method private a(JLjava/lang/String;)V
    .locals 6

    .line 127
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/n;->a()Lcom/ss/android/downloadlib/addownload/a/d;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 128
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/downloadlib/addownload/b/f;->d(J)Lcom/ss/android/downloadad/api/a/b;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 129
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object p2

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->s()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p2

    .line 130
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "time_after_click"

    .line 131
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->T()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "click_download_size"

    .line 132
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->U()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p2, :cond_1

    const-string v1, "download_length"

    .line 133
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "download_percent"

    .line 134
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v2

    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v4

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "download_apk_size"

    .line 135
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "download_current_bytes"

    .line 136
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v2

    const-wide/32 v4, 0x100000

    div-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "download_total_bytes"

    .line 137
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v2

    div-long/2addr v2, v4

    long-to-int p2, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 138
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 139
    :cond_1
    :goto_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 140
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p2

    const-string v1, "cancel_pause_reserve_wifi_dialog_show"

    invoke-virtual {p2, v1, v0, p1}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    goto :goto_1

    .line 141
    :cond_2
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p2

    const-string v1, "pause_reserve_wifi_dialog_show"

    invoke-virtual {p2, v1, v0, p1}, Lcom/ss/android/downloadlib/d/a;->b(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    .line 142
    :cond_3
    :goto_1
    new-instance p2, Lcom/ss/android/downloadlib/addownload/a/e$a;

    invoke-direct {p2, p0}, Lcom/ss/android/downloadlib/addownload/a/e$a;-><init>(Landroid/app/Activity;)V

    const/4 v0, 0x0

    .line 143
    invoke-virtual {p2, v0}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a(Z)Lcom/ss/android/downloadlib/addownload/a/e$a;

    move-result-object p2

    .line 144
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/n;->a()Lcom/ss/android/downloadlib/addownload/a/d;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a(Lcom/ss/android/downloadlib/addownload/a/d;)Lcom/ss/android/downloadlib/addownload/a/e$a;

    move-result-object p2

    .line 145
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 146
    invoke-virtual {p2, p3}, Lcom/ss/android/downloadlib/addownload/a/e$a;->d(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/a/e$a;

    move-result-object p3

    .line 147
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/n;->b()Lcom/ss/android/downloadlib/addownload/a/c;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a(Lcom/ss/android/downloadlib/addownload/a/c;)Lcom/ss/android/downloadlib/addownload/a/e$a;

    .line 148
    :cond_4
    invoke-virtual {p2}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a()Lcom/ss/android/downloadlib/addownload/a/e;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Dialog;->show()V

    const/4 p2, 0x1

    .line 149
    iput-boolean p2, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->b:Z

    .line 150
    iput-object p1, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->c:Lcom/ss/android/downloadad/api/a/b;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 3

    .line 56
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 57
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v1, "type"

    const/16 v2, 0x10

    .line 58
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "package_name"

    .line 59
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "model_id"

    .line 60
    invoke-virtual {v0, p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    if-eqz p0, :cond_0

    .line 61
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public static a(Lcom/ss/android/downloadad/api/a/a;)V
    .locals 4

    .line 14
    invoke-static {p0}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->c(Lcom/ss/android/downloadad/api/a/a;)Landroid/content/Intent;

    move-result-object v0

    const/high16 v1, 0x10000000

    .line 15
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v1, "type"

    const/4 v2, 0x4

    .line 16
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "model_id"

    .line 17
    invoke-interface {p0}, Lcom/ss/android/downloadad/api/a/a;->b()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 18
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 19
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method private static a(Lcom/ss/android/downloadad/api/a/a;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0    # Lcom/ss/android/downloadad/api/a/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 65
    invoke-static {p0}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->c(Lcom/ss/android/downloadad/api/a/a;)Landroid/content/Intent;

    move-result-object v0

    const/high16 v1, 0x10000000

    .line 66
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v1, "type"

    .line 67
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 68
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "positive_button_text"

    .line 69
    invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 70
    :cond_0
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "negative_button_text"

    .line 71
    invoke-virtual {v0, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 72
    :cond_1
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "delete_button_text"

    .line 73
    invoke-virtual {v0, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 74
    :cond_2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    const-string p1, "message_text"

    .line 75
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_3
    const-string p1, "model_id"

    .line 76
    invoke-interface {p0}, Lcom/ss/android/downloadad/api/a/a;->b()J

    move-result-wide p2

    invoke-virtual {v0, p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 77
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 78
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_4
    return-void
.end method

.method public static a(Lcom/ss/android/downloadad/api/a/a;Lcom/ss/android/downloadlib/guide/install/a;)V
    .locals 2

    .line 20
    invoke-static {p0}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->c(Lcom/ss/android/downloadad/api/a/a;)Landroid/content/Intent;

    move-result-object p0

    const/high16 v0, 0x10000000

    .line 21
    invoke-virtual {p0, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v0, "type"

    const/16 v1, 0x9

    .line 22
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 23
    sput-object p1, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->d:Lcom/ss/android/downloadlib/guide/install/a;

    .line 24
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 25
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public static a(Lcom/ss/android/downloadad/api/a/a;Ljava/lang/String;)V
    .locals 6
    .param p0    # Lcom/ss/android/downloadad/api/a/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/16 v1, 0x13

    const-string v2, ""

    const-string v3, ""

    const-string v4, ""

    move-object v0, p0

    move-object v5, p1

    .line 62
    invoke-static/range {v0 .. v5}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a(Lcom/ss/android/downloadad/api/a/a;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Lcom/ss/android/downloadad/api/a/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p0    # Lcom/ss/android/downloadad/api/a/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/16 v1, 0x8

    const-string v5, ""

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 63
    invoke-static/range {v0 .. v5}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a(Lcom/ss/android/downloadad/api/a/a;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Lcom/ss/android/downloadad/api/a/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p0    # Lcom/ss/android/downloadad/api/a/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/16 v1, 0x15

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 64
    invoke-static/range {v0 .. v5}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a(Lcom/ss/android/downloadad/api/a/a;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .line 151
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    return-void

    .line 153
    :cond_0
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 154
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 155
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string v0, "open_url"

    .line 156
    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 p1, 0x10000000

    .line 157
    invoke-virtual {v1, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 158
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object p1

    const-string v0, "fix_app_link_flag"

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/high16 p1, 0x4000000

    .line 159
    invoke-virtual {v1, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_1
    const-string p1, "start_only_for_android"

    const/4 v0, 0x1

    .line 160
    invoke-virtual {v1, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 161
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 162
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 163
    :goto_0
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    return-void

    :goto_1
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    throw p1
.end method

.method public static a(Ljava/lang/String;J)V
    .locals 3

    .line 49
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 50
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v1, "type"

    const/16 v2, 0xf

    .line 51
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "package_name"

    .line 52
    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "model_id"

    .line 53
    invoke-virtual {v0, p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 54
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 55
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;JLjava/lang/String;)V
    .locals 3

    .line 41
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 42
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v1, "type"

    const/16 v2, 0xd

    .line 43
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "package_name"

    .line 44
    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "model_id"

    .line 45
    invoke-virtual {v0, p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const-string p0, "need_comment"

    .line 46
    invoke-virtual {v0, p0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 47
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 48
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;JLjava/lang/String;Lorg/json/JSONObject;)V
    .locals 3
    .param p4    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 32
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 33
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v1, "type"

    const/16 v2, 0xc

    .line 34
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "package_name"

    .line 35
    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "model_id"

    .line 36
    invoke-virtual {v0, p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const-string p0, "param"

    .line 37
    invoke-virtual {v0, p0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "ext_json"

    .line 38
    invoke-virtual {p4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 39
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 40
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/ss/android/downloadad/api/a/a;)V
    .locals 2

    .line 8
    invoke-static {p1}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->c(Lcom/ss/android/downloadad/api/a/a;)Landroid/content/Intent;

    move-result-object p1

    const/high16 v0, 0x10000000

    .line 9
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v0, "type"

    const/4 v1, 0x2

    .line 10
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "open_url"

    .line 11
    invoke-virtual {p1, v0, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 12
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 13
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v1, "type"

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "permission_id_key"

    .line 4
    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "permission_content_key"

    .line 5
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 7
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method private b()V
    .locals 3

    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const/4 v2, 0x0

    .line 20
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->alpha:F

    .line 21
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method private b(J)V
    .locals 4

    .line 35
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/downloadlib/addownload/b/f;->d(J)Lcom/ss/android/downloadad/api/a/b;

    move-result-object p1

    if-nez p1, :cond_0

    .line 36
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p1

    const-string p2, "showOpenAppDialogInner nativeModel null"

    invoke-virtual {p1, p2}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/String;)V

    .line 37
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    return-void

    .line 38
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->d()Lcom/ss/android/download/api/config/l;

    move-result-object p2

    new-instance v0, Lcom/ss/android/download/api/model/b$a;

    invoke-direct {v0, p0}, Lcom/ss/android/download/api/model/b$a;-><init>(Landroid/content/Context;)V

    const-string v1, "\u5df2\u5b89\u88c5\u5b8c\u6210"

    .line 39
    invoke-virtual {v0, v1}, Lcom/ss/android/download/api/model/b$a;->a(Ljava/lang/String;)Lcom/ss/android/download/api/model/b$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 40
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->N()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "\u521a\u521a\u4e0b\u8f7d\u7684\u5e94\u7528"

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->N()Ljava/lang/String;

    move-result-object v2

    :goto_0
    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "%1$s\u5df2\u5b89\u88c5\u5b8c\u6210\uff0c\u662f\u5426\u7acb\u5373\u6253\u5f00\uff1f"

    .line 41
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/download/api/model/b$a;->b(Ljava/lang/String;)Lcom/ss/android/download/api/model/b$a;

    move-result-object v0

    const-string v1, "\u6253\u5f00"

    .line 42
    invoke-virtual {v0, v1}, Lcom/ss/android/download/api/model/b$a;->c(Ljava/lang/String;)Lcom/ss/android/download/api/model/b$a;

    move-result-object v0

    const-string v1, "\u53d6\u6d88"

    .line 43
    invoke-virtual {v0, v1}, Lcom/ss/android/download/api/model/b$a;->d(Ljava/lang/String;)Lcom/ss/android/download/api/model/b$a;

    move-result-object v0

    .line 44
    invoke-virtual {v0, v3}, Lcom/ss/android/download/api/model/b$a;->a(Z)Lcom/ss/android/download/api/model/b$a;

    move-result-object v0

    .line 45
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/ss/android/downloadlib/g/m;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/download/api/model/b$a;->a(Landroid/graphics/drawable/Drawable;)Lcom/ss/android/download/api/model/b$a;

    move-result-object v0

    new-instance v1, Lcom/ss/android/downloadlib/activity/TTDelegateActivity$2;

    invoke-direct {v1, p0, p1}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity$2;-><init>(Lcom/ss/android/downloadlib/activity/TTDelegateActivity;Lcom/ss/android/downloadad/api/a/b;)V

    .line 46
    invoke-virtual {v0, v1}, Lcom/ss/android/download/api/model/b$a;->a(Lcom/ss/android/download/api/model/b$b;)Lcom/ss/android/download/api/model/b$a;

    move-result-object v0

    const/4 v1, 0x2

    .line 47
    invoke-virtual {v0, v1}, Lcom/ss/android/download/api/model/b$a;->a(I)Lcom/ss/android/download/api/model/b$a;

    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lcom/ss/android/download/api/model/b$a;->a()Lcom/ss/android/download/api/model/b;

    move-result-object v0

    .line 49
    invoke-interface {p2, v0}, Lcom/ss/android/download/api/config/l;->b(Lcom/ss/android/download/api/model/b;)Landroid/app/Dialog;

    .line 50
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p2

    const-string v0, "market_openapp_window_show"

    invoke-virtual {p2, v0, p1}, Lcom/ss/android/downloadlib/d/a;->b(Ljava/lang/String;Lcom/ss/android/downloadad/api/a/a;)V

    return-void
.end method

.method public static b(Lcom/ss/android/downloadad/api/a/a;)V
    .locals 6
    .param p0    # Lcom/ss/android/downloadad/api/a/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v1, 0x5

    const-string v2, ""

    const-string v3, ""

    const-string v4, ""

    const-string v5, ""

    move-object v0, p0

    .line 15
    invoke-static/range {v0 .. v5}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a(Lcom/ss/android/downloadad/api/a/a;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b(Lcom/ss/android/downloadad/api/a/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p0    # Lcom/ss/android/downloadad/api/a/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v1, 0x7

    const-string v5, ""

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 16
    invoke-static/range {v0 .. v5}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a(Lcom/ss/android/downloadad/api/a/a;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b(Lcom/ss/android/downloadad/api/a/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p0    # Lcom/ss/android/downloadad/api/a/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/16 v1, 0x14

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 17
    invoke-static/range {v0 .. v5}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a(Lcom/ss/android/downloadad/api/a/a;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .line 28
    invoke-static {p0, p1}, Lcom/ss/android/downloadlib/g/m;->g(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    if-nez p1, :cond_0

    .line 29
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    return-void

    :cond_0
    const/high16 v0, 0x10000000

    .line 30
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v0, "start_only_for_android"

    const/4 v1, 0x1

    .line 31
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 32
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 33
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    :goto_0
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    return-void

    :goto_1
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    throw p1
.end method

.method public static b(Ljava/lang/String;JLjava/lang/String;)V
    .locals 3

    .line 7
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 8
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v1, "type"

    const/16 v2, 0xe

    .line 9
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "package_name"

    .line 10
    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "model_id"

    .line 11
    invoke-virtual {v0, p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const-string p0, "market_app_id"

    .line 12
    invoke-virtual {v0, p0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 14
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/String;Lcom/ss/android/downloadad/api/a/a;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->c(Lcom/ss/android/downloadad/api/a/a;)Landroid/content/Intent;

    move-result-object p1

    const/high16 v0, 0x10000000

    .line 2
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v0, "type"

    const/16 v1, 0xb

    .line 3
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "package_name"

    .line 4
    invoke-virtual {p1, v0, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 6
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2

    .line 22
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_1

    array-length v0, p2

    if-gtz v0, :cond_0

    goto :goto_1

    .line 23
    :cond_0
    new-instance v0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity$1;

    invoke-direct {v0, p0, p1}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity$1;-><init>(Lcom/ss/android/downloadlib/activity/TTDelegateActivity;Ljava/lang/String;)V

    .line 24
    :try_start_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->f()Lcom/ss/android/download/api/config/i;

    move-result-object p1

    invoke-interface {p1, p0, p2, v0}, Lcom/ss/android/download/api/config/i;->a(Landroid/app/Activity;[Ljava/lang/String;Lcom/ss/android/download/api/config/t;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 25
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->u()Lcom/ss/android/download/api/b/a;

    move-result-object p2

    const-string v1, "requestPermission"

    invoke-interface {p2, p1, v1}, Lcom/ss/android/download/api/b/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 26
    invoke-interface {v0}, Lcom/ss/android/download/api/config/t;->a()V

    :goto_0
    return-void

    .line 27
    :cond_1
    :goto_1
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    return-void
.end method

.method private static c(Lcom/ss/android/downloadad/api/a/a;)Landroid/content/Intent;
    .locals 2
    .param p0    # Lcom/ss/android/downloadad/api/a/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    new-instance p0, Landroid/content/Intent;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;

    invoke-direct {p0, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object p0
.end method

.method private c()V
    .locals 19

    move-object/from16 v1, p0

    .line 2
    iget-object v0, v1, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    const-string v2, "model_id"

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v5

    .line 3
    iget-object v0, v1, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    const-string v2, "message_text"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v2, v1, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    const-string v7, "positive_button_text"

    invoke-virtual {v2, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 5
    iget-object v7, v1, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    const-string v8, "negative_button_text"

    invoke-virtual {v7, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 6
    iget-object v8, v1, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    const-string v9, "delete_button_text"

    invoke-virtual {v8, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 7
    iget-object v9, v1, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    const-string v10, "type"

    const/4 v11, 0x0

    invoke-virtual {v9, v10, v11}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v9

    .line 8
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v10

    invoke-virtual {v10, v5, v6}, Lcom/ss/android/downloadlib/addownload/b/f;->d(J)Lcom/ss/android/downloadad/api/a/b;

    move-result-object v5

    const/4 v6, 0x1

    if-eqz v5, :cond_1

    .line 9
    invoke-virtual {v5}, Lcom/ss/android/downloadad/api/a/b;->af()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_0

    .line 10
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10}, Lcom/ss/android/downloadlib/i;->a(Landroid/content/Context;)Lcom/ss/android/downloadlib/i;

    move-result-object v10

    invoke-virtual {v5}, Lcom/ss/android/downloadad/api/a/b;->af()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v10, v12, v13, v6}, Lcom/ss/android/downloadlib/i;->a(Ljava/lang/String;Ljava/lang/String;Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v10

    goto :goto_0

    .line 11
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10}, Lcom/ss/android/downloadlib/i;->a(Landroid/content/Context;)Lcom/ss/android/downloadlib/i;

    move-result-object v10

    invoke-virtual {v5}, Lcom/ss/android/downloadad/api/a/b;->a()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v12}, Lcom/ss/android/downloadlib/i;->b(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v10

    :goto_0
    if-eqz v10, :cond_1

    .line 12
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v12

    .line 13
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v14

    cmp-long v16, v12, v3

    if-lez v16, :cond_1

    cmp-long v3, v14, v3

    if-lez v3, :cond_1

    const-wide/32 v3, 0x100000

    move-object/from16 v16, v7

    .line 14
    div-long v6, v12, v3

    long-to-int v6, v6

    .line 15
    div-long v3, v14, v3

    long-to-int v3, v3

    .line 16
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v4

    const-wide/16 v17, 0x64

    mul-long v12, v12, v17

    div-long/2addr v12, v14

    long-to-int v7, v12

    invoke-static {v4, v7}, Lcom/ss/android/downloadlib/addownload/j;->a(II)I

    move-result v4

    goto :goto_1

    :cond_1
    move-object/from16 v16, v7

    const/4 v4, -0x1

    move v3, v11

    move v6, v3

    .line 17
    :goto_1
    new-instance v7, Lcom/ss/android/downloadlib/addownload/a/e$a;

    invoke-direct {v7, v1}, Lcom/ss/android/downloadlib/addownload/a/e$a;-><init>(Landroid/app/Activity;)V

    .line 18
    invoke-virtual {v7, v11}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a(Z)Lcom/ss/android/downloadlib/addownload/a/e$a;

    move-result-object v7

    .line 19
    invoke-virtual {v7, v0}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/a/e$a;

    move-result-object v0

    .line 20
    invoke-virtual {v0, v2}, Lcom/ss/android/downloadlib/addownload/a/e$a;->b(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/a/e$a;

    move-result-object v0

    move-object/from16 v2, v16

    .line 21
    invoke-virtual {v0, v2}, Lcom/ss/android/downloadlib/addownload/a/e$a;->c(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/a/e$a;

    move-result-object v0

    const/4 v2, 0x7

    const-string v7, "apk_size_cancel"

    const-string v10, "download_percent_cancel"

    const-string v11, "apk_size"

    const-string v12, "download_percent"

    if-ne v9, v2, :cond_3

    .line 22
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/d/f;->a()Lcom/ss/android/downloadlib/addownload/a/d;

    move-result-object v2

    if-nez v2, :cond_2

    return-void

    .line 23
    :cond_2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/d/f;->a()Lcom/ss/android/downloadlib/addownload/a/d;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a(Lcom/ss/android/downloadlib/addownload/a/d;)Lcom/ss/android/downloadlib/addownload/a/e$a;

    .line 24
    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a()Lcom/ss/android/downloadlib/addownload/a/e;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    move-object v2, v12

    goto/16 :goto_4

    :cond_3
    const/16 v2, 0x8

    if-ne v9, v2, :cond_5

    .line 25
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/d/a;->a()Lcom/ss/android/downloadlib/addownload/a/d;

    move-result-object v2

    if-nez v2, :cond_4

    return-void

    .line 26
    :cond_4
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/d/a;->a()Lcom/ss/android/downloadlib/addownload/a/d;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a(Lcom/ss/android/downloadlib/addownload/a/d;)Lcom/ss/android/downloadlib/addownload/a/e$a;

    .line 27
    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a()Lcom/ss/android/downloadlib/addownload/a/e;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    move-object v2, v11

    goto :goto_4

    :cond_5
    const/16 v2, 0x14

    if-ne v9, v2, :cond_8

    .line 28
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/d/c;->a()Lcom/ss/android/downloadlib/addownload/a/d;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/d/c;->b()Lcom/ss/android/downloadlib/addownload/a/c;

    move-result-object v2

    if-nez v2, :cond_6

    goto :goto_2

    .line 29
    :cond_6
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/d/c;->a()Lcom/ss/android/downloadlib/addownload/a/d;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a(Lcom/ss/android/downloadlib/addownload/a/d;)Lcom/ss/android/downloadlib/addownload/a/e$a;

    move-result-object v2

    .line 30
    invoke-virtual {v2, v8}, Lcom/ss/android/downloadlib/addownload/a/e$a;->d(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/a/e$a;

    move-result-object v2

    .line 31
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/d/c;->b()Lcom/ss/android/downloadlib/addownload/a/c;

    move-result-object v8

    invoke-virtual {v2, v8}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a(Lcom/ss/android/downloadlib/addownload/a/c;)Lcom/ss/android/downloadlib/addownload/a/e$a;

    .line 32
    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a()Lcom/ss/android/downloadlib/addownload/a/e;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    move-object v2, v10

    goto :goto_4

    :cond_7
    :goto_2
    return-void

    :cond_8
    const/16 v2, 0x15

    if-ne v9, v2, :cond_b

    .line 33
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/d/b;->a()Lcom/ss/android/downloadlib/addownload/a/d;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/d/b;->b()Lcom/ss/android/downloadlib/addownload/a/c;

    move-result-object v2

    if-nez v2, :cond_9

    goto :goto_3

    .line 34
    :cond_9
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/d/b;->a()Lcom/ss/android/downloadlib/addownload/a/d;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a(Lcom/ss/android/downloadlib/addownload/a/d;)Lcom/ss/android/downloadlib/addownload/a/e$a;

    move-result-object v2

    .line 35
    invoke-virtual {v2, v8}, Lcom/ss/android/downloadlib/addownload/a/e$a;->d(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/a/e$a;

    move-result-object v2

    .line 36
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/d/b;->b()Lcom/ss/android/downloadlib/addownload/a/c;

    move-result-object v8

    invoke-virtual {v2, v8}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a(Lcom/ss/android/downloadlib/addownload/a/c;)Lcom/ss/android/downloadlib/addownload/a/e$a;

    .line 37
    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/a/e$a;->a()Lcom/ss/android/downloadlib/addownload/a/e;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    move-object v2, v7

    goto :goto_4

    :cond_a
    :goto_3
    return-void

    :cond_b
    const-string v0, ""

    move-object v2, v0

    .line 38
    :goto_4
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_f

    const/4 v0, 0x1

    .line 39
    iput-boolean v0, v1, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->b:Z

    .line 40
    iput-object v5, v1, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->c:Lcom/ss/android/downloadad/api/a/b;

    .line 41
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v0, "pause_optimise_type"

    .line 42
    invoke-virtual {v8, v0, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "pause_optimise_action"

    const-string v9, "show_dialog"

    .line 43
    invoke-virtual {v8, v0, v9}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v12, v0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "download_current_bytes"

    .line 45
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v8, v0, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "download_total_bytes"

    .line 46
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v8, v0, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 48
    :goto_5
    invoke-static {v2, v12}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    invoke-static {v2, v11}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_6

    .line 49
    :cond_c
    invoke-static {v2, v10}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-static {v2, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 50
    :cond_d
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v0

    const-string v2, "pause_cancel_optimise"

    invoke-virtual {v0, v2, v8, v5}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    goto :goto_7

    .line 51
    :cond_e
    :goto_6
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v0

    const-string v2, "pause_optimise"

    invoke-virtual {v0, v2, v8, v5}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    :cond_f
    :goto_7
    return-void
.end method

.method private c(J)V
    .locals 1

    .line 52
    new-instance v0, Lcom/ss/android/downloadlib/addownload/compliance/a;

    invoke-direct {v0, p0, p1, p2}, Lcom/ss/android/downloadlib/addownload/compliance/a;-><init>(Landroid/app/Activity;J)V

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 11

    .line 79
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v1, "type"

    const/4 v2, 0x0

    .line 80
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v1, "package_name"

    const-string v2, "model_id"

    const-wide/16 v3, 0x0

    packed-switch v0, :pswitch_data_0

    .line 81
    :pswitch_0
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    goto/16 :goto_0

    .line 82
    :pswitch_1
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    invoke-virtual {v0, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 83
    iget-object v2, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    const-string v3, "delete_button_text"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 84
    invoke-direct {p0, v0, v1, v2}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a(JLjava/lang/String;)V

    goto/16 :goto_0

    .line 85
    :pswitch_2
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 86
    iget-object v1, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v1

    .line 87
    invoke-static {p0, v0, v1, v2}, Lcom/ss/android/downloadlib/g/h;->b(Landroid/app/Activity;Ljava/lang/String;J)V

    .line 88
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    goto/16 :goto_0

    .line 89
    :pswitch_3
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 90
    iget-object v1, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v1

    .line 91
    invoke-static {p0, v0, v1, v2}, Lcom/ss/android/downloadlib/g/h;->a(Landroid/app/Activity;Ljava/lang/String;J)V

    .line 92
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    goto/16 :goto_0

    .line 93
    :pswitch_4
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 94
    iget-object v1, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v1

    .line 95
    iget-object v3, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    const-string v4, "market_app_id"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 96
    invoke-static {p0, v0, v1, v2, v3}, Lcom/ss/android/downloadlib/g/h;->b(Landroid/app/Activity;Ljava/lang/String;JLjava/lang/String;)V

    .line 97
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    goto/16 :goto_0

    .line 98
    :pswitch_5
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 99
    iget-object v1, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v1

    .line 100
    iget-object v3, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    const-string v4, "need_comment"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 101
    invoke-static {p0, v0, v1, v2, v3}, Lcom/ss/android/downloadlib/g/h;->a(Landroid/app/Activity;Ljava/lang/String;JLjava/lang/String;)V

    .line 102
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    goto/16 :goto_0

    .line 103
    :pswitch_6
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 104
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    invoke-virtual {v0, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v7

    .line 105
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    const-string v1, "param"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 106
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    const-string v1, "ext_json"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    move-object v5, p0

    .line 107
    invoke-static/range {v5 .. v10}, Lcom/ss/android/downloadlib/g/h;->a(Landroid/app/Activity;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 108
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    goto :goto_0

    .line 109
    :pswitch_7
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 110
    invoke-direct {p0, v0}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 111
    :pswitch_8
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    const-string v1, "app_info_id"

    invoke-virtual {v0, v1, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 112
    invoke-direct {p0, v0, v1}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->c(J)V

    goto :goto_0

    .line 113
    :pswitch_9
    sget-object v0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->d:Lcom/ss/android/downloadlib/guide/install/a;

    if-eqz v0, :cond_1

    .line 114
    invoke-interface {v0}, Lcom/ss/android/downloadlib/guide/install/a;->a()V

    .line 115
    :cond_1
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    goto :goto_0

    .line 116
    :pswitch_a
    invoke-direct {p0}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->c()V

    goto :goto_0

    .line 117
    :pswitch_b
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    invoke-virtual {v0, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    const-string v2, ""

    .line 118
    invoke-direct {p0, v0, v1, v2}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a(JLjava/lang/String;)V

    goto :goto_0

    .line 119
    :pswitch_c
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    invoke-virtual {v0, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 120
    invoke-direct {p0, v0, v1}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->b(J)V

    goto :goto_0

    .line 121
    :pswitch_d
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    const-string v1, "open_url"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 122
    invoke-direct {p0, v0}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 123
    :pswitch_e
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    const-string v1, "permission_id_key"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 124
    iget-object v1, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    const-string v2, "permission_content_key"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 125
    invoke-direct {p0, v0, v1}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->b(Ljava/lang/String;[Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    .line 126
    iput-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_0
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_a
        :pswitch_a
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->startActivityTrace(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->b()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    .line 23
    .line 24
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/k;->b(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a()V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
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
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a:Landroid/content/Intent;

    .line 8
    .line 9
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/k;->b(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a()V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1
    .param p2    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->f()Lcom/ss/android/download/api/config/i;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0, p0, p1, p2, p3}, Lcom/ss/android/download/api/config/i;->a(Landroid/app/Activity;I[Ljava/lang/String;[I)V

    .line 9
    .line 10
    .line 11
    return-void
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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
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
.end method

.method protected onRestart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartEnd()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeEnd()V

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method

.method protected onStop()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->b:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->c:Lcom/ss/android/downloadad/api/a/b;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/a/b;->af()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lcom/ss/android/downloadlib/i;->a(Landroid/content/Context;)Lcom/ss/android/downloadlib/i;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->c:Lcom/ss/android/downloadad/api/a/b;

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/ss/android/downloadad/api/a/b;->af()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/downloadlib/i;->a(Ljava/lang/String;Ljava/lang/String;Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Lcom/ss/android/downloadlib/i;->a(Landroid/content/Context;)Lcom/ss/android/downloadlib/i;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v1, p0, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->c:Lcom/ss/android/downloadad/api/a/b;

    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/ss/android/downloadad/api/a/b;->a()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/i;->b(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :goto_0
    if-eqz v0, :cond_1

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 64
    .line 65
    .line 66
    move-result-wide v1

    .line 67
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 68
    .line 69
    .line 70
    move-result-wide v3

    .line 71
    cmp-long v0, v1, v3

    .line 72
    .line 73
    if-ltz v0, :cond_1

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_1

    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 82
    .line 83
    .line 84
    :cond_1
    return-void
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
.end method
