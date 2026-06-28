.class public Lcom/ss/android/downloadlib/addownload/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lorg/json/JSONObject;

.field private static b:Landroid/content/Context;

.field private static c:Lcom/ss/android/download/api/config/g;

.field private static d:Lcom/ss/android/download/api/config/c;

.field private static e:Lcom/ss/android/download/api/config/l;

.field private static f:Lcom/ss/android/download/api/config/h;

.field private static g:Lcom/ss/android/download/api/config/i;

.field private static h:Lcom/ss/android/download/api/config/j;

.field private static i:Lcom/ss/android/download/api/model/a;

.field private static j:Lcom/ss/android/download/api/config/b;

.field private static k:Lcom/ss/android/socialbase/appdownloader/c/h;

.field private static l:Lcom/ss/android/download/api/config/d;

.field private static m:Lcom/ss/android/download/api/config/e;

.field private static n:Lcom/ss/android/download/api/config/o;

.field private static o:Lcom/ss/android/download/api/config/k;

.field private static p:Lcom/ss/android/download/api/config/u;

.field private static q:Lcom/ss/android/download/api/config/n;

.field private static r:Lcom/ss/android/download/api/config/m;

.field private static s:Lcom/ss/android/download/api/config/p;

.field private static t:Lcom/ss/android/download/api/b/a;

.field private static u:Lcom/ss/android/download/api/config/q;

.field private static v:Lcom/ss/android/download/api/config/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    sput-object v0, Lcom/ss/android/downloadlib/addownload/k;->a:Lorg/json/JSONObject;

    return-void
.end method

.method public static a()Landroid/content/Context;
    .locals 2

    .line 4
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Context is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/ss/android/downloadlib/addownload/k;->b:Landroid/content/Context;

    return-void

    .line 3
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Context is null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Lcom/ss/android/download/api/b/a;)V
    .locals 0

    .line 15
    sput-object p0, Lcom/ss/android/downloadlib/addownload/k;->t:Lcom/ss/android/download/api/b/a;

    return-void
.end method

.method public static a(Lcom/ss/android/download/api/config/b;)V
    .locals 0
    .param p0    # Lcom/ss/android/download/api/config/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 12
    sput-object p0, Lcom/ss/android/downloadlib/addownload/k;->j:Lcom/ss/android/download/api/config/b;

    return-void
.end method

.method public static a(Lcom/ss/android/download/api/config/g;)V
    .locals 0
    .param p0    # Lcom/ss/android/download/api/config/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 6
    sput-object p0, Lcom/ss/android/downloadlib/addownload/k;->c:Lcom/ss/android/download/api/config/g;

    return-void
.end method

.method public static a(Lcom/ss/android/download/api/config/h;)V
    .locals 0
    .param p0    # Lcom/ss/android/download/api/config/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 8
    sput-object p0, Lcom/ss/android/downloadlib/addownload/k;->f:Lcom/ss/android/download/api/config/h;

    return-void
.end method

.method public static a(Lcom/ss/android/download/api/config/i;)V
    .locals 0
    .param p0    # Lcom/ss/android/download/api/config/i;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 9
    sput-object p0, Lcom/ss/android/downloadlib/addownload/k;->g:Lcom/ss/android/download/api/config/i;

    return-void
.end method

.method public static a(Lcom/ss/android/download/api/config/j;)V
    .locals 0
    .param p0    # Lcom/ss/android/download/api/config/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 10
    sput-object p0, Lcom/ss/android/downloadlib/addownload/k;->h:Lcom/ss/android/download/api/config/j;

    return-void
.end method

.method public static a(Lcom/ss/android/download/api/config/l;)V
    .locals 0
    .param p0    # Lcom/ss/android/download/api/config/l;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 7
    sput-object p0, Lcom/ss/android/downloadlib/addownload/k;->e:Lcom/ss/android/download/api/config/l;

    return-void
.end method

.method public static a(Lcom/ss/android/download/api/config/q;)V
    .locals 0

    .line 14
    sput-object p0, Lcom/ss/android/downloadlib/addownload/k;->u:Lcom/ss/android/download/api/config/q;

    return-void
.end method

.method public static a(Lcom/ss/android/download/api/model/a;)V
    .locals 0
    .param p0    # Lcom/ss/android/download/api/model/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 11
    sput-object p0, Lcom/ss/android/downloadlib/addownload/k;->i:Lcom/ss/android/download/api/model/a;

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    .line 13
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/d;->j()Lcom/ss/android/socialbase/appdownloader/d;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ss/android/socialbase/appdownloader/d;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static b()Lcom/ss/android/download/api/config/g;
    .locals 1

    .line 3
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->c:Lcom/ss/android/download/api/config/g;

    return-object v0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/ss/android/downloadlib/addownload/k;->b:Landroid/content/Context;

    :cond_0
    return-void
.end method

.method public static c()Lcom/ss/android/download/api/config/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->d:Lcom/ss/android/download/api/config/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/ss/android/downloadlib/addownload/k$1;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/k$1;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/ss/android/downloadlib/addownload/k;->d:Lcom/ss/android/download/api/config/c;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->d:Lcom/ss/android/download/api/config/c;

    .line 13
    .line 14
    return-object v0
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

.method public static d()Lcom/ss/android/download/api/config/l;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->e:Lcom/ss/android/download/api/config/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/ss/android/download/api/a/a;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/ss/android/download/api/a/a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/ss/android/downloadlib/addownload/k;->e:Lcom/ss/android/download/api/config/l;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->e:Lcom/ss/android/download/api/config/l;

    .line 13
    .line 14
    return-object v0
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

