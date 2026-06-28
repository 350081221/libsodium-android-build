.class public Lcom/ss/android/downloadlib/addownload/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/downloadlib/g/n$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/addownload/h$b;,
        Lcom/ss/android/downloadlib/addownload/h$a;
    }
.end annotation


# instance fields
.field public a:Lcom/ss/android/downloadlib/addownload/b/e;

.field private b:J

.field private c:Z

.field private d:Lcom/ss/android/downloadlib/addownload/e;

.field private e:Lcom/ss/android/downloadlib/addownload/h$b;


# direct methods
.method public constructor <init>(Lcom/ss/android/downloadlib/addownload/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/h;->c:Z

    .line 6
    .line 7
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/h;->d:Lcom/ss/android/downloadlib/addownload/e;

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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method static synthetic a(Lcom/ss/android/downloadlib/addownload/h;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/h;->b:J

    return-wide v0
.end method

.method private a(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/c;
    .locals 2

    const-string v0, "clickid"

    .line 217
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 218
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 219
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 220
    new-instance v1, Lcom/ss/android/socialbase/downloader/model/c;

    invoke-direct {v1, v0, p1}, Lcom/ss/android/socialbase/downloader/model/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p1

    .line 221
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->u()Lcom/ss/android/download/api/b/a;

    move-result-object v0

    const-string v1, "parseLogExtra Error"

    invoke-interface {v0, p1, v1}, Lcom/ss/android/download/api/b/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private a(Lcom/ss/android/socialbase/downloader/g/a;)Ljava/lang/String;
    .locals 8

    .line 140
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getFilePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 141
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p1, p1, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getFilePath()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 142
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/d;->j()Lcom/ss/android/socialbase/appdownloader/d;

    move-result-object v0

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v2, v2, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v2}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/appdownloader/d;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    .line 143
    invoke-static {}, Lcom/ss/android/downloadlib/g/m;->a()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 144
    invoke-static {v1}, Lcom/ss/android/downloadlib/g/j;->b(Ljava/lang/String;)Z

    move-result v1

    goto :goto_1

    :cond_1
    const-string v1, "android.permission.READ_MEDIA_IMAGES"

    .line 145
    invoke-static {v1}, Lcom/ss/android/downloadlib/g/j;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "android.permission.READ_MEDIA_AUDIO"

    .line 146
    invoke-static {v1}, Lcom/ss/android/downloadlib/g/j;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "android.permission.READ_MEDIA_VIDEO"

    invoke-static {v1}, Lcom/ss/android/downloadlib/g/j;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    move v1, v2

    .line 147
    :goto_1
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/h;->b()Ljava/lang/String;

    move-result-object v3

    if-eqz v0, :cond_7

    .line 148
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_7

    .line 149
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v4

    if-eqz v1, :cond_4

    return-object v4

    .line 150
    :cond_4
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    return-object v4

    .line 151
    :cond_5
    :try_start_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_6

    invoke-virtual {v4, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v5, :cond_6

    return-object v4

    :catch_0
    move-exception v4

    .line 152
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 153
    :cond_6
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v4

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->cancel(I)V

    .line 154
    :cond_7
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const/4 v4, 0x2

    :try_start_1
    const-string v5, "ttdownloader_code"

    if-eqz v1, :cond_8

    move v6, v2

    goto :goto_2

    :cond_8
    move v6, v4

    .line 155
    :goto_2
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v5

    .line 156
    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V

    .line 157
    :goto_3
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v5

    const-string v6, "label_external_permission"

    iget-object v7, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    invoke-virtual {v5, v6, v0, v7}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    .line 158
    :try_start_2
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/c;->b()Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_4

    :catch_2
    const/4 v0, 0x0

    .line 159
    :goto_4
    invoke-static {p1}, Lcom/ss/android/downloadlib/g/e;->a(Lcom/ss/android/socialbase/downloader/g/a;)I

    move-result p1

    if-eqz p1, :cond_d

    const/4 v5, 0x4

    if-eq p1, v5, :cond_b

    if-nez v1, :cond_9

    if-ne p1, v4, :cond_9

    goto :goto_5

    :cond_9
    const/4 v4, 0x3

    if-eq p1, v4, :cond_a

    if-nez v1, :cond_d

    if-ne p1, v2, :cond_d

    .line 160
    :cond_a
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_6

    .line 161
    :cond_b
    :goto_5
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    .line 162
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_c

    .line 163
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 164
    :cond_c
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_d

    .line 165
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    move-object v3, p1

    goto :goto_6

    :cond_d
    move-object v3, v0

    :goto_6
    return-object v3
.end method

.method public static a(Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ss/android/download/api/download/DownloadStatusChangeListener;",
            ">;"
        }
    .end annotation

    .line 208
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_4

    .line 209
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 210
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 211
    instance-of v2, v1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    if-eqz v2, :cond_2

    .line 212
    check-cast v1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 213
    :cond_2
    instance-of v2, v1, Ljava/lang/ref/SoftReference;

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, Ljava/lang/ref/SoftReference;

    invoke-virtual {v2}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    if-eqz v3, :cond_3

    .line 214
    invoke-virtual {v2}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 215
    :cond_3
    instance-of v2, v1, Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    if-eqz v2, :cond_1

    .line 216
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    :goto_1
    return-object v0
.end method

.method public static b(Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ss/android/download/api/download/a;",
            ">;"
        }
    .end annotation

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_4

    .line 18
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 19
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 20
    instance-of v2, v1, Lcom/ss/android/download/api/download/a;

    if-eqz v2, :cond_2

    .line 21
    check-cast v1, Lcom/ss/android/download/api/download/a;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 22
    :cond_2
    instance-of v2, v1, Ljava/lang/ref/SoftReference;

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, Ljava/lang/ref/SoftReference;

    invoke-virtual {v2}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lcom/ss/android/download/api/download/a;

    if-eqz v3, :cond_3

    .line 23
    invoke-virtual {v2}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/download/api/download/a;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 24
    :cond_3
    instance-of v2, v1, Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/ss/android/download/api/download/a;

    if-eqz v2, :cond_1

    .line 25
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/download/api/download/a;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    :goto_1
    return-object v0
.end method

.method private b(Lcom/ss/android/download/api/config/t;)V
    .locals 3

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 4
    invoke-static {v0}, Lcom/ss/android/downloadlib/g/j;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 5
    invoke-interface {p1}, Lcom/ss/android/download/api/config/t;->a()V

    :cond_0
    return-void

    .line 6
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/g/m;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "android.permission.READ_MEDIA_IMAGES"

    .line 7
    invoke-static {v0}, Lcom/ss/android/downloadlib/g/j;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "android.permission.READ_MEDIA_AUDIO"

    .line 8
    invoke-static {v1}, Lcom/ss/android/downloadlib/g/j;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "android.permission.READ_MEDIA_VIDEO"

    .line 9
    invoke-static {v1}, Lcom/ss/android/downloadlib/g/j;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_2
    if-eqz p1, :cond_3

    .line 10
    invoke-interface {p1}, Lcom/ss/android/download/api/config/t;->a()V

    :cond_3
    return-void

    :cond_4
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    :cond_5
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    .line 11
    new-instance v0, Lcom/ss/android/downloadlib/addownload/h$2;

    invoke-direct {v0, p0, p1}, Lcom/ss/android/downloadlib/addownload/h$2;-><init>(Lcom/ss/android/downloadlib/addownload/h;Lcom/ss/android/download/api/config/t;)V

    invoke-static {v1, v0}, Lcom/ss/android/downloadlib/g/j;->a([Ljava/lang/String;Lcom/ss/android/downloadlib/g/j$a;)V

    return-void
.end method

.method private c()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/h;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/h;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 3
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->d:Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadController;->isAddToDownloadManage()Z

    move-result v0

    return v0
.end method

.method private e(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v0}, Lcom/ss/android/downloadlib/g/m;->a(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/h;->f(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v0}, Lcom/ss/android/downloadlib/g/m;->a(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->d:Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadController;->getLinkMode()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/i;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private f(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 2

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    const/4 v1, -0x3

    if-ne v0, v1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ss/android/socialbase/downloader/i/f;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method a(Landroid/content/Context;Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;)I
    .locals 11

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 66
    :cond_0
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getHeaders()Ljava/util/Map;

    move-result-object v1

    .line 67
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 68
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "enable_send_click_id_in_apk"

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    if-ne v3, v5, :cond_1

    .line 69
    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v3, v3, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v3}, Lcom/ss/android/download/api/download/DownloadModel;->getLogExtra()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 70
    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v3, v3, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v3}, Lcom/ss/android/download/api/download/DownloadModel;->getLogExtra()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/ss/android/downloadlib/addownload/h;->a(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/c;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 71
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz v1, :cond_3

    .line 72
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    if-eqz v3, :cond_2

    .line 73
    new-instance v4, Lcom/ss/android/socialbase/downloader/model/c;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v4, v6, v3}, Lcom/ss/android/socialbase/downloader/model/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 74
    :cond_3
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 75
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v3, v3, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 76
    invoke-interface {v3}, Lcom/ss/android/download/api/download/DownloadModel;->getNotificationJumpUrl()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v4, v4, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 77
    invoke-interface {v4}, Lcom/ss/android/download/api/download/DownloadModel;->isShowToast()Z

    move-result v4

    iget-object v6, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v6, v6, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 78
    invoke-interface {v6}, Lcom/ss/android/download/api/download/DownloadModel;->getModelType()I

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    .line 79
    invoke-static {v1, v3, v4, v6}, Lcom/ss/android/downloadlib/g/d;->a(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 80
    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v3, v3, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v3}, Lcom/ss/android/downloadlib/g/e;->b(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v3

    .line 81
    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v4, v4, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v4}, Lcom/ss/android/downloadlib/g/e;->a(Lcom/ss/android/download/api/download/DownloadModel;)Lorg/json/JSONObject;

    move-result-object v4

    .line 82
    iget-object v6, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v6, v6, Lcom/ss/android/downloadlib/addownload/b/e;->d:Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {v6}, Lcom/ss/android/download/api/download/DownloadController;->enableAH()Z

    move-result v6

    if-nez v6, :cond_4

    .line 83
    invoke-static {v4}, Lcom/ss/android/downloadlib/g/m;->a(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v4

    .line 84
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    const-string v7, "ah_plans"

    invoke-static {v4, v7, v6}, Lcom/ss/android/downloadlib/g/m;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 85
    :cond_4
    iget-object v6, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v6, v6, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v6}, Lcom/ss/android/download/api/download/DownloadModel;->getExecutorGroup()I

    move-result v6

    .line 86
    iget-object v7, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v7, v7, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v7}, Lcom/ss/android/download/api/download/DownloadModel;->isAd()Z

    move-result v7

    if-nez v7, :cond_5

    iget-object v7, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v7, v7, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v7}, Lcom/ss/android/downloadlib/addownload/i;->b(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v7

    if-eqz v7, :cond_6

    :cond_5
    const/4 v6, 0x4

    .line 87
    :cond_6
    invoke-direct {p0, v3}, Lcom/ss/android/downloadlib/addownload/h;->a(Lcom/ss/android/socialbase/downloader/g/a;)Ljava/lang/String;

    move-result-object v7

    .line 88
    iget-object v8, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v8, v8, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v8}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v8

    .line 89
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v9

    invoke-virtual {v9, v8}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v8

    if-eqz v8, :cond_7

    .line 90
    iget-object v9, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v9, v9, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v9}, Lcom/ss/android/download/api/download/DownloadModel;->getModelType()I

    move-result v9

    const/4 v10, 0x3

    if-ne v10, v9, :cond_7

    .line 91
    invoke-virtual {v8, v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstDownload(Z)V

    .line 92
    :cond_7
    new-instance v8, Lcom/ss/android/socialbase/appdownloader/f;

    iget-object v9, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v9, v9, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v9}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, p1, v9}, Lcom/ss/android/socialbase/appdownloader/f;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p1, p1, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 93
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getBackupUrls()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v8, p1}, Lcom/ss/android/socialbase/appdownloader/f;->b(Ljava/util/List;)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    iget-object v8, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v8, v8, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 94
    invoke-interface {v8}, Lcom/ss/android/download/api/download/DownloadModel;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/ss/android/socialbase/appdownloader/f;->a(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    .line 95
    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/appdownloader/f;->e(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    .line 96
    invoke-virtual {p1, v2}, Lcom/ss/android/socialbase/appdownloader/f;->a(Ljava/util/List;)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 97
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->isShowNotification()Z

    move-result v1

    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/appdownloader/f;->a(Z)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 98
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->isNeedWifi()Z

    move-result v1

    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/appdownloader/f;->c(Z)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 99
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/appdownloader/f;->b(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    .line 100
    invoke-virtual {p1, v7}, Lcom/ss/android/socialbase/appdownloader/f;->c(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 101
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getAppIcon()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/appdownloader/f;->k(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 102
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getMd5()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/appdownloader/f;->h(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 103
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getSdkMonitorScene()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/appdownloader/f;->j(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 104
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getExpectFileLength()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/ss/android/socialbase/appdownloader/f;->a(J)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    .line 105
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->a(Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 106
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->needIndependentProcess()Z

    move-result p2

    if-nez p2, :cond_9

    const-string p2, "need_independent_process"

    invoke-virtual {v3, p2, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v5, :cond_8

    goto :goto_1

    :cond_8
    move p2, v0

    goto :goto_2

    :cond_9
    :goto_1
    move p2, v5

    :goto_2
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->l(Z)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 107
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadFileUriProvider()Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->a(Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 108
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->autoInstallWithoutNotification()Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->b(Z)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 109
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->g(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    const/16 p2, 0x3e8

    .line 110
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->d(I)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    const/16 p2, 0x64

    .line 111
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->e(I)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    .line 112
    invoke-virtual {p1, v4}, Lcom/ss/android/socialbase/appdownloader/f;->a(Lorg/json/JSONObject;)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    .line 113
    invoke-virtual {p1, v5}, Lcom/ss/android/socialbase/appdownloader/f;->i(Z)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    .line 114
    invoke-virtual {p1, v5}, Lcom/ss/android/socialbase/appdownloader/f;->j(Z)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    const-string p2, "retry_count"

    const/4 v1, 0x5

    .line 115
    invoke-virtual {v3, p2, v1}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->b(I)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    const-string p2, "backup_url_retry_count"

    .line 116
    invoke-virtual {v3, p2, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->c(I)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    .line 117
    invoke-virtual {p1, v5}, Lcom/ss/android/socialbase/appdownloader/f;->j(Z)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    const-string p2, "need_head_connection"

    .line 118
    invoke-virtual {v3, p2, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v5, :cond_a

    move p2, v5

    goto :goto_3

    :cond_a
    move p2, v0

    :goto_3
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->m(Z)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    const-string p2, "need_https_to_http_retry"

    .line 119
    invoke-virtual {v3, p2, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v5, :cond_b

    move p2, v5

    goto :goto_4

    :cond_b
    move p2, v0

    :goto_4
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->d(Z)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    const-string p2, "need_chunk_downgrade_retry"

    .line 120
    invoke-virtual {v3, p2, v5}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v5, :cond_c

    move p2, v5

    goto :goto_5

    :cond_c
    move p2, v0

    :goto_5
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->h(Z)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    const-string p2, "need_retry_delay"

    .line 121
    invoke-virtual {v3, p2, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v5, :cond_d

    move p2, v5

    goto :goto_6

    :cond_d
    move p2, v0

    :goto_6
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->g(Z)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    const-string p2, "retry_delay_time_array"

    .line 122
    invoke-virtual {v3, p2}, Lcom/ss/android/socialbase/downloader/g/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->i(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    const-string p2, "need_reuse_runnable"

    .line 123
    invoke-virtual {v3, p2, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v5, :cond_e

    move p2, v5

    goto :goto_7

    :cond_e
    move p2, v0

    :goto_7
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->k(Z)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    .line 124
    invoke-virtual {p1, v6}, Lcom/ss/android/socialbase/appdownloader/f;->f(I)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 125
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->isAutoInstall()Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->p(Z)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 126
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->distinctDir()Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->o(Z)Lcom/ss/android/socialbase/appdownloader/f;

    move-result-object p1

    .line 127
    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->getMimeType()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_f

    .line 128
    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->getMimeType()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->f(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;

    goto :goto_8

    :cond_f
    const-string p2, "application/vnd.android.package-archive"

    .line 129
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->f(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;

    :goto_8
    const-string p2, "notification_opt_2"

    .line 130
    invoke-virtual {v3, p2, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v5, :cond_10

    .line 131
    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/appdownloader/f;->a(Z)Lcom/ss/android/socialbase/appdownloader/f;

    .line 132
    invoke-virtual {p1, v5}, Lcom/ss/android/socialbase/appdownloader/f;->b(Z)Lcom/ss/android/socialbase/appdownloader/f;

    :cond_10
    const-string p2, "clear_space_use_disk_handler"

    .line 133
    invoke-virtual {v3, p2, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v5, :cond_11

    .line 134
    new-instance p2, Lcom/ss/android/downloadlib/addownload/c/a;

    invoke-direct {p2}, Lcom/ss/android/downloadlib/addownload/c/a;-><init>()V

    .line 135
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/f;->a(Lcom/ss/android/socialbase/downloader/depend/r;)Lcom/ss/android/socialbase/appdownloader/f;

    goto :goto_9

    :cond_11
    const/4 p2, 0x0

    .line 136
    :goto_9
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    instance-of v1, v0, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-eqz v1, :cond_12

    check-cast v0, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getTaskKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_12

    .line 137
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    check-cast v0, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getTaskKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/appdownloader/f;->d(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;

    .line 138
    :cond_12
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/h;->c()Z

    move-result v1

    invoke-static {v0, v1, p1}, Lcom/ss/android/downloadlib/addownload/i;->a(Lcom/ss/android/downloadlib/addownload/b/e;ZLcom/ss/android/socialbase/appdownloader/f;)I

    move-result p1

    if-eqz p2, :cond_13

    .line 139
    invoke-virtual {p2, p1}, Lcom/ss/android/downloadlib/addownload/c/a;->a(I)V

    :cond_13
    return p1
.end method

.method a()V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->e:Lcom/ss/android/downloadlib/addownload/h$b;

    if-nez v0, :cond_0

    .line 65
    new-instance v0, Lcom/ss/android/downloadlib/addownload/h$3;

    invoke-direct {v0, p0}, Lcom/ss/android/downloadlib/addownload/h$3;-><init>(Lcom/ss/android/downloadlib/addownload/h;)V

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->e:Lcom/ss/android/downloadlib/addownload/h$b;

    :cond_0
    return-void
.end method

.method public a(J)V
    .locals 1

    .line 2
    iput-wide p1, p0, Lcom/ss/android/downloadlib/addownload/h;->b:J

    .line 3
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/downloadlib/addownload/b/f;->e(J)Lcom/ss/android/downloadlib/addownload/b/e;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    .line 4
    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/b/e;->x()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p1

    const-string p2, "setAdId ModelBox notValid"

    invoke-virtual {p1, p2}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(Landroid/os/Message;)V
    .locals 0

    return-void
.end method

.method a(Landroid/os/Message;Lcom/ss/android/download/api/model/DownloadShortInfo;Ljava/util/Map;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Message;",
            "Lcom/ss/android/download/api/model/DownloadShortInfo;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_10

    .line 32
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto/16 :goto_3

    .line 33
    :cond_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 34
    iget p1, p1, Landroid/os/Message;->arg1:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne p1, v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v5, 0x6

    if-ne p1, v5, :cond_2

    goto :goto_0

    :cond_2
    if-ne p1, v3, :cond_4

    .line 35
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getIsFirstDownload()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 36
    invoke-static {}, Lcom/ss/android/downloadlib/g;->a()Lcom/ss/android/downloadlib/g;

    move-result-object p1

    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v6, v5, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    iget-object v7, v5, Lcom/ss/android/downloadlib/addownload/b/e;->d:Lcom/ss/android/download/api/download/DownloadController;

    iget-object v5, v5, Lcom/ss/android/downloadlib/addownload/b/e;->c:Lcom/ss/android/download/api/download/DownloadEventConfig;

    invoke-virtual {p1, v6, v7, v5}, Lcom/ss/android/downloadlib/g;->a(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/download/DownloadEventConfig;)V

    .line 37
    invoke-virtual {v0, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstDownload(Z)V

    .line 38
    :cond_3
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ss/android/downloadlib/d/a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 39
    :cond_4
    :goto_0
    invoke-virtual {p2, v0}, Lcom/ss/android/download/api/model/DownloadShortInfo;->updateFromNewDownloadInfo(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 40
    invoke-static {p2}, Lcom/ss/android/downloadlib/addownload/j;->a(Lcom/ss/android/download/api/model/DownloadShortInfo;)Lcom/ss/android/download/api/model/DownloadShortInfo;

    .line 41
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result p1

    invoke-static {p1}, Lcom/ss/android/socialbase/appdownloader/c;->a(I)I

    move-result p1

    .line 42
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v7, v5, v7

    if-lez v7, :cond_5

    .line 43
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v8

    const-wide/16 v10, 0x64

    mul-long/2addr v8, v10

    div-long/2addr v8, v5

    long-to-int v2, v8

    :cond_5
    if-gtz v7, :cond_6

    .line 44
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v5

    const-string v6, "fix_click_start"

    invoke-virtual {v5, v6}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 45
    :cond_6
    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/h;->e:Lcom/ss/android/downloadlib/addownload/h$b;

    if-eqz v5, :cond_7

    .line 46
    invoke-interface {v5, v0}, Lcom/ss/android/downloadlib/addownload/h$b;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    const/4 v5, 0x0

    .line 47
    iput-object v5, p0, Lcom/ss/android/downloadlib/addownload/h;->e:Lcom/ss/android/downloadlib/addownload/h$b;

    .line 48
    :cond_7
    invoke-static {p3}, Lcom/ss/android/downloadlib/addownload/h;->a(Ljava/util/Map;)Ljava/util/List;

    move-result-object v5

    .line 49
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_8
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    if-eq p1, v4, :cond_e

    if-eq p1, v3, :cond_d

    if-eq p1, v1, :cond_9

    goto :goto_1

    .line 50
    :cond_9
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v7

    const/4 v8, -0x4

    if-ne v7, v8, :cond_a

    .line 51
    invoke-interface {v6}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onIdle()V

    goto :goto_1

    .line 52
    :cond_a
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v7

    const/4 v8, -0x1

    if-ne v7, v8, :cond_b

    .line 53
    invoke-interface {v6, p2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadFailed(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    goto :goto_1

    .line 54
    :cond_b
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v7

    const/4 v8, -0x3

    if-ne v7, v8, :cond_8

    .line 55
    iget-object v7, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v7, v7, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v7}, Lcom/ss/android/downloadlib/g/m;->a(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v7

    if-eqz v7, :cond_c

    .line 56
    invoke-interface {v6, p2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onInstalled(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    goto :goto_1

    .line 57
    :cond_c
    invoke-interface {v6, p2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadFinished(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    goto :goto_1

    .line 58
    :cond_d
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v7

    invoke-static {v7, v2}, Lcom/ss/android/downloadlib/addownload/j;->a(II)I

    move-result v7

    invoke-interface {v6, p2, v7}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadPaused(Lcom/ss/android/download/api/model/DownloadShortInfo;I)V

    goto :goto_1

    .line 59
    :cond_e
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v7

    const/16 v8, 0xb

    if-eq v7, v8, :cond_f

    .line 60
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v7

    invoke-static {v7, v2}, Lcom/ss/android/downloadlib/addownload/j;->a(II)I

    move-result v7

    invoke-interface {v6, p2, v7}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadActive(Lcom/ss/android/download/api/model/DownloadShortInfo;I)V

    goto :goto_1

    .line 61
    :cond_f
    invoke-static {p3}, Lcom/ss/android/downloadlib/addownload/h;->b(Ljava/util/Map;)Ljava/util/List;

    move-result-object v6

    .line 62
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ss/android/download/api/download/a;

    .line 63
    invoke-interface {v7, v0}, Lcom/ss/android/download/api/download/a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    goto :goto_2

    :cond_10
    :goto_3
    return-void
.end method

.method a(Lcom/ss/android/download/api/config/t;)V
    .locals 2
    .param p1    # Lcom/ss/android/download/api/config/t;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 25
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getFilePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 26
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getFilePath()Ljava/lang/String;

    move-result-object v0

    .line 27
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 28
    invoke-interface {p1}, Lcom/ss/android/download/api/config/t;->a()V

    return-void

    .line 29
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 30
    invoke-interface {p1}, Lcom/ss/android/download/api/config/t;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 31
    :catch_0
    :cond_1
    new-instance v0, Lcom/ss/android/downloadlib/addownload/h$1;

    invoke-direct {v0, p0, p1}, Lcom/ss/android/downloadlib/addownload/h$1;-><init>(Lcom/ss/android/downloadlib/addownload/h;Lcom/ss/android/download/api/config/t;)V

    invoke-direct {p0, v0}, Lcom/ss/android/downloadlib/addownload/h;->b(Lcom/ss/android/download/api/config/t;)V

    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/h;->c:Z

    .line 7
    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/addownload/h;->b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return-void
.end method

.method a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/download/api/model/DownloadShortInfo;Ljava/util/List;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            "Lcom/ss/android/download/api/model/DownloadShortInfo;",
            "Ljava/util/List<",
            "Lcom/ss/android/download/api/download/DownloadStatusChangeListener;",
            ">;Z)V"
        }
    .end annotation

    .line 186
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_8

    if-nez p2, :cond_1

    goto/16 :goto_3

    :cond_1
    const/4 v0, 0x0

    .line 187
    :try_start_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_2

    .line 188
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v1

    const-wide/16 v3, 0x64

    mul-long/2addr v1, v3

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v3

    div-long/2addr v1, v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    long-to-int v1, v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 189
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    move v1, v0

    :goto_0
    if-gez v1, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    .line 190
    :goto_1
    invoke-virtual {p2, p1}, Lcom/ss/android/download/api/model/DownloadShortInfo;->updateFromNewDownloadInfo(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 191
    invoke-static {p2}, Lcom/ss/android/downloadlib/addownload/j;->a(Lcom/ss/android/download/api/model/DownloadShortInfo;)Lcom/ss/android/download/api/model/DownloadShortInfo;

    .line 192
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    .line 193
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_2

    .line 194
    :pswitch_1
    instance-of v2, v1, Lcom/ss/android/download/api/download/a;

    if-eqz v2, :cond_4

    .line 195
    check-cast v1, Lcom/ss/android/download/api/download/a;

    invoke-interface {v1, p1}, Lcom/ss/android/download/api/download/a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    goto :goto_2

    .line 196
    :cond_4
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-static {v2, v0}, Lcom/ss/android/downloadlib/addownload/j;->a(II)I

    move-result v2

    invoke-interface {v1, p2, v2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadActive(Lcom/ss/android/download/api/model/DownloadShortInfo;I)V

    goto :goto_2

    .line 197
    :pswitch_2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-static {v2, v0}, Lcom/ss/android/downloadlib/addownload/j;->a(II)I

    move-result v2

    invoke-interface {v1, p2, v2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadActive(Lcom/ss/android/download/api/model/DownloadShortInfo;I)V

    goto :goto_2

    .line 198
    :pswitch_3
    invoke-interface {v1, p2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadFailed(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    goto :goto_2

    .line 199
    :pswitch_4
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-static {v2, v0}, Lcom/ss/android/downloadlib/addownload/j;->a(II)I

    move-result v2

    invoke-interface {v1, p2, v2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadPaused(Lcom/ss/android/download/api/model/DownloadShortInfo;I)V

    goto :goto_2

    :pswitch_5
    if-eqz p4, :cond_5

    .line 200
    invoke-interface {v1, p2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onInstalled(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    goto :goto_2

    .line 201
    :cond_5
    invoke-interface {v1, p2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadFinished(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    goto :goto_2

    .line 202
    :pswitch_6
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v2, v2, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v2}, Lcom/ss/android/downloadlib/g/m;->a(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x3

    .line 203
    iput v2, p2, Lcom/ss/android/download/api/model/DownloadShortInfo;->status:I

    .line 204
    invoke-interface {v1, p2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onInstalled(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    goto :goto_2

    .line 205
    :cond_6
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onIdle()V

    goto :goto_2

    :cond_7
    return-void

    .line 206
    :cond_8
    :goto_3
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    .line 207
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onIdle()V

    goto :goto_4

    :cond_9
    return-void

    :pswitch_data_0
    .packed-switch -0x4
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V
    .locals 5

    .line 166
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_7

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 167
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, -0x4

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 168
    :cond_1
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/i;->a(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 169
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v1

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/h;->b:J

    invoke-virtual {v1, v3, v4, v2}, Lcom/ss/android/downloadlib/d/a;->a(JI)V

    goto :goto_1

    :cond_2
    if-eqz p2, :cond_5

    .line 170
    invoke-static {}, Lcom/ss/android/downloadlib/d/c;->a()Lcom/ss/android/downloadlib/d/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ss/android/downloadlib/d/c;->c()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, -0x2

    if-eq v0, v1, :cond_3

    const/4 v1, -0x3

    if-ne v0, v1, :cond_5

    .line 171
    :cond_3
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v1

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/h;->b:J

    invoke-virtual {v1, v3, v4, v2}, Lcom/ss/android/downloadlib/d/a;->a(JI)V

    goto :goto_1

    .line 172
    :cond_4
    :goto_0
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v1

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/h;->b:J

    invoke-virtual {v1, v3, v4, v2}, Lcom/ss/android/downloadlib/d/a;->a(JI)V

    :cond_5
    :goto_1
    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_2

    .line 173
    :pswitch_1
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p2

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/h;->b:J

    const/4 v2, 0x3

    invoke-virtual {p2, v0, v1, v2, p1}, Lcom/ss/android/downloadlib/d/a;->a(JILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    goto/16 :goto_2

    .line 174
    :pswitch_2
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v0

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/h;->b:J

    const/4 v1, 0x4

    invoke-virtual {v0, v3, v4, v1, p1}, Lcom/ss/android/downloadlib/d/a;->a(JILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    if-eqz p2, :cond_7

    .line 175
    invoke-static {}, Lcom/ss/android/downloadlib/d/c;->a()Lcom/ss/android/downloadlib/d/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/downloadlib/d/c;->b()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 176
    invoke-static {}, Lcom/ss/android/downloadlib/d/c;->a()Lcom/ss/android/downloadlib/d/c;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/h;->b:J

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->getLogExtra()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, v1, p2}, Lcom/ss/android/downloadlib/d/c;->b(JLjava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 177
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/h;->b:J

    invoke-virtual {p1, v0, v1, v2}, Lcom/ss/android/downloadlib/d/a;->a(JI)V

    goto :goto_2

    .line 178
    :pswitch_3
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v0}, Lcom/ss/android/downloadlib/g/m;->a(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 179
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p1

    const-string p2, "SUCCESSED isInstalledApp"

    invoke-virtual {p1, p2}, Lcom/ss/android/downloadlib/e/c;->b(Ljava/lang/String;)V

    goto :goto_2

    .line 180
    :cond_6
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v0

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/h;->b:J

    const/4 v1, 0x5

    invoke-virtual {v0, v3, v4, v1, p1}, Lcom/ss/android/downloadlib/d/a;->a(JILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    if-eqz p2, :cond_7

    .line 181
    invoke-static {}, Lcom/ss/android/downloadlib/d/c;->a()Lcom/ss/android/downloadlib/d/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/downloadlib/d/c;->b()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 182
    invoke-static {}, Lcom/ss/android/downloadlib/d/c;->a()Lcom/ss/android/downloadlib/d/c;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/h;->b:J

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->getLogExtra()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, v1, p2}, Lcom/ss/android/downloadlib/d/c;->b(JLjava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 183
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/h;->b:J

    invoke-virtual {p1, v0, v1, v2}, Lcom/ss/android/downloadlib/d/a;->a(JI)V

    goto :goto_2

    .line 184
    :pswitch_4
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/h;->a()V

    .line 185
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object p2

    new-instance v0, Lcom/ss/android/downloadad/api/a/b;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v2, v1, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    iget-object v3, v1, Lcom/ss/android/downloadlib/addownload/b/e;->c:Lcom/ss/android/download/api/download/DownloadEventConfig;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/b/e;->d:Lcom/ss/android/download/api/download/DownloadController;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result p1

    invoke-direct {v0, v2, v3, v1, p1}, Lcom/ss/android/downloadad/api/a/b;-><init>(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;I)V

    invoke-virtual {p2, v0}, Lcom/ss/android/downloadlib/addownload/b/f;->a(Lcom/ss/android/downloadad/api/a/b;)V

    :cond_7
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch -0x4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public a(I)Z
    .locals 4

    .line 20
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->d:Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadController;->getDownloadMode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    if-ne p1, v2, :cond_0

    return v1

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->d:Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadController;->getDownloadMode()I

    move-result v0

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    if-ne p1, v1, :cond_1

    .line 22
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "disable_lp_if_market"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    if-ne p1, v1, :cond_1

    return v1

    :cond_1
    return v3
.end method

.method public a(ILcom/ss/android/download/api/download/DownloadModel;)Z
    .locals 1

    .line 23
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/f/e;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/addownload/h;->a(I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p2}, Lcom/ss/android/downloadlib/g/m;->a(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method a(Landroid/content/Context;IZ)Z
    .locals 3

    .line 8
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p1, p1, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {p1}, Lcom/ss/android/downloadlib/g/m;->a(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 9
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object p1

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-wide p2, p2, Lcom/ss/android/downloadlib/addownload/b/e;->a:J

    invoke-virtual {p1, p2, p3}, Lcom/ss/android/downloadlib/addownload/b/f;->d(J)Lcom/ss/android/downloadad/api/a/b;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 10
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/b;->a()Lcom/ss/android/socialbase/downloader/notification/b;

    move-result-object p2

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->s()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/ss/android/socialbase/downloader/notification/b;->f(I)V

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    invoke-static {p1}, Lcom/ss/android/downloadlib/b/a;->a(Lcom/ss/android/downloadlib/addownload/b/e;)Z

    move-result p1

    return p1

    .line 12
    :cond_1
    invoke-virtual {p0, p2}, Lcom/ss/android/downloadlib/addownload/h;->a(I)Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p1, p1, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    .line 13
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 14
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    move-result-object p1

    const-string v2, "disable_market"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    if-eq p1, v1, :cond_4

    .line 15
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    invoke-static {p1, p2}, Lcom/ss/android/downloadlib/b/a;->a(Lcom/ss/android/downloadlib/addownload/b/e;I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    .line 16
    :cond_2
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/h;->d:Lcom/ss/android/downloadlib/addownload/e;

    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/e;->i()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/h;->d:Lcom/ss/android/downloadlib/addownload/e;

    invoke-virtual {p1, v1}, Lcom/ss/android/downloadlib/addownload/e;->d(Z)Z

    move-result p1

    if-eqz p1, :cond_3

    move v0, v1

    :cond_3
    return v0

    :cond_4
    if-eqz p3, :cond_5

    .line 17
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p1, p1, Lcom/ss/android/downloadlib/addownload/b/e;->d:Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadController;->getDownloadMode()I

    move-result p1

    const/4 p2, 0x4

    if-ne p1, p2, :cond_5

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/h;->d:Lcom/ss/android/downloadlib/addownload/e;

    .line 18
    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/e;->e()Z

    move-result p1

    if-nez p1, :cond_5

    .line 19
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/h;->d:Lcom/ss/android/downloadlib/addownload/e;

    invoke-virtual {p1, v1}, Lcom/ss/android/downloadlib/addownload/e;->c(Z)V

    return v1

    :cond_5
    return v0
.end method

.method a(Z)Z
    .locals 1

    if-nez p1, :cond_0

    .line 24
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object p1, p1, Lcom/ss/android/downloadlib/addownload/b/e;->d:Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadController;->getDownloadMode()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 12
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 13
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 14
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 16
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1
    .param p1    # Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->e:Lcom/ss/android/downloadlib/addownload/h$b;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/ss/android/downloadlib/addownload/h$b;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/h;->e:Lcom/ss/android/downloadlib/addownload/h$b;

    :cond_0
    return-void
.end method

.method c(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/i;->a(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/h;->c:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTargetFilePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ss/android/downloadlib/g/m;->b(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    .line 5
    :goto_0
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v1

    const-string v2, "file_status"

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    invoke-virtual {v1, v2, p1, v3}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;ILcom/ss/android/downloadlib/addownload/b/e;)V

    .line 6
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/h;->c:Z

    :cond_1
    return-void
.end method

.method d(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 1

    .line 4
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/h;->f()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/h;->e(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
