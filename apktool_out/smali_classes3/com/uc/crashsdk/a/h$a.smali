.class final Lcom/uc/crashsdk/a/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/uc/crashsdk/a/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field a:J

.field b:I

.field c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:Z

.field private f:Z


# direct methods
.method constructor <init>(Ljava/lang/String;ZZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/uc/crashsdk/a/h$a;->a:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lcom/uc/crashsdk/a/h$a;->b:I

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/uc/crashsdk/a/h$a;->e:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/uc/crashsdk/a/h$a;->f:Z

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/uc/crashsdk/a/h$a;->c:Ljava/util/Map;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/uc/crashsdk/a/h$a;->d:Ljava/lang/String;

    .line 23
    .line 24
    iput-boolean p2, p0, Lcom/uc/crashsdk/a/h$a;->e:Z

    .line 25
    .line 26
    iput-boolean p3, p0, Lcom/uc/crashsdk/a/h$a;->f:Z

    .line 27
    .line 28
    return-void
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

.method private d(Ljava/lang/String;)J
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/uc/crashsdk/a/h$a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lcom/uc/crashsdk/a/g;->c(Ljava/lang/String;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
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


# virtual methods
.method final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/uc/crashsdk/a/h$a;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method final a(ZZZ)Ljava/lang/String;
    .locals 5

    .line 14
    iget-object v0, p0, Lcom/uc/crashsdk/a/h$a;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n"

    const-string v2, "lt"

    if-eqz p1, :cond_4

    const-string p1, "uc"

    .line 16
    invoke-static {v0, v2, p1}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "pre"

    invoke-static {}, Lcom/uc/crashsdk/g;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "pkg"

    sget-object v3, Lcom/uc/crashsdk/a;->a:Ljava/lang/String;

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "rom"

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "brd"

    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "model"

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    int-to-long v3, p1

    const-string p1, "sdk"

    invoke-static {v0, p1, v3, v4}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    const-string p1, "cpu"

    invoke-static {}, Lcom/uc/crashsdk/e;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "hdw"

    invoke-static {}, Lcom/uc/crashsdk/e;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/uc/crashsdk/a/h;->l()J

    move-result-wide v3

    const-string p1, "ram"

    invoke-static {v0, p1, v3, v4}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    const-string p1, "aram"

    invoke-static {v3, v4}, Lcom/uc/crashsdk/a/h;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "cver"

    const-string v3, "3.3.2.2"

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "cseq"

    const-string v3, "211215141717"

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "ctag"

    const-string v3, "release"

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "aver"

    invoke-static {}, Lcom/uc/crashsdk/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "ver"

    invoke-static {}, Lcom/uc/crashsdk/g;->T()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "sver"

    invoke-static {}, Lcom/uc/crashsdk/g;->U()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "seq"

    invoke-static {}, Lcom/uc/crashsdk/g;->V()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/uc/crashsdk/b;->A()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "fg"

    goto :goto_0

    :cond_1
    const-string p1, "bg"

    :goto_0
    const-string v3, "grd"

    invoke-static {v0, v3, p1}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "os"

    const-string v3, "android"

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "dn"

    invoke-static {}, Lcom/uc/crashsdk/e;->q()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, p1, v3}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/uc/crashsdk/g;->ab()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const-string v4, "k_uid"

    if-eqz v3, :cond_2

    invoke-static {}, Lcom/uc/crashsdk/e;->q()Ljava/lang/String;

    move-result-object p1

    :cond_2
    invoke-static {v0, v4, p1}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/uc/crashsdk/g;->ac()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "k_channel"

    invoke-static {v0, v3, p1}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    :cond_4
    iget-object p1, p0, Lcom/uc/crashsdk/a/h$a;->d:Ljava/lang/String;

    invoke-static {v0, v2, p1}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lcom/uc/crashsdk/a/h$a;->c:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/util/Map;)V

    .line 19
    iget-boolean p1, p0, Lcom/uc/crashsdk/a/h$a;->e:Z

    if-eqz p1, :cond_7

    if-nez p2, :cond_7

    .line 20
    iget-wide p1, p0, Lcom/uc/crashsdk/a/h$a;->a:J

    const-wide/16 v2, 0x0

    cmp-long v2, p1, v2

    if-eqz v2, :cond_5

    const-string v2, "up"

    .line 21
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    .line 22
    invoke-static {v0, v2, p1}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    const/4 p1, 0x0

    const/4 p2, 0x1

    const-string v2, "%d"

    const-string v3, "pid"

    if-eqz p3, :cond_6

    .line 23
    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p2, p2, [Ljava/lang/Object;

    .line 24
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, p2, p1

    .line 25
    invoke-static {p3, v2, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v3, p1}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 26
    :cond_6
    iget p3, p0, Lcom/uc/crashsdk/a/h$a;->b:I

    if-eqz p3, :cond_7

    .line 27
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p2, p2, [Ljava/lang/Object;

    .line 28
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, p1

    .line 29
    invoke-static {v4, v2, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v3, p1}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    :cond_7
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method final a(Ljava/lang/String;J)V
    .locals 4

    .line 2
    invoke-direct {p0, p1}, Lcom/uc/crashsdk/a/h$a;->d(Ljava/lang/String;)J

    move-result-wide v0

    add-long/2addr v0, p2

    const-wide/16 v2, 0x64

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 p2, 0x0

    cmp-long v2, v0, p2

    if-gez v2, :cond_1

    goto :goto_0

    :cond_1
    move-wide p2, v0

    .line 3
    :goto_0
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/uc/crashsdk/a/h$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/uc/crashsdk/a/h$a;->c:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method final a(Lcom/uc/crashsdk/a/h$a;)Z
    .locals 7

    .line 4
    iget-boolean v0, p0, Lcom/uc/crashsdk/a/h$a;->f:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 5
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v0, v1, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/uc/crashsdk/a/h$a;->d:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "WaItem \'%s\' is not mergable!"

    invoke-static {p1, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "crashsdk"

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v2

    .line 6
    :cond_0
    iget-object v0, p1, Lcom/uc/crashsdk/a/h$a;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "c_"

    .line 8
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 9
    invoke-virtual {p1, v2}, Lcom/uc/crashsdk/a/h$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lcom/uc/crashsdk/a/h$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-direct {p1, v2}, Lcom/uc/crashsdk/a/h$a;->d(Ljava/lang/String;)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v5, v3, v5

    if-eqz v5, :cond_3

    const-wide/16 v5, 0x64

    cmp-long v5, v3, v5

    if-gez v5, :cond_1

    .line 11
    invoke-virtual {p0, v2, v3, v4}, Lcom/uc/crashsdk/a/h$a;->a(Ljava/lang/String;J)V

    goto :goto_0

    .line 12
    :cond_3
    invoke-virtual {p1, v2}, Lcom/uc/crashsdk/a/h$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lcom/uc/crashsdk/a/h$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    return v1
.end method

.method final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/uc/crashsdk/a/h$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method final c(Ljava/lang/String;)Z
    .locals 10

    .line 1
    invoke-static {p1}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lcom/uc/crashsdk/a/h;->c(Ljava/lang/String;)Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/4 v3, 0x0

    .line 27
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    move v6, v1

    .line 30
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-eqz v7, :cond_4

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    check-cast v7, Ljava/lang/String;

    .line 41
    .line 42
    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    check-cast v8, Ljava/lang/String;

    .line 47
    .line 48
    const-string v9, "lt"

    .line 49
    .line 50
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    if-eqz v9, :cond_1

    .line 55
    .line 56
    move-object v3, v8

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-boolean v9, p0, Lcom/uc/crashsdk/a/h$a;->e:Z

    .line 59
    .line 60
    if-eqz v9, :cond_2

    .line 61
    .line 62
    const-string v9, "up"

    .line 63
    .line 64
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    if-eqz v9, :cond_2

    .line 69
    .line 70
    invoke-static {v8}, Lcom/uc/crashsdk/a/g;->c(Ljava/lang/String;)J

    .line 71
    .line 72
    .line 73
    move-result-wide v4

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    iget-boolean v9, p0, Lcom/uc/crashsdk/a/h$a;->e:Z

    .line 76
    .line 77
    if-eqz v9, :cond_3

    .line 78
    .line 79
    const-string v9, "pid"

    .line 80
    .line 81
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-eqz v9, :cond_3

    .line 86
    .line 87
    invoke-static {v8}, Lcom/uc/crashsdk/a/g;->c(Ljava/lang/String;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v6

    .line 91
    long-to-int v6, v6

    .line 92
    goto :goto_0

    .line 93
    :cond_3
    invoke-interface {v0, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    iget-object p1, p0, Lcom/uc/crashsdk/a/h$a;->d:Ljava/lang/String;

    .line 98
    .line 99
    if-eqz p1, :cond_5

    .line 100
    .line 101
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-nez p1, :cond_5

    .line 106
    .line 107
    return v1

    .line 108
    :cond_5
    iput-wide v4, p0, Lcom/uc/crashsdk/a/h$a;->a:J

    .line 109
    .line 110
    iput v6, p0, Lcom/uc/crashsdk/a/h$a;->b:I

    .line 111
    .line 112
    iput-object v3, p0, Lcom/uc/crashsdk/a/h$a;->d:Ljava/lang/String;

    .line 113
    .line 114
    iput-object v0, p0, Lcom/uc/crashsdk/a/h$a;->c:Ljava/util/Map;

    .line 115
    .line 116
    const/4 p1, 0x1

    .line 117
    return p1
    .line 118
    .line 119
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method
