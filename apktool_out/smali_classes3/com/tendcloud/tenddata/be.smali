.class public Lcom/tendcloud/tenddata/be;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/be$a;
    }
.end annotation


# static fields
.field private static volatile a:Lcom/tendcloud/tenddata/be;

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static d:Ljava/lang/String;

.field private static e:Ljava/lang/String;

.field private static f:Ljava/lang/String;

.field private static g:Ljava/lang/String;

.field private static h:Ljava/lang/String;

.field private static i:Ljava/lang/String;

.field private static j:Ljava/lang/String;

.field private static k:Ljava/lang/String;

.field private static l:Ljava/lang/String;

.field private static m:Ljava/lang/String;

.field private static n:Ljava/lang/String;

.field private static o:Ljava/lang/String;

.field private static p:Ljava/lang/String;

.field private static q:Ljava/lang/String;

.field private static r:Ljava/lang/String;

.field private static t:Ljava/lang/String;

.field private static z:Lorg/json/JSONObject;


# instance fields
.field private A:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private s:Ljava/lang/String;

.field private u:Lcom/tendcloud/tenddata/be$a;

.field private v:Ljava/lang/String;

.field private w:I

.field private x:Ljava/lang/String;

.field private y:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/tendcloud/tenddata/be;->a()Lcom/tendcloud/tenddata/be;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/z;->register(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    :catchall_0
    const-string v0, "account"

    .line 13
    .line 14
    sput-object v0, Lcom/tendcloud/tenddata/be;->b:Ljava/lang/String;

    .line 15
    .line 16
    const-string v0, "accountId"

    .line 17
    .line 18
    sput-object v0, Lcom/tendcloud/tenddata/be;->c:Ljava/lang/String;

    .line 19
    .line 20
    const-string v0, "name"

    .line 21
    .line 22
    sput-object v0, Lcom/tendcloud/tenddata/be;->d:Ljava/lang/String;

    .line 23
    .line 24
    const-string v0, "gender"

    .line 25
    .line 26
    sput-object v0, Lcom/tendcloud/tenddata/be;->e:Ljava/lang/String;

    .line 27
    .line 28
    const-string v0, "age"

    .line 29
    .line 30
    sput-object v0, Lcom/tendcloud/tenddata/be;->f:Ljava/lang/String;

    .line 31
    .line 32
    const-string v0, "type"

    .line 33
    .line 34
    sput-object v0, Lcom/tendcloud/tenddata/be;->g:Ljava/lang/String;

    .line 35
    .line 36
    const-string v0, "accountCus"

    .line 37
    .line 38
    sput-object v0, Lcom/tendcloud/tenddata/be;->h:Ljava/lang/String;

    .line 39
    .line 40
    const-string v0, "property1"

    .line 41
    .line 42
    sput-object v0, Lcom/tendcloud/tenddata/be;->i:Ljava/lang/String;

    .line 43
    .line 44
    const-string v0, "property2"

    .line 45
    .line 46
    sput-object v0, Lcom/tendcloud/tenddata/be;->j:Ljava/lang/String;

    .line 47
    .line 48
    const-string v0, "property3"

    .line 49
    .line 50
    sput-object v0, Lcom/tendcloud/tenddata/be;->k:Ljava/lang/String;

    .line 51
    .line 52
    const-string v0, "property4"

    .line 53
    .line 54
    sput-object v0, Lcom/tendcloud/tenddata/be;->l:Ljava/lang/String;

    .line 55
    .line 56
    const-string v0, "property5"

    .line 57
    .line 58
    sput-object v0, Lcom/tendcloud/tenddata/be;->m:Ljava/lang/String;

    .line 59
    .line 60
    const-string v0, "property6"

    .line 61
    .line 62
    sput-object v0, Lcom/tendcloud/tenddata/be;->n:Ljava/lang/String;

    .line 63
    .line 64
    const-string v0, "property7"

    .line 65
    .line 66
    sput-object v0, Lcom/tendcloud/tenddata/be;->o:Ljava/lang/String;

    .line 67
    .line 68
    const-string v0, "property8"

    .line 69
    .line 70
    sput-object v0, Lcom/tendcloud/tenddata/be;->p:Ljava/lang/String;

    .line 71
    .line 72
    const-string v0, "property9"

    .line 73
    .line 74
    sput-object v0, Lcom/tendcloud/tenddata/be;->q:Ljava/lang/String;

    .line 75
    .line 76
    const-string v0, "property10"

    .line 77
    .line 78
    sput-object v0, Lcom/tendcloud/tenddata/be;->r:Ljava/lang/String;

    .line 79
    .line 80
    const-string v0, "default"

    .line 81
    .line 82
    sput-object v0, Lcom/tendcloud/tenddata/be;->t:Ljava/lang/String;

    .line 83
    .line 84
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

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/tendcloud/tenddata/be$a;->UNKNOWN:Lcom/tendcloud/tenddata/be$a;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tendcloud/tenddata/be;->u:Lcom/tendcloud/tenddata/be$a;

    .line 7
    .line 8
    new-instance v0, Ljava/util/TreeMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

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
.end method

.method public static a()Lcom/tendcloud/tenddata/be;
    .locals 2

    .line 62
    sget-object v0, Lcom/tendcloud/tenddata/be;->a:Lcom/tendcloud/tenddata/be;

    if-nez v0, :cond_1

    .line 63
    const-class v0, Lcom/tendcloud/tenddata/be;

    monitor-enter v0

    .line 64
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/be;->a:Lcom/tendcloud/tenddata/be;

    if-nez v1, :cond_0

    .line 65
    new-instance v1, Lcom/tendcloud/tenddata/be;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/be;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/be;->a:Lcom/tendcloud/tenddata/be;

    .line 66
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 67
    :cond_1
    :goto_0
    sget-object v0, Lcom/tendcloud/tenddata/be;->a:Lcom/tendcloud/tenddata/be;

    return-object v0
.end method

.method private a(Lcom/tendcloud/tenddata/a;)V
    .locals 2

    .line 2
    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/bu;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bu;-><init>()V

    .line 3
    sget-object v1, Lcom/tendcloud/tenddata/bu$a;->IMMEDIATELY:Lcom/tendcloud/tenddata/bu$a;

    iput-object v1, v0, Lcom/tendcloud/tenddata/bu;->b:Lcom/tendcloud/tenddata/bu$a;

    .line 4
    iput-object p1, v0, Lcom/tendcloud/tenddata/bu;->a:Lcom/tendcloud/tenddata/a;

    .line 5
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method protected static a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-static {p0, p1, p2, v0, p3}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method protected static a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    if-nez p4, :cond_0

    return-void

    :cond_0
    if-eqz p0, :cond_3

    if-eqz p1, :cond_3

    .line 7
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_3

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 8
    new-instance v0, Lcom/tendcloud/tenddata/bv;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bv;-><init>()V

    .line 9
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    .line 10
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    if-eqz p2, :cond_2

    .line 11
    instance-of p0, p2, Ljava/util/Map;

    if-eqz p0, :cond_2

    .line 12
    check-cast p2, Ljava/util/Map;

    if-eqz p3, :cond_1

    const-string p0, "eventValue"

    .line 13
    invoke-interface {p2, p0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    :cond_1
    iput-object p2, v0, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    .line 15
    :cond_2
    iput-object p4, v0, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    .line 16
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    .line 31
    :try_start_0
    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->s:Ljava/lang/String;

    .line 32
    invoke-static {p1}, Lcom/tendcloud/tenddata/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 33
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 34
    sget-object p1, Lcom/tendcloud/tenddata/be;->d:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 35
    sget-object p1, Lcom/tendcloud/tenddata/be;->d:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->v:Ljava/lang/String;

    .line 36
    :cond_0
    sget-object p1, Lcom/tendcloud/tenddata/be;->e:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 37
    sget-object p1, Lcom/tendcloud/tenddata/be;->e:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/be$a;->valueOf(Ljava/lang/String;)Lcom/tendcloud/tenddata/be$a;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->u:Lcom/tendcloud/tenddata/be$a;

    .line 38
    :cond_1
    sget-object p1, Lcom/tendcloud/tenddata/be;->f:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 39
    sget-object p1, Lcom/tendcloud/tenddata/be;->f:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/tendcloud/tenddata/be;->w:I

    .line 40
    :cond_2
    sget-object p1, Lcom/tendcloud/tenddata/be;->g:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 41
    sget-object p1, Lcom/tendcloud/tenddata/be;->g:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->x:Ljava/lang/String;

    .line 42
    :cond_3
    sget-object p1, Lcom/tendcloud/tenddata/be;->h:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 43
    sget-object p1, Lcom/tendcloud/tenddata/be;->h:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_4
    return-void
.end method

.method public static declared-synchronized a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 3

    const-class v0, Lcom/tendcloud/tenddata/be;

    monitor-enter v0

    .line 44
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    .line 45
    sput-object p0, Lcom/tendcloud/tenddata/be;->t:Ljava/lang/String;

    .line 46
    invoke-static {}, Lcom/tendcloud/tenddata/be;->g()Ljava/util/Map;

    move-result-object p0

    .line 47
    sget-object v1, Lcom/tendcloud/tenddata/be;->b:Ljava/lang/String;

    const-string v2, "roleCreate"

    invoke-static {v1, v2, p0, p1}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    .line 48
    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    move-result-object p1

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1, v1}, Lcom/tendcloud/tenddata/ct;->setSubprofile(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    :catchall_0
    monitor-exit v0

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    .locals 8

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v7, p6

    .line 17
    invoke-direct/range {v0 .. v7}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    .line 18
    :try_start_0
    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->c()V

    .line 19
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->s:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 20
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 21
    :cond_0
    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->s:Ljava/lang/String;

    .line 22
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 23
    sget-object v0, Lcom/tendcloud/tenddata/be;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/tendcloud/tenddata/be;->s:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    check-cast p2, Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    if-eqz p5, :cond_1

    const-string p2, "invitationCode"

    .line 25
    invoke-static {p5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p5

    invoke-interface {p1, p2, p5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    :cond_1
    iget-object p2, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 27
    new-instance p2, Lorg/json/JSONObject;

    iget-object p5, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    invoke-direct {p2, p5}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 28
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Lcom/tendcloud/tenddata/i;->setUniversalProfileInfo(Ljava/lang/String;)V

    .line 29
    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    move-result-object p5

    invoke-virtual {p5, p2}, Lcom/tendcloud/tenddata/ct;->setProfile(Lorg/json/JSONObject;)V

    .line 30
    invoke-static {p4, p3, p1, p6, p7}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private a(Ljava/lang/Object;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    :try_start_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p1

    :catchall_0
    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private b()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->s:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 9
    iget-object v1, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    sget-object v2, Lcom/tendcloud/tenddata/be;->c:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    :catchall_0
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    return-object v0
.end method

.method private static b(Lcom/tendcloud/tenddata/a;)V
    .locals 3

    .line 21
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/be;->g()Ljava/util/Map;

    move-result-object v0

    .line 22
    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    move-result-object v1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1, v2}, Lcom/tendcloud/tenddata/ct;->setSubprofile(Lorg/json/JSONObject;)V

    .line 23
    sget-object v1, Lcom/tendcloud/tenddata/be;->b:Ljava/lang/String;

    const-string v2, "roleUpdate"

    invoke-static {v1, v2, v0, p0}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->c()V

    .line 2
    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->b()Ljava/util/Map;

    move-result-object v0

    .line 3
    move-object v1, p1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 4
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 5
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/i;->setUniversalProfileInfo(Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/ct;->setProfile(Lorg/json/JSONObject;)V

    .line 7
    invoke-static {p3, p2, p1, p4}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private c()V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/i;->m()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    new-instance v1, Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lcom/tendcloud/tenddata/be;->c:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v0, Lcom/tendcloud/tenddata/be;->c:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/tendcloud/tenddata/be;->s:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v2, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    .line 29
    .line 30
    sget-object v3, Lcom/tendcloud/tenddata/be;->c:Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_0
    sget-object v0, Lcom/tendcloud/tenddata/be;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    .line 44
    .line 45
    sget-object v2, Lcom/tendcloud/tenddata/be;->d:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_1
    sget-object v0, Lcom/tendcloud/tenddata/be;->g:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    .line 63
    .line 64
    sget-object v2, Lcom/tendcloud/tenddata/be;->g:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :cond_2
    sget-object v0, Lcom/tendcloud/tenddata/be;->e:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    .line 86
    .line 87
    sget-object v2, Lcom/tendcloud/tenddata/be;->e:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    :cond_3
    sget-object v0, Lcom/tendcloud/tenddata/be;->f:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_4

    .line 107
    .line 108
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    .line 109
    .line 110
    sget-object v2, Lcom/tendcloud/tenddata/be;->f:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    :cond_4
    sget-object v0, Lcom/tendcloud/tenddata/be;->i:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_5

    .line 130
    .line 131
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    .line 132
    .line 133
    sget-object v2, Lcom/tendcloud/tenddata/be;->i:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    :cond_5
    sget-object v0, Lcom/tendcloud/tenddata/be;->j:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_6

    .line 149
    .line 150
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    .line 151
    .line 152
    sget-object v2, Lcom/tendcloud/tenddata/be;->j:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    :cond_6
    sget-object v0, Lcom/tendcloud/tenddata/be;->k:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_7

    .line 168
    .line 169
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    .line 170
    .line 171
    sget-object v2, Lcom/tendcloud/tenddata/be;->k:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    :cond_7
    sget-object v0, Lcom/tendcloud/tenddata/be;->l:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_8

    .line 187
    .line 188
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    .line 189
    .line 190
    sget-object v2, Lcom/tendcloud/tenddata/be;->l:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    :cond_8
    sget-object v0, Lcom/tendcloud/tenddata/be;->m:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_9

    .line 206
    .line 207
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    .line 208
    .line 209
    sget-object v2, Lcom/tendcloud/tenddata/be;->m:Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    :cond_9
    sget-object v0, Lcom/tendcloud/tenddata/be;->n:Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_a

    .line 225
    .line 226
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    .line 227
    .line 228
    sget-object v2, Lcom/tendcloud/tenddata/be;->n:Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    :cond_a
    sget-object v0, Lcom/tendcloud/tenddata/be;->o:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_b

    .line 244
    .line 245
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    .line 246
    .line 247
    sget-object v2, Lcom/tendcloud/tenddata/be;->o:Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    :cond_b
    sget-object v0, Lcom/tendcloud/tenddata/be;->p:Ljava/lang/String;

    .line 257
    .line 258
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_c

    .line 263
    .line 264
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    .line 265
    .line 266
    sget-object v2, Lcom/tendcloud/tenddata/be;->p:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    :cond_c
    sget-object v0, Lcom/tendcloud/tenddata/be;->q:Ljava/lang/String;

    .line 276
    .line 277
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-eqz v0, :cond_d

    .line 282
    .line 283
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    .line 284
    .line 285
    sget-object v2, Lcom/tendcloud/tenddata/be;->q:Ljava/lang/String;

    .line 286
    .line 287
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    :cond_d
    sget-object v0, Lcom/tendcloud/tenddata/be;->r:Ljava/lang/String;

    .line 295
    .line 296
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-eqz v0, :cond_e

    .line 301
    .line 302
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->A:Ljava/util/Map;

    .line 303
    .line 304
    sget-object v2, Lcom/tendcloud/tenddata/be;->r:Ljava/lang/String;

    .line 305
    .line 306
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 311
    .line 312
    .line 313
    :catchall_0
    :cond_e
    return-void
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

.method private d()V
    .locals 5

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->f()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/tendcloud/tenddata/zz$a;

    .line 6
    .line 7
    invoke-direct {v1}, Lcom/tendcloud/tenddata/zz$a;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 11
    .line 12
    const-string v3, "apiType"

    .line 13
    .line 14
    const/16 v4, 0x9

    .line 15
    .line 16
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 24
    .line 25
    const-string v3, "domain"

    .line 26
    .line 27
    sget-object v4, Lcom/tendcloud/tenddata/be;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 33
    .line 34
    const-string v3, "action"

    .line 35
    .line 36
    const-string v4, "update"

    .line 37
    .line 38
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 42
    .line 43
    const-string v3, "data"

    .line 44
    .line 45
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lcom/tendcloud/tenddata/zz;->c()Landroid/os/Handler;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const/16 v3, 0x66

    .line 53
    .line 54
    invoke-virtual {v2, v3, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    new-instance v2, Lorg/json/JSONObject;

    .line 66
    .line 67
    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2}, Lcom/tendcloud/tenddata/ct;->setProfile(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    :catchall_0
    return-void
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

.method private static e()V
    .locals 2

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/be;->t:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/i;->setLastRoleName(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/tendcloud/tenddata/be;->t:Ljava/lang/String;

    .line 7
    .line 8
    sget-object v1, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v0, v1}, Lcom/tendcloud/tenddata/i;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private f()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/be;->c:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/tendcloud/tenddata/be;->s:Ljava/lang/String;

    .line 9
    .line 10
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget v1, p0, Lcom/tendcloud/tenddata/be;->w:I

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    sget-object v2, Lcom/tendcloud/tenddata/be;->f:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :cond_0
    const-string v1, "UNKNOWN"

    .line 27
    .line 28
    iget-object v2, p0, Lcom/tendcloud/tenddata/be;->u:Lcom/tendcloud/tenddata/be$a;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    sget-object v1, Lcom/tendcloud/tenddata/be;->e:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v2, p0, Lcom/tendcloud/tenddata/be;->u:Lcom/tendcloud/tenddata/be$a;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object v1, p0, Lcom/tendcloud/tenddata/be;->v:Ljava/lang/String;

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    sget-object v2, Lcom/tendcloud/tenddata/be;->d:Ljava/lang/String;

    .line 56
    .line 57
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    :cond_2
    iget-object v1, p0, Lcom/tendcloud/tenddata/be;->x:Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    sget-object v2, Lcom/tendcloud/tenddata/be;->g:Ljava/lang/String;

    .line 65
    .line 66
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_3
    iget-object v1, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-lez v1, :cond_4

    .line 78
    .line 79
    const-string v1, "custom"

    .line 80
    .line 81
    iget-object v2, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;

    .line 82
    .line 83
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    .line 86
    :catchall_0
    :cond_4
    return-object v0
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

.method private static g()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v1, "name"

    .line 7
    .line 8
    sget-object v2, Lcom/tendcloud/tenddata/be;->t:Ljava/lang/String;

    .line 9
    .line 10
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    sget-object v1, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-lez v1, :cond_0

    .line 22
    .line 23
    const-string v1, "custom"

    .line 24
    .line 25
    sget-object v2, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    .line 26
    .line 27
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :catchall_0
    :cond_0
    return-object v0
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

.method private static h()V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/be;->g()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lorg/json/JSONObject;

    .line 10
    .line 11
    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lcom/tendcloud/tenddata/ct;->setSubprofile(Lorg/json/JSONObject;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {v0}, Lcom/tendcloud/tenddata/be;->b(Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :catchall_0
    return-void
    .line 22
    .line 23
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;I)V
    .locals 1

    monitor-enter p0

    .line 56
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    .line 57
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 58
    :cond_0
    :try_start_1
    sget-object v0, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 59
    invoke-static {}, Lcom/tendcloud/tenddata/be;->e()V

    .line 60
    invoke-static {}, Lcom/tendcloud/tenddata/be;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    :catchall_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    .line 50
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    .line 51
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 52
    :cond_0
    :try_start_1
    sget-object v0, Lcom/tendcloud/tenddata/be;->z:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    invoke-static {}, Lcom/tendcloud/tenddata/be;->e()V

    .line 54
    invoke-static {}, Lcom/tendcloud/tenddata/be;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    :catchall_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Ljava/lang/String;I)V
    .locals 1

    monitor-enter p0

    .line 16
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    .line 17
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 19
    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    :catchall_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    .line 12
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->y:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 14
    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :catchall_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final onTDEBEventAccount(Lcom/tendcloud/tenddata/zz$a;)V
    .locals 9

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 4
    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    const-string v1, "apiType"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/16 v1, 0x9

    .line 22
    .line 23
    if-eq v0, v1, :cond_0

    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :cond_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 28
    .line 29
    const-string v1, "account"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 35
    .line 36
    const-string v1, "service"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    move-object v8, v0

    .line 43
    check-cast v8, Lcom/tendcloud/tenddata/a;

    .line 44
    .line 45
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 46
    .line 47
    const-string v1, "data"

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 54
    .line 55
    const-string v1, "domain"

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 62
    .line 63
    const-string v1, "action"

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 70
    .line 71
    const-string v1, "immediate"

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz v4, :cond_4

    .line 78
    .line 79
    const-string v1, "login"

    .line 80
    .line 81
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_3

    .line 86
    .line 87
    const-string v1, "register"

    .line 88
    .line 89
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    const-string v1, "roleCreate"

    .line 97
    .line 98
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_2

    .line 103
    .line 104
    iget-object p1, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 105
    .line 106
    const-string v0, "parameter"

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {p1, v8}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_2
    const-string p1, "update"

    .line 121
    .line 122
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_4

    .line 127
    .line 128
    invoke-direct {p0, v3, v4, v5, v8}, Lcom/tendcloud/tenddata/be;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_3
    :goto_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 133
    .line 134
    const-string v1, "accountId"

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 145
    .line 146
    const-string v1, "invitationCode"

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    iget-object p1, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 153
    .line 154
    const-string v0, "eventValue"

    .line 155
    .line 156
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    move-object v1, p0

    .line 161
    invoke-direct/range {v1 .. v8}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_4
    if-eqz v4, :cond_5

    .line 166
    .line 167
    invoke-static {v5, v4, v3, v8}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    .line 168
    .line 169
    .line 170
    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/be;->a(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_5

    .line 175
    .line 176
    invoke-direct {p0, v8}, Lcom/tendcloud/tenddata/be;->a(Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    .line 178
    .line 179
    :catchall_0
    :cond_5
    :goto_1
    return-void
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

.method public setAccountType(Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->x:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->x:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    :catchall_0
    :cond_1
    return-void
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

.method public setAge(I)V
    .locals 1

    .line 1
    :try_start_0
    iget v0, p0, Lcom/tendcloud/tenddata/be;->w:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/tendcloud/tenddata/be;->w:I

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    :catchall_0
    :cond_0
    return-void
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

.method public setGender(Lcom/tendcloud/tenddata/be$a;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->u:Lcom/tendcloud/tenddata/be$a;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->u:Lcom/tendcloud/tenddata/be$a;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    :catchall_0
    :cond_0
    return-void
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

.method public setName(Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/be;->v:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iput-object p1, p0, Lcom/tendcloud/tenddata/be;->v:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/tendcloud/tenddata/be;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    :catchall_0
    :cond_1
    return-void
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
