.class public Lcom/uyumao/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:J

.field public final f:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    check-cast p1, Landroid/content/pm/PackageManager;

    .line 5
    .line 6
    check-cast p2, Landroid/content/pm/PackageInfo;

    .line 7
    .line 8
    iget-object v0, p2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/uyumao/p;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v0, p2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/uyumao/p;->c:Ljava/lang/String;

    .line 15
    .line 16
    iget-wide v0, p2, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 17
    .line 18
    iput-wide v0, p0, Lcom/uyumao/p;->d:J

    .line 19
    .line 20
    iget-wide v0, p2, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/uyumao/p;->e:J

    .line 23
    .line 24
    invoke-virtual {p0, p2}, Lcom/uyumao/p;->a(Landroid/content/pm/PackageInfo;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput v0, p0, Lcom/uyumao/p;->f:I

    .line 29
    .line 30
    :try_start_0
    iget-object p2, p2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    const-string p1, ""

    .line 42
    .line 43
    :goto_0
    iput-object p1, p0, Lcom/uyumao/p;->b:Ljava/lang/String;

    .line 44
    .line 45
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method


# virtual methods
.method public final a(Landroid/content/pm/PackageInfo;)I
    .locals 2

    .line 1
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, -0x1

    .line 6
    return p1

    .line 7
    :cond_0
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 8
    .line 9
    and-int/lit8 v0, p1, 0x1

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    return v1

    .line 15
    :cond_1
    and-int/lit16 p1, p1, 0x80

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    const/4 p1, 0x1

    .line 21
    return p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
