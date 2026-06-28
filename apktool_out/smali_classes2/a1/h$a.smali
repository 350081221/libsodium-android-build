.class public La1/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alipay/sdk/app/APayEntranceActivity$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La1/h;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:La1/h;


# direct methods
.method public constructor <init>(La1/h;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, La1/h$a;->b:La1/h;

    iput-object p2, p0, La1/h$a;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, La1/h$a;->b:La1/h;

    .line 2
    .line 3
    invoke-static {v0, p1}, La1/h;->c(La1/h;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La1/h$a;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter p1

    .line 9
    :try_start_0
    iget-object v0, p0, La1/h$a;->a:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    :try_start_1
    iget-object v1, p0, La1/h$a;->b:La1/h;

    .line 17
    .line 18
    invoke-static {v1}, La1/h;->h(La1/h;)Ly0/a;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "biz"

    .line 23
    .line 24
    const-string v3, "BSAResultEx"

    .line 25
    .line 26
    invoke-static {v1, v2, v3, v0}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    monitor-exit p1

    .line 30
    return-void

    .line 31
    :catchall_1
    move-exception v0

    .line 32
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    throw v0
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
.end method
