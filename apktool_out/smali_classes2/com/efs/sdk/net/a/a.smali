.class public final Lcom/efs/sdk/net/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lcom/efs/sdk/net/a/a;


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/efs/sdk/net/a/c;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/efs/sdk/net/a/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/efs/sdk/net/a/a;->b()V

    .line 5
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
.end method

.method public static a()Lcom/efs/sdk/net/a/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/efs/sdk/net/a/a;->c:Lcom/efs/sdk/net/a/a;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/efs/sdk/net/a/a;

    invoke-direct {v0}, Lcom/efs/sdk/net/a/a;-><init>()V

    sput-object v0, Lcom/efs/sdk/net/a/a;->c:Lcom/efs/sdk/net/a/a;

    .line 3
    :cond_0
    sget-object v0, Lcom/efs/sdk/net/a/a;->c:Lcom/efs/sdk/net/a/a;

    return-object v0
.end method

.method private b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/efs/sdk/net/a/c;
    .locals 3

    .line 4
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 5
    invoke-direct {p0}, Lcom/efs/sdk/net/a/a;->b()V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/efs/sdk/net/a/c;

    if-nez v0, :cond_1

    .line 7
    new-instance v0, Lcom/efs/sdk/net/a/c;

    invoke-direct {v0}, Lcom/efs/sdk/net/a/c;-><init>()V

    .line 8
    iput-object p1, v0, Lcom/efs/sdk/net/a/c;->a:Ljava/lang/String;

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 10
    iput-wide v1, v0, Lcom/efs/sdk/net/a/c;->b:J

    .line 11
    iget-object v1, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/String;)Lcom/efs/sdk/net/a/d;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->b:Ljava/util/HashMap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/efs/sdk/net/a/a;->b:Ljava/util/HashMap;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->b:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->b:Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lcom/efs/sdk/net/a/d;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_1
    new-instance v0, Lcom/efs/sdk/net/a/d;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/efs/sdk/net/a/d;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, v0, Lcom/efs/sdk/net/a/d;->A:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    iput-wide v1, v0, Lcom/efs/sdk/net/a/d;->D:J

    .line 41
    .line 42
    iget-object v1, p0, Lcom/efs/sdk/net/a/a;->b:Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
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
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->b:Ljava/util/HashMap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->b:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
