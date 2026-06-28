.class final Lcom/tendcloud/tenddata/am;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/am$a;
    }
.end annotation


# static fields
.field private static final a:I = 0x3a98

.field private static final b:I = 0x3a98


# instance fields
.field private c:Ljava/net/URL;

.field private d:Lcom/tendcloud/tenddata/aq;

.field private e:Lcom/tendcloud/tenddata/ap;

.field private f:Lcom/tendcloud/tenddata/an;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:I

.field private k:I


# direct methods
.method private constructor <init>(Ljava/net/URL;Lcom/tendcloud/tenddata/aq;Lcom/tendcloud/tenddata/ap;Lcom/tendcloud/tenddata/an;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    .line 4
    iput-object p2, p0, Lcom/tendcloud/tenddata/am;->d:Lcom/tendcloud/tenddata/aq;

    .line 5
    iput-object p3, p0, Lcom/tendcloud/tenddata/am;->e:Lcom/tendcloud/tenddata/ap;

    .line 6
    iput-object p4, p0, Lcom/tendcloud/tenddata/am;->f:Lcom/tendcloud/tenddata/an;

    .line 7
    iput p5, p0, Lcom/tendcloud/tenddata/am;->j:I

    .line 8
    iput p6, p0, Lcom/tendcloud/tenddata/am;->k:I

    .line 9
    iput-object p7, p0, Lcom/tendcloud/tenddata/am;->g:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/tendcloud/tenddata/am;->i:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/net/URL;Lcom/tendcloud/tenddata/aq;Lcom/tendcloud/tenddata/ap;Lcom/tendcloud/tenddata/an;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/am$1;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, Lcom/tendcloud/tenddata/am;-><init>(Ljava/net/URL;Lcom/tendcloud/tenddata/aq;Lcom/tendcloud/tenddata/ap;Lcom/tendcloud/tenddata/an;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/tendcloud/tenddata/aq;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->d:Lcom/tendcloud/tenddata/aq;

    return-object v0
.end method

.method a(Lcom/tendcloud/tenddata/a;)Lcom/tendcloud/tenddata/ar;
    .locals 7

    const-string v0, "TD_app_pefercen_profile"

    const-string v1, ""

    .line 2
    invoke-static {v1}, Lcom/tendcloud/tenddata/ar;->a(Ljava/lang/String;)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    const/4 v2, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0, v2}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    .line 4
    iget-object v3, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    .line 5
    iget-object v4, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p1

    const-string v5, "SDK"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v5

    if-ne p1, v5, :cond_2

    .line 7
    invoke-static {v4}, Lcom/tendcloud/tenddata/ai;->a(Ljava/lang/String;)V

    move p1, v2

    .line 8
    :goto_0
    sget-object v5, Lcom/tendcloud/tenddata/ai;->a:Ljava/util/Queue;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    if-gt p1, v5, :cond_2

    .line 9
    invoke-static {}, Lcom/tendcloud/tenddata/ai;->a()Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    .line 10
    invoke-static {v3, v5}, Lcom/tendcloud/tenddata/ai;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v5

    iput-object v5, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    .line 11
    invoke-virtual {v3, v5}, Ljava/net/URL;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {p0, v2}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    .line 13
    iget-object v5, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v5}, Lcom/tendcloud/tenddata/ai;->a(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result v5

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v6

    if-eq v5, v6, :cond_1

    .line 15
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v2, "TD_sdk_last_send_url"

    iget-object v3, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v0, v2, v3}, Lcom/tendcloud/tenddata/s;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v2, "TD_sdk_last_send_host"

    iget-object v3, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1, v0, v2, v3}, Lcom/tendcloud/tenddata/s;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 17
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->i:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/tendcloud/tenddata/ak;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v0

    const/4 v2, 0x2

    if-eq p1, v0, :cond_3

    .line 19
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/ak;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v2}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;)V

    return-object v1

    .line 21
    :cond_3
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1, v2}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x3

    const/4 v3, 0x1

    if-eqz p1, :cond_4

    .line 22
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    iget-object v4, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v4, v2}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Lcom/tendcloud/tenddata/ak;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    .line 23
    invoke-virtual {p0, v3}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v3

    if-ne p1, v3, :cond_8

    .line 25
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {p1, v3, v2}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;Ljava/lang/String;I)V

    goto/16 :goto_2

    .line 26
    :cond_4
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1, v3}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 27
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    iget-object v4, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v4, v3}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Lcom/tendcloud/tenddata/ak;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    .line 28
    invoke-virtual {p0, v3}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v4

    if-eq p1, v4, :cond_5

    .line 30
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1, v3}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4, v2}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 31
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;)V

    .line 32
    :cond_5
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v4

    if-ne p1, v4, :cond_6

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    .line 33
    invoke-static {p1, v0}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 34
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    iget-object v4, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v4, v0}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Lcom/tendcloud/tenddata/ak;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    .line 35
    invoke-virtual {p0, v3}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    .line 36
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v4

    if-eq p1, v4, :cond_6

    .line 37
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4, v2}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    :cond_6
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v4

    if-ne p1, v4, :cond_7

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    const/4 v4, 0x4

    .line 39
    invoke-static {p1, v4}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 40
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    iget-object v5, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v5, v4}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v5}, Lcom/tendcloud/tenddata/ak;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    .line 41
    invoke-virtual {p0, v3}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    .line 42
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v5

    if-eq p1, v5, :cond_7

    .line 43
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1, v4}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4, v2}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 44
    :cond_7
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v2

    if-ne p1, v2, :cond_8

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/aj;->b(Ljava/lang/String;)I

    move-result p1

    if-ne p1, v0, :cond_8

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/aj;->c(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 45
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/aj;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 46
    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 47
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-static {v2, p1}, Lcom/tendcloud/tenddata/ak;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v2

    iput-object v2, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    .line 48
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v2}, Lcom/tendcloud/tenddata/aj;->updateTimeStamp(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p0, v3}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    move-result-object v1

    .line 50
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result v2

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v3

    if-eq v2, v3, :cond_8

    .line 51
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {v2, p1}, Lcom/tendcloud/tenddata/ak;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    :cond_8
    :goto_2
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ar;->b()I

    move-result p1

    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    move-result v2

    if-ne p1, v2, :cond_9

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/aj;->b(Ljava/lang/String;)I

    move-result p1

    if-ge p1, v0, :cond_9

    .line 53
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/aj;->updateFailureCountWithHost(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_9
    return-object v1
.end method

.method a(Z)Lcom/tendcloud/tenddata/ar;
    .locals 7

    const-string v0, "Host"

    const/4 v1, 0x0

    .line 54
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 55
    iget-object v4, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    check-cast v4, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v1, 0x3a98

    .line 56
    :try_start_1
    invoke-virtual {v4, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 57
    invoke-virtual {v4, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 58
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "https://"

    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 59
    sget-object v1, Lcom/tendcloud/tenddata/ah;->a:Ljava/util/HashMap;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iget-object v6, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 60
    invoke-static {v4}, Lcom/tendcloud/tenddata/ah;->setHostNameVerifyAllowAll(Ljava/net/URLConnection;)V

    .line 61
    :cond_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->g:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 62
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->g:Ljava/lang/String;

    invoke-static {v4, p1}, Lcom/tendcloud/tenddata/ah;->a(Ljava/net/URLConnection;Ljava/lang/String;)V

    .line 63
    :cond_1
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 64
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v4, v0, p1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    invoke-virtual {v4, v0, p1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    :cond_3
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->d:Lcom/tendcloud/tenddata/aq;

    if-eqz p1, :cond_4

    .line 67
    invoke-virtual {p1, v4}, Lcom/tendcloud/tenddata/aq;->a(Ljava/net/HttpURLConnection;)V

    .line 68
    :cond_4
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->e:Lcom/tendcloud/tenddata/ap;

    if-eqz p1, :cond_5

    .line 69
    invoke-virtual {p1, v4}, Lcom/tendcloud/tenddata/ap;->a(Ljava/net/HttpURLConnection;)V

    .line 70
    :cond_5
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->f:Lcom/tendcloud/tenddata/an;

    if-eqz p1, :cond_6

    .line 71
    invoke-virtual {p1, v4}, Lcom/tendcloud/tenddata/an;->a(Ljava/net/HttpURLConnection;)V

    .line 72
    :cond_6
    invoke-virtual {v4}, Ljava/net/URLConnection;->connect()V

    .line 73
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->f:Lcom/tendcloud/tenddata/an;

    invoke-static {p1, v4, v2, v3, v0}, Lcom/tendcloud/tenddata/ar;->a(Ljava/lang/String;Ljava/net/HttpURLConnection;JLcom/tendcloud/tenddata/an;)Lcom/tendcloud/tenddata/ar;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_2

    :catchall_0
    move-exception p1

    move-object v1, v4

    goto :goto_1

    :catchall_1
    move-exception p1

    .line 75
    :goto_1
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/ar;->a(Ljava/lang/String;)Lcom/tendcloud/tenddata/ar;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v1, :cond_7

    .line 76
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_7
    :goto_2
    return-object p1

    :catchall_2
    move-exception p1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_8
    throw p1
.end method

.method b()Lcom/tendcloud/tenddata/ar;
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/ar;->a(Ljava/lang/String;)Lcom/tendcloud/tenddata/ar;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p0, v1}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/ar;->b()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {}, Lcom/tendcloud/tenddata/ar;->a()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1}, Lcom/tendcloud/tenddata/aj;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    .line 35
    .line 36
    invoke-static {v2, v1}, Lcom/tendcloud/tenddata/ak;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-virtual {p0, v1}, Lcom/tendcloud/tenddata/am;->a(Z)Lcom/tendcloud/tenddata/ar;

    .line 44
    .line 45
    .line 46
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    :catchall_0
    :cond_0
    return-object v0
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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "\n url: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->c:Ljava/net/URL;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "\n method: "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->d:Lcom/tendcloud/tenddata/aq;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, "\n headers: "

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->e:Lcom/tendcloud/tenddata/ap;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, "\n content length: "

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->f:Lcom/tendcloud/tenddata/an;

    .line 42
    .line 43
    const-string v2, ""

    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/an;->a()[B

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    array-length v1, v1

    .line 52
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move-object v1, v2

    .line 58
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, "\n content Type: "

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->f:Lcom/tendcloud/tenddata/an;

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/an;->b()Lcom/tendcloud/tenddata/an$a;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, "\n host: "

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v1, "\n ip: "

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->i:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, "\n connectionTimeout: "

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    iget v1, p0, Lcom/tendcloud/tenddata/am;->j:I

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v1, "\n readTimeout: "

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget v1, p0, Lcom/tendcloud/tenddata/am;->k:I

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v1, "\n cert:  "

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->g:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v1, "\n"

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    return-object v0
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method
