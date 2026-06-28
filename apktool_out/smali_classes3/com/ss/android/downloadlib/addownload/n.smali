.class public Lcom/ss/android/downloadlib/addownload/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/ss/android/downloadlib/addownload/a/d;

.field private static b:Lcom/ss/android/downloadlib/addownload/a/c;


# direct methods
.method public static a()Lcom/ss/android/downloadlib/addownload/a/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/n;->a:Lcom/ss/android/downloadlib/addownload/a/d;

    return-object v0
.end method

.method public static a(Lcom/ss/android/downloadlib/addownload/a/c;)V
    .locals 0

    .line 3
    sput-object p0, Lcom/ss/android/downloadlib/addownload/n;->b:Lcom/ss/android/downloadlib/addownload/a/c;

    return-void
.end method

.method public static a(Lcom/ss/android/downloadlib/addownload/a/d;)V
    .locals 0

    .line 2
    sput-object p0, Lcom/ss/android/downloadlib/addownload/n;->a:Lcom/ss/android/downloadlib/addownload/a/d;

    return-void
.end method

.method public static a(I)Z
    .locals 2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    const/4 v1, 0x3

    if-eq p0, v1, :cond_1

    const/4 v1, 0x4

    if-eq p0, v1, :cond_1

    const/4 v1, 0x5

    if-eq p0, v1, :cond_1

    const/4 v1, 0x7

    if-eq p0, v1, :cond_1

    const/16 v1, 0x8

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method public static a(Lcom/ss/android/downloadad/api/a/b;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ILcom/ss/android/downloadlib/addownload/d/h;ZLcom/ss/android/downloadlib/addownload/a/c;)Z
    .locals 7

    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 4
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p0

    const-string p1, "tryReverseWifi nativeModel null"

    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/String;)V

    return v0

    :cond_0
    if-nez p1, :cond_1

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p0

    const-string p1, "tryReverseWifi info null"

    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/String;)V

    return v0

    .line 6
    :cond_1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    if-eqz p4, :cond_2

    .line 7
    invoke-static {p0}, Lcom/ss/android/downloadlib/g/e;->c(Lcom/ss/android/downloadad/api/a/a;)Z

    move-result v2

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {p0}, Lcom/ss/android/downloadlib/g/e;->b(Lcom/ss/android/downloadad/api/a/a;)Z

    move-result v2

    .line 9
    :goto_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const/4 v4, 0x1

    :try_start_0
    const-string v5, "switch_status"

    if-eqz v2, :cond_3

    move v6, v4

    goto :goto_1

    :cond_3
    move v6, v0

    .line 10
    :goto_1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v5

    .line 11
    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    if-eqz p4, :cond_4

    .line 12
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v5

    const-string v6, "cancel_pause_reserve_wifi_switch_status"

    invoke-virtual {v5, v6, v3, p0}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    goto :goto_3

    .line 13
    :cond_4
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v5

    const-string v6, "pause_reserve_wifi_switch_status"

    invoke-virtual {v5, v6, v3, p0}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    :goto_3
    if-nez v2, :cond_5

    return v0

    .line 14
    :cond_5
    invoke-static {p2}, Lcom/ss/android/downloadlib/addownload/n;->a(I)Z

    move-result p2

    if-nez p2, :cond_6

    return v0

    .line 15
    :cond_6
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/ss/android/socialbase/downloader/i/f;->b(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_7

    return v0

    :cond_7
    if-nez p4, :cond_9

    .line 16
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->hasPauseReservedOnWifi()Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_4

    :cond_8
    return v0

    .line 17
    :cond_9
    :goto_4
    new-instance p1, Lcom/ss/android/downloadlib/addownload/n$1;

    invoke-direct {p1, v1, p4, p0, p3}, Lcom/ss/android/downloadlib/addownload/n$1;-><init>(IZLcom/ss/android/downloadad/api/a/b;Lcom/ss/android/downloadlib/addownload/d/h;)V

    .line 18
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/n;->a(Lcom/ss/android/downloadlib/addownload/a/d;)V

    if-eqz p4, :cond_a

    if-eqz p5, :cond_a

    .line 19
    new-instance p1, Lcom/ss/android/downloadlib/addownload/n$2;

    invoke-direct {p1, p0, p5}, Lcom/ss/android/downloadlib/addownload/n$2;-><init>(Lcom/ss/android/downloadad/api/a/b;Lcom/ss/android/downloadlib/addownload/a/c;)V

    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/n;->a(Lcom/ss/android/downloadlib/addownload/a/c;)V

    :cond_a
    if-eqz p4, :cond_b

    const-string p1, "\u5220\u9664"

    .line 20
    invoke-static {p0, p1}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a(Lcom/ss/android/downloadad/api/a/a;Ljava/lang/String;)V

    goto :goto_5

    .line 21
    :cond_b
    invoke-static {p0}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->b(Lcom/ss/android/downloadad/api/a/a;)V

    :goto_5
    return v4
.end method

.method public static b()Lcom/ss/android/downloadlib/addownload/a/c;
    .locals 1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/n;->b:Lcom/ss/android/downloadlib/addownload/a/c;

    return-object v0
.end method