.method public static e()Lcom/ss/android/download/api/config/h;
    .locals 1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->f:Lcom/ss/android/download/api/config/h;

    return-object v0
.end method

.method public static f()Lcom/ss/android/download/api/config/i;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->g:Lcom/ss/android/download/api/config/i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/ss/android/download/api/a/b;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/ss/android/download/api/a/b;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/ss/android/downloadlib/addownload/k;->g:Lcom/ss/android/download/api/config/i;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->g:Lcom/ss/android/download/api/config/i;

    .line 13
    .line 14
    return-object v0
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

.method public static g()Lcom/ss/android/socialbase/appdownloader/c/h;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->k:Lcom/ss/android/socialbase/appdownloader/c/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/ss/android/downloadlib/addownload/k$2;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/k$2;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/ss/android/downloadlib/addownload/k;->k:Lcom/ss/android/socialbase/appdownloader/c/h;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->k:Lcom/ss/android/socialbase/appdownloader/c/h;

    .line 13
    .line 14
    return-object v0
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

.method public static h()Lcom/ss/android/download/api/config/o;
    .locals 1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->n:Lcom/ss/android/download/api/config/o;

    return-object v0
.end method

.method public static i()Lcom/ss/android/download/api/config/p;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->s:Lcom/ss/android/download/api/config/p;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/ss/android/downloadlib/addownload/k$3;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/k$3;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/ss/android/downloadlib/addownload/k;->s:Lcom/ss/android/download/api/config/p;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->s:Lcom/ss/android/download/api/config/p;

    .line 13
    .line 14
    return-object v0
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

.method public static j()Lorg/json/JSONObject;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->h:Lcom/ss/android/download/api/config/j;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/ss/android/download/api/config/j;->a()Lorg/json/JSONObject;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->h:Lcom/ss/android/download/api/config/j;

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/ss/android/download/api/config/j;->a()Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->a:Lorg/json/JSONObject;

    .line 20
    .line 21
    return-object v0
    .line 22
    .line 23
.end method

.method public static k()Lcom/ss/android/download/api/model/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->i:Lcom/ss/android/download/api/model/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/ss/android/download/api/model/a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/ss/android/download/api/model/a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/ss/android/download/api/model/a$a;->a()Lcom/ss/android/download/api/model/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/ss/android/downloadlib/addownload/k;->i:Lcom/ss/android/download/api/model/a;

    .line 15
    .line 16
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->i:Lcom/ss/android/download/api/model/a;

    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static l()Lcom/ss/android/download/api/config/m;
    .locals 1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->r:Lcom/ss/android/download/api/config/m;

    return-object v0
.end method

.method public static m()Lcom/ss/android/download/api/config/b;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->j:Lcom/ss/android/download/api/config/b;

    return-object v0
.end method

.method public static n()Lcom/ss/android/download/api/config/n;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->q:Lcom/ss/android/download/api/config/n;

    return-object v0
.end method

.method public static o()Ljava/lang/String;
    .locals 1

    const-string v0, "1.7.0"

    return-object v0
.end method

.method public static p()Lcom/ss/android/download/api/config/d;
    .locals 1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->l:Lcom/ss/android/download/api/config/d;

    return-object v0
.end method

.method public static q()Lcom/ss/android/download/api/config/e;
    .locals 1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->m:Lcom/ss/android/download/api/config/e;

    return-object v0
.end method

.method public static r()Lcom/ss/android/download/api/config/k;
    .locals 1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->o:Lcom/ss/android/download/api/config/k;

    return-object v0
.end method

.method public static s()Lcom/ss/android/download/api/config/q;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->u:Lcom/ss/android/download/api/config/q;

    return-object v0
.end method

.method public static t()Lcom/ss/android/download/api/config/u;
    .locals 1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->p:Lcom/ss/android/download/api/config/u;

    return-object v0
.end method

.method public static u()Lcom/ss/android/download/api/b/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->t:Lcom/ss/android/download/api/b/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/ss/android/downloadlib/addownload/k$4;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/k$4;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/ss/android/downloadlib/addownload/k;->t:Lcom/ss/android/download/api/b/a;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->t:Lcom/ss/android/download/api/b/a;

    .line 13
    .line 14
    return-object v0
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

.method public static v()Lcom/ss/android/download/api/config/s;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->v:Lcom/ss/android/download/api/config/s;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/ss/android/downloadlib/addownload/k$5;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/k$5;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/ss/android/downloadlib/addownload/k;->v:Lcom/ss/android/download/api/config/s;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->v:Lcom/ss/android/download/api/config/s;

    .line 13
    .line 14
    return-object v0
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

.method public static w()Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 10
    .line 11
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v2, 0x1d

    .line 14
    .line 15
    if-lt v1, v2, :cond_2

    .line 16
    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/o;->a()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    :cond_0
    if-le v0, v2, :cond_2

    .line 26
    .line 27
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const-string v2, "default_save_dir_name"

    .line 68
    .line 69
    const-string v3, "ByteDownload"

    .line 70
    .line 71
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    return-object v0

    .line 83
    :catchall_0
    const/4 v0, 0x0

    .line 84
    return-object v0
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

.method public static x()Z
    .locals 1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->c:Lcom/ss/android/download/api/config/g;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->f:Lcom/ss/android/download/api/config/h;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->h:Lcom/ss/android/download/api/config/j;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->j:Lcom/ss/android/download/api/config/b;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/k;->u:Lcom/ss/android/download/api/config/q;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
