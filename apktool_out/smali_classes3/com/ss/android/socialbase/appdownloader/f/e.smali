.class public Lcom/ss/android/socialbase/appdownloader/f/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/String; = null

.field public static b:Ljava/lang/String; = ""

.field public static c:Ljava/lang/String; = null

.field private static d:Ljava/lang/String; = ""

.field private static e:Ljava/lang/String;

.field private static f:Ljava/lang/String;

.field private static g:Ljava/lang/String;

.field private static h:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a()Z
    .locals 1

    const-string v0, "EMUI"

    .line 1
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "MAGICUI"

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 4

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/f/e;->r()V

    .line 3
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_0
    const-string v0, "ro.miui.ui.version.name"

    .line 5
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "MIUI"

    .line 6
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    const-string v0, "com.xiaomi.market"

    .line 7
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    .line 8
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->f:Ljava/lang/String;

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->g:Ljava/lang/String;

    goto/16 :goto_1

    :cond_1
    const-string v0, "ro.build.version.emui"

    .line 9
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "com.hihonor.appmarket"

    const-string v2, "MAGICUI"

    if-nez v0, :cond_4

    .line 10
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/f/e;->q()Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, v2

    goto :goto_0

    :cond_2
    const-string v0, "EMUI"

    :goto_0
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    .line 11
    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 12
    sput-object v1, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    goto/16 :goto_1

    :cond_3
    const-string v0, "com.huawei.appmarket"

    .line 13
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    goto/16 :goto_1

    :cond_4
    const-string v0, "ro.build.version.magic"

    .line 14
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 15
    sput-object v2, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    .line 16
    sput-object v1, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    goto/16 :goto_1

    .line 17
    :cond_5
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "com.heytap.market"

    const/4 v2, -0x1

    if-nez v0, :cond_7

    .line 18
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->a:Ljava/lang/String;

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    .line 19
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/g;->a(Ljava/lang/String;)I

    move-result v0

    if-le v0, v2, :cond_6

    .line 20
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->b:Ljava/lang/String;

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    goto/16 :goto_1

    .line 21
    :cond_6
    sput-object v1, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    goto/16 :goto_1

    :cond_7
    const-string v0, "ro.vivo.os.version"

    .line 22
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "VIVO"

    .line 23
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    const-string v0, "com.bbk.appstore"

    .line 24
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    goto/16 :goto_1

    :cond_8
    const-string v0, "ro.smartisan.version"

    .line 25
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "SMARTISAN"

    .line 26
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    const-string v0, "com.smartisanos.appstore"

    .line 27
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    goto/16 :goto_1

    :cond_9
    const-string v0, "ro.gn.sv.version"

    .line 28
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    const-string v0, "QIONEE"

    .line 29
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    const-string v0, "com.gionee.aora.market"

    .line 30
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    goto/16 :goto_1

    :cond_a
    const-string v0, "ro.lenovo.lvp.version"

    .line 31
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "LENOVO"

    .line 32
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    const-string v0, "com.lenovo.leos.appstore"

    .line 33
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    goto/16 :goto_1

    .line 34
    :cond_b
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/f/e;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v3, "SAMSUNG"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 35
    sput-object v3, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    const-string v0, "com.sec.android.app.samsungapps"

    .line 36
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    goto/16 :goto_1

    .line 37
    :cond_c
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/f/e;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v3, "ZTE"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 38
    sput-object v3, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    const-string v0, "zte.com.market"

    .line 39
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    goto :goto_1

    .line 40
    :cond_d
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/f/e;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v3, "NUBIA"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 41
    sput-object v3, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    const-string v0, "cn.nubia.neostore"

    .line 42
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    goto :goto_1

    .line 43
    :cond_e
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/f/e;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v3, "FLYME"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 44
    sput-object v3, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    const-string v0, "com.meizu.mstore"

    .line 45
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    .line 46
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/f/e;->l()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->f:Ljava/lang/String;

    goto :goto_1

    .line 47
    :cond_f
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/f/e;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v3, "ONEPLUS"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 48
    sput-object v3, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    const-string v0, "ro.rom.version"

    .line 49
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->f:Ljava/lang/String;

    .line 50
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/g;->a(Ljava/lang/String;)I

    move-result v0

    if-le v0, v2, :cond_10

    .line 51
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->b:Ljava/lang/String;

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    goto :goto_1

    .line 52
    :cond_10
    sput-object v1, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    goto :goto_1

    .line 53
    :cond_11
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/f/e;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    const-string v0, ""

    .line 54
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    .line 55
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->f:Ljava/lang/String;

    .line 56
    :goto_1
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getprop "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object p0

    .line 3
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-virtual {p0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    invoke-direct {v4, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    const/16 p0, 0x400

    invoke-direct {v3, v4, p0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :try_start_1
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p0

    .line 5
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    new-array v1, v1, [Ljava/io/Closeable;

    aput-object v3, v1, v0

    .line 6
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    return-object p0

    :catchall_0
    move-object v3, v2

    :catchall_1
    new-array p0, v1, [Ljava/io/Closeable;

    aput-object v3, p0, v0

    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    return-object v2
.end method

.method public static b()Z
    .locals 1

    const-string v0, "MAGICUI"

    .line 1
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const-string v0, "android.os.SystemProperties"

    .line 2
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "get"

    invoke-virtual {v0, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v4

    const/4 p0, 0x0

    .line 3
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static c()Z
    .locals 1

    const-string v0, "MIUI"

    .line 1
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->b()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "enable_reflect_system_properties"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    :try_start_0
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/f/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 5
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/f/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/f/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static d()Z
    .locals 1

    const-string v0, "VIVO"

    .line 1
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static e()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/f/e;->r()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->a(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
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

.method public static f()Z
    .locals 1

    .line 1
    const-string v0, "FLYME"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public static g()Z
    .locals 1

    .line 1
    const-string v0, "SAMSUNG"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public static h()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->a(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->e:Ljava/lang/String;

    .line 11
    .line 12
    return-object v0
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

.method public static i()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->f:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->a(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->f:Ljava/lang/String;

    .line 11
    .line 12
    return-object v0
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

.method public static j()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->a(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->c:Ljava/lang/String;

    .line 11
    .line 12
    return-object v0
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

.method public static k()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static l()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static m()Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/f/e;->s()V

    .line 2
    .line 3
    .line 4
    const-string v0, "V10"

    .line 5
    .line 6
    sget-object v1, Lcom/ss/android/socialbase/appdownloader/f/e;->g:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
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

.method public static n()Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/f/e;->s()V

    .line 2
    .line 3
    .line 4
    const-string v0, "V11"

    .line 5
    .line 6
    sget-object v1, Lcom/ss/android/socialbase/appdownloader/f/e;->g:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
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

.method public static o()Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/f/e;->s()V

    .line 2
    .line 3
    .line 4
    const-string v0, "V12"

    .line 5
    .line 6
    sget-object v1, Lcom/ss/android/socialbase/appdownloader/f/e;->g:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
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

.method public static p()Z
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->h:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/f/d;->g()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "harmony"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->h:Ljava/lang/Boolean;

    .line 20
    .line 21
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->h:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0
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

.method public static q()Z
    .locals 3

    .line 1
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-string v2, "honor"

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    :cond_0
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    :cond_1
    const/4 v0, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 v0, 0x0

    .line 42
    :goto_0
    return v0
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

.method private static r()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->G()V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/e;->b:Ljava/lang/String;

    .line 13
    .line 14
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->a:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "ro.build.version."

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/e;->c:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, "rom"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->d:Ljava/lang/String;

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v1, "com."

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/e;->c:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ".market"

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->b:Ljava/lang/String;

    .line 67
    .line 68
    :cond_0
    return-void
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
.end method

.method private static s()V
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->g:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    :try_start_0
    const-string v0, "ro.miui.ui.version.name"

    .line 6
    .line 7
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/f/e;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->g:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 16
    .line 17
    .line 18
    :goto_0
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->g:Ljava/lang/String;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    :cond_0
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/f/e;->g:Ljava/lang/String;

    .line 25
    .line 26
    :cond_1
    return-void
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
